/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 16:06:26 GMT 2019
 */

package org.springframework.samples.petclinic.evo_sixty_seconds;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.model.NamedEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class NamedEntity_ESTest extends NamedEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NamedEntity namedEntity0 = new NamedEntity();
      namedEntity0.setName("F^");
      String string0 = namedEntity0.toString();
      assertEquals("F^", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NamedEntity namedEntity0 = new NamedEntity();
      namedEntity0.setName("");
      String string0 = namedEntity0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NamedEntity namedEntity0 = new NamedEntity();
      namedEntity0.setName("");
      String string0 = namedEntity0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NamedEntity namedEntity0 = new NamedEntity();
      String string0 = namedEntity0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NamedEntity namedEntity0 = new NamedEntity();
      String string0 = namedEntity0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NamedEntity namedEntity0 = new NamedEntity();
      namedEntity0.setName("F^");
      String string0 = namedEntity0.getName();
      assertEquals("F^", string0);
  }
}