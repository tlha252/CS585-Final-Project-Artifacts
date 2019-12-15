/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 15:10:39 GMT 2019
 */

package org.springframework.samples.petclinic.evo_ten_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.system.CrashController;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CrashController_ESTest extends CrashController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CrashController crashController0 = new CrashController();
      // Undeclared exception!
      try {
        crashController0.triggerException();
        fail("Expecting exception: RuntimeException");

      } catch(RuntimeException e) {
         //
         // Expected: controller used to showcase what happens when an exception is thrown
         //
         verifyException("org.springframework.samples.petclinic.system.CrashController", e);
      }
  }
}
