/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 11 01:32:16 GMT 2019
 */

package org.springframework.samples.petclinic.evo_two_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.model.Person;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Person_ESTest extends Person_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Person person0 = new Person();
      person0.setLastName("CQ)R..H,");
      String string0 = person0.getLastName();
      assertEquals("CQ)R..H,", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Person person0 = new Person();
      person0.setLastName("");
      String string0 = person0.getLastName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Person person0 = new Person();
      person0.setFirstName("CQ)R..H,");
      String string0 = person0.getFirstName();
      assertEquals("CQ)R..H,", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Person person0 = new Person();
      person0.setFirstName("");
      String string0 = person0.getFirstName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Person person0 = new Person();
      String string0 = person0.getLastName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Person person0 = new Person();
      String string0 = person0.getFirstName();
      assertNull(string0);
  }
}