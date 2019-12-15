/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 15:11:46 GMT 2019
 */

package org.springframework.samples.petclinic.evo_ten_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.visit.Visit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Visit_ESTest extends Visit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Visit visit0 = new Visit();
      Integer integer0 = new Integer(0);
      visit0.setPetId(integer0);
      Integer integer1 = visit0.getPetId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Visit visit0 = new Visit();
      Integer integer0 = new Integer((-202));
      visit0.setPetId(integer0);
      Integer integer1 = visit0.getPetId();
      assertEquals((-202), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Visit visit0 = new Visit();
      Integer integer0 = new Integer(1523);
      visit0.setPetId(integer0);
      Integer integer1 = visit0.getPetId();
      assertEquals(1523, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Visit visit0 = new Visit();
      visit0.setDescription("g");
      String string0 = visit0.getDescription();
      assertEquals("g", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Visit visit0 = new Visit();
      visit0.setDescription("");
      String string0 = visit0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Visit visit0 = new Visit();
      String string0 = visit0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Visit visit0 = new Visit();
      LocalDate localDate0 = visit0.getDate();
      assertNotNull(localDate0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Visit visit0 = new Visit();
      visit0.setDate((LocalDate) null);
      LocalDate localDate0 = visit0.getDate();
      assertNull(localDate0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Visit visit0 = new Visit();
      Integer integer0 = visit0.getPetId();
      assertNull(integer0);
  }
}
