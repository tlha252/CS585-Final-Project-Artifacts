/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 16:07:06 GMT 2019
 */

package org.springframework.samples.petclinic.evo_sixty_seconds;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.owner.PetType;

import static org.junit.Assert.assertNull;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class PetType_ESTest extends PetType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PetType petType0 = new PetType();
      assertNull(petType0.getName());
  }
}
