/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 12 23:05:05 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evo_ten_seconds;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TodoManagementSpringBoot2Application_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TodoManagementSpringBoot2Application_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.boot.autoconfigure.AutoConfigurationPackage",
      "org.springframework.context.annotation.DeferredImportSelector",
      "org.springframework.beans.factory.Aware",
      "org.springframework.context.annotation.ComponentScan$Filter",
      "org.springframework.context.annotation.ImportBeanDefinitionRegistrar",
      "org.springframework.beans.factory.BeanFactoryAware",
      "org.springframework.context.annotation.ComponentScans",
      "org.springframework.stereotype.Indexed",
      "org.springframework.context.annotation.ImportSelector",
      "org.springframework.context.annotation.FilterType",
      "org.springframework.boot.autoconfigure.AutoConfigurationPackages$Registrar",
      "org.springframework.boot.autoconfigure.SpringBootApplication",
      "net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application",
      "org.springframework.boot.autoconfigure.EnableAutoConfiguration",
      "org.springframework.context.annotation.ScopedProxyMode",
      "org.springframework.context.ResourceLoaderAware",
      "org.springframework.context.annotation.Import",
      "org.springframework.context.annotation.ComponentScan",
      "org.springframework.context.annotation.Configuration",
      "org.springframework.boot.context.annotation.DeterminableImports",
      "org.springframework.stereotype.Component",
      "org.springframework.boot.SpringBootConfiguration",
      "org.springframework.beans.factory.support.BeanNameGenerator",
      "org.springframework.context.annotation.ScopeMetadataResolver",
      "org.springframework.context.EnvironmentAware",
      "org.springframework.beans.factory.BeanFactory",
      "org.springframework.context.annotation.AnnotationScopeMetadataResolver",
      "org.springframework.beans.factory.BeanClassLoaderAware"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TodoManagementSpringBoot2Application_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application"
    );
  }
}
