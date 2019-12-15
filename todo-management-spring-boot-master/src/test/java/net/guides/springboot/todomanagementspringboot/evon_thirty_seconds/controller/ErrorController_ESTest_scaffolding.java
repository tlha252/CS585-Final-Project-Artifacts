/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 12 23:07:04 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evon_thirty_seconds.controller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ErrorController_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.guides.springboot.todomanagement.controller.ErrorController"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ErrorController_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.tomcat.util.net.SocketWrapperBase$CompletionHandlerCall",
      "org.apache.tomcat.util.buf.ByteChunk$ByteOutputChannel",
      "org.apache.tomcat.ContextBind",
      "org.apache.coyote.http2.HpackException",
      "org.apache.coyote.ProtocolException",
      "org.apache.coyote.http2.HpackEncoder$HpackHeaderFunction",
      "org.apache.coyote.http2.ConnectionException",
      "org.apache.coyote.http11.HttpOutputBuffer",
      "org.apache.tomcat.util.http.ServerCookies",
      "org.apache.coyote.RequestGroupInfo",
      "org.apache.coyote.Response",
      "org.apache.coyote.http11.OutputFilter",
      "org.apache.coyote.http2.ConnectionSettingsLocal",
      "org.apache.tomcat.util.net.SocketEvent",
      "org.apache.coyote.http2.HpackEncoder$1",
      "org.apache.coyote.http2.Hpack",
      "org.apache.coyote.CloseNowException",
      "org.apache.tomcat.util.net.SSLSupport",
      "org.apache.tomcat.util.net.SocketProperties",
      "org.apache.coyote.ErrorState",
      "org.apache.tomcat.util.net.SocketWrapperBase$CompletionState",
      "org.apache.coyote.http2.ConnectionSettingsBase",
      "org.apache.coyote.ActionCode",
      "org.apache.coyote.UpgradeProtocol",
      "org.springframework.http.HttpStatus$Series",
      "org.apache.tomcat.util.net.AbstractEndpoint$Handler",
      "org.apache.tomcat.util.net.openssl.OpenSSLConf",
      "org.apache.coyote.http2.AbstractStream",
      "org.apache.tomcat.util.net.SocketWrapperBase$CompletionCheck",
      "org.apache.tomcat.util.net.ApplicationBufferHandler",
      "org.apache.coyote.InputBuffer",
      "org.apache.coyote.OutputBuffer",
      "org.apache.coyote.Processor",
      "org.springframework.stereotype.Indexed",
      "org.apache.tomcat.util.net.SSLHostConfig",
      "org.apache.coyote.Request",
      "org.apache.coyote.http2.Setting",
      "org.apache.coyote.UpgradeToken",
      "org.apache.tomcat.util.http.Parameters$FailReason",
      "org.apache.tomcat.util.net.AbstractEndpoint$Acceptor$AcceptorState",
      "org.apache.tomcat.util.buf.CharChunk$CharInputChannel",
      "org.apache.coyote.RequestInfo",
      "org.apache.coyote.http2.Hpack$HeaderField",
      "org.springframework.http.HttpStatus",
      "org.apache.tomcat.util.buf.CharChunk$CharOutputChannel",
      "org.springframework.web.servlet.View",
      "org.apache.coyote.http2.Stream",
      "org.apache.tomcat.util.net.AbstractEndpoint$Handler$SocketState",
      "org.apache.coyote.http2.StreamProcessor",
      "org.apache.juli.logging.LogConfigurationException",
      "org.apache.tomcat.util.net.AbstractEndpoint$Acceptor",
      "org.apache.tomcat.util.buf.UDecoder$DecodeException",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.coyote.AbstractProcessor",
      "org.apache.tomcat.util.http.MimeHeaderField",
      "org.apache.juli.logging.LogFactory",
      "org.springframework.ui.ModelMap",
      "org.apache.coyote.http2.StreamException",
      "org.apache.coyote.http2.Http2Protocol",
      "org.apache.coyote.http2.FrameType$IntPredicate",
      "org.apache.coyote.http2.Http2Exception",
      "org.apache.tomcat.util.net.SocketWrapperBase$1",
      "org.apache.tomcat.util.net.SendfileState",
      "org.apache.tomcat.util.net.SocketWrapperBase$2",
      "org.apache.tomcat.util.buf.UDecoder",
      "org.apache.tomcat.util.net.SocketProcessorBase",
      "org.apache.tomcat.util.http.Parameters",
      "org.apache.tomcat.util.net.AbstractEndpoint",
      "org.apache.tomcat.util.buf.AbstractChunk",
      "org.apache.tomcat.util.http.ServerCookie",
      "org.apache.coyote.http2.Stream$StreamInputBuffer",
      "org.apache.coyote.Adapter",
      "org.apache.coyote.http2.Http2Parser$Input",
      "org.apache.tomcat.util.threads.LimitLatch",
      "org.apache.tomcat.util.net.SocketBufferHandler",
      "org.apache.coyote.http2.Http2UpgradeHandler",
      "org.springframework.web.servlet.ModelAndView",
      "org.apache.coyote.http11.upgrade.InternalHttpUpgradeHandler",
      "org.apache.coyote.ActionHook",
      "org.apache.coyote.http2.HpackEncoder",
      "org.apache.tomcat.util.net.SSLHostConfig$CertificateVerification",
      "org.apache.tomcat.util.buf.MessageBytes",
      "org.apache.coyote.http2.ConnectionSettingsRemote",
      "org.apache.tomcat.util.log.UserDataHelper$Mode",
      "org.apache.coyote.http2.Http2Error",
      "org.apache.tomcat.util.buf.CharChunk",
      "org.apache.coyote.http2.HpackEncoder$State",
      "org.apache.tomcat.util.buf.MessageBytes$MessageBytesFactory",
      "org.apache.tomcat.util.net.SendfileDataBase",
      "org.springframework.stereotype.Controller",
      "org.apache.juli.logging.Log",
      "org.apache.tomcat.util.buf.ByteChunk",
      "org.apache.coyote.http2.FrameType$2",
      "org.apache.coyote.http2.FrameType$3",
      "org.apache.juli.logging.DirectJDKLog",
      "org.apache.coyote.http2.FrameType$1",
      "org.apache.tomcat.util.http.MimeHeaders",
      "org.apache.coyote.http2.HpackDecoder",
      "org.apache.coyote.http2.HpackDecoder$HeaderEmitter",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.coyote.AbstractProcessorLight",
      "org.apache.tomcat.util.buf.ByteChunk$ByteInputChannel",
      "org.apache.tomcat.util.net.SocketWrapperBase",
      "org.apache.coyote.http2.HeaderSink",
      "org.apache.coyote.http2.FrameType",
      "org.apache.tomcat.util.net.SSLHostConfig$Type",
      "org.apache.coyote.http2.HpackEncoder$TableEntry",
      "org.apache.coyote.http2.Http2Parser$Output",
      "org.apache.tomcat.InstanceManager",
      "org.apache.tomcat.util.log.UserDataHelper",
      "org.apache.tomcat.util.net.DispatchType",
      "org.springframework.stereotype.Component",
      "net.guides.springboot.todomanagement.controller.ErrorController",
      "org.apache.tomcat.util.log.UserDataHelper$Config",
      "org.apache.tomcat.util.net.SSLHostConfigCertificate",
      "org.apache.tomcat.util.buf.ByteBufferHolder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.servlet.http.HttpServletRequest", false, ErrorController_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ErrorController_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.guides.springboot.todomanagement.controller.ErrorController",
      "org.springframework.web.servlet.ModelAndView",
      "org.springframework.ui.ModelMap",
      "org.apache.juli.logging.LogFactory",
      "org.apache.juli.logging.DirectJDKLog",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.coyote.http2.AbstractStream",
      "org.apache.coyote.http2.HeaderSink",
      "org.apache.coyote.http2.Http2UpgradeHandler"
    );
  }
}