/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 23:00:19 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evo_two_seconds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TodoManagementSpringBoot2Application_ESTest extends TodoManagementSpringBoot2Application_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TodoManagementSpringBoot2Application todoManagementSpringBoot2Application0 = new TodoManagementSpringBoot2Application();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        TodoManagementSpringBoot2Application.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/boot/SpringApplication
         //
         verifyException("net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application", e);
      }
  }
}