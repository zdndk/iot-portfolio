/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.ioT.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.sdu.ioT.Destination;
import org.xtext.sdu.ioT.DestinationType;
import org.xtext.sdu.ioT.DestinationTypes;
import org.xtext.sdu.ioT.Device;
import org.xtext.sdu.ioT.DeviceType;
import org.xtext.sdu.ioT.DeviceTypes;
import org.xtext.sdu.ioT.FetchData;
import org.xtext.sdu.ioT.FetchDataCondition;
import org.xtext.sdu.ioT.FetchDataExpression;
import org.xtext.sdu.ioT.IoTFactory;
import org.xtext.sdu.ioT.IoTPackage;
import org.xtext.sdu.ioT.Ip;
import org.xtext.sdu.ioT.Method;
import org.xtext.sdu.ioT.Portnumber;
import org.xtext.sdu.ioT.Sensor;
import org.xtext.sdu.ioT.SensorGetMethod;
import org.xtext.sdu.ioT.SensorGroup;
import org.xtext.sdu.ioT.SensorType;
import org.xtext.sdu.ioT.SensorTypes;
import org.xtext.sdu.ioT.Server;
import org.xtext.sdu.ioT.ServerType;
import org.xtext.sdu.ioT.ServerTypes;
import org.xtext.sdu.ioT.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoTFactoryImpl extends EFactoryImpl implements IoTFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IoTFactory init()
  {
    try
    {
      IoTFactory theIoTFactory = (IoTFactory)EPackage.Registry.INSTANCE.getEFactory(IoTPackage.eNS_URI);
      if (theIoTFactory != null)
      {
        return theIoTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IoTFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IoTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IoTPackage.SYSTEM: return createSystem();
      case IoTPackage.SENSOR_TYPE: return createSensorType();
      case IoTPackage.SENSOR_TYPES: return createSensorTypes();
      case IoTPackage.SENSOR: return createSensor();
      case IoTPackage.SENSOR_GROUP: return createSensorGroup();
      case IoTPackage.SENSOR_GET_METHOD: return createSensorGetMethod();
      case IoTPackage.METHOD: return createMethod();
      case IoTPackage.DEVICE_TYPE: return createDeviceType();
      case IoTPackage.DEVICE_TYPES: return createDeviceTypes();
      case IoTPackage.DEVICE: return createDevice();
      case IoTPackage.SERVER_TYPE: return createServerType();
      case IoTPackage.SERVER_TYPES: return createServerTypes();
      case IoTPackage.SERVER: return createServer();
      case IoTPackage.DESTINATION_TYPE: return createDestinationType();
      case IoTPackage.DESTINATION_TYPES: return createDestinationTypes();
      case IoTPackage.DESTINATION: return createDestination();
      case IoTPackage.FETCH_DATA: return createFetchData();
      case IoTPackage.FETCH_DATA_EXPRESSION: return createFetchDataExpression();
      case IoTPackage.FETCH_DATA_CONDITION: return createFetchDataCondition();
      case IoTPackage.IP: return createIp();
      case IoTPackage.PORTNUMBER: return createPortnumber();
      case IoTPackage.TIME: return createTime();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.sdu.ioT.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorType createSensorType()
  {
    SensorTypeImpl sensorType = new SensorTypeImpl();
    return sensorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorTypes createSensorTypes()
  {
    SensorTypesImpl sensorTypes = new SensorTypesImpl();
    return sensorTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorGroup createSensorGroup()
  {
    SensorGroupImpl sensorGroup = new SensorGroupImpl();
    return sensorGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorGetMethod createSensorGetMethod()
  {
    SensorGetMethodImpl sensorGetMethod = new SensorGetMethodImpl();
    return sensorGetMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeviceType createDeviceType()
  {
    DeviceTypeImpl deviceType = new DeviceTypeImpl();
    return deviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeviceTypes createDeviceTypes()
  {
    DeviceTypesImpl deviceTypes = new DeviceTypesImpl();
    return deviceTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServerType createServerType()
  {
    ServerTypeImpl serverType = new ServerTypeImpl();
    return serverType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServerTypes createServerTypes()
  {
    ServerTypesImpl serverTypes = new ServerTypesImpl();
    return serverTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Server createServer()
  {
    ServerImpl server = new ServerImpl();
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DestinationType createDestinationType()
  {
    DestinationTypeImpl destinationType = new DestinationTypeImpl();
    return destinationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DestinationTypes createDestinationTypes()
  {
    DestinationTypesImpl destinationTypes = new DestinationTypesImpl();
    return destinationTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Destination createDestination()
  {
    DestinationImpl destination = new DestinationImpl();
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FetchData createFetchData()
  {
    FetchDataImpl fetchData = new FetchDataImpl();
    return fetchData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FetchDataExpression createFetchDataExpression()
  {
    FetchDataExpressionImpl fetchDataExpression = new FetchDataExpressionImpl();
    return fetchDataExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FetchDataCondition createFetchDataCondition()
  {
    FetchDataConditionImpl fetchDataCondition = new FetchDataConditionImpl();
    return fetchDataCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ip createIp()
  {
    IpImpl ip = new IpImpl();
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Portnumber createPortnumber()
  {
    PortnumberImpl portnumber = new PortnumberImpl();
    return portnumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IoTPackage getIoTPackage()
  {
    return (IoTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IoTPackage getPackage()
  {
    return IoTPackage.eINSTANCE;
  }

} //IoTFactoryImpl
