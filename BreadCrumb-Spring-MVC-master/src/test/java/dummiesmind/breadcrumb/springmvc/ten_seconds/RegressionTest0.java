package dummiesmind.breadcrumb.springmvc.ten_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        Class<?> wildcardClass11 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        Class<?> wildcardClass1 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Class<?> wildcardClass5 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        Class<?> wildcardClass15 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        Class<?> wildcardClass11 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            String str16 = breadCrumbLink15.getParentKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink8.setCurrentPage(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Exception exception18 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) false, exception18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        Exception exception23 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest20, httpServletResponse21, (Object) '#', exception23);
        Class<?> wildcardClass25 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = breadCrumbLink8.getPrevious();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) 1, modelAndView19);
        Class<?> wildcardClass21 = breadCrumbInterceptor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        boolean boolean6 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        Class<?> wildcardClass11 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink8.setFamily("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        Class<?> wildcardClass29 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        Class<?> wildcardClass14 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        boolean boolean11 = breadCrumbLink4.isCurrentPage();
        Class<?> wildcardClass12 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink9.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            String str16 = breadCrumbLink15.getFamily();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str13 = breadCrumbLink12.getParentKey();
        breadCrumbLink12.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink12.getParent();
        breadCrumbLink4.setParent(breadCrumbLink16);
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink16.setParentKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            String str9 = breadCrumbLink8.getLabel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList13 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str13 = breadCrumbLink12.getParentKey();
        breadCrumbLink12.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink12.getParent();
        breadCrumbLink4.setParent(breadCrumbLink16);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            String str19 = breadCrumbLink18.getFamily();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink18);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        Class<?> wildcardClass16 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = breadCrumbLink11.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        Class<?> wildcardClass9 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink11.setParentKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink4.setLabel("");
        Class<?> wildcardClass25 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink5.setParentKey("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        Class<?> wildcardClass20 = breadCrumbLink9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            String str9 = breadCrumbLink8.getParentKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        Class<?> wildcardClass18 = breadCrumbLink15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = breadCrumbLink9.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            String str23 = breadCrumbLink22.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink22);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink23.setUrl("hi!");
        breadCrumbLink23.setParentKey("");
        breadCrumbLink23.setFamily("");
        breadCrumbLink9.addNext(breadCrumbLink23);
        String str32 = breadCrumbLink23.getFamily();
        Class<?> wildcardClass33 = breadCrumbLink23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink13.setLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        Exception exception24 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) (short) 0, exception24);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        String str6 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        Class<?> wildcardClass17 = breadCrumbLink9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setLabel("");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getFamily();
        String str6 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink7 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setUrl("");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) false, modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str23 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        boolean boolean26 = breadCrumbLink22.isCurrentPage();
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest16, httpServletResponse17, (Object) boolean26, modelAndView27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor31 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        org.springframework.web.servlet.ModelAndView modelAndView35 = null;
        breadCrumbInterceptor31.postHandle(httpServletRequest32, httpServletResponse33, (Object) "", modelAndView35);
        javax.servlet.http.HttpServletRequest httpServletRequest37 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse38 = null;
        Object obj39 = null;
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor31.postHandle(httpServletRequest37, httpServletResponse38, obj39, modelAndView40);
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        org.springframework.web.servlet.ModelAndView modelAndView45 = null;
        breadCrumbInterceptor31.postHandle(httpServletRequest42, httpServletResponse43, (Object) false, modelAndView45);
        javax.servlet.http.HttpServletRequest httpServletRequest47 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse48 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink53.addNext(breadCrumbLink58);
        breadCrumbLink58.setUrl("hi!");
        breadCrumbLink58.setParentKey("");
        org.springframework.web.servlet.ModelAndView modelAndView64 = null;
        breadCrumbInterceptor31.postHandle(httpServletRequest47, httpServletResponse48, (Object) breadCrumbLink58, modelAndView64);
        org.springframework.web.servlet.ModelAndView modelAndView66 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest29, httpServletResponse30, (Object) httpServletRequest47, modelAndView66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        Class<?> wildcardClass34 = breadCrumbLinkList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setCurrentPage(false);
        boolean boolean16 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Exception exception18 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) false, exception18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        Exception exception23 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest20, httpServletResponse21, (Object) '#', exception23);
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink31.addNext(breadCrumbLink36);
        breadCrumbLink31.setCurrentPage(true);
        boolean boolean40 = breadCrumbLink31.isCurrentPage();
        String str41 = breadCrumbLink31.getParentKey();
        breadCrumbLink31.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        breadCrumbLink48.setCurrentPage(true);
        boolean boolean57 = breadCrumbLink48.isCurrentPage();
        String str58 = breadCrumbLink48.getParentKey();
        breadCrumbLink48.setLabel("hi!");
        breadCrumbLink31.setParent(breadCrumbLink48);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = breadCrumbLink31.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView63 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest25, httpServletResponse26, (Object) breadCrumbLink62, modelAndView63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink62);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) false, modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink27.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink27.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink41.setUrl("hi!");
        breadCrumbLink41.setParentKey("");
        breadCrumbLink41.setFamily("");
        breadCrumbLink27.addNext(breadCrumbLink41);
        String str50 = breadCrumbLink41.getFamily();
        Exception exception51 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest16, httpServletResponse17, (Object) breadCrumbLink41, exception51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList11 = breadCrumbLink4.getNext();
        breadCrumbLink4.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getParentKey();
        breadCrumbLink18.setUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        String str11 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink18.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink18.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        String str11 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink8.setCurrentPage(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        breadCrumbLink17.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        breadCrumbLink4.setFamily("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink7 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink7.addNext(breadCrumbLink12);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str19 = breadCrumbLink18.getParentKey();
        breadCrumbLink12.addNext(breadCrumbLink18);
        org.springframework.web.servlet.ModelAndView modelAndView21 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) breadCrumbLink18, modelAndView21);
        javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse24 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink29.addNext(breadCrumbLink34);
        breadCrumbLink34.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str43 = breadCrumbLink42.getParentKey();
        breadCrumbLink42.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str51 = breadCrumbLink50.getParentKey();
        breadCrumbLink50.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink50.getParent();
        breadCrumbLink42.setParent(breadCrumbLink54);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = breadCrumbLink42.getPrevious();
        breadCrumbLink34.setParent(breadCrumbLink42);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList58 = breadCrumbLink42.getNext();
        Exception exception59 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest23, httpServletResponse24, (Object) breadCrumbLinkList58, exception59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList58);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink11.setUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        breadCrumbLink4.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        String str11 = breadCrumbLink4.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink4.getNext();
        String str13 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        String str20 = breadCrumbLink9.getUrl();
        Class<?> wildcardClass21 = breadCrumbLink9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        Class<?> wildcardClass8 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink27.setFamily("");
        Exception exception48 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) "", exception48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        String str20 = breadCrumbLink9.getUrl();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor21 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor24 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest25, httpServletResponse26, (Object) "", modelAndView28);
        Exception exception30 = null;
        breadCrumbInterceptor21.afterCompletion(httpServletRequest22, httpServletResponse23, (Object) breadCrumbInterceptor24, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        Exception exception35 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest32, httpServletResponse33, (Object) 0L, exception35);
        javax.servlet.http.HttpServletRequest httpServletRequest37 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse38 = null;
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest37, httpServletResponse38, (Object) 1, modelAndView40);
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        breadCrumbLink48.setCurrentPage(true);
        boolean boolean57 = breadCrumbLink48.isCurrentPage();
        String str58 = breadCrumbLink48.getFamily();
        breadCrumbLink48.setUrl("");
        String str61 = breadCrumbLink48.getFamily();
        String str62 = breadCrumbLink48.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str68 = breadCrumbLink67.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = breadCrumbLink67.getParent();
        breadCrumbLink48.setPrevious(breadCrumbLink67);
        Exception exception71 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest42, httpServletResponse43, (Object) breadCrumbLink48, exception71);
        String str73 = breadCrumbLink48.getFamily();
        breadCrumbLink9.setParent(breadCrumbLink48);
        String str75 = breadCrumbLink48.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        breadCrumbLink44.addNext(breadCrumbLink53);
        boolean boolean55 = breadCrumbLink44.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor19 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        org.springframework.web.servlet.ModelAndView modelAndView23 = null;
        breadCrumbInterceptor19.postHandle(httpServletRequest20, httpServletResponse21, (Object) "", modelAndView23);
        Exception exception25 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest17, httpServletResponse18, (Object) breadCrumbInterceptor19, exception25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Exception exception34 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (Object) false, exception34);
        javax.servlet.http.HttpServletRequest httpServletRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest36, httpServletResponse37, (Object) breadCrumbLink42, modelAndView43);
        breadCrumbLink4.setParent(breadCrumbLink42);
        boolean boolean46 = breadCrumbLink42.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        String str16 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = breadCrumbLink21.getPrevious();
        String str29 = breadCrumbLink21.getFamily();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        String str31 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink4.setFamily("");
        String str7 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str21 = breadCrumbLink20.getParentKey();
        breadCrumbLink20.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink20.getParent();
        breadCrumbLink20.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList27 = breadCrumbLink20.getNext();
        breadCrumbLink4.setParent(breadCrumbLink20);
        String str29 = breadCrumbLink20.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList9 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        String str8 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        String str49 = breadCrumbLink44.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink18.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink35.getPrevious();
        String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink35.getParent();
        String str47 = breadCrumbLink35.getLabel();
        breadCrumbLink18.addNext(breadCrumbLink35);
        breadCrumbLink35.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        Class<?> wildcardClass11 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        breadCrumbLink17.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = breadCrumbLink17.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink36);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = null;
        breadCrumbLink9.setParent(breadCrumbLink22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink10.setLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean22 = breadCrumbLink21.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = null;
        breadCrumbLink21.setPrevious(breadCrumbLink23);
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str31 = breadCrumbLink30.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink30.getParent();
        breadCrumbLink21.setParent(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink38.addNext(breadCrumbLink43);
        breadCrumbLink38.setCurrentPage(true);
        boolean boolean47 = breadCrumbLink38.isCurrentPage();
        String str48 = breadCrumbLink38.getParentKey();
        breadCrumbLink38.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink55.addNext(breadCrumbLink60);
        breadCrumbLink55.setCurrentPage(true);
        boolean boolean64 = breadCrumbLink55.isCurrentPage();
        String str65 = breadCrumbLink55.getParentKey();
        breadCrumbLink55.setLabel("hi!");
        breadCrumbLink38.setParent(breadCrumbLink55);
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink32.addNext(breadCrumbLink55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!" + "'", str65.equals("hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        boolean boolean28 = breadCrumbLink21.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        String str30 = breadCrumbLink21.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink33.setFamily("");
        breadCrumbLink4.addNext(breadCrumbLink33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = null;
        breadCrumbLink4.addNext(breadCrumbLink20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        breadCrumbLink9.setLabel("");
        String str21 = breadCrumbLink9.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink25.addNext(breadCrumbLink31);
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (Object) breadCrumbLink31, modelAndView34);
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink31, modelAndView36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor40 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str59 = breadCrumbLink58.getParentKey();
        breadCrumbLink52.addNext(breadCrumbLink58);
        org.springframework.web.servlet.ModelAndView modelAndView61 = null;
        breadCrumbInterceptor40.postHandle(httpServletRequest41, httpServletResponse42, (Object) breadCrumbLink58, modelAndView61);
        Exception exception63 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest38, httpServletResponse39, (Object) breadCrumbLink58, exception63);
        javax.servlet.http.HttpServletRequest httpServletRequest65 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse66 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink71.addNext(breadCrumbLink76);
        breadCrumbLink71.setCurrentPage(true);
        boolean boolean80 = breadCrumbLink71.isCurrentPage();
        String str81 = breadCrumbLink71.getParentKey();
        breadCrumbLink71.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink88 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink71.setParent(breadCrumbLink88);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink90 = breadCrumbLink71.getPrevious();
        Exception exception91 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest65, httpServletResponse66, (Object) breadCrumbLink90, exception91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink90);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink44.getPrevious();
        breadCrumbLink21.addNext(breadCrumbLink46);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink21.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink48);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "");
        breadCrumbLink4.setParentKey("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink9.addNext(breadCrumbLink14);
        breadCrumbLink9.setCurrentPage(true);
        boolean boolean18 = breadCrumbLink9.isCurrentPage();
        String str19 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setUrl("");
        String str22 = breadCrumbLink9.getFamily();
        breadCrumbLink4.setParent(breadCrumbLink9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        breadCrumbLink26.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        String str15 = breadCrumbLink9.getParentKey();
        breadCrumbLink9.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) false, modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str23 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        boolean boolean26 = breadCrumbLink22.isCurrentPage();
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest16, httpServletResponse17, (Object) boolean26, modelAndView27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink35.getPrevious();
        String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setUrl("hi!");
        Exception exception46 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest29, httpServletResponse30, (Object) "hi!", exception46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink23.setUrl("hi!");
        breadCrumbLink23.setParentKey("");
        breadCrumbLink23.setFamily("");
        breadCrumbLink9.addNext(breadCrumbLink23);
        breadCrumbLink9.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        breadCrumbLink21.setCurrentPage(true);
        boolean boolean30 = breadCrumbLink21.isCurrentPage();
        String str31 = breadCrumbLink21.getParentKey();
        breadCrumbLink21.setLabel("hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = breadCrumbLink4.getPrevious();
        String str36 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink21.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink21.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        breadCrumbLink4.setCurrentPage(false);
        breadCrumbLink4.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        String str11 = breadCrumbLink4.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = breadCrumbLink27.getPrevious();
        String str35 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = breadCrumbLink27.getPrevious();
        Exception exception39 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink38, exception39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink47.getPrevious();
        Exception exception55 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest41, httpServletResponse42, (Object) breadCrumbLink47, exception55);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink61.addNext(breadCrumbLink66);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = breadCrumbLink66.getPrevious();
        breadCrumbLink66.setParentKey("");
        breadCrumbLink66.setUrl("");
        breadCrumbLink47.addNext(breadCrumbLink66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink68);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        breadCrumbLink9.setLabel("");
        String str21 = breadCrumbLink9.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Exception exception18 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) false, exception18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest20, httpServletResponse21, (Object) breadCrumbLink26, modelAndView27);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink26.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.setCurrentPage(false);
        breadCrumbLink4.setCurrentPage(false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        String str32 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink37.addNext(breadCrumbLink42);
        breadCrumbLink37.setCurrentPage(true);
        boolean boolean46 = breadCrumbLink37.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink51.addNext(breadCrumbLink56);
        breadCrumbLink51.setCurrentPage(true);
        boolean boolean60 = breadCrumbLink51.isCurrentPage();
        breadCrumbLink37.setPrevious(breadCrumbLink51);
        String str62 = breadCrumbLink51.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink51.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink68.addNext(breadCrumbLink73);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = breadCrumbLink68.getPrevious();
        String str76 = breadCrumbLink68.getFamily();
        breadCrumbLink68.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = breadCrumbLink68.getParent();
        String str80 = breadCrumbLink68.getLabel();
        breadCrumbLink51.addNext(breadCrumbLink68);
        breadCrumbLink4.addNext(breadCrumbLink51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        String str5 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = breadCrumbLink27.getPrevious();
        String str35 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = breadCrumbLink27.getPrevious();
        Exception exception39 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink38, exception39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink47.getPrevious();
        String str55 = breadCrumbLink47.getFamily();
        breadCrumbLink47.setUrl("hi!");
        breadCrumbLink47.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean65 = breadCrumbLink64.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = null;
        breadCrumbLink64.setPrevious(breadCrumbLink66);
        breadCrumbLink47.setParent(breadCrumbLink64);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str74 = breadCrumbLink73.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = breadCrumbLink73.getParent();
        breadCrumbLink64.setParent(breadCrumbLink75);
        org.springframework.web.servlet.ModelAndView modelAndView77 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest41, httpServletResponse42, (Object) breadCrumbLink75, modelAndView77);
        javax.servlet.http.HttpServletRequest httpServletRequest79 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse80 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean86 = breadCrumbLink85.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink87 = null;
        breadCrumbLink85.setPrevious(breadCrumbLink87);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink89 = breadCrumbLink85.getPrevious();
        String str90 = breadCrumbLink85.getParentKey();
        org.springframework.web.servlet.ModelAndView modelAndView91 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest79, httpServletResponse80, (Object) str90, modelAndView91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!" + "'", str90.equals("hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) false, modelAndView14);
        Class<?> wildcardClass16 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setUrl("");
        String str40 = breadCrumbLink27.getFamily();
        String str41 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str47 = breadCrumbLink46.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getParent();
        breadCrumbLink27.setPrevious(breadCrumbLink46);
        Exception exception50 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink27, exception50);
        String str52 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setCurrentPage(true);
        breadCrumbLink27.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str13 = breadCrumbLink12.getParentKey();
        breadCrumbLink12.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink12.getParent();
        breadCrumbLink4.setParent(breadCrumbLink16);
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink16.setLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest17, httpServletResponse18, (Object) "", modelAndView20);
        Exception exception22 = null;
        breadCrumbInterceptor13.afterCompletion(httpServletRequest14, httpServletResponse15, (Object) breadCrumbInterceptor16, exception22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        Exception exception27 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest24, httpServletResponse25, (Object) 0L, exception27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        org.springframework.web.servlet.ModelAndView modelAndView32 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest29, httpServletResponse30, (Object) 1, modelAndView32);
        javax.servlet.http.HttpServletRequest httpServletRequest34 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse35 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink40.setCurrentPage(true);
        boolean boolean49 = breadCrumbLink40.isCurrentPage();
        String str50 = breadCrumbLink40.getFamily();
        breadCrumbLink40.setUrl("");
        String str53 = breadCrumbLink40.getFamily();
        String str54 = breadCrumbLink40.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str60 = breadCrumbLink59.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = breadCrumbLink59.getParent();
        breadCrumbLink40.setPrevious(breadCrumbLink59);
        Exception exception63 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest34, httpServletResponse35, (Object) breadCrumbLink40, exception63);
        org.springframework.web.servlet.ModelAndView modelAndView65 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) breadCrumbInterceptor16, modelAndView65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink61);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        Class<?> wildcardClass29 = breadCrumbLink18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink14.addNext(breadCrumbLink19);
        breadCrumbLink19.setUrl("hi!");
        breadCrumbLink19.setParentKey("");
        breadCrumbLink19.setFamily("");
        String str27 = breadCrumbLink19.getFamily();
        breadCrumbLink4.addNext(breadCrumbLink19);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink19.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        Class<?> wildcardClass11 = breadCrumbInterceptor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink21.setParentKey("hi!");
        breadCrumbLink21.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        Class<?> wildcardClass15 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink23.addNext(breadCrumbLink28);
        breadCrumbLink23.setCurrentPage(true);
        boolean boolean32 = breadCrumbLink23.isCurrentPage();
        String str33 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink23.setParent(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink46.addNext(breadCrumbLink51);
        breadCrumbLink46.setCurrentPage(true);
        boolean boolean55 = breadCrumbLink46.isCurrentPage();
        String str56 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink46.setParent(breadCrumbLink63);
        breadCrumbLink23.addNext(breadCrumbLink63);
        breadCrumbLink63.setUrl("");
        breadCrumbLink63.setFamily("");
        breadCrumbLink9.setPrevious(breadCrumbLink63);
        String str71 = breadCrumbLink9.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        String str15 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink16);
        String str18 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        Exception exception19 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink17, exception19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink25.addNext(breadCrumbLink31);
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (Object) breadCrumbLink31, modelAndView34);
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink31, modelAndView36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor40 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str59 = breadCrumbLink58.getParentKey();
        breadCrumbLink52.addNext(breadCrumbLink58);
        org.springframework.web.servlet.ModelAndView modelAndView61 = null;
        breadCrumbInterceptor40.postHandle(httpServletRequest41, httpServletResponse42, (Object) breadCrumbLink58, modelAndView61);
        Exception exception63 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest38, httpServletResponse39, (Object) breadCrumbLink58, exception63);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList65 = breadCrumbLink58.getNext();
        Class<?> wildcardClass66 = breadCrumbLink58.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        String str19 = breadCrumbLink9.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            String str20 = breadCrumbLink19.getLabel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink18.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink35.getPrevious();
        String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink35.getParent();
        String str47 = breadCrumbLink35.getLabel();
        breadCrumbLink18.addNext(breadCrumbLink35);
        String str49 = breadCrumbLink35.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getFamily();
        String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setUrl("");
        String str22 = breadCrumbLink4.getFamily();
        String str23 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        String str8 = breadCrumbLink4.getParentKey();
        String str9 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        Class<?> wildcardClass15 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink25.addNext(breadCrumbLink31);
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (Object) breadCrumbLink31, modelAndView34);
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink31, modelAndView36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor40 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str59 = breadCrumbLink58.getParentKey();
        breadCrumbLink52.addNext(breadCrumbLink58);
        org.springframework.web.servlet.ModelAndView modelAndView61 = null;
        breadCrumbInterceptor40.postHandle(httpServletRequest41, httpServletResponse42, (Object) breadCrumbLink58, modelAndView61);
        Exception exception63 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest38, httpServletResponse39, (Object) breadCrumbLink58, exception63);
        breadCrumbLink58.setUrl("");
        breadCrumbLink58.setFamily("hi!");
        breadCrumbLink58.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getLabel();
        boolean boolean30 = breadCrumbLink18.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        String str20 = breadCrumbLink9.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = breadCrumbLink9.getPrevious();
        String str22 = breadCrumbLink9.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getFamily();
        String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setUrl("");
        breadCrumbLink4.setParentKey("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str56 = breadCrumbLink55.getParentKey();
        breadCrumbLink55.setLabel("hi!");
        boolean boolean59 = breadCrumbLink55.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList60 = breadCrumbLink55.getNext();
        String str61 = breadCrumbLink55.getLabel();
        breadCrumbLink44.setPrevious(breadCrumbLink55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        boolean boolean28 = breadCrumbLink21.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        breadCrumbLink21.setUrl("hi!");
        breadCrumbLink21.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) false, modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str23 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        boolean boolean26 = breadCrumbLink22.isCurrentPage();
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest16, httpServletResponse17, (Object) boolean26, modelAndView27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        Exception exception32 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest29, httpServletResponse30, (Object) (short) 10, exception32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink18.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink35.getPrevious();
        String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink35.getParent();
        String str47 = breadCrumbLink35.getLabel();
        breadCrumbLink18.addNext(breadCrumbLink35);
        boolean boolean49 = breadCrumbLink18.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getFamily();
        String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str24 = breadCrumbLink23.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink23.getParent();
        breadCrumbLink4.setPrevious(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = breadCrumbLink4.getPrevious();
        String str28 = breadCrumbLink27.getUrl();
        String str29 = breadCrumbLink27.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = null;
        breadCrumbLink4.setParent(breadCrumbLink10);
        String str12 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = breadCrumbLink4.getParent();
        breadCrumbLink4.setLabel("");
        Class<?> wildcardClass13 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getPrevious();
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setUrl("");
        String str16 = breadCrumbLink9.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = breadCrumbLink9.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = breadCrumbLink22.isCurrentPage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink22);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        boolean boolean26 = breadCrumbLink17.isCurrentPage();
        String str27 = breadCrumbLink17.getFamily();
        breadCrumbLink17.setUrl("");
        String str30 = breadCrumbLink17.getUrl();
        breadCrumbLink17.setParentKey("");
        Exception exception33 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink17, exception33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        String str5 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str11 = breadCrumbLink10.getParentKey();
        breadCrumbLink10.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor14 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink26.addNext(breadCrumbLink32);
        org.springframework.web.servlet.ModelAndView modelAndView35 = null;
        breadCrumbInterceptor14.postHandle(httpServletRequest15, httpServletResponse16, (Object) breadCrumbLink32, modelAndView35);
        breadCrumbLink10.addNext(breadCrumbLink32);
        String str38 = breadCrumbLink10.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        String str55 = breadCrumbLink43.getUrl();
        breadCrumbLink10.setPrevious(breadCrumbLink43);
        breadCrumbLink10.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink10.getPrevious();
        breadCrumbLink4.setPrevious(breadCrumbLink59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink59);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink23.setUrl("hi!");
        breadCrumbLink23.setParentKey("");
        breadCrumbLink23.setFamily("");
        breadCrumbLink9.addNext(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink23.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.addNext(breadCrumbLink15);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink22.setCurrentPage(true);
        boolean boolean31 = breadCrumbLink22.isCurrentPage();
        String str32 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink22.setParent(breadCrumbLink39);
        breadCrumbLink22.setLabel("");
        String str43 = breadCrumbLink22.getFamily();
        breadCrumbLink9.addNext(breadCrumbLink22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        String str6 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink9.getParent();
        breadCrumbLink9.setFamily("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList22 = breadCrumbLink9.getNext();
        breadCrumbLink9.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink8.setFamily("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        Exception exception4 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) (-1L), exception4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink12.addNext(breadCrumbLink17);
        String str19 = breadCrumbLink12.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList20 = breadCrumbLink12.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink25.addNext(breadCrumbLink30);
        breadCrumbLink25.setCurrentPage(true);
        boolean boolean34 = breadCrumbLink25.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink39.addNext(breadCrumbLink44);
        breadCrumbLink39.setCurrentPage(true);
        boolean boolean48 = breadCrumbLink39.isCurrentPage();
        breadCrumbLink25.setPrevious(breadCrumbLink39);
        breadCrumbLink12.setPrevious(breadCrumbLink39);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink12.getPrevious();
        Exception exception52 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest6, httpServletResponse7, (Object) breadCrumbLink12, exception52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink51);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        String str15 = breadCrumbLink9.getParentKey();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList16 = breadCrumbLink9.getNext();
        String str17 = breadCrumbLink9.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink22.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str31 = breadCrumbLink30.getParentKey();
        breadCrumbLink30.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str39 = breadCrumbLink38.getParentKey();
        breadCrumbLink38.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink38.getParent();
        breadCrumbLink30.setParent(breadCrumbLink42);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = breadCrumbLink30.getPrevious();
        breadCrumbLink22.setParent(breadCrumbLink30);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList46 = breadCrumbLink30.getNext();
        Exception exception47 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink30, exception47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList46);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink4.setLabel("");
        String str25 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        breadCrumbLink17.setUrl("hi!");
        breadCrumbLink17.setFamily("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str43 = breadCrumbLink42.getParentKey();
        breadCrumbLink42.setLabel("hi!");
        boolean boolean46 = breadCrumbLink42.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList47 = breadCrumbLink42.getNext();
        String str48 = breadCrumbLink42.getLabel();
        breadCrumbLink17.setParent(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setUrl("");
        String str40 = breadCrumbLink27.getFamily();
        String str41 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str47 = breadCrumbLink46.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getParent();
        breadCrumbLink27.setPrevious(breadCrumbLink46);
        Exception exception50 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink27, exception50);
        String str52 = breadCrumbLink27.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList53 = breadCrumbLink27.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink58.addNext(breadCrumbLink63);
        breadCrumbLink63.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str72 = breadCrumbLink71.getParentKey();
        breadCrumbLink71.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str80 = breadCrumbLink79.getParentKey();
        breadCrumbLink79.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink83 = breadCrumbLink79.getParent();
        breadCrumbLink71.setParent(breadCrumbLink83);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = breadCrumbLink71.getPrevious();
        breadCrumbLink63.setParent(breadCrumbLink71);
        breadCrumbLink71.setLabel("hi!");
        breadCrumbLink27.setPrevious(breadCrumbLink71);
        breadCrumbLink71.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!" + "'", str80.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink85);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        breadCrumbLink17.setUrl("hi!");
        String str36 = breadCrumbLink17.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = breadCrumbLink17.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink37);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink23.setUrl("hi!");
        breadCrumbLink23.setParentKey("");
        breadCrumbLink23.setFamily("");
        breadCrumbLink9.addNext(breadCrumbLink23);
        boolean boolean32 = breadCrumbLink9.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        org.springframework.web.servlet.ModelAndView modelAndView17 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (Object) "", modelAndView17);
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        Object obj21 = null;
        org.springframework.web.servlet.ModelAndView modelAndView22 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest19, httpServletResponse20, obj21, modelAndView22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest24, httpServletResponse25, (Object) false, modelAndView27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str36 = breadCrumbLink35.getParentKey();
        breadCrumbLink35.setLabel("hi!");
        boolean boolean39 = breadCrumbLink35.isCurrentPage();
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest29, httpServletResponse30, (Object) boolean39, modelAndView40);
        org.springframework.web.servlet.ModelAndView modelAndView42 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) boolean39, modelAndView42);
        javax.servlet.http.HttpServletRequest httpServletRequest44 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse45 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink50.addNext(breadCrumbLink55);
        breadCrumbLink50.setCurrentPage(true);
        boolean boolean59 = breadCrumbLink50.isCurrentPage();
        String str60 = breadCrumbLink50.getFamily();
        breadCrumbLink50.setUrl("");
        String str63 = breadCrumbLink50.getUrl();
        breadCrumbLink50.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink70.addNext(breadCrumbLink75);
        breadCrumbLink75.setUrl("hi!");
        breadCrumbLink75.setCurrentPage(true);
        breadCrumbLink50.setPrevious(breadCrumbLink75);
        Exception exception82 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest44, httpServletResponse45, (Object) breadCrumbLink75, exception82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink19.setFamily("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "");
        Exception exception18 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) "hi!", exception18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink26.addNext(breadCrumbLink31);
        breadCrumbLink31.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = breadCrumbLink31.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink45.setUrl("hi!");
        breadCrumbLink45.setParentKey("");
        breadCrumbLink45.setFamily("");
        breadCrumbLink31.addNext(breadCrumbLink45);
        String str54 = breadCrumbLink45.getFamily();
        breadCrumbLink45.setLabel("");
        org.springframework.web.servlet.ModelAndView modelAndView57 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest20, httpServletResponse21, (Object) "", modelAndView57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = breadCrumbLink4.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink22.setUrl("hi!");
        breadCrumbLink22.setParentKey("");
        breadCrumbLink22.setFamily("");
        breadCrumbLink22.setCurrentPage(false);
        breadCrumbLink22.setLabel("");
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink12.setPrevious(breadCrumbLink22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setFamily("");
        String str11 = breadCrumbLink4.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        boolean boolean26 = breadCrumbLink17.isCurrentPage();
        String str27 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink17.setParent(breadCrumbLink34);
        Exception exception36 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) breadCrumbLink34, exception36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        Object obj40 = null;
        org.springframework.web.servlet.ModelAndView modelAndView41 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest38, httpServletResponse39, obj40, modelAndView41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "hi!");
        Class<?> wildcardClass5 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean27 = breadCrumbLink26.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = null;
        breadCrumbLink26.setPrevious(breadCrumbLink28);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink26.getPrevious();
        String str31 = breadCrumbLink26.getFamily();
        breadCrumbLink9.setPrevious(breadCrumbLink26);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink9.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getFamily();
        String str6 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList5 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = breadCrumbLink19.getPrevious();
        String str27 = breadCrumbLink19.getFamily();
        breadCrumbLink19.setUrl("hi!");
        breadCrumbLink4.addNext(breadCrumbLink19);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        boolean boolean42 = breadCrumbLink35.isCurrentPage();
        breadCrumbLink19.setPrevious(breadCrumbLink35);
        breadCrumbLink19.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "");
        breadCrumbLink4.setFamily("");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        boolean boolean28 = breadCrumbLink21.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList30 = breadCrumbLink21.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList30);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink12.addNext(breadCrumbLink17);
        breadCrumbLink12.setCurrentPage(true);
        boolean boolean21 = breadCrumbLink12.isCurrentPage();
        String str22 = breadCrumbLink12.getFamily();
        Exception exception23 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest6, httpServletResponse7, (Object) breadCrumbLink12, exception23);
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink31.addNext(breadCrumbLink36);
        breadCrumbLink31.setCurrentPage(true);
        boolean boolean40 = breadCrumbLink31.isCurrentPage();
        String str41 = breadCrumbLink31.getParentKey();
        breadCrumbLink31.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink31.setParent(breadCrumbLink48);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink54.addNext(breadCrumbLink59);
        breadCrumbLink54.setCurrentPage(true);
        boolean boolean63 = breadCrumbLink54.isCurrentPage();
        String str64 = breadCrumbLink54.getParentKey();
        breadCrumbLink54.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink54.setParent(breadCrumbLink71);
        breadCrumbLink31.addNext(breadCrumbLink71);
        breadCrumbLink71.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink80 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        breadCrumbLink71.addNext(breadCrumbLink80);
        org.springframework.web.servlet.ModelAndView modelAndView82 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest25, httpServletResponse26, (Object) breadCrumbLink80, modelAndView82);
        boolean boolean84 = breadCrumbLink80.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        breadCrumbLink29.setUrl("hi!");
        breadCrumbLink29.setCurrentPage(true);
        breadCrumbLink4.setPrevious(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink4.setPrevious(breadCrumbLink40);
        String str42 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = breadCrumbLink19.getPrevious();
        String str27 = breadCrumbLink19.getFamily();
        breadCrumbLink19.setUrl("hi!");
        breadCrumbLink4.addNext(breadCrumbLink19);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        boolean boolean42 = breadCrumbLink35.isCurrentPage();
        breadCrumbLink19.setPrevious(breadCrumbLink35);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str60 = breadCrumbLink59.getParentKey();
        breadCrumbLink53.addNext(breadCrumbLink59);
        breadCrumbLink19.setPrevious(breadCrumbLink59);
        breadCrumbLink59.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        breadCrumbLink44.addNext(breadCrumbLink53);
        String str55 = breadCrumbLink44.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = null;
        breadCrumbLink4.setParent(breadCrumbLink18);
        String str20 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        String str11 = breadCrumbLink4.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        boolean boolean26 = breadCrumbLink17.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink31.addNext(breadCrumbLink36);
        breadCrumbLink31.setCurrentPage(true);
        boolean boolean40 = breadCrumbLink31.isCurrentPage();
        breadCrumbLink17.setPrevious(breadCrumbLink31);
        breadCrumbLink4.setPrevious(breadCrumbLink31);
        String str43 = breadCrumbLink31.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = breadCrumbLink31.getParent();
        breadCrumbLink31.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink44);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str21 = breadCrumbLink20.getParentKey();
        breadCrumbLink20.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink20.getParent();
        breadCrumbLink20.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList27 = breadCrumbLink20.getNext();
        breadCrumbLink4.setParent(breadCrumbLink20);
        breadCrumbLink20.setLabel("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink35.getPrevious();
        String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink50.addNext(breadCrumbLink55);
        breadCrumbLink55.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str64 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        breadCrumbLink55.addNext(breadCrumbLink63);
        breadCrumbLink35.setPrevious(breadCrumbLink63);
        breadCrumbLink20.addNext(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str37 = breadCrumbLink36.getParentKey();
        breadCrumbLink36.setLabel("hi!");
        breadCrumbLink36.setCurrentPage(false);
        breadCrumbLink26.addNext(breadCrumbLink36);
        Class<?> wildcardClass43 = breadCrumbLink36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getPrevious();
        breadCrumbLink9.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean19 = breadCrumbLink18.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = null;
        breadCrumbLink18.setPrevious(breadCrumbLink20);
        breadCrumbLink9.setPrevious(breadCrumbLink18);
        String str23 = breadCrumbLink18.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        Class<?> wildcardClass23 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean27 = breadCrumbLink26.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = null;
        breadCrumbLink26.setPrevious(breadCrumbLink28);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink26.getPrevious();
        String str31 = breadCrumbLink26.getFamily();
        breadCrumbLink9.setPrevious(breadCrumbLink26);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink26.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        String str16 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = breadCrumbLink21.getPrevious();
        String str29 = breadCrumbLink21.getFamily();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        boolean boolean31 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setParentKey("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink49);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink15.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor20 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor23 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor23.postHandle(httpServletRequest24, httpServletResponse25, (Object) "", modelAndView27);
        Exception exception29 = null;
        breadCrumbInterceptor20.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) breadCrumbInterceptor23, exception29);
        javax.servlet.http.HttpServletRequest httpServletRequest31 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse32 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor33 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest34 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse35 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str52 = breadCrumbLink51.getParentKey();
        breadCrumbLink45.addNext(breadCrumbLink51);
        org.springframework.web.servlet.ModelAndView modelAndView54 = null;
        breadCrumbInterceptor33.postHandle(httpServletRequest34, httpServletResponse35, (Object) breadCrumbLink51, modelAndView54);
        org.springframework.web.servlet.ModelAndView modelAndView56 = null;
        breadCrumbInterceptor20.postHandle(httpServletRequest31, httpServletResponse32, (Object) breadCrumbLink51, modelAndView56);
        javax.servlet.http.HttpServletRequest httpServletRequest58 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse59 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor60 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest61 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse62 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink67.addNext(breadCrumbLink72);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink78 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str79 = breadCrumbLink78.getParentKey();
        breadCrumbLink72.addNext(breadCrumbLink78);
        org.springframework.web.servlet.ModelAndView modelAndView81 = null;
        breadCrumbInterceptor60.postHandle(httpServletRequest61, httpServletResponse62, (Object) breadCrumbLink78, modelAndView81);
        Exception exception83 = null;
        breadCrumbInterceptor20.afterCompletion(httpServletRequest58, httpServletResponse59, (Object) breadCrumbLink78, exception83);
        breadCrumbLink78.setUrl("");
        breadCrumbLink15.setParent(breadCrumbLink78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink12.setParentKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        breadCrumbLink9.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList21 = breadCrumbLink9.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList21);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        String str8 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean28 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = null;
        breadCrumbLink27.setPrevious(breadCrumbLink29);
        boolean boolean31 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink27.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView33 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink27, modelAndView33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean22 = breadCrumbLink21.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = null;
        breadCrumbLink21.setPrevious(breadCrumbLink23);
        breadCrumbLink4.setParent(breadCrumbLink21);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList26 = breadCrumbLink21.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList26);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            String str16 = breadCrumbLink15.getFamily();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        String str16 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = breadCrumbLink21.getPrevious();
        String str29 = breadCrumbLink21.getFamily();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        breadCrumbLink4.setFamily("hi!");
        breadCrumbLink4.setParentKey("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean15 = breadCrumbLink4.isCurrentPage();
        String str16 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink23.setUrl("hi!");
        breadCrumbLink23.setParentKey("");
        breadCrumbLink23.setFamily("");
        breadCrumbLink9.addNext(breadCrumbLink23);
        String str32 = breadCrumbLink23.getFamily();
        String str33 = breadCrumbLink23.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        String str15 = breadCrumbLink9.getParentKey();
        String str16 = breadCrumbLink9.getLabel();
        breadCrumbLink9.setFamily("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        String str11 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        String str11 = breadCrumbLink9.getUrl();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink9.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink4.setFamily("");
        breadCrumbLink4.setParentKey("hi!");
        String str9 = breadCrumbLink4.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            String str12 = breadCrumbLink11.getLabel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (Object) false, modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink27.setUrl("hi!");
        breadCrumbLink27.setParentKey("");
        org.springframework.web.servlet.ModelAndView modelAndView33 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest16, httpServletResponse17, (Object) breadCrumbLink27, modelAndView33);
        javax.servlet.http.HttpServletRequest httpServletRequest35 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse36 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor37 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor40 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        org.springframework.web.servlet.ModelAndView modelAndView44 = null;
        breadCrumbInterceptor40.postHandle(httpServletRequest41, httpServletResponse42, (Object) "", modelAndView44);
        Exception exception46 = null;
        breadCrumbInterceptor37.afterCompletion(httpServletRequest38, httpServletResponse39, (Object) breadCrumbInterceptor40, exception46);
        javax.servlet.http.HttpServletRequest httpServletRequest48 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse49 = null;
        Exception exception51 = null;
        breadCrumbInterceptor40.afterCompletion(httpServletRequest48, httpServletResponse49, (Object) 0L, exception51);
        javax.servlet.http.HttpServletRequest httpServletRequest53 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse54 = null;
        org.springframework.web.servlet.ModelAndView modelAndView56 = null;
        breadCrumbInterceptor40.postHandle(httpServletRequest53, httpServletResponse54, (Object) (byte) 100, modelAndView56);
        javax.servlet.http.HttpServletRequest httpServletRequest58 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse59 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink64.addNext(breadCrumbLink69);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = breadCrumbLink64.getPrevious();
        String str72 = breadCrumbLink64.getFamily();
        breadCrumbLink64.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = breadCrumbLink64.getPrevious();
        Exception exception76 = null;
        breadCrumbInterceptor40.afterCompletion(httpServletRequest58, httpServletResponse59, (Object) breadCrumbLink75, exception76);
        org.springframework.web.servlet.ModelAndView modelAndView78 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest35, httpServletResponse36, (Object) httpServletRequest58, modelAndView78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink75);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor17 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink24.setFamily("");
        Exception exception37 = null;
        breadCrumbInterceptor17.afterCompletion(httpServletRequest18, httpServletResponse19, (Object) breadCrumbLink24, exception37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str60 = breadCrumbLink59.getParentKey();
        breadCrumbLink59.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink59.getParent();
        breadCrumbLink59.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList66 = breadCrumbLink59.getNext();
        breadCrumbLink43.setParent(breadCrumbLink59);
        breadCrumbLink24.setPrevious(breadCrumbLink59);
        breadCrumbLink4.setParent(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList66);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink10.addNext(breadCrumbLink15);
        breadCrumbLink15.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str24 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        breadCrumbLink15.addNext(breadCrumbLink23);
        boolean boolean28 = breadCrumbLink15.isCurrentPage();
        breadCrumbLink4.addNext(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            String str6 = breadCrumbLink5.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        String str17 = breadCrumbLink4.getFamily();
        String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str24 = breadCrumbLink23.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink23.getParent();
        breadCrumbLink4.setPrevious(breadCrumbLink23);
        Class<?> wildcardClass27 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        boolean boolean28 = breadCrumbLink21.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        breadCrumbLink21.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = breadCrumbLink36.getPrevious();
        String str44 = breadCrumbLink36.getFamily();
        breadCrumbLink36.setUrl("hi!");
        breadCrumbLink36.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean54 = breadCrumbLink53.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = null;
        breadCrumbLink53.setPrevious(breadCrumbLink55);
        breadCrumbLink36.setParent(breadCrumbLink53);
        breadCrumbLink21.setParent(breadCrumbLink53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            String str12 = breadCrumbLink11.getParentKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getFamily();
        String str6 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink11.addNext(breadCrumbLink16);
        breadCrumbLink16.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str25 = breadCrumbLink24.getParentKey();
        breadCrumbLink24.setLabel("hi!");
        breadCrumbLink16.addNext(breadCrumbLink24);
        boolean boolean29 = breadCrumbLink16.isCurrentPage();
        breadCrumbLink4.setParent(breadCrumbLink16);
        breadCrumbLink16.setFamily("hi!");
        breadCrumbLink16.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList5 = breadCrumbLink4.getNext();
        String str6 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getParent();
        String str6 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink12.addNext(breadCrumbLink17);
        breadCrumbLink12.setCurrentPage(true);
        boolean boolean21 = breadCrumbLink12.isCurrentPage();
        String str22 = breadCrumbLink12.getFamily();
        Exception exception23 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest6, httpServletResponse7, (Object) breadCrumbLink12, exception23);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList25 = breadCrumbLink12.getNext();
        breadCrumbLink12.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList25);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getFamily();
        String str6 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink11.addNext(breadCrumbLink16);
        breadCrumbLink16.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str25 = breadCrumbLink24.getParentKey();
        breadCrumbLink24.setLabel("hi!");
        breadCrumbLink16.addNext(breadCrumbLink24);
        boolean boolean29 = breadCrumbLink16.isCurrentPage();
        breadCrumbLink4.setParent(breadCrumbLink16);
        breadCrumbLink16.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = breadCrumbLink16.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink33);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink23.setUrl("hi!");
        breadCrumbLink23.setParentKey("");
        breadCrumbLink23.setFamily("");
        breadCrumbLink9.addNext(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink41.setUrl("hi!");
        breadCrumbLink41.setParentKey("");
        breadCrumbLink41.setFamily("");
        breadCrumbLink41.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink41.getParent();
        breadCrumbLink41.setFamily("hi!");
        breadCrumbLink23.addNext(breadCrumbLink41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink51);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        breadCrumbLink27.setCurrentPage(false);
        org.springframework.web.servlet.ModelAndView modelAndView39 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink27, modelAndView39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        Object obj43 = null;
        Exception exception44 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest41, httpServletResponse42, obj43, exception44);
        javax.servlet.http.HttpServletRequest httpServletRequest46 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse47 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink52.addNext(breadCrumbLink57);
        breadCrumbLink52.setCurrentPage(true);
        boolean boolean61 = breadCrumbLink52.isCurrentPage();
        String str62 = breadCrumbLink52.getFamily();
        breadCrumbLink52.setUrl("");
        String str65 = breadCrumbLink52.getUrl();
        breadCrumbLink52.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink77 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink72.addNext(breadCrumbLink77);
        breadCrumbLink77.setUrl("hi!");
        breadCrumbLink77.setCurrentPage(true);
        breadCrumbLink52.setPrevious(breadCrumbLink77);
        Exception exception84 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest46, httpServletResponse47, (Object) breadCrumbLink77, exception84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getPrevious();
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setUrl("");
        breadCrumbLink9.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getPrevious();
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setUrl("");
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        breadCrumbLink24.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink32.setLabel("hi!");
        breadCrumbLink24.addNext(breadCrumbLink32);
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink42.addNext(breadCrumbLink47);
        breadCrumbLink42.setCurrentPage(true);
        boolean boolean51 = breadCrumbLink42.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink56.addNext(breadCrumbLink61);
        breadCrumbLink56.setCurrentPage(true);
        boolean boolean65 = breadCrumbLink56.isCurrentPage();
        breadCrumbLink42.setPrevious(breadCrumbLink56);
        String str67 = breadCrumbLink56.getParentKey();
        String str68 = breadCrumbLink56.getParentKey();
        String str69 = breadCrumbLink56.getLabel();
        breadCrumbLink32.addNext(breadCrumbLink56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        String str8 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        String str37 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setUrl("");
        String str40 = breadCrumbLink27.getFamily();
        String str41 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str47 = breadCrumbLink46.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getParent();
        breadCrumbLink27.setPrevious(breadCrumbLink46);
        Exception exception50 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (Object) breadCrumbLink27, exception50);
        String str52 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setLabel("hi!");
        breadCrumbLink27.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        boolean boolean14 = breadCrumbLink9.isCurrentPage();
        String str15 = breadCrumbLink9.getParentKey();
        breadCrumbLink9.setCurrentPage(true);
        Class<?> wildcardClass18 = breadCrumbLink9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        String str15 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = breadCrumbLink25.getPrevious();
        breadCrumbLink25.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean35 = breadCrumbLink34.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = null;
        breadCrumbLink34.setPrevious(breadCrumbLink36);
        breadCrumbLink25.setPrevious(breadCrumbLink34);
        boolean boolean39 = breadCrumbLink25.isCurrentPage();
        breadCrumbLink4.setParent(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        boolean boolean14 = breadCrumbLink9.isCurrentPage();
        String str15 = breadCrumbLink9.getParentKey();
        String str16 = breadCrumbLink9.getParentKey();
        breadCrumbLink9.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = breadCrumbLink4.getPrevious();
        String str10 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (Object) "", modelAndView7);
        Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        String str26 = breadCrumbLink17.getLabel();
        Exception exception27 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) str26, exception27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink40.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest29, httpServletResponse30, (Object) breadCrumbLink40, modelAndView43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink18);
        String str29 = breadCrumbLink18.getParentKey();
        String str30 = breadCrumbLink18.getParentKey();
        String str31 = breadCrumbLink18.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList32 = breadCrumbLink18.getNext();
        breadCrumbLink18.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.setParentKey("hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        Exception exception14 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (Object) true, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str23 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str31 = breadCrumbLink30.getParentKey();
        breadCrumbLink30.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = breadCrumbLink30.getParent();
        breadCrumbLink22.setParent(breadCrumbLink34);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = breadCrumbLink22.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView37 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest16, httpServletResponse17, (Object) breadCrumbLink22, modelAndView37);
        String str39 = breadCrumbLink22.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink41.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str50 = breadCrumbLink49.getParentKey();
        breadCrumbLink49.setLabel("hi!");
        breadCrumbLink41.addNext(breadCrumbLink49);
        breadCrumbLink26.addNext(breadCrumbLink49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink10.addNext(breadCrumbLink15);
        breadCrumbLink15.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str24 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink31.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = breadCrumbLink31.getParent();
        breadCrumbLink23.setParent(breadCrumbLink35);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = breadCrumbLink23.getPrevious();
        breadCrumbLink15.setParent(breadCrumbLink23);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList39 = breadCrumbLink23.getNext();
        breadCrumbLink4.setParent(breadCrumbLink23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList39);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList5 = breadCrumbLink4.getNext();
        String str6 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        boolean boolean11 = breadCrumbLink4.isCurrentPage();
        String str12 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        String str15 = breadCrumbLink9.getParentKey();
        String str16 = breadCrumbLink9.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList17 = breadCrumbLink9.getNext();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor18 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink25.addNext(breadCrumbLink30);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink25.getPrevious();
        String str33 = breadCrumbLink25.getFamily();
        breadCrumbLink25.setUrl("hi!");
        breadCrumbLink25.setFamily("");
        Exception exception38 = null;
        breadCrumbInterceptor18.afterCompletion(httpServletRequest19, httpServletResponse20, (Object) breadCrumbLink25, exception38);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink44.addNext(breadCrumbLink49);
        breadCrumbLink44.setCurrentPage(true);
        boolean boolean53 = breadCrumbLink44.isCurrentPage();
        String str54 = breadCrumbLink44.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList55 = breadCrumbLink44.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str61 = breadCrumbLink60.getParentKey();
        breadCrumbLink60.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = breadCrumbLink60.getParent();
        breadCrumbLink60.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList67 = breadCrumbLink60.getNext();
        breadCrumbLink44.setParent(breadCrumbLink60);
        breadCrumbLink25.setPrevious(breadCrumbLink60);
        breadCrumbLink9.addNext(breadCrumbLink60);
        breadCrumbLink9.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList67);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor19 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        org.springframework.web.servlet.ModelAndView modelAndView23 = null;
        breadCrumbInterceptor19.postHandle(httpServletRequest20, httpServletResponse21, (Object) "", modelAndView23);
        Exception exception25 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest17, httpServletResponse18, (Object) breadCrumbInterceptor19, exception25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Exception exception34 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (Object) false, exception34);
        javax.servlet.http.HttpServletRequest httpServletRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest36, httpServletResponse37, (Object) breadCrumbLink42, modelAndView43);
        breadCrumbLink4.setParent(breadCrumbLink42);
        String str46 = breadCrumbLink42.getUrl();
        breadCrumbLink42.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink53.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList56 = breadCrumbLink53.getNext();
        breadCrumbLink42.setParent(breadCrumbLink53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList56);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = breadCrumbLink9.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink22);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink17.getPrevious();
        String str25 = breadCrumbLink17.getFamily();
        breadCrumbLink17.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink32.getPrevious();
        String str40 = breadCrumbLink32.getFamily();
        breadCrumbLink32.setUrl("hi!");
        breadCrumbLink17.addNext(breadCrumbLink32);
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList45 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink46);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink14.addNext(breadCrumbLink19);
        breadCrumbLink19.setUrl("hi!");
        breadCrumbLink19.setParentKey("");
        breadCrumbLink19.setFamily("");
        String str27 = breadCrumbLink19.getFamily();
        breadCrumbLink4.addNext(breadCrumbLink19);
        breadCrumbLink4.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setUrl("hi!");
        String str11 = breadCrumbLink4.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        String str15 = breadCrumbLink9.getParentKey();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList16 = breadCrumbLink9.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        breadCrumbLink26.setUrl("hi!");
        breadCrumbLink26.setParentKey("");
        breadCrumbLink26.setFamily("");
        breadCrumbLink26.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink40.setCurrentPage(true);
        boolean boolean49 = breadCrumbLink40.isCurrentPage();
        String str50 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink40.setParent(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink63.addNext(breadCrumbLink68);
        breadCrumbLink63.setCurrentPage(true);
        boolean boolean72 = breadCrumbLink63.isCurrentPage();
        String str73 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink80 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink63.setParent(breadCrumbLink80);
        breadCrumbLink40.addNext(breadCrumbLink80);
        breadCrumbLink80.setUrl("");
        breadCrumbLink80.setFamily("");
        breadCrumbLink26.setPrevious(breadCrumbLink80);
        breadCrumbLink9.addNext(breadCrumbLink80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest17, httpServletResponse18, (Object) "", modelAndView20);
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        org.springframework.web.servlet.ModelAndView modelAndView25 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest22, httpServletResponse23, (Object) 0, modelAndView25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink33.addNext(breadCrumbLink38);
        breadCrumbLink33.setCurrentPage(true);
        boolean boolean42 = breadCrumbLink33.isCurrentPage();
        String str43 = breadCrumbLink33.getParentKey();
        breadCrumbLink33.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink33.setParent(breadCrumbLink50);
        Exception exception52 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (Object) breadCrumbLink50, exception52);
        String str54 = breadCrumbLink50.getFamily();
        breadCrumbLink50.setLabel("hi!");
        breadCrumbLink4.setPrevious(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
    }
}

