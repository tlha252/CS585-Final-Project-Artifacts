/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 01:33:58 GMT 2019
 */

package org.springframework.samples.petclinic.evo_two_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.Vets;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Vets_ESTest extends Vets_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vets vets0 = new Vets();
      vets0.getVetList();
      List<Vet> list0 = vets0.getVetList();
      assertTrue(list0.isEmpty());
  }
}
