/**
 * generated by Xtext 2.17.0
 */
package org.xtext.sdu;

import org.xtext.sdu.IoTStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class IoTStandaloneSetup extends IoTStandaloneSetupGenerated {
  public static void doSetup() {
    new IoTStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
