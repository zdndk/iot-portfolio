/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.Ip#getIp <em>Ip</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getIp()
 * @model
 * @generated
 */
public interface Ip extends EObject
{
  /**
   * Returns the value of the '<em><b>Ip</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip</em>' attribute list.
   * @see org.xtext.sdu.ioT.IoTPackage#getIp_Ip()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIp();

} // Ip
