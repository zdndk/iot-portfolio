/**
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.sdu.ioT.AndCondition;
import org.xtext.sdu.ioT.ComparisonCondition;
import org.xtext.sdu.ioT.Condition;
import org.xtext.sdu.ioT.Device;
import org.xtext.sdu.ioT.DeviceType;
import org.xtext.sdu.ioT.DeviceTypes;
import org.xtext.sdu.ioT.FetchData;
import org.xtext.sdu.ioT.FetchDataCondition;
import org.xtext.sdu.ioT.FetchDataExpression;
import org.xtext.sdu.ioT.LiteralBool;
import org.xtext.sdu.ioT.LiteralNumber;
import org.xtext.sdu.ioT.Method;
import org.xtext.sdu.ioT.OrCondition;
import org.xtext.sdu.ioT.Sensor;
import org.xtext.sdu.ioT.SensorGetMethod;
import org.xtext.sdu.ioT.SensorGroup;
import org.xtext.sdu.ioT.SensorType;
import org.xtext.sdu.ioT.SensorTypes;
import org.xtext.sdu.ioT.Server;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class IoTGenerator extends AbstractGenerator {
  private HashMap<String, String> sensorMap = new HashMap<String, String>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.sensorMap.put("gyroscope", "LIS2HH12");
    this.sensorMap.put("lightsensor", "LTR329ALS01");
    this.sensorMap.put("altimeter", "MPL3115A2");
    Iterable<Device> _iterable = IteratorExtensions.<Device>toIterable(Iterators.<Device>filter(resource.getAllContents(), Device.class));
    for (final Device device : _iterable) {
      String _name = device.getName();
      String _plus = (_name + ".py");
      fsa.generateFile(_plus, this.generatePythonCode(resource, device));
    }
    Iterable<Server> _iterable_1 = IteratorExtensions.<Server>toIterable(Iterators.<Server>filter(resource.getAllContents(), Server.class));
    for (final Server server : _iterable_1) {
      String _name_1 = server.getName();
      String _plus_1 = (_name_1 + ".py");
      fsa.generateFile(_plus_1, this.generateServerCode(server));
    }
  }
  
  private String getSensorLibraryName(final String sensorName) {
    String _get = this.sensorMap.get(sensorName);
    boolean _notEquals = (!Objects.equal(_get, null));
    if (_notEquals) {
      return this.sensorMap.get(sensorName);
    } else {
      return sensorName;
    }
  }
  
  protected CharSequence generateServerCode(final Server server) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#Autogenerated ");
    String _string = new SimpleDateFormat("dd-MM-yyyy \'at\' HH:mm:ss").format(Calendar.getInstance().getTime()).toString();
    _builder.append(_string);
    _builder.append(" by EasyIoT");
    _builder.newLineIfNotEmpty();
    _builder.append("import socket,sys");
    _builder.newLine();
    _builder.append("from _thread import *");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def client_recieve(connection):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while True:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data = connection.recv(2048)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(data)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if not data:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("break");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("connection.close()");
    _builder.newLine();
    _builder.append("host = \'");
    CharSequence _printIp = this.printIp(server);
    _builder.append(_printIp);
    _builder.append("\' ");
    _builder.newLineIfNotEmpty();
    _builder.append("port = ");
    int _number = server.getPort().getNumber();
    _builder.append(_number);
    _builder.newLineIfNotEmpty();
    _builder.append("s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if __name__ == \'__main__\':");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("try:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("s.bind((host, port))");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("except socket.error as e:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(str(e))");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("s.listen()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("print(\'Easy IoT Server started. Waiting for connection\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while True:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("connnection, addr = s.accept()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(\'connected to: \'+addr[0]+\':\'+str(addr[1]))");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("start_new_thread(client_recieve,(connnection,))");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence printIp(final Server server) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = server.getIp().getIp().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for(final Integer ipNumber : _doubleDotLessThan) {
        Integer _get = server.getIp().getIp().get((ipNumber).intValue());
        _builder.append(_get);
        {
          int _size_1 = server.getIp().getIp().size();
          boolean _lessThan = (((ipNumber).intValue() + 1) < _size_1);
          if (_lessThan) {
            _builder.append(".");
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence generatePythonCode(final Resource resourceRoot, final Device scope) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<FetchData, Boolean> _function = (FetchData it) -> {
      EObject _destination = it.getDestination();
      return Boolean.valueOf((_destination instanceof Server));
    };
    int _size = IteratorExtensions.size(IteratorExtensions.<FetchData>filter(Iterators.<FetchData>filter(resourceRoot.getAllContents(), FetchData.class), _function));
    final boolean communicationSet = (_size > 0);
    _builder.newLineIfNotEmpty();
    _builder.append("#Autogenerated ");
    String _string = new SimpleDateFormat("dd-MM-yyyy \'at\' HH:mm:ss").format(Calendar.getInstance().getTime()).toString();
    _builder.append(_string);
    _builder.append(" by EasyIoT");
    _builder.newLineIfNotEmpty();
    _builder.append("from pysense import Pysense");
    _builder.newLine();
    {
      if (communicationSet) {
        _builder.append("import socket");
        _builder.newLine();
        _builder.append("import network");
        _builder.newLine();
        _builder.append("import time");
        _builder.newLine();
      }
    }
    CharSequence _emitSensortypes = this.emitSensortypes(resourceRoot);
    _builder.append(_emitSensortypes);
    _builder.newLineIfNotEmpty();
    CharSequence _emitDevicetypes = this.emitDevicetypes(resourceRoot);
    _builder.append(_emitDevicetypes);
    _builder.newLineIfNotEmpty();
    _builder.append("py = Pysense()");
    _builder.newLine();
    CharSequence _emitSensors = this.emitSensors(resourceRoot);
    _builder.append(_emitSensors);
    CharSequence _emitDevices = this.emitDevices(resourceRoot, scope);
    _builder.append(_emitDevices);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _emitSensorgroup = this.emitSensorgroup(resourceRoot);
    _builder.append(_emitSensorgroup);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _emitSensorGetMethod = this.emitSensorGetMethod(resourceRoot);
    _builder.append(_emitSensorGetMethod);
    CharSequence _xifexpression = null;
    if (communicationSet) {
      _xifexpression = this.emitCommunicationLogic(resourceRoot, scope);
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence emitCommunicationLogic(final Resource resource, final Device scope) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<FetchData, Boolean> _function = (FetchData it) -> {
      EObject _destination = it.getDestination();
      return Boolean.valueOf((_destination instanceof Server));
    };
    final Function1<FetchData, Boolean> _function_1 = (FetchData it) -> {
      Device _device = it.getDevice();
      return Boolean.valueOf(Objects.equal(_device, scope));
    };
    final Iterator<FetchData> fetches = IteratorExtensions.<FetchData>filter(IteratorExtensions.<FetchData>filter(Iterators.<FetchData>filter(resource.getAllContents(), FetchData.class), _function), _function_1);
    _builder.newLineIfNotEmpty();
    _builder.append("wlan = network.WLAN(mode=network.WLAN.STA)");
    _builder.newLine();
    {
      Iterable<FetchData> _iterable = IteratorExtensions.<FetchData>toIterable(fetches);
      for(final FetchData fetchDataWithServer : _iterable) {
        EObject _destination = fetchDataWithServer.getDestination();
        final Server server = ((Server) _destination);
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
        _builder.append("wlan.connect(\'SSID\', auth=(network.WLAN.WPA2, \'PASSWORD\'), timeout=5000) #insert network SSID and password");
        _builder.newLine();
        _builder.append("while not wlan.isconnected():");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("time.sleep_ms(100)");
        _builder.newLine();
        String _name = server.getName();
        _builder.append(_name);
        _builder.append("_HOST = \'");
        CharSequence _printIp = this.printIp(server);
        _builder.append(_printIp);
        _builder.append("\'  # ");
        String _name_1 = server.getName();
        _builder.append(_name_1);
        _builder.append("\'s IP address");
        _builder.newLineIfNotEmpty();
        String _name_2 = server.getName();
        _builder.append(_name_2);
        _builder.append("_PORT = ");
        int _number = server.getPort().getNumber();
        _builder.append(_number);
        _builder.append(" # The port used by ");
        String _name_3 = server.getName();
        _builder.append(_name_3);
        _builder.newLineIfNotEmpty();
        String _name_4 = server.getName();
        _builder.append(_name_4);
        _builder.append("_addr = socket.getaddrinfo(");
        String _name_5 = server.getName();
        _builder.append(_name_5);
        _builder.append("_HOST, ");
        String _name_6 = server.getName();
        _builder.append(_name_6);
        _builder.append("_PORT)[0][-1]");
        _builder.newLineIfNotEmpty();
        String _name_7 = server.getName();
        _builder.append(_name_7);
        _builder.append("_s = socket.socket()");
        _builder.newLineIfNotEmpty();
        String _name_8 = server.getName();
        _builder.append(_name_8);
        _builder.append("_s.connect(");
        String _name_9 = server.getName();
        _builder.append(_name_9);
        _builder.append("_addr)");
        _builder.newLineIfNotEmpty();
        String _name_10 = server.getName();
        _builder.append(_name_10);
        _builder.append("_s.setblocking(True)");
        _builder.newLineIfNotEmpty();
        {
          FetchDataExpression _triggered = fetchDataWithServer.getTriggered();
          boolean _tripleNotEquals = (_triggered != null);
          if (_tripleNotEquals) {
            _builder.append("while True:");
            _builder.newLine();
            _builder.append("   \t");
            _builder.append("time.sleep(");
            FetchDataExpression _triggered_1 = fetchDataWithServer.getTriggered();
            int _time = ((FetchDataExpression) _triggered_1).getDuration().getTime();
            _builder.append(_time, "   \t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            {
              final Function1<SensorGetMethod, Boolean> _function_2 = (SensorGetMethod it) -> {
                SensorType _type = it.getType();
                EObject _filter = fetchDataWithServer.getFilter();
                return Boolean.valueOf(Objects.equal(_type, ((SensorType) _filter)));
              };
              Iterable<SensorGetMethod> _iterable_1 = IteratorExtensions.<SensorGetMethod>toIterable(IteratorExtensions.<SensorGetMethod>filter(Iterators.<SensorGetMethod>filter(resource.getAllContents(), SensorGetMethod.class), _function_2));
              for(final SensorGetMethod getMethod : _iterable_1) {
                _builder.append("   \t");
                String _name_11 = server.getName();
                _builder.append(_name_11, "   \t");
                _builder.append("_s.sendall((b\'");
                String _name_12 = scope.getName();
                _builder.append(_name_12, "   \t");
                _builder.append("|{0}|\'.format(");
                final Function1<Sensor, Boolean> _function_3 = (Sensor it) -> {
                  SensorType _type = it.getType();
                  EObject _filter = fetchDataWithServer.getFilter();
                  return Boolean.valueOf(Objects.equal(_type, ((SensorType) _filter)));
                };
                String _name_13 = IteratorExtensions.<Sensor>head(IteratorExtensions.<Sensor>filter(Iterators.<Sensor>filter(resource.getAllContents(), Sensor.class), _function_3)).getName();
                _builder.append(_name_13, "   \t");
                _builder.append(".");
                String _name_14 = getMethod.getMethod().getName();
                _builder.append(_name_14, "   \t");
                _builder.append("(");
                {
                  EList<String> _parameters = getMethod.getMethod().getParameters();
                  boolean _hasElements = false;
                  for(final String param : _parameters) {
                    if (!_hasElements) {
                      _hasElements = true;
                    } else {
                      _builder.appendImmediate(",", "   \t");
                    }
                    _builder.append(param, "   \t");
                  }
                }
                _builder.append("))))");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            FetchDataCondition _condition = fetchDataWithServer.getCondition();
            boolean _tripleNotEquals_1 = (_condition != null);
            if (_tripleNotEquals_1) {
              _builder.append("while True:");
              _builder.newLine();
              {
                final Function1<SensorGetMethod, Boolean> _function_4 = (SensorGetMethod it) -> {
                  SensorType _type = it.getType();
                  EObject _filter = fetchDataWithServer.getFilter();
                  return Boolean.valueOf(Objects.equal(_type, ((SensorType) _filter)));
                };
                Iterable<SensorGetMethod> _iterable_2 = IteratorExtensions.<SensorGetMethod>toIterable(IteratorExtensions.<SensorGetMethod>filter(Iterators.<SensorGetMethod>filter(resource.getAllContents(), SensorGetMethod.class), _function_4));
                for(final SensorGetMethod getMethod_1 : _iterable_2) {
                  _builder.append("\t");
                  CharSequence _emitCondition = this.emitCondition(fetchDataWithServer, getMethod_1, scope, resource, server);
                  _builder.append(_emitCondition, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("time.sleep(1)");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence emitCondition(final FetchData fetchData, final SensorGetMethod sensorGetMethod, final Device scope, final Resource resource, final Server server) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    String _generateCondition = this.generateCondition(fetchData.getCondition().getCondition(), resource, fetchData);
    _builder.append(_generateCondition);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name = server.getName();
    _builder.append(_name, "\t");
    _builder.append("_s.sendall((b\'");
    String _name_1 = scope.getName();
    _builder.append(_name_1, "\t");
    _builder.append("|{0}|\'.format(");
    final Function1<Sensor, Boolean> _function = (Sensor it) -> {
      SensorType _type = it.getType();
      EObject _filter = fetchData.getFilter();
      return Boolean.valueOf(Objects.equal(_type, ((SensorType) _filter)));
    };
    String _name_2 = IteratorExtensions.<Sensor>head(IteratorExtensions.<Sensor>filter(Iterators.<Sensor>filter(resource.getAllContents(), Sensor.class), _function)).getName();
    _builder.append(_name_2, "\t");
    _builder.append(".");
    String _name_3 = sensorGetMethod.getMethod().getName();
    _builder.append(_name_3, "\t");
    _builder.append("(");
    {
      EList<String> _parameters = sensorGetMethod.getMethod().getParameters();
      boolean _hasElements = false;
      for(final String param : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append(param, "\t");
      }
    }
    _builder.append("))))");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generateCondition(final Condition con, final Resource resource, final FetchData fetchData) {
    String _switchResult = null;
    boolean _matched = false;
    if (con instanceof OrCondition) {
      _matched=true;
      String _generateCondition = this.generateCondition(((OrCondition)con).getLeft(), resource, fetchData);
      String _plus = (_generateCondition + " || ");
      String _generateCondition_1 = this.generateCondition(((OrCondition)con).getRight(), resource, fetchData);
      _switchResult = (_plus + _generateCondition_1);
    }
    if (!_matched) {
      if (con instanceof AndCondition) {
        _matched=true;
        String _generateCondition = this.generateCondition(((AndCondition)con).getLeft(), resource, fetchData);
        String _plus = (_generateCondition + " && ");
        String _generateCondition_1 = this.generateCondition(((AndCondition)con).getRight(), resource, fetchData);
        _switchResult = (_plus + _generateCondition_1);
      }
    }
    if (!_matched) {
      if (con instanceof ComparisonCondition) {
        _matched=true;
        String _generateCondition = this.generateCondition(((ComparisonCondition)con).getLeft(), resource, fetchData);
        String _plus = (_generateCondition + " ");
        String _operator = ((ComparisonCondition)con).getOperator();
        String _plus_1 = (_plus + _operator);
        String _plus_2 = (_plus_1 + " ");
        String _generateCondition_1 = this.generateCondition(((ComparisonCondition)con).getRight(), resource, fetchData);
        _switchResult = (_plus_2 + _generateCondition_1);
      }
    }
    if (!_matched) {
      if (con instanceof LiteralBool) {
        _matched=true;
        _switchResult = ((LiteralBool)con).getValue();
      }
    }
    if (!_matched) {
      if (con instanceof LiteralNumber) {
        _matched=true;
        _switchResult = Integer.toString(((LiteralNumber)con).getValue());
      }
    }
    if (!_matched) {
      if (con instanceof Method) {
        _matched=true;
        _switchResult = this.emitMethod(((Method)con), resource, fetchData);
      }
    }
    if (!_matched) {
      String _string = con.toString();
      throw new Error(_string);
    }
    return _switchResult;
  }
  
  public String emitMethod(final Method method, final Resource resource, final FetchData fetchData) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<SensorGetMethod, Boolean> _function = (SensorGetMethod it) -> {
      String _name = it.getMethod().getName();
      String _name_1 = method.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final SensorType sgm = IteratorExtensions.<SensorGetMethod>head(IteratorExtensions.<SensorGetMethod>filter(Iterators.<SensorGetMethod>filter(resource.getAllContents(), SensorGetMethod.class), _function)).getType();
    final Function1<Sensor, Boolean> _function_1 = (Sensor it) -> {
      SensorType _type = it.getType();
      return Boolean.valueOf(Objects.equal(_type, sgm));
    };
    String _name = IteratorExtensions.<Sensor>head(IteratorExtensions.<Sensor>filter(Iterators.<Sensor>filter(resource.getAllContents(), Sensor.class), _function_1)).getName();
    _builder.append(_name);
    _builder.append(".");
    String _name_1 = method.getName();
    _builder.append(_name_1);
    _builder.append("(");
    {
      EList<String> _parameters = method.getParameters();
      boolean _hasElements = false;
      for(final String param : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(param);
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  public CharSequence emitSensorGetMethod(final Resource resourceRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = IteratorExtensions.size(Iterators.<SensorGetMethod>filter(resourceRoot.getAllContents(), SensorGetMethod.class));
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("getMethods = dict()");
        _builder.newLine();
      }
    }
    {
      Iterable<SensorGetMethod> _iterable = IteratorExtensions.<SensorGetMethod>toIterable(Iterators.<SensorGetMethod>filter(resourceRoot.getAllContents(), SensorGetMethod.class));
      for(final SensorGetMethod sensorGetMethod : _iterable) {
        _builder.append("getMethods[");
        String _name = sensorGetMethod.getType().getName();
        _builder.append(_name);
        _builder.append("_");
        String _name_1 = sensorGetMethod.getMethod().getName();
        _builder.append(_name_1);
        _builder.append("(");
        {
          EList<String> _parameters = sensorGetMethod.getMethod().getParameters();
          boolean _hasElements = false;
          for(final String parameter : _parameters) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(parameter);
          }
        }
        _builder.append(")] = getattr(");
        String _name_2 = sensorGetMethod.getType().getName();
        _builder.append(_name_2);
        _builder.append(",");
        String _name_3 = sensorGetMethod.getMethod().getName();
        _builder.append(_name_3);
        _builder.append("(");
        {
          EList<String> _parameters_1 = sensorGetMethod.getMethod().getParameters();
          boolean _hasElements_1 = false;
          for(final String parameter_1 : _parameters_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(parameter_1);
          }
        }
        _builder.append("))");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence emitSensorgroup(final Resource resourceRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<SensorGroup> _iterable = IteratorExtensions.<SensorGroup>toIterable(Iterators.<SensorGroup>filter(resourceRoot.getAllContents(), SensorGroup.class));
      for(final SensorGroup sensorGroup : _iterable) {
        _builder.newLineIfNotEmpty();
        String _name = sensorGroup.getName();
        _builder.append(_name);
        _builder.append(" = [");
        {
          EList<Sensor> _sensors = sensorGroup.getSensors();
          boolean _hasElements = false;
          for(final Sensor sensor : _sensors) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = sensor.getName();
            _builder.append(_name_1);
          }
        }
        _builder.append("]");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence emitSensors(final Resource resourceRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Sensor> _iterable = IteratorExtensions.<Sensor>toIterable(Iterators.<Sensor>filter(resourceRoot.getAllContents(), Sensor.class));
      for(final Sensor sensor : _iterable) {
        _builder.newLineIfNotEmpty();
        String _name = sensor.getName();
        _builder.append(_name);
        _builder.append(" = ");
        String _name_1 = sensor.getType().getName();
        _builder.append(_name_1);
        _builder.append("(py)");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence emitSensortypes(final Resource resourceRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<SensorTypes> _iterable = IteratorExtensions.<SensorTypes>toIterable(Iterators.<SensorTypes>filter(resourceRoot.getAllContents(), SensorTypes.class));
      for(final SensorTypes sensorTypes : _iterable) {
        _builder.newLineIfNotEmpty();
        {
          EList<SensorType> _types = sensorTypes.getTypes();
          for(final SensorType sensorType : _types) {
            CharSequence _importSensorLibrary = this.importSensorLibrary(sensorType);
            _builder.append(_importSensorLibrary);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence emitDevicetypes(final Resource resourceRoot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<DeviceTypes> _iterable = IteratorExtensions.<DeviceTypes>toIterable(Iterators.<DeviceTypes>filter(resourceRoot.getAllContents(), DeviceTypes.class));
      for(final DeviceTypes deviceTypes : _iterable) {
        _builder.newLineIfNotEmpty();
        {
          EList<DeviceType> _types = deviceTypes.getTypes();
          for(final DeviceType deviceType : _types) {
            CharSequence _importDeviceLibrary = this.importDeviceLibrary(deviceType);
            _builder.append(_importDeviceLibrary);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence emitDevices(final Resource resourceRoot, final Device scope) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = scope.getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _name_1 = scope.getType().getName();
    _builder.append(_name_1);
    _builder.append("()");
    return _builder;
  }
  
  protected CharSequence importSensorLibrary(final SensorType sensorType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from ");
    String _sensorLibraryName = this.getSensorLibraryName(sensorType.getName());
    _builder.append(_sensorLibraryName);
    _builder.append(" import ");
    String _sensorLibraryName_1 = this.getSensorLibraryName(sensorType.getName());
    _builder.append(_sensorLibraryName_1);
    _builder.append(" as ");
    String _name = sensorType.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence importDeviceLibrary(final DeviceType deviceType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _name = deviceType.getName();
    _builder.append(_name);
    _builder.append(" from ");
    String _name_1 = deviceType.getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
