/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 23:15:04 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evo_sixty_seconds.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.guides.springboot.todomanagement.controller.LogoutController;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LogoutController_ESTest extends LogoutController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      LogoutController logoutController0 = new LogoutController();
      // Undeclared exception!
      try { 
        logoutController0.logout((HttpServletRequest) null, httpServletResponse0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/security/core/context/SecurityContextHolder
         //
         verifyException("net.guides.springboot.todomanagement.controller.LogoutController", e);
      }
  }
}
