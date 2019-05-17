/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.ioT.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.sdu.ioT.Device;
import org.xtext.sdu.ioT.FetchData;
import org.xtext.sdu.ioT.IoTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetch Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.impl.FetchDataImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.impl.FetchDataImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.impl.FetchDataImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.impl.FetchDataImpl#getConExp <em>Con Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FetchDataImpl extends MinimalEObjectImpl.Container implements FetchData
{
  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected EObject filter;

  /**
   * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevice()
   * @generated
   * @ordered
   */
  protected Device device;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected EObject destination;

  /**
   * The cached value of the '{@link #getConExp() <em>Con Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConExp()
   * @generated
   * @ordered
   */
  protected EObject conExp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetchDataImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IoTPackage.Literals.FETCH_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getFilter()
  {
    if (filter != null && filter.eIsProxy())
    {
      InternalEObject oldFilter = (InternalEObject)filter;
      filter = eResolveProxy(oldFilter);
      if (filter != oldFilter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoTPackage.FETCH_DATA__FILTER, oldFilter, filter));
      }
    }
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFilter(EObject newFilter)
  {
    EObject oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__FILTER, oldFilter, filter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device getDevice()
  {
    if (device != null && device.eIsProxy())
    {
      InternalEObject oldDevice = (InternalEObject)device;
      device = (Device)eResolveProxy(oldDevice);
      if (device != oldDevice)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoTPackage.FETCH_DATA__DEVICE, oldDevice, device));
      }
    }
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device basicGetDevice()
  {
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDevice(Device newDevice)
  {
    Device oldDevice = device;
    device = newDevice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__DEVICE, oldDevice, device));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getDestination()
  {
    if (destination != null && destination.eIsProxy())
    {
      InternalEObject oldDestination = (InternalEObject)destination;
      destination = eResolveProxy(oldDestination);
      if (destination != oldDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoTPackage.FETCH_DATA__DESTINATION, oldDestination, destination));
      }
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDestination(EObject newDestination)
  {
    EObject oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getConExp()
  {
    return conExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConExp(EObject newConExp, NotificationChain msgs)
  {
    EObject oldConExp = conExp;
    conExp = newConExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__CON_EXP, oldConExp, newConExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConExp(EObject newConExp)
  {
    if (newConExp != conExp)
    {
      NotificationChain msgs = null;
      if (conExp != null)
        msgs = ((InternalEObject)conExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.FETCH_DATA__CON_EXP, null, msgs);
      if (newConExp != null)
        msgs = ((InternalEObject)newConExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.FETCH_DATA__CON_EXP, null, msgs);
      msgs = basicSetConExp(newConExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__CON_EXP, newConExp, newConExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IoTPackage.FETCH_DATA__CON_EXP:
        return basicSetConExp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IoTPackage.FETCH_DATA__FILTER:
        if (resolve) return getFilter();
        return basicGetFilter();
      case IoTPackage.FETCH_DATA__DEVICE:
        if (resolve) return getDevice();
        return basicGetDevice();
      case IoTPackage.FETCH_DATA__DESTINATION:
        if (resolve) return getDestination();
        return basicGetDestination();
      case IoTPackage.FETCH_DATA__CON_EXP:
        return getConExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IoTPackage.FETCH_DATA__FILTER:
        setFilter((EObject)newValue);
        return;
      case IoTPackage.FETCH_DATA__DEVICE:
        setDevice((Device)newValue);
        return;
      case IoTPackage.FETCH_DATA__DESTINATION:
        setDestination((EObject)newValue);
        return;
      case IoTPackage.FETCH_DATA__CON_EXP:
        setConExp((EObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IoTPackage.FETCH_DATA__FILTER:
        setFilter((EObject)null);
        return;
      case IoTPackage.FETCH_DATA__DEVICE:
        setDevice((Device)null);
        return;
      case IoTPackage.FETCH_DATA__DESTINATION:
        setDestination((EObject)null);
        return;
      case IoTPackage.FETCH_DATA__CON_EXP:
        setConExp((EObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IoTPackage.FETCH_DATA__FILTER:
        return filter != null;
      case IoTPackage.FETCH_DATA__DEVICE:
        return device != null;
      case IoTPackage.FETCH_DATA__DESTINATION:
        return destination != null;
      case IoTPackage.FETCH_DATA__CON_EXP:
        return conExp != null;
    }
    return super.eIsSet(featureID);
  }

} //FetchDataImpl
