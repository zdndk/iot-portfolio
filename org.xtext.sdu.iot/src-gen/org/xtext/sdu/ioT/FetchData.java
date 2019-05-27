/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.FetchData#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.FetchData#getDevice <em>Device</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.FetchData#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.FetchData#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.FetchData#getTriggered <em>Triggered</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getFetchData()
 * @model
 * @generated
 */
public interface FetchData extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' reference.
   * @see #setFilter(EObject)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchData_Filter()
   * @model
   * @generated
   */
  EObject getFilter();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchData#getFilter <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(EObject value);

  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(Device)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchData_Device()
   * @model
   * @generated
   */
  Device getDevice();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchData#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Device value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(EObject)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchData_Destination()
   * @model
   * @generated
   */
  EObject getDestination();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchData#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(EObject value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(FetchDataCondition)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchData_Condition()
   * @model containment="true"
   * @generated
   */
  FetchDataCondition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchData#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(FetchDataCondition value);

  /**
   * Returns the value of the '<em><b>Triggered</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggered</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggered</em>' containment reference.
   * @see #setTriggered(FetchDataExpression)
   * @see org.xtext.sdu.ioT.IoTPackage#getFetchData_Triggered()
   * @model containment="true"
   * @generated
   */
  FetchDataExpression getTriggered();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.FetchData#getTriggered <em>Triggered</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triggered</em>' containment reference.
   * @see #getTriggered()
   * @generated
   */
  void setTriggered(FetchDataExpression value);

} // FetchData
