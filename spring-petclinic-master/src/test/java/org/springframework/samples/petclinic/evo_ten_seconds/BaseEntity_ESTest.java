/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 15:08:57 GMT 2019
 */

package org.springframework.samples.petclinic.evo_ten_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.model.BaseEntity;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class BaseEntity_ESTest extends BaseEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseEntity baseEntity0 = new BaseEntity();
      Integer integer0 = new Integer(0);
      baseEntity0.setId(integer0);
      Integer integer1 = baseEntity0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseEntity baseEntity0 = new BaseEntity();
      Integer integer0 = new Integer(1580);
      baseEntity0.setId(integer0);
      Integer integer1 = baseEntity0.getId();
      assertEquals(1580, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BaseEntity baseEntity0 = new BaseEntity();
      Integer integer0 = new Integer((-1));
      baseEntity0.setId(integer0);
      Integer integer1 = baseEntity0.getId();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BaseEntity baseEntity0 = new BaseEntity();
      boolean boolean0 = baseEntity0.isNew();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseEntity baseEntity0 = new BaseEntity();
      Integer integer0 = baseEntity0.getId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BaseEntity baseEntity0 = new BaseEntity();
      Integer integer0 = new Integer((-1));
      baseEntity0.setId(integer0);
      boolean boolean0 = baseEntity0.isNew();
      assertFalse(boolean0);
  }
}
