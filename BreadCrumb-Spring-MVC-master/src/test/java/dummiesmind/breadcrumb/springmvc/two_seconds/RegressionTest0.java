package dummiesmind.breadcrumb.springmvc.two_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        Class<?> wildcardClass1 = breadCrumbInterceptor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (Object) 0, modelAndView9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        Class<?> wildcardClass5 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getParentKey();
        String str15 = breadCrumbLink4.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        String str14 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        Class<?> wildcardClass11 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str5 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.addNext(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        String str16 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }
}

