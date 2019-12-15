/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 13 00:13:25 GMT 2019
 */

package dummiesmind.breadcrumb.springmvc.evo_ten_seconds.dummiesmind.breadcrumb.springmvc.breadcrumb;

import dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink_ESTest_scaffolding;
import org.junit.Test;
import static org.junit.Assert.*;
import dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BreadCrumbLink_ESTest extends BreadCrumbLink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink("", "xLb0ty2fJvu<:", false, "xLb0ty2fJvu<:");
      breadCrumbLink0.setParent((BreadCrumbLink) null);
      assertEquals("", breadCrumbLink0.getFamily());
      assertEquals("xLb0ty2fJvu<:", breadCrumbLink0.getLabel());
      assertFalse(breadCrumbLink0.isCurrentPage());
      assertEquals("xLb0ty2fJvu<:", breadCrumbLink0.getParentKey());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.addNext((BreadCrumbLink) null);
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink(")", "", true, ")");
      BreadCrumbLink breadCrumbLink1 = new BreadCrumbLink("", "dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink", true, "");
      breadCrumbLink0.setPrevious(breadCrumbLink1);
      assertEquals("", breadCrumbLink1.getFamily());
      assertEquals("dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink", breadCrumbLink1.getLabel());
      assertTrue(breadCrumbLink1.isCurrentPage());
      assertEquals("", breadCrumbLink1.getParentKey());
      assertEquals("", breadCrumbLink0.getLabel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      assertTrue(breadCrumbLink0.isCurrentPage());
      
      breadCrumbLink0.setCurrentPage(false);
      boolean boolean0 = breadCrumbLink0.isCurrentPage();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setUrl(";-Jx)aAmIBW^B*j#(7");
      breadCrumbLink0.getUrl();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setUrl("");
      breadCrumbLink0.getUrl();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, "dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink", false, (String) null);
      breadCrumbLink0.setPrevious(breadCrumbLink0);
      BreadCrumbLink breadCrumbLink1 = breadCrumbLink0.getPrevious();
      assertFalse(breadCrumbLink1.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setParentKey("$rw<PqSuE]x=Sa5Q+");
      breadCrumbLink0.getParentKey();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setParentKey("");
      breadCrumbLink0.getParentKey();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink("", "xLb0ty2fJvu<:", false, "xLb0ty2fJvu<:");
      breadCrumbLink0.setParent(breadCrumbLink0);
      BreadCrumbLink breadCrumbLink1 = breadCrumbLink0.getParent();
      assertEquals("", breadCrumbLink1.getFamily());
      assertEquals("xLb0ty2fJvu<:", breadCrumbLink1.getParentKey());
      assertFalse(breadCrumbLink1.isCurrentPage());
      assertEquals("xLb0ty2fJvu<:", breadCrumbLink1.getLabel());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, "t@w;", true, (String) null);
      String string0 = breadCrumbLink0.getLabel();
      assertNotNull(string0);
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, false, (String) null);
      breadCrumbLink0.setLabel("");
      breadCrumbLink0.getLabel();
      assertFalse(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setFamily("ca8>");
      breadCrumbLink0.getFamily();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink("", "", false, (String) null);
      String string0 = breadCrumbLink0.getFamily();
      assertNotNull(string0);
      assertFalse(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      boolean boolean0 = breadCrumbLink0.isCurrentPage();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setPrevious(breadCrumbLink0);
      BreadCrumbLink breadCrumbLink1 = breadCrumbLink0.getPrevious();
      assertTrue(breadCrumbLink1.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getFamily();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getNext();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getPrevious();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getLabel();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.setParent(breadCrumbLink0);
      BreadCrumbLink breadCrumbLink1 = breadCrumbLink0.getParent();
      assertTrue(breadCrumbLink1.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getParentKey();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getUrl();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.addNext(breadCrumbLink0);
      breadCrumbLink0.getNext();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BreadCrumbLink breadCrumbLink0 = new BreadCrumbLink((String) null, (String) null, true, (String) null);
      breadCrumbLink0.getParent();
      assertTrue(breadCrumbLink0.isCurrentPage());
  }
}