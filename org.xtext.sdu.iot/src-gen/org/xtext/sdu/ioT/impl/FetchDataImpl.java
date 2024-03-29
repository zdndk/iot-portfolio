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
import org.xtext.sdu.ioT.FetchDataCondition;
import org.xtext.sdu.ioT.FetchDataExpression;
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
 *   <li>{@link org.xtext.sdu.ioT.impl.FetchDataImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.impl.FetchDataImpl#getTriggered <em>Triggered</em>}</li>
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
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected FetchDataCondition condition;

  /**
   * The cached value of the '{@link #getTriggered() <em>Triggered</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggered()
   * @generated
   * @ordered
   */
  protected FetchDataExpression triggered;

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
  public FetchDataCondition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(FetchDataCondition newCondition, NotificationChain msgs)
  {
    FetchDataCondition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__CONDITION, oldCondition, newCondition);
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
  public void setCondition(FetchDataCondition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.FETCH_DATA__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.FETCH_DATA__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FetchDataExpression getTriggered()
  {
    return triggered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggered(FetchDataExpression newTriggered, NotificationChain msgs)
  {
    FetchDataExpression oldTriggered = triggered;
    triggered = newTriggered;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__TRIGGERED, oldTriggered, newTriggered);
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
  public void setTriggered(FetchDataExpression newTriggered)
  {
    if (newTriggered != triggered)
    {
      NotificationChain msgs = null;
      if (triggered != null)
        msgs = ((InternalEObject)triggered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.FETCH_DATA__TRIGGERED, null, msgs);
      if (newTriggered != null)
        msgs = ((InternalEObject)newTriggered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.FETCH_DATA__TRIGGERED, null, msgs);
      msgs = basicSetTriggered(newTriggered, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.FETCH_DATA__TRIGGERED, newTriggered, newTriggered));
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
      case IoTPackage.FETCH_DATA__CONDITION:
        return basicSetCondition(null, msgs);
      case IoTPackage.FETCH_DATA__TRIGGERED:
        return basicSetTriggered(null, msgs);
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
      case IoTPackage.FETCH_DATA__CONDITION:
        return getCondition();
      case IoTPackage.FETCH_DATA__TRIGGERED:
        return getTriggered();
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
      case IoTPackage.FETCH_DATA__CONDITION:
        setCondition((FetchDataCondition)newValue);
        return;
      case IoTPackage.FETCH_DATA__TRIGGERED:
        setTriggered((FetchDataExpression)newValue);
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
      case IoTPackage.FETCH_DATA__CONDITION:
        setCondition((FetchDataCondition)null);
        return;
      case IoTPackage.FETCH_DATA__TRIGGERED:
        setTriggered((FetchDataExpression)null);
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
      case IoTPackage.FETCH_DATA__CONDITION:
        return condition != null;
      case IoTPackage.FETCH_DATA__TRIGGERED:
        return triggered != null;
    }
    return super.eIsSet(featureID);
  }

} //FetchDataImpl
