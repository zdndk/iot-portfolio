/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.DeviceTypes#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getDeviceTypes()
 * @model
 * @generated
 */
public interface DeviceTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sdu.ioT.DeviceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xtext.sdu.ioT.IoTPackage#getDeviceTypes_Types()
   * @model containment="true"
   * @generated
   */
  EList<DeviceType> getTypes();

} // DeviceTypes
