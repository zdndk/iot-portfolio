/**
 * generated by Xtext 2.16.0
 */
package org.xtext.sdu.ioT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.ioT.Server#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.Server#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.Server#getIp <em>Ip</em>}</li>
 *   <li>{@link org.xtext.sdu.ioT.Server#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.xtext.sdu.ioT.IoTPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sdu.ioT.IoTPackage#getServer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.Server#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ServerType)
   * @see org.xtext.sdu.ioT.IoTPackage#getServer_Type()
   * @model
   * @generated
   */
  ServerType getType();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.Server#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ServerType value);

  /**
   * Returns the value of the '<em><b>Ip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip</em>' containment reference.
   * @see #setIp(Ip)
   * @see org.xtext.sdu.ioT.IoTPackage#getServer_Ip()
   * @model containment="true"
   * @generated
   */
  Ip getIp();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.Server#getIp <em>Ip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip</em>' containment reference.
   * @see #getIp()
   * @generated
   */
  void setIp(Ip value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(Portnumber)
   * @see org.xtext.sdu.ioT.IoTPackage#getServer_Port()
   * @model containment="true"
   * @generated
   */
  Portnumber getPort();

  /**
   * Sets the value of the '{@link org.xtext.sdu.ioT.Server#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Portnumber value);

} // Server
