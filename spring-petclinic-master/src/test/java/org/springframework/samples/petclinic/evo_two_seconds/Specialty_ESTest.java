/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 01:33:38 GMT 2019
 */

package org.springframework.samples.petclinic.evo_two_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.vet.Specialty;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Specialty_ESTest extends Specialty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Specialty specialty0 = new Specialty();
      assertTrue(specialty0.isNew());
  }
}
