/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 23:07:04 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evon_thirty_seconds.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import net.guides.springboot.todomanagement.controller.ErrorController;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ErrorController_ESTest extends ErrorController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      // Undeclared exception!
      try { 
        errorController0.handleException((HttpServletRequest) null, (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.guides.springboot.todomanagement.controller.ErrorController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      MockException mockException0 = new MockException("Unavailable For Legal Reasons");
      // Undeclared exception!
      try { 
        errorController0.handleException(httpServletRequestWrapper0, mockException0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/util/Assert
         //
         verifyException("org.springframework.ui.ModelMap", e);
      }
  }
}