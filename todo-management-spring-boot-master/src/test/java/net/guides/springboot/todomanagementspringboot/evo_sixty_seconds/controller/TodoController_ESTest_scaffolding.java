/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 12 23:16:24 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evo_sixty_seconds.controller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TodoController_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.guides.springboot.todomanagement.controller.TodoController"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = SandboxMode.RECOMMENDED;
    Sandbox.initializeSecurityManagerForSUT();
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    System.setProperties((java.util.Properties) defaultProperties.clone());
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    Sandbox.goingToExecuteSUTCode();
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    Sandbox.doneWithExecutingSUTCode();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("file.encoding", "Cp1252");
    System.setProperty("java.awt.headless", "true");
    System.setProperty("java.io.tmpdir", "C:\\Users\\tlha252\\AppData\\Local\\Temp\\");
    System.setProperty("user.country", "US");
    System.setProperty("user.dir", "C:\\Users\\tlha252\\Downloads\\evosuite");
    System.setProperty("user.home", "C:\\Users\\tlha252");
    System.setProperty("user.language", "en");
    System.setProperty("user.name", "tlha252");
    System.setProperty("user.timezone", "America/New_York");
    System.setProperty("user.variant", "");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TodoController_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.validation.Errors",
      "org.springframework.beans.PropertyEditorRegistry",
      "org.springframework.beans.factory.annotation.Autowired",
      "org.springframework.validation.BindingResult",
      "org.springframework.stereotype.Controller",
      "org.springframework.validation.BindingErrorProcessor",
      "org.springframework.ui.ModelMap",
      "org.springframework.validation.MessageCodeFormatter",
      "org.springframework.context.support.DefaultMessageSourceResolvable",
      "org.springframework.validation.ObjectError",
      "org.springframework.validation.DefaultMessageCodesResolver$Format",
      "org.springframework.beans.TypeConverter",
      "org.springframework.stereotype.Indexed",
      "org.springframework.validation.MessageCodesResolver",
      "org.springframework.beans.propertyeditors.CustomDateEditor",
      "org.springframework.validation.BindException",
      "org.springframework.context.MessageSourceResolvable",
      "org.springframework.validation.AbstractBindingResult",
      "org.springframework.validation.AbstractErrors",
      "org.springframework.validation.FieldError",
      "org.springframework.validation.DataBinder",
      "net.guides.springboot.todomanagement.service.ITodoService",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.data.util.Lazy",
      "net.guides.springboot.todomanagement.controller.TodoController",
      "net.guides.springboot.todomanagement.model.Todo",
      "org.springframework.stereotype.Component",
      "org.springframework.validation.DefaultMessageCodesResolver",
      "org.springframework.validation.DefaultMessageCodesResolver$Format$1",
      "org.springframework.validation.DefaultMessageCodesResolver$Format$2",
      "org.springframework.validation.MapBindingResult",
      "org.springframework.web.bind.WebDataBinder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.guides.springboot.todomanagement.service.ITodoService", false, TodoController_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TodoController_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.guides.springboot.todomanagement.controller.TodoController",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.ui.ModelMap",
      "net.guides.springboot.todomanagement.model.Todo",
      "org.springframework.validation.BindingResult",
      "org.springframework.validation.BindException",
      "org.springframework.beans.propertyeditors.CustomDateEditor",
      "org.springframework.validation.AbstractErrors",
      "org.springframework.validation.AbstractBindingResult",
      "org.springframework.validation.MapBindingResult",
      "org.springframework.validation.DefaultMessageCodesResolver$Format",
      "org.springframework.validation.DefaultMessageCodesResolver",
      "org.springframework.data.util.Lazy"
    );
  }
}
