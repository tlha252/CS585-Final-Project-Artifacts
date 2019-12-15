package dummiesmind.breadcrumb.springmvc.sixty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        breadCrumbLink9.setLabel("");
        java.lang.String str21 = breadCrumbLink9.getUrl();
        breadCrumbLink9.setCurrentPage(false);
        breadCrumbLink9.setUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean28 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = null;
        breadCrumbLink27.setPrevious(breadCrumbLink29);
        boolean boolean31 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink27.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView33 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, modelAndView33);
        javax.servlet.http.HttpServletRequest httpServletRequest35 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse36 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink41.addNext(breadCrumbLink46);
        breadCrumbLink41.setCurrentPage(true);
        boolean boolean50 = breadCrumbLink41.isCurrentPage();
        java.lang.String str51 = breadCrumbLink41.getParentKey();
        java.lang.String str52 = breadCrumbLink41.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = null;
        breadCrumbLink41.setPrevious(breadCrumbLink53);
        java.lang.String str55 = breadCrumbLink41.getLabel();
        org.springframework.web.servlet.ModelAndView modelAndView56 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest35, httpServletResponse36, (java.lang.Object) str55, modelAndView56);
        javax.servlet.http.HttpServletRequest httpServletRequest58 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse59 = null;
        java.lang.Object obj60 = null;
        java.lang.Exception exception61 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest58, httpServletResponse59, obj60, exception61);
        javax.servlet.http.HttpServletRequest httpServletRequest63 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse64 = null;
        java.lang.Object obj65 = null;
        org.springframework.web.servlet.ModelAndView modelAndView66 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest63, httpServletResponse64, obj65, modelAndView66);
        javax.servlet.http.HttpServletRequest httpServletRequest68 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse69 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink74.addNext(breadCrumbLink79);
        breadCrumbLink74.setCurrentPage(true);
        boolean boolean83 = breadCrumbLink74.isCurrentPage();
        java.lang.String str84 = breadCrumbLink74.getParentKey();
        breadCrumbLink74.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink91 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink74.setParent(breadCrumbLink91);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink93 = breadCrumbLink91.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView94 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest68, httpServletResponse69, (java.lang.Object) breadCrumbLink91, modelAndView94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!" + "'", str84.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink93);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setFamily("");
        java.lang.String str51 = breadCrumbLink44.getLabel();
        breadCrumbLink44.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList59 = breadCrumbLink58.getNext();
        breadCrumbLink44.setPrevious(breadCrumbLink58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList59);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink7 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink7.addNext(breadCrumbLink12);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str19 = breadCrumbLink18.getParentKey();
        breadCrumbLink12.addNext(breadCrumbLink18);
        org.springframework.web.servlet.ModelAndView modelAndView21 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbLink18, modelAndView21);
        javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse24 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink29.addNext(breadCrumbLink34);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = breadCrumbLink34.getPrevious();
        breadCrumbLink34.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean44 = breadCrumbLink43.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = null;
        breadCrumbLink43.setPrevious(breadCrumbLink45);
        breadCrumbLink34.setPrevious(breadCrumbLink43);
        boolean boolean48 = breadCrumbLink34.isCurrentPage();
        breadCrumbLink34.setFamily("");
        java.lang.String str51 = breadCrumbLink34.getFamily();
        breadCrumbLink34.setCurrentPage(false);
        breadCrumbLink34.setUrl("");
        breadCrumbLink34.setLabel("hi!");
        org.springframework.web.servlet.ModelAndView modelAndView58 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest23, httpServletResponse24, (java.lang.Object) breadCrumbLink34, modelAndView58);
        java.lang.String str60 = breadCrumbLink34.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        breadCrumbLink27.setCurrentPage(false);
        org.springframework.web.servlet.ModelAndView modelAndView39 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, modelAndView39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        java.lang.Object obj43 = null;
        java.lang.Exception exception44 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest41, httpServletResponse42, obj43, exception44);
        javax.servlet.http.HttpServletRequest httpServletRequest46 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse47 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink52.addNext(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink57.getPrevious();
        breadCrumbLink57.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean67 = breadCrumbLink66.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = null;
        breadCrumbLink66.setPrevious(breadCrumbLink68);
        breadCrumbLink57.setPrevious(breadCrumbLink66);
        java.lang.String str71 = breadCrumbLink66.getUrl();
        org.springframework.web.servlet.ModelAndView modelAndView72 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest46, httpServletResponse47, (java.lang.Object) str71, modelAndView72);
        javax.servlet.http.HttpServletRequest httpServletRequest74 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse75 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink80 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink80.addNext(breadCrumbLink85);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink87 = breadCrumbLink85.getPrevious();
        breadCrumbLink85.setParentKey("");
        org.springframework.web.servlet.ModelAndView modelAndView90 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest74, httpServletResponse75, (java.lang.Object) "", modelAndView90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink87);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink14.addNext(breadCrumbLink19);
        breadCrumbLink19.setUrl("hi!");
        breadCrumbLink19.setParentKey("");
        breadCrumbLink19.setFamily("");
        java.lang.String str27 = breadCrumbLink19.getFamily();
        breadCrumbLink4.addNext(breadCrumbLink19);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink33.setLabel("");
        breadCrumbLink33.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean43 = breadCrumbLink42.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = null;
        breadCrumbLink42.setPrevious(breadCrumbLink44);
        java.lang.String str46 = breadCrumbLink42.getParentKey();
        breadCrumbLink42.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink53.addNext(breadCrumbLink58);
        breadCrumbLink58.setUrl("hi!");
        breadCrumbLink58.setParentKey("");
        breadCrumbLink58.setFamily("");
        breadCrumbLink58.setCurrentPage(false);
        breadCrumbLink58.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList70 = breadCrumbLink58.getNext();
        java.lang.String str71 = breadCrumbLink58.getParentKey();
        breadCrumbLink42.setPrevious(breadCrumbLink58);
        breadCrumbLink33.setPrevious(breadCrumbLink42);
        breadCrumbLink33.setLabel("hi!");
        breadCrumbLink19.addNext(breadCrumbLink33);
        boolean boolean77 = breadCrumbLink33.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getFamily();
        java.lang.String str6 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        java.lang.String str9 = breadCrumbLink4.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList10 = breadCrumbLink4.getNext();
        boolean boolean11 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        boolean boolean6 = breadCrumbLink4.isCurrentPage();
        java.lang.String str7 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = null;
        breadCrumbLink4.addNext(breadCrumbLink10);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList12);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink39.addNext(breadCrumbLink44);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink39.getPrevious();
        java.lang.String str47 = breadCrumbLink39.getFamily();
        breadCrumbLink39.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink39.getParent();
        java.lang.String str51 = breadCrumbLink39.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink56.addNext(breadCrumbLink61);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink56.getPrevious();
        java.lang.String str64 = breadCrumbLink56.getFamily();
        breadCrumbLink39.setPrevious(breadCrumbLink56);
        java.lang.String str66 = breadCrumbLink39.getFamily();
        breadCrumbLink17.setParent(breadCrumbLink39);
        breadCrumbLink17.setCurrentPage(false);
        breadCrumbLink17.setFamily("");
        breadCrumbLink17.setUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        java.lang.String str8 = breadCrumbLink4.getLabel();
        breadCrumbLink4.setUrl("hi!");
        java.lang.String str11 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink10.addNext(breadCrumbLink15);
        breadCrumbLink15.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str24 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink31.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = breadCrumbLink31.getParent();
        breadCrumbLink23.setParent(breadCrumbLink35);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = breadCrumbLink23.getPrevious();
        breadCrumbLink15.setParent(breadCrumbLink23);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList39 = breadCrumbLink23.getNext();
        breadCrumbLink4.setParent(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink45.addNext(breadCrumbLink50);
        breadCrumbLink45.setCurrentPage(true);
        boolean boolean54 = breadCrumbLink45.isCurrentPage();
        java.lang.String str55 = breadCrumbLink45.getParentKey();
        breadCrumbLink45.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink45.setParent(breadCrumbLink62);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink68.addNext(breadCrumbLink73);
        breadCrumbLink68.setCurrentPage(true);
        boolean boolean77 = breadCrumbLink68.isCurrentPage();
        java.lang.String str78 = breadCrumbLink68.getParentKey();
        breadCrumbLink68.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink68.setParent(breadCrumbLink85);
        breadCrumbLink45.addNext(breadCrumbLink85);
        breadCrumbLink85.setUrl("");
        breadCrumbLink85.setFamily("");
        java.lang.String str92 = breadCrumbLink85.getLabel();
        breadCrumbLink23.setParent(breadCrumbLink85);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        breadCrumbLink9.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink9.addNext(breadCrumbLink14);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink9.getPrevious();
        java.lang.String str17 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        java.lang.String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink9.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        boolean boolean47 = breadCrumbLink40.isCurrentPage();
        breadCrumbLink24.setPrevious(breadCrumbLink40);
        java.lang.String str49 = breadCrumbLink24.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink24.getParent();
        breadCrumbLink24.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        breadCrumbLink57.setCurrentPage(true);
        boolean boolean66 = breadCrumbLink57.isCurrentPage();
        java.lang.String str67 = breadCrumbLink57.getFamily();
        breadCrumbLink57.setUrl("");
        java.lang.String str70 = breadCrumbLink57.getFamily();
        java.lang.String str71 = breadCrumbLink57.getFamily();
        breadCrumbLink24.addNext(breadCrumbLink57);
        breadCrumbLink4.setPrevious(breadCrumbLink24);
        breadCrumbLink24.setCurrentPage(true);
        boolean boolean76 = breadCrumbLink24.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        java.lang.String str16 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = breadCrumbLink21.getPrevious();
        java.lang.String str29 = breadCrumbLink21.getFamily();
        breadCrumbLink4.setPrevious(breadCrumbLink21);
        boolean boolean31 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink41.setUrl("hi!");
        breadCrumbLink41.setParentKey("");
        java.lang.String str47 = breadCrumbLink41.getParentKey();
        java.lang.String str48 = breadCrumbLink41.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList49 = breadCrumbLink41.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink54.addNext(breadCrumbLink59);
        breadCrumbLink54.setCurrentPage(true);
        boolean boolean63 = breadCrumbLink54.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink68.addNext(breadCrumbLink73);
        breadCrumbLink68.setCurrentPage(true);
        boolean boolean77 = breadCrumbLink68.isCurrentPage();
        breadCrumbLink54.setPrevious(breadCrumbLink68);
        java.lang.String str79 = breadCrumbLink68.getParentKey();
        breadCrumbLink41.setParent(breadCrumbLink68);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink81 = breadCrumbLink41.getParent();
        breadCrumbLink4.setParent(breadCrumbLink41);
        java.lang.String str83 = breadCrumbLink41.getParentKey();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        java.lang.String str11 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink16.addNext(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str28 = breadCrumbLink27.getParentKey();
        breadCrumbLink21.setParent(breadCrumbLink27);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink21.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList31 = breadCrumbLink30.getNext();
        breadCrumbLink30.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink38.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList41 = breadCrumbLink38.getNext();
        java.lang.String str42 = breadCrumbLink38.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean48 = breadCrumbLink47.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = null;
        breadCrumbLink47.setPrevious(breadCrumbLink49);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink47.getPrevious();
        java.lang.String str52 = breadCrumbLink47.getParentKey();
        breadCrumbLink47.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = breadCrumbLink47.getParent();
        breadCrumbLink47.setFamily("");
        breadCrumbLink47.setCurrentPage(true);
        breadCrumbLink38.setPrevious(breadCrumbLink47);
        breadCrumbLink30.setParent(breadCrumbLink47);
        breadCrumbLink4.setPrevious(breadCrumbLink47);
        breadCrumbLink47.setParentKey("hi!");
        breadCrumbLink47.setUrl("hi!");
        breadCrumbLink47.setFamily("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink55);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        java.lang.String str5 = breadCrumbLink4.getFamily();
        java.lang.String str6 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("");
        breadCrumbLink4.setFamily("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList11 = breadCrumbLink4.getNext();
        breadCrumbLink4.setLabel("hi!");
        java.lang.String str14 = breadCrumbLink4.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        breadCrumbLink21.setCurrentPage(true);
        boolean boolean30 = breadCrumbLink21.isCurrentPage();
        java.lang.String str31 = breadCrumbLink21.getParentKey();
        breadCrumbLink21.setLabel("hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = breadCrumbLink4.getPrevious();
        java.lang.String str36 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setCurrentPage(true);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList39 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink44.addNext(breadCrumbLink49);
        breadCrumbLink44.setCurrentPage(true);
        boolean boolean53 = breadCrumbLink44.isCurrentPage();
        breadCrumbLink44.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor56 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest57 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse58 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor59 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest60 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse61 = null;
        org.springframework.web.servlet.ModelAndView modelAndView63 = null;
        breadCrumbInterceptor59.postHandle(httpServletRequest60, httpServletResponse61, (java.lang.Object) "", modelAndView63);
        java.lang.Exception exception65 = null;
        breadCrumbInterceptor56.afterCompletion(httpServletRequest57, httpServletResponse58, (java.lang.Object) breadCrumbInterceptor59, exception65);
        javax.servlet.http.HttpServletRequest httpServletRequest67 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse68 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.Exception exception74 = null;
        breadCrumbInterceptor56.afterCompletion(httpServletRequest67, httpServletResponse68, (java.lang.Object) false, exception74);
        javax.servlet.http.HttpServletRequest httpServletRequest76 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse77 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink82 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView83 = null;
        breadCrumbInterceptor56.postHandle(httpServletRequest76, httpServletResponse77, (java.lang.Object) breadCrumbLink82, modelAndView83);
        breadCrumbLink44.setParent(breadCrumbLink82);
        boolean boolean86 = breadCrumbLink82.isCurrentPage();
        breadCrumbLink4.addNext(breadCrumbLink82);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink88 = breadCrumbLink82.getParent();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink88);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink25.addNext(breadCrumbLink31);
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) breadCrumbLink31, modelAndView34);
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) breadCrumbLink31, modelAndView36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink44.addNext(breadCrumbLink49);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink44.getPrevious();
        java.lang.String str52 = breadCrumbLink44.getFamily();
        breadCrumbLink44.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink59.addNext(breadCrumbLink64);
        breadCrumbLink64.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str73 = breadCrumbLink72.getParentKey();
        breadCrumbLink72.setLabel("hi!");
        breadCrumbLink64.addNext(breadCrumbLink72);
        breadCrumbLink44.setPrevious(breadCrumbLink72);
        org.springframework.web.servlet.ModelAndView modelAndView78 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest38, httpServletResponse39, (java.lang.Object) breadCrumbLink44, modelAndView78);
        breadCrumbLink44.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        breadCrumbLink21.setCurrentPage(true);
        boolean boolean30 = breadCrumbLink21.isCurrentPage();
        java.lang.String str31 = breadCrumbLink21.getParentKey();
        breadCrumbLink21.setLabel("hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink21.setLabel("hi!");
        breadCrumbLink21.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        java.lang.String str20 = breadCrumbLink4.getLabel();
        java.lang.String str21 = breadCrumbLink4.getParentKey();
        java.lang.String str22 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink23);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        java.lang.String str32 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink37.addNext(breadCrumbLink42);
        breadCrumbLink37.setCurrentPage(true);
        boolean boolean46 = breadCrumbLink37.isCurrentPage();
        java.lang.String str47 = breadCrumbLink37.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList48 = breadCrumbLink37.getNext();
        java.lang.String str49 = breadCrumbLink37.getUrl();
        breadCrumbLink4.setPrevious(breadCrumbLink37);
        breadCrumbLink4.setCurrentPage(false);
        java.lang.String str53 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        boolean boolean14 = breadCrumbLink9.isCurrentPage();
        java.lang.String str15 = breadCrumbLink9.getParentKey();
        java.lang.String str16 = breadCrumbLink9.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = breadCrumbLink9.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink22.setCurrentPage(true);
        boolean boolean31 = breadCrumbLink22.isCurrentPage();
        java.lang.String str32 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink22.setParent(breadCrumbLink39);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink45.addNext(breadCrumbLink50);
        breadCrumbLink45.setCurrentPage(true);
        boolean boolean54 = breadCrumbLink45.isCurrentPage();
        java.lang.String str55 = breadCrumbLink45.getParentKey();
        breadCrumbLink45.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink45.setParent(breadCrumbLink62);
        breadCrumbLink22.addNext(breadCrumbLink62);
        breadCrumbLink9.setPrevious(breadCrumbLink22);
        breadCrumbLink9.setUrl("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList68 = breadCrumbLink9.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList68);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor15 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor18 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        org.springframework.web.servlet.ModelAndView modelAndView22 = null;
        breadCrumbInterceptor18.postHandle(httpServletRequest19, httpServletResponse20, (java.lang.Object) "", modelAndView22);
        java.lang.Exception exception24 = null;
        breadCrumbInterceptor15.afterCompletion(httpServletRequest16, httpServletResponse17, (java.lang.Object) breadCrumbInterceptor18, exception24);
        javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse27 = null;
        java.lang.Exception exception29 = null;
        breadCrumbInterceptor18.afterCompletion(httpServletRequest26, httpServletResponse27, (java.lang.Object) 0L, exception29);
        javax.servlet.http.HttpServletRequest httpServletRequest31 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse32 = null;
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor18.postHandle(httpServletRequest31, httpServletResponse32, (java.lang.Object) 1, modelAndView34);
        javax.servlet.http.HttpServletRequest httpServletRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean43 = breadCrumbLink42.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = null;
        breadCrumbLink42.setPrevious(breadCrumbLink44);
        boolean boolean46 = breadCrumbLink42.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = breadCrumbLink42.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView48 = null;
        breadCrumbInterceptor18.postHandle(httpServletRequest36, httpServletResponse37, (java.lang.Object) breadCrumbLink42, modelAndView48);
        breadCrumbLink4.addNext(breadCrumbLink42);
        breadCrumbLink42.setParentKey("");
        boolean boolean53 = breadCrumbLink42.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList51 = breadCrumbLink44.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = breadCrumbLink44.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink52);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink12.addNext(breadCrumbLink17);
        breadCrumbLink12.setCurrentPage(true);
        boolean boolean21 = breadCrumbLink12.isCurrentPage();
        java.lang.String str22 = breadCrumbLink12.getFamily();
        java.lang.Exception exception23 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest6, httpServletResponse7, (java.lang.Object) breadCrumbLink12, exception23);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList25 = breadCrumbLink12.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList31 = breadCrumbLink30.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink36.setCurrentPage(true);
        boolean boolean45 = breadCrumbLink36.isCurrentPage();
        java.lang.String str46 = breadCrumbLink36.getParentKey();
        breadCrumbLink36.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink36.setParent(breadCrumbLink53);
        breadCrumbLink30.addNext(breadCrumbLink53);
        breadCrumbLink12.setPrevious(breadCrumbLink53);
        java.lang.String str57 = breadCrumbLink53.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.addNext(breadCrumbLink15);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink22.setCurrentPage(true);
        boolean boolean31 = breadCrumbLink22.isCurrentPage();
        java.lang.String str32 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink22.setParent(breadCrumbLink39);
        breadCrumbLink22.setLabel("");
        java.lang.String str43 = breadCrumbLink22.getFamily();
        breadCrumbLink9.addNext(breadCrumbLink22);
        breadCrumbLink22.setLabel("hi!");
        java.lang.String str47 = breadCrumbLink22.getParentKey();
        breadCrumbLink22.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        java.lang.String str8 = breadCrumbLink4.getParentKey();
        java.lang.String str9 = breadCrumbLink4.getLabel();
        java.lang.String str10 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        breadCrumbLink27.setCurrentPage(false);
        org.springframework.web.servlet.ModelAndView modelAndView39 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, modelAndView39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        java.lang.Object obj43 = null;
        java.lang.Exception exception44 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest41, httpServletResponse42, obj43, exception44);
        javax.servlet.http.HttpServletRequest httpServletRequest46 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse47 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink52.addNext(breadCrumbLink57);
        breadCrumbLink57.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = breadCrumbLink57.getParent();
        org.springframework.web.servlet.ModelAndView modelAndView62 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest46, httpServletResponse47, (java.lang.Object) breadCrumbLink57, modelAndView62);
        javax.servlet.http.HttpServletRequest httpServletRequest64 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse65 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink70.addNext(breadCrumbLink75);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink77 = breadCrumbLink70.getPrevious();
        java.lang.String str78 = breadCrumbLink70.getFamily();
        breadCrumbLink70.setLabel("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList81 = breadCrumbLink70.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink82 = breadCrumbLink70.getPrevious();
        java.lang.Exception exception83 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest64, httpServletResponse65, (java.lang.Object) breadCrumbLink70, exception83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink82);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        java.lang.String str32 = breadCrumbLink4.getParentKey();
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
        java.lang.String str62 = breadCrumbLink51.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink51.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink68.addNext(breadCrumbLink73);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = breadCrumbLink68.getPrevious();
        java.lang.String str76 = breadCrumbLink68.getFamily();
        breadCrumbLink68.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = breadCrumbLink68.getParent();
        java.lang.String str80 = breadCrumbLink68.getLabel();
        breadCrumbLink51.addNext(breadCrumbLink68);
        breadCrumbLink4.addNext(breadCrumbLink51);
        breadCrumbLink4.setCurrentPage(false);
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink12.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink17.getPrevious();
        breadCrumbLink17.setParentKey("");
        breadCrumbLink17.setUrl("");
        breadCrumbLink17.setFamily("hi!");
        org.springframework.web.servlet.ModelAndView modelAndView26 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (java.lang.Object) breadCrumbLink17, modelAndView26);
        javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse29 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink34.addNext(breadCrumbLink39);
        breadCrumbLink39.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = breadCrumbLink39.getParent();
        boolean boolean44 = breadCrumbLink39.isCurrentPage();
        java.lang.String str45 = breadCrumbLink39.getParentKey();
        java.lang.String str46 = breadCrumbLink39.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = breadCrumbLink39.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink52.addNext(breadCrumbLink57);
        breadCrumbLink52.setCurrentPage(true);
        boolean boolean61 = breadCrumbLink52.isCurrentPage();
        java.lang.String str62 = breadCrumbLink52.getParentKey();
        breadCrumbLink52.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink52.setParent(breadCrumbLink69);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink80 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink75.addNext(breadCrumbLink80);
        breadCrumbLink75.setCurrentPage(true);
        boolean boolean84 = breadCrumbLink75.isCurrentPage();
        java.lang.String str85 = breadCrumbLink75.getParentKey();
        breadCrumbLink75.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink92 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink75.setParent(breadCrumbLink92);
        breadCrumbLink52.addNext(breadCrumbLink92);
        breadCrumbLink39.setPrevious(breadCrumbLink52);
        org.springframework.web.servlet.ModelAndView modelAndView96 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest28, httpServletResponse29, (java.lang.Object) breadCrumbLink52, modelAndView96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str37 = breadCrumbLink36.getParentKey();
        breadCrumbLink36.setLabel("hi!");
        breadCrumbLink36.setCurrentPage(false);
        breadCrumbLink26.addNext(breadCrumbLink36);
        java.lang.String str43 = breadCrumbLink26.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink4.setLabel("");
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean14 = breadCrumbLink13.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = null;
        breadCrumbLink13.setPrevious(breadCrumbLink15);
        java.lang.String str17 = breadCrumbLink13.getParentKey();
        breadCrumbLink13.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        breadCrumbLink29.setUrl("hi!");
        breadCrumbLink29.setParentKey("");
        breadCrumbLink29.setFamily("");
        breadCrumbLink29.setCurrentPage(false);
        breadCrumbLink29.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList41 = breadCrumbLink29.getNext();
        java.lang.String str42 = breadCrumbLink29.getParentKey();
        breadCrumbLink13.setPrevious(breadCrumbLink29);
        breadCrumbLink4.setPrevious(breadCrumbLink13);
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink52);
        breadCrumbLink52.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink47);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        breadCrumbLink29.setUrl("hi!");
        breadCrumbLink29.setCurrentPage(true);
        breadCrumbLink4.setPrevious(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink4.setPrevious(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink40.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        breadCrumbLink47.setCurrentPage(true);
        boolean boolean56 = breadCrumbLink47.isCurrentPage();
        java.lang.String str57 = breadCrumbLink47.getFamily();
        breadCrumbLink47.setUrl("");
        java.lang.String str60 = breadCrumbLink47.getUrl();
        breadCrumbLink47.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink67.addNext(breadCrumbLink72);
        breadCrumbLink72.setUrl("hi!");
        breadCrumbLink72.setCurrentPage(true);
        breadCrumbLink47.setPrevious(breadCrumbLink72);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink83 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink47.setPrevious(breadCrumbLink83);
        java.lang.String str85 = breadCrumbLink47.getFamily();
        java.lang.String str86 = breadCrumbLink47.getParentKey();
        breadCrumbLink47.setLabel("");
        breadCrumbLink40.addNext(breadCrumbLink47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "" + "'", str85.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        java.lang.Exception exception24 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) (short) 0, exception24);
        javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse27 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        breadCrumbLink37.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str46 = breadCrumbLink45.getParentKey();
        breadCrumbLink45.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str54 = breadCrumbLink53.getParentKey();
        breadCrumbLink53.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = breadCrumbLink53.getParent();
        breadCrumbLink45.setParent(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink45.getPrevious();
        breadCrumbLink37.setParent(breadCrumbLink45);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList61 = breadCrumbLink45.getNext();
        breadCrumbLink45.setFamily("hi!");
        breadCrumbLink45.setCurrentPage(true);
        org.springframework.web.servlet.ModelAndView modelAndView66 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest26, httpServletResponse27, (java.lang.Object) breadCrumbLink45, modelAndView66);
        java.lang.String str68 = breadCrumbLink45.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        java.lang.String str15 = breadCrumbLink9.getParentKey();
        java.lang.String str16 = breadCrumbLink9.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList17 = breadCrumbLink9.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink22.setCurrentPage(true);
        boolean boolean31 = breadCrumbLink22.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink36.setCurrentPage(true);
        boolean boolean45 = breadCrumbLink36.isCurrentPage();
        breadCrumbLink22.setPrevious(breadCrumbLink36);
        java.lang.String str47 = breadCrumbLink36.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink36);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = breadCrumbLink9.getParent();
        boolean boolean50 = breadCrumbLink49.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setUrl("");
        java.lang.String str40 = breadCrumbLink27.getFamily();
        java.lang.String str41 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getParent();
        breadCrumbLink27.setPrevious(breadCrumbLink46);
        java.lang.Exception exception50 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, exception50);
        java.lang.String str52 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setLabel("hi!");
        breadCrumbLink27.setUrl("");
        breadCrumbLink27.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str64 = breadCrumbLink63.getFamily();
        java.lang.String str65 = breadCrumbLink63.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = breadCrumbLink63.getPrevious();
        breadCrumbLink63.setUrl("hi!");
        breadCrumbLink27.setPrevious(breadCrumbLink63);
        boolean boolean70 = breadCrumbLink27.isCurrentPage();
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
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = breadCrumbLink9.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList19 = breadCrumbLink18.getNext();
        breadCrumbLink18.setCurrentPage(true);
        breadCrumbLink18.setUrl("");
        breadCrumbLink18.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean28 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink33.addNext(breadCrumbLink38);
        breadCrumbLink38.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        breadCrumbLink38.addNext(breadCrumbLink46);
        boolean boolean51 = breadCrumbLink38.isCurrentPage();
        breadCrumbLink27.addNext(breadCrumbLink38);
        java.lang.Exception exception53 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, exception53);
        breadCrumbLink27.setCurrentPage(true);
        java.lang.String str57 = breadCrumbLink27.getFamily();
        boolean boolean58 = breadCrumbLink27.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setFamily("");
        java.lang.String str11 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink16.addNext(breadCrumbLink21);
        breadCrumbLink21.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str30 = breadCrumbLink29.getParentKey();
        breadCrumbLink29.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str38 = breadCrumbLink37.getParentKey();
        breadCrumbLink37.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = breadCrumbLink37.getParent();
        breadCrumbLink29.setParent(breadCrumbLink41);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = breadCrumbLink29.getPrevious();
        breadCrumbLink21.setParent(breadCrumbLink29);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList45 = breadCrumbLink29.getNext();
        breadCrumbLink29.setUrl("hi!");
        java.lang.String str48 = breadCrumbLink29.getFamily();
        breadCrumbLink4.setPrevious(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getParent();
        java.lang.String str6 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("hi!");
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getUrl();
        breadCrumbLink15.setFamily("hi!");
        breadCrumbLink4.setPrevious(breadCrumbLink15);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList20 = breadCrumbLink15.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList20);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink25.addNext(breadCrumbLink31);
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) breadCrumbLink31, modelAndView34);
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) breadCrumbLink31, modelAndView36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink44.addNext(breadCrumbLink49);
        java.lang.String str51 = breadCrumbLink44.getFamily();
        breadCrumbLink44.setCurrentPage(false);
        java.lang.Exception exception54 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest38, httpServletResponse39, (java.lang.Object) false, exception54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink7 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink7.addNext(breadCrumbLink12);
        breadCrumbLink7.setCurrentPage(true);
        boolean boolean16 = breadCrumbLink7.isCurrentPage();
        java.lang.String str17 = breadCrumbLink7.getFamily();
        breadCrumbLink7.setUrl("");
        java.lang.String str20 = breadCrumbLink7.getUrl();
        breadCrumbLink7.setParentKey("");
        java.lang.String str23 = breadCrumbLink7.getLabel();
        breadCrumbLink7.setCurrentPage(false);
        breadCrumbLink7.setParentKey("hi!");
        java.lang.Exception exception28 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) "hi!", exception28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean15 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest17, httpServletResponse18, (java.lang.Object) "", modelAndView20);
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        java.lang.Object obj24 = null;
        org.springframework.web.servlet.ModelAndView modelAndView25 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest22, httpServletResponse23, obj24, modelAndView25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        java.lang.Exception exception30 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (java.lang.Object) true, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str39 = breadCrumbLink38.getParentKey();
        breadCrumbLink38.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink46.getParent();
        breadCrumbLink38.setParent(breadCrumbLink50);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = breadCrumbLink38.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView53 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest32, httpServletResponse33, (java.lang.Object) breadCrumbLink38, modelAndView53);
        breadCrumbLink38.setParentKey("");
        java.lang.String str57 = breadCrumbLink38.getParentKey();
        breadCrumbLink4.setParent(breadCrumbLink38);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink59);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean15 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest17, httpServletResponse18, (java.lang.Object) "", modelAndView20);
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        java.lang.Object obj24 = null;
        org.springframework.web.servlet.ModelAndView modelAndView25 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest22, httpServletResponse23, obj24, modelAndView25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        java.lang.Exception exception30 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (java.lang.Object) true, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str39 = breadCrumbLink38.getParentKey();
        breadCrumbLink38.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink46.getParent();
        breadCrumbLink38.setParent(breadCrumbLink50);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = breadCrumbLink38.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView53 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest32, httpServletResponse33, (java.lang.Object) breadCrumbLink38, modelAndView53);
        breadCrumbLink38.setParentKey("");
        java.lang.String str57 = breadCrumbLink38.getParentKey();
        breadCrumbLink4.setParent(breadCrumbLink38);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean64 = breadCrumbLink63.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink65 = null;
        breadCrumbLink63.setPrevious(breadCrumbLink65);
        java.lang.String str67 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("");
        breadCrumbLink63.setParentKey("hi!");
        breadCrumbLink38.setParent(breadCrumbLink63);
        java.lang.Class<?> wildcardClass73 = breadCrumbLink38.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        java.lang.String str11 = breadCrumbLink4.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink22.getPrevious();
        breadCrumbLink22.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean32 = breadCrumbLink31.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = null;
        breadCrumbLink31.setPrevious(breadCrumbLink33);
        breadCrumbLink22.setPrevious(breadCrumbLink31);
        boolean boolean36 = breadCrumbLink22.isCurrentPage();
        breadCrumbLink22.setLabel("");
        boolean boolean39 = breadCrumbLink22.isCurrentPage();
        breadCrumbLink22.setUrl("hi!");
        breadCrumbLink4.setPrevious(breadCrumbLink22);
        java.lang.String str43 = breadCrumbLink22.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.lang.String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setUrl("");
        breadCrumbLink4.setUrl("");
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList11 = breadCrumbLink4.getNext();
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        breadCrumbLink18.setCurrentPage(true);
        boolean boolean27 = breadCrumbLink18.isCurrentPage();
        java.lang.String str28 = breadCrumbLink18.getParentKey();
        breadCrumbLink18.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink18.setParent(breadCrumbLink35);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink41.addNext(breadCrumbLink46);
        breadCrumbLink41.setCurrentPage(true);
        boolean boolean50 = breadCrumbLink41.isCurrentPage();
        java.lang.String str51 = breadCrumbLink41.getParentKey();
        breadCrumbLink41.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink41.setParent(breadCrumbLink58);
        breadCrumbLink18.addNext(breadCrumbLink58);
        breadCrumbLink58.setUrl("");
        breadCrumbLink4.setPrevious(breadCrumbLink58);
        breadCrumbLink4.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList12 = breadCrumbLink11.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.addNext(breadCrumbLink15);
        breadCrumbLink9.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        breadCrumbLink9.setLabel("");
        java.lang.String str21 = breadCrumbLink9.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList27 = breadCrumbLink26.getNext();
        java.lang.String str28 = breadCrumbLink26.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink26);
        java.lang.String str30 = breadCrumbLink26.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink9.addNext(breadCrumbLink14);
        breadCrumbLink9.setCurrentPage(true);
        boolean boolean18 = breadCrumbLink9.isCurrentPage();
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor21 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor24 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest25, httpServletResponse26, (java.lang.Object) "", modelAndView28);
        java.lang.Exception exception30 = null;
        breadCrumbInterceptor21.afterCompletion(httpServletRequest22, httpServletResponse23, (java.lang.Object) breadCrumbInterceptor24, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.Exception exception39 = null;
        breadCrumbInterceptor21.afterCompletion(httpServletRequest32, httpServletResponse33, (java.lang.Object) false, exception39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView48 = null;
        breadCrumbInterceptor21.postHandle(httpServletRequest41, httpServletResponse42, (java.lang.Object) breadCrumbLink47, modelAndView48);
        breadCrumbLink9.setParent(breadCrumbLink47);
        java.lang.String str51 = breadCrumbLink47.getUrl();
        breadCrumbLink47.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink58.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList61 = breadCrumbLink58.getNext();
        breadCrumbLink47.setParent(breadCrumbLink58);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink47.getPrevious();
        breadCrumbLink4.setParent(breadCrumbLink47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink63);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.lang.String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("hi!");
        java.lang.String str12 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = breadCrumbLink17.getParent();
        java.lang.String str19 = breadCrumbLink17.getUrl();
        breadCrumbLink17.setParentKey("hi!");
        breadCrumbLink17.setCurrentPage(false);
        breadCrumbLink4.setParent(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink29.addNext(breadCrumbLink34);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = breadCrumbLink29.getPrevious();
        java.lang.String str37 = breadCrumbLink29.getFamily();
        breadCrumbLink29.setLabel("hi!");
        boolean boolean40 = breadCrumbLink29.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor41 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        org.springframework.web.servlet.ModelAndView modelAndView45 = null;
        breadCrumbInterceptor41.postHandle(httpServletRequest42, httpServletResponse43, (java.lang.Object) "", modelAndView45);
        javax.servlet.http.HttpServletRequest httpServletRequest47 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse48 = null;
        java.lang.Object obj49 = null;
        org.springframework.web.servlet.ModelAndView modelAndView50 = null;
        breadCrumbInterceptor41.postHandle(httpServletRequest47, httpServletResponse48, obj49, modelAndView50);
        javax.servlet.http.HttpServletRequest httpServletRequest52 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse53 = null;
        java.lang.Exception exception55 = null;
        breadCrumbInterceptor41.afterCompletion(httpServletRequest52, httpServletResponse53, (java.lang.Object) true, exception55);
        javax.servlet.http.HttpServletRequest httpServletRequest57 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse58 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str64 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str72 = breadCrumbLink71.getParentKey();
        breadCrumbLink71.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = breadCrumbLink71.getParent();
        breadCrumbLink63.setParent(breadCrumbLink75);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink77 = breadCrumbLink63.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView78 = null;
        breadCrumbInterceptor41.postHandle(httpServletRequest57, httpServletResponse58, (java.lang.Object) breadCrumbLink63, modelAndView78);
        breadCrumbLink63.setParentKey("");
        java.lang.String str82 = breadCrumbLink63.getParentKey();
        breadCrumbLink29.setParent(breadCrumbLink63);
        boolean boolean84 = breadCrumbLink29.isCurrentPage();
        breadCrumbLink4.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink86 = breadCrumbLink29.getPrevious();
        java.lang.String str87 = breadCrumbLink29.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "" + "'", str82.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getPrevious();
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setUrl("");
        java.lang.String str16 = breadCrumbLink9.getUrl();
        java.lang.String str17 = breadCrumbLink9.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setParentKey("hi!");
        java.lang.String str26 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink31.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList34 = breadCrumbLink31.getNext();
        java.lang.String str35 = breadCrumbLink31.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink40.setCurrentPage(true);
        boolean boolean49 = breadCrumbLink40.isCurrentPage();
        java.lang.String str50 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink40.setParent(breadCrumbLink57);
        breadCrumbLink31.setParent(breadCrumbLink40);
        breadCrumbLink4.setParent(breadCrumbLink31);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink65 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink65.addNext(breadCrumbLink70);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = breadCrumbLink65.getPrevious();
        java.lang.String str73 = breadCrumbLink65.getFamily();
        breadCrumbLink31.setPrevious(breadCrumbLink65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        java.lang.String str26 = breadCrumbLink17.getLabel();
        java.lang.Exception exception27 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) str26, exception27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink40.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest29, httpServletResponse30, (java.lang.Object) breadCrumbLink40, modelAndView43);
        javax.servlet.http.HttpServletRequest httpServletRequest45 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse46 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str52 = breadCrumbLink51.getFamily();
        java.lang.String str53 = breadCrumbLink51.getFamily();
        breadCrumbLink51.setParentKey("");
        java.lang.String str56 = breadCrumbLink51.getFamily();
        org.springframework.web.servlet.ModelAndView modelAndView57 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest45, httpServletResponse46, (java.lang.Object) breadCrumbLink51, modelAndView57);
        javax.servlet.http.HttpServletRequest httpServletRequest59 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse60 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink65 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink65.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList68 = breadCrumbLink65.getNext();
        java.lang.String str69 = breadCrumbLink65.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean75 = breadCrumbLink74.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = null;
        breadCrumbLink74.setPrevious(breadCrumbLink76);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink78 = breadCrumbLink74.getPrevious();
        java.lang.String str79 = breadCrumbLink74.getParentKey();
        breadCrumbLink74.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink82 = breadCrumbLink74.getParent();
        breadCrumbLink74.setFamily("");
        breadCrumbLink74.setCurrentPage(true);
        breadCrumbLink65.setPrevious(breadCrumbLink74);
        java.lang.String str88 = breadCrumbLink65.getFamily();
        java.lang.Exception exception89 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest59, httpServletResponse60, (java.lang.Object) str88, exception89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "" + "'", str88.equals(""));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        java.lang.String str20 = breadCrumbLink9.getUrl();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor21 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor24 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest25, httpServletResponse26, (java.lang.Object) "", modelAndView28);
        java.lang.Exception exception30 = null;
        breadCrumbInterceptor21.afterCompletion(httpServletRequest22, httpServletResponse23, (java.lang.Object) breadCrumbInterceptor24, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        java.lang.Exception exception35 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest32, httpServletResponse33, (java.lang.Object) 0L, exception35);
        javax.servlet.http.HttpServletRequest httpServletRequest37 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse38 = null;
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest37, httpServletResponse38, (java.lang.Object) 1, modelAndView40);
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        breadCrumbLink48.setCurrentPage(true);
        boolean boolean57 = breadCrumbLink48.isCurrentPage();
        java.lang.String str58 = breadCrumbLink48.getFamily();
        breadCrumbLink48.setUrl("");
        java.lang.String str61 = breadCrumbLink48.getFamily();
        java.lang.String str62 = breadCrumbLink48.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str68 = breadCrumbLink67.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = breadCrumbLink67.getParent();
        breadCrumbLink48.setPrevious(breadCrumbLink67);
        java.lang.Exception exception71 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest42, httpServletResponse43, (java.lang.Object) breadCrumbLink48, exception71);
        java.lang.String str73 = breadCrumbLink48.getFamily();
        breadCrumbLink9.setParent(breadCrumbLink48);
        boolean boolean75 = breadCrumbLink9.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = breadCrumbLink9.getParent();
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink76);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        java.lang.String str19 = breadCrumbLink9.getParentKey();
        breadCrumbLink9.setFamily("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = breadCrumbLink9.getParent();
        breadCrumbLink9.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink22);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        boolean boolean14 = breadCrumbLink9.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        breadCrumbLink19.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink32.getPrevious();
        java.lang.String str40 = breadCrumbLink32.getFamily();
        breadCrumbLink32.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink47.addNext(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink47.getPrevious();
        java.lang.String str55 = breadCrumbLink47.getFamily();
        breadCrumbLink47.setUrl("hi!");
        breadCrumbLink32.addNext(breadCrumbLink47);
        breadCrumbLink19.setPrevious(breadCrumbLink47);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList60 = breadCrumbLink19.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = breadCrumbLink19.getPrevious();
        java.lang.String str62 = breadCrumbLink61.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink61.setParent(breadCrumbLink67);
        breadCrumbLink9.setPrevious(breadCrumbLink61);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink74.addNext(breadCrumbLink79);
        breadCrumbLink79.setUrl("hi!");
        breadCrumbLink79.setParentKey("");
        breadCrumbLink79.setFamily("");
        breadCrumbLink79.setCurrentPage(false);
        breadCrumbLink79.setLabel("");
        java.lang.String str91 = breadCrumbLink79.getLabel();
        java.lang.String str92 = breadCrumbLink79.getFamily();
        breadCrumbLink61.setParent(breadCrumbLink79);
        java.lang.String str94 = breadCrumbLink61.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink9.addNext(breadCrumbLink14);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink9.getPrevious();
        java.lang.String str17 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        java.lang.String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink9.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        boolean boolean47 = breadCrumbLink40.isCurrentPage();
        breadCrumbLink24.setPrevious(breadCrumbLink40);
        java.lang.String str49 = breadCrumbLink24.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink24.getParent();
        breadCrumbLink24.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        breadCrumbLink57.setCurrentPage(true);
        boolean boolean66 = breadCrumbLink57.isCurrentPage();
        java.lang.String str67 = breadCrumbLink57.getFamily();
        breadCrumbLink57.setUrl("");
        java.lang.String str70 = breadCrumbLink57.getFamily();
        java.lang.String str71 = breadCrumbLink57.getFamily();
        breadCrumbLink24.addNext(breadCrumbLink57);
        breadCrumbLink4.setPrevious(breadCrumbLink24);
        breadCrumbLink24.setParentKey("");
        java.lang.String str76 = breadCrumbLink24.getLabel();
        java.lang.String str77 = breadCrumbLink24.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor17 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        java.lang.String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink24.setFamily("");
        java.lang.Exception exception37 = null;
        breadCrumbInterceptor17.afterCompletion(httpServletRequest18, httpServletResponse19, (java.lang.Object) breadCrumbLink24, exception37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str60 = breadCrumbLink59.getParentKey();
        breadCrumbLink59.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink59.getParent();
        breadCrumbLink59.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList66 = breadCrumbLink59.getNext();
        breadCrumbLink43.setParent(breadCrumbLink59);
        breadCrumbLink24.setPrevious(breadCrumbLink59);
        breadCrumbLink4.setParent(breadCrumbLink24);
        breadCrumbLink4.setUrl("");
        boolean boolean72 = breadCrumbLink4.isCurrentPage();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList22 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList22);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        java.lang.String str16 = breadCrumbLink4.getLabel();
        breadCrumbLink4.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        java.lang.String str5 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str11 = breadCrumbLink10.getParentKey();
        breadCrumbLink10.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor14 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink26.addNext(breadCrumbLink32);
        org.springframework.web.servlet.ModelAndView modelAndView35 = null;
        breadCrumbInterceptor14.postHandle(httpServletRequest15, httpServletResponse16, (java.lang.Object) breadCrumbLink32, modelAndView35);
        breadCrumbLink10.addNext(breadCrumbLink32);
        java.lang.String str38 = breadCrumbLink10.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        java.lang.String str55 = breadCrumbLink43.getUrl();
        breadCrumbLink10.setPrevious(breadCrumbLink43);
        breadCrumbLink10.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink10.getPrevious();
        breadCrumbLink4.setPrevious(breadCrumbLink59);
        breadCrumbLink4.setParentKey("");
        java.lang.String str63 = breadCrumbLink4.getFamily();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getPrevious();
        java.lang.String str6 = breadCrumbLink4.getParentKey();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList7 = breadCrumbLink4.getNext();
        breadCrumbLink4.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList10 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        java.lang.String str15 = breadCrumbLink9.getParentKey();
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
        java.lang.String str50 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink40.setParent(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink63.addNext(breadCrumbLink68);
        breadCrumbLink63.setCurrentPage(true);
        boolean boolean72 = breadCrumbLink63.isCurrentPage();
        java.lang.String str73 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink80 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink63.setParent(breadCrumbLink80);
        breadCrumbLink40.addNext(breadCrumbLink80);
        breadCrumbLink80.setUrl("");
        breadCrumbLink80.setFamily("");
        breadCrumbLink26.setPrevious(breadCrumbLink80);
        breadCrumbLink9.addNext(breadCrumbLink80);
        java.lang.String str89 = breadCrumbLink9.getLabel();
        java.lang.String str90 = breadCrumbLink9.getParentKey();
        java.lang.String str91 = breadCrumbLink9.getFamily();
        java.lang.String str92 = breadCrumbLink9.getParentKey();
        java.lang.Class<?> wildcardClass93 = breadCrumbLink9.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.String str33 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink23.setParent(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink46.addNext(breadCrumbLink51);
        breadCrumbLink46.setCurrentPage(true);
        boolean boolean55 = breadCrumbLink46.isCurrentPage();
        java.lang.String str56 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink46.setParent(breadCrumbLink63);
        breadCrumbLink23.addNext(breadCrumbLink63);
        breadCrumbLink63.setUrl("");
        breadCrumbLink63.setFamily("");
        breadCrumbLink9.setPrevious(breadCrumbLink63);
        java.lang.String str71 = breadCrumbLink63.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = breadCrumbLink63.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink72.setCurrentPage(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink72);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.String str33 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink23.setParent(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink46.addNext(breadCrumbLink51);
        breadCrumbLink46.setCurrentPage(true);
        boolean boolean55 = breadCrumbLink46.isCurrentPage();
        java.lang.String str56 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink46.setParent(breadCrumbLink63);
        breadCrumbLink23.addNext(breadCrumbLink63);
        breadCrumbLink63.setUrl("");
        breadCrumbLink63.setFamily("");
        breadCrumbLink9.setPrevious(breadCrumbLink63);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = breadCrumbLink9.getPrevious();
        breadCrumbLink9.setUrl("");
        java.lang.String str74 = breadCrumbLink9.getUrl();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList75 = breadCrumbLink9.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList75);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        breadCrumbLink9.addNext(breadCrumbLink17);
        boolean boolean22 = breadCrumbLink9.isCurrentPage();
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean30 = breadCrumbLink29.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = null;
        breadCrumbLink29.setPrevious(breadCrumbLink31);
        java.lang.String str33 = breadCrumbLink29.getParentKey();
        breadCrumbLink29.setCurrentPage(false);
        boolean boolean36 = breadCrumbLink29.isCurrentPage();
        breadCrumbLink9.setParent(breadCrumbLink29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str39 = breadCrumbLink38.getParentKey();
        breadCrumbLink38.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor42 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest43 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse44 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink49.addNext(breadCrumbLink54);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str61 = breadCrumbLink60.getParentKey();
        breadCrumbLink54.addNext(breadCrumbLink60);
        org.springframework.web.servlet.ModelAndView modelAndView63 = null;
        breadCrumbInterceptor42.postHandle(httpServletRequest43, httpServletResponse44, (java.lang.Object) breadCrumbLink60, modelAndView63);
        breadCrumbLink38.addNext(breadCrumbLink60);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink70.addNext(breadCrumbLink75);
        breadCrumbLink75.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink83 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str84 = breadCrumbLink83.getParentKey();
        breadCrumbLink83.setLabel("hi!");
        breadCrumbLink75.addNext(breadCrumbLink83);
        breadCrumbLink60.addNext(breadCrumbLink83);
        breadCrumbLink9.setParent(breadCrumbLink60);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList90 = breadCrumbLink9.getNext();
        java.lang.String str91 = breadCrumbLink9.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!" + "'", str84.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        java.lang.String str26 = breadCrumbLink17.getLabel();
        java.lang.Exception exception27 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) str26, exception27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink40.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest29, httpServletResponse30, (java.lang.Object) breadCrumbLink40, modelAndView43);
        java.lang.String str45 = breadCrumbLink40.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        breadCrumbLink29.setUrl("hi!");
        breadCrumbLink29.setCurrentPage(true);
        breadCrumbLink4.setPrevious(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = breadCrumbLink40.getPrevious();
        java.lang.String str48 = breadCrumbLink40.getFamily();
        breadCrumbLink40.setUrl("hi!");
        breadCrumbLink40.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        breadCrumbLink62.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = breadCrumbLink62.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink71.addNext(breadCrumbLink76);
        breadCrumbLink76.setUrl("hi!");
        breadCrumbLink76.setParentKey("");
        breadCrumbLink76.setFamily("");
        breadCrumbLink62.addNext(breadCrumbLink76);
        java.lang.String str85 = breadCrumbLink76.getFamily();
        java.lang.String str86 = breadCrumbLink76.getParentKey();
        breadCrumbLink40.setPrevious(breadCrumbLink76);
        breadCrumbLink4.addNext(breadCrumbLink76);
        java.lang.Class<?> wildcardClass89 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "" + "'", str85.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink17.setCurrentPage(true);
        boolean boolean26 = breadCrumbLink17.isCurrentPage();
        java.lang.String str27 = breadCrumbLink17.getFamily();
        breadCrumbLink17.setUrl("");
        java.lang.String str30 = breadCrumbLink17.getUrl();
        breadCrumbLink17.setParentKey("");
        org.springframework.web.servlet.ModelAndView modelAndView33 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) "", modelAndView33);
        javax.servlet.http.HttpServletRequest httpServletRequest35 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse36 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink41.addNext(breadCrumbLink46);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str53 = breadCrumbLink52.getParentKey();
        breadCrumbLink46.setParent(breadCrumbLink52);
        breadCrumbLink46.setCurrentPage(true);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList57 = breadCrumbLink46.getNext();
        java.lang.Exception exception58 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest35, httpServletResponse36, (java.lang.Object) breadCrumbLink46, exception58);
        boolean boolean60 = breadCrumbLink46.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = breadCrumbLink46.getParent();
        java.lang.String str62 = breadCrumbLink61.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) (byte) 100, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink41.addNext(breadCrumbLink46);
        breadCrumbLink41.setCurrentPage(true);
        boolean boolean50 = breadCrumbLink41.isCurrentPage();
        breadCrumbLink27.setPrevious(breadCrumbLink41);
        java.lang.String str52 = breadCrumbLink41.getLabel();
        boolean boolean53 = breadCrumbLink41.isCurrentPage();
        java.lang.Exception exception54 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink41, exception54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean28 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = null;
        breadCrumbLink27.setPrevious(breadCrumbLink29);
        boolean boolean31 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink27.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView33 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, modelAndView33);
        javax.servlet.http.HttpServletRequest httpServletRequest35 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse36 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink41.addNext(breadCrumbLink46);
        breadCrumbLink46.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink46.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink55.addNext(breadCrumbLink60);
        breadCrumbLink60.setUrl("hi!");
        breadCrumbLink60.setParentKey("");
        breadCrumbLink60.setFamily("");
        breadCrumbLink46.addNext(breadCrumbLink60);
        breadCrumbLink60.setParentKey("");
        java.lang.Exception exception71 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest35, httpServletResponse36, (java.lang.Object) breadCrumbLink60, exception71);
        javax.servlet.http.HttpServletRequest httpServletRequest73 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse74 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink84 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink79.addNext(breadCrumbLink84);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink86 = breadCrumbLink79.getPrevious();
        java.lang.String str87 = breadCrumbLink79.getFamily();
        breadCrumbLink79.setParentKey("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList90 = breadCrumbLink79.getNext();
        java.lang.String str91 = breadCrumbLink79.getLabel();
        breadCrumbLink79.setParentKey("");
        java.lang.Exception exception94 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest73, httpServletResponse74, (java.lang.Object) "", exception94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "" + "'", str87.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink23.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor38 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest39 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse40 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor41 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        org.springframework.web.servlet.ModelAndView modelAndView45 = null;
        breadCrumbInterceptor41.postHandle(httpServletRequest42, httpServletResponse43, (java.lang.Object) "", modelAndView45);
        java.lang.Exception exception47 = null;
        breadCrumbInterceptor38.afterCompletion(httpServletRequest39, httpServletResponse40, (java.lang.Object) breadCrumbInterceptor41, exception47);
        javax.servlet.http.HttpServletRequest httpServletRequest49 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse50 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.Exception exception56 = null;
        breadCrumbInterceptor38.afterCompletion(httpServletRequest49, httpServletResponse50, (java.lang.Object) false, exception56);
        javax.servlet.http.HttpServletRequest httpServletRequest58 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse59 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView65 = null;
        breadCrumbInterceptor38.postHandle(httpServletRequest58, httpServletResponse59, (java.lang.Object) breadCrumbLink64, modelAndView65);
        breadCrumbLink64.setCurrentPage(true);
        breadCrumbLink37.addNext(breadCrumbLink64);
        java.lang.String str70 = breadCrumbLink37.getLabel();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink32.setParent(breadCrumbLink37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor18 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        org.springframework.web.servlet.ModelAndView modelAndView22 = null;
        breadCrumbInterceptor18.postHandle(httpServletRequest19, httpServletResponse20, (java.lang.Object) "", modelAndView22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        breadCrumbLink30.setCurrentPage(true);
        boolean boolean39 = breadCrumbLink30.isCurrentPage();
        java.lang.String str40 = breadCrumbLink30.getFamily();
        java.lang.Exception exception41 = null;
        breadCrumbInterceptor18.afterCompletion(httpServletRequest24, httpServletResponse25, (java.lang.Object) breadCrumbLink30, exception41);
        breadCrumbLink30.setFamily("");
        breadCrumbLink15.setParent(breadCrumbLink30);
        java.lang.String str46 = breadCrumbLink15.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList5 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink10.addNext(breadCrumbLink15);
        breadCrumbLink10.setCurrentPage(true);
        boolean boolean19 = breadCrumbLink10.isCurrentPage();
        java.lang.String str20 = breadCrumbLink10.getParentKey();
        breadCrumbLink10.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink10.setParent(breadCrumbLink27);
        breadCrumbLink4.addNext(breadCrumbLink27);
        breadCrumbLink27.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str48 = breadCrumbLink47.getParentKey();
        breadCrumbLink41.setParent(breadCrumbLink47);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink41.getParent();
        java.lang.String str51 = breadCrumbLink41.getFamily();
        java.lang.String str52 = breadCrumbLink41.getParentKey();
        breadCrumbLink41.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean60 = breadCrumbLink59.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = null;
        breadCrumbLink59.setPrevious(breadCrumbLink61);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink59.getPrevious();
        java.lang.String str64 = breadCrumbLink59.getParentKey();
        breadCrumbLink59.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = breadCrumbLink59.getParent();
        breadCrumbLink59.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink74.addNext(breadCrumbLink79);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str86 = breadCrumbLink85.getParentKey();
        breadCrumbLink79.setParent(breadCrumbLink85);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink88 = breadCrumbLink79.getParent();
        breadCrumbLink59.addNext(breadCrumbLink88);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink90 = breadCrumbLink88.getParent();
        breadCrumbLink41.addNext(breadCrumbLink90);
        breadCrumbLink27.addNext(breadCrumbLink90);
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink90.setUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!" + "'", str86.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink90);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        java.lang.String str5 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str11 = breadCrumbLink10.getParentKey();
        breadCrumbLink10.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor14 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink26.addNext(breadCrumbLink32);
        org.springframework.web.servlet.ModelAndView modelAndView35 = null;
        breadCrumbInterceptor14.postHandle(httpServletRequest15, httpServletResponse16, (java.lang.Object) breadCrumbLink32, modelAndView35);
        breadCrumbLink10.addNext(breadCrumbLink32);
        java.lang.String str38 = breadCrumbLink10.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        java.lang.String str55 = breadCrumbLink43.getUrl();
        breadCrumbLink10.setPrevious(breadCrumbLink43);
        breadCrumbLink10.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink10.getPrevious();
        breadCrumbLink4.setPrevious(breadCrumbLink59);
        java.lang.String str61 = breadCrumbLink4.getFamily();
        boolean boolean62 = breadCrumbLink4.isCurrentPage();
        java.lang.String str63 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setLabel("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink64);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        java.lang.String str17 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setCurrentPage(true);
        boolean boolean20 = breadCrumbLink9.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        java.lang.String str32 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink37.addNext(breadCrumbLink42);
        breadCrumbLink37.setCurrentPage(true);
        boolean boolean46 = breadCrumbLink37.isCurrentPage();
        java.lang.String str47 = breadCrumbLink37.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList48 = breadCrumbLink37.getNext();
        java.lang.String str49 = breadCrumbLink37.getUrl();
        breadCrumbLink4.setPrevious(breadCrumbLink37);
        breadCrumbLink4.setCurrentPage(false);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList53 = breadCrumbLink4.getNext();
        java.lang.String str54 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        java.lang.String str13 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = breadCrumbLink4.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = breadCrumbLink14.getParentKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str32 = breadCrumbLink31.getParentKey();
        breadCrumbLink25.addNext(breadCrumbLink31);
        org.springframework.web.servlet.ModelAndView modelAndView34 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) breadCrumbLink31, modelAndView34);
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) breadCrumbLink31, modelAndView36);
        breadCrumbLink31.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink44.addNext(breadCrumbLink49);
        java.lang.String str51 = breadCrumbLink44.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList52 = breadCrumbLink44.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        breadCrumbLink57.setCurrentPage(true);
        boolean boolean66 = breadCrumbLink57.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink71.addNext(breadCrumbLink76);
        breadCrumbLink71.setCurrentPage(true);
        boolean boolean80 = breadCrumbLink71.isCurrentPage();
        breadCrumbLink57.setPrevious(breadCrumbLink71);
        breadCrumbLink44.setPrevious(breadCrumbLink71);
        java.lang.String str83 = breadCrumbLink71.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink84 = breadCrumbLink71.getParent();
        breadCrumbLink31.addNext(breadCrumbLink71);
        java.lang.String str86 = breadCrumbLink71.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink87 = breadCrumbLink71.getPrevious();
        breadCrumbLink71.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink87);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        breadCrumbInterceptor19.postHandle(httpServletRequest20, httpServletResponse21, (java.lang.Object) "", modelAndView23);
        java.lang.Exception exception25 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest17, httpServletResponse18, (java.lang.Object) breadCrumbInterceptor19, exception25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.Exception exception34 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (java.lang.Object) false, exception34);
        javax.servlet.http.HttpServletRequest httpServletRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest36, httpServletResponse37, (java.lang.Object) breadCrumbLink42, modelAndView43);
        breadCrumbLink4.setParent(breadCrumbLink42);
        java.lang.String str46 = breadCrumbLink42.getUrl();
        breadCrumbLink42.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink53.addNext(breadCrumbLink58);
        breadCrumbLink53.setCurrentPage(true);
        boolean boolean62 = breadCrumbLink53.isCurrentPage();
        java.lang.String str63 = breadCrumbLink53.getFamily();
        breadCrumbLink53.setUrl("");
        java.lang.String str66 = breadCrumbLink53.getFamily();
        java.lang.String str67 = breadCrumbLink53.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str73 = breadCrumbLink72.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = breadCrumbLink72.getParent();
        breadCrumbLink53.setPrevious(breadCrumbLink72);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = breadCrumbLink53.getPrevious();
        breadCrumbLink42.setParent(breadCrumbLink76);
        java.lang.String str78 = breadCrumbLink42.getParentKey();
        java.lang.Class<?> wildcardClass79 = breadCrumbLink42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = breadCrumbLink26.getParent();
        breadCrumbLink4.setParent(breadCrumbLink28);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink30);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        boolean boolean23 = breadCrumbLink9.isCurrentPage();
        breadCrumbLink9.setParentKey("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str21 = breadCrumbLink20.getFamily();
        java.lang.String str22 = breadCrumbLink20.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink32.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str41 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        breadCrumbLink32.addNext(breadCrumbLink40);
        boolean boolean45 = breadCrumbLink32.isCurrentPage();
        breadCrumbLink20.setParent(breadCrumbLink32);
        breadCrumbLink20.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink53.addNext(breadCrumbLink58);
        breadCrumbLink53.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink66.addNext(breadCrumbLink71);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = breadCrumbLink66.getPrevious();
        java.lang.String str74 = breadCrumbLink66.getFamily();
        breadCrumbLink66.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink81 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink86 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink81.addNext(breadCrumbLink86);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink88 = breadCrumbLink81.getPrevious();
        java.lang.String str89 = breadCrumbLink81.getFamily();
        breadCrumbLink81.setUrl("hi!");
        breadCrumbLink66.addNext(breadCrumbLink81);
        breadCrumbLink53.setPrevious(breadCrumbLink81);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList94 = breadCrumbLink53.getNext();
        breadCrumbLink53.setUrl("hi!");
        breadCrumbLink20.addNext(breadCrumbLink53);
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink15.setPrevious(breadCrumbLink20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList94);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink4.setLabel("");
        java.lang.String str25 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setCurrentPage(true);
        java.lang.String str30 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean36 = breadCrumbLink35.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = null;
        breadCrumbLink35.setPrevious(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink35.getPrevious();
        java.lang.String str40 = breadCrumbLink35.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = breadCrumbLink35.getParent();
        breadCrumbLink4.setPrevious(breadCrumbLink41);
        java.lang.String str43 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        breadCrumbLink29.setUrl("hi!");
        breadCrumbLink29.setCurrentPage(true);
        breadCrumbLink4.setPrevious(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink4.setPrevious(breadCrumbLink40);
        java.lang.String str42 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setParentKey("");
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        java.lang.String str11 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink18.addNext(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink18.getPrevious();
        java.lang.String str26 = breadCrumbLink18.getFamily();
        breadCrumbLink18.setUrl("hi!");
        breadCrumbLink18.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean36 = breadCrumbLink35.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = null;
        breadCrumbLink35.setPrevious(breadCrumbLink37);
        breadCrumbLink18.setParent(breadCrumbLink35);
        breadCrumbLink4.addNext(breadCrumbLink18);
        breadCrumbLink4.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getPrevious();
        java.lang.String str6 = breadCrumbLink4.getParentKey();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList7 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str13 = breadCrumbLink12.getFamily();
        java.lang.String str14 = breadCrumbLink12.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        breadCrumbLink24.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink32.setLabel("hi!");
        breadCrumbLink24.addNext(breadCrumbLink32);
        boolean boolean37 = breadCrumbLink24.isCurrentPage();
        breadCrumbLink12.setParent(breadCrumbLink24);
        breadCrumbLink24.setFamily("hi!");
        breadCrumbLink4.setParent(breadCrumbLink24);
        java.lang.Class<?> wildcardClass42 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        boolean boolean14 = breadCrumbLink9.isCurrentPage();
        java.lang.String str15 = breadCrumbLink9.getParentKey();
        breadCrumbLink9.setCurrentPage(true);
        java.lang.String str18 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        boolean boolean29 = breadCrumbLink25.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList30 = breadCrumbLink25.getNext();
        java.lang.String str31 = breadCrumbLink25.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = breadCrumbLink36.getPrevious();
        java.lang.String str44 = breadCrumbLink36.getFamily();
        breadCrumbLink36.setUrl("hi!");
        breadCrumbLink36.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean54 = breadCrumbLink53.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = null;
        breadCrumbLink53.setPrevious(breadCrumbLink55);
        breadCrumbLink36.setParent(breadCrumbLink53);
        java.lang.String str58 = breadCrumbLink53.getFamily();
        boolean boolean59 = breadCrumbLink53.isCurrentPage();
        breadCrumbLink53.setParentKey("hi!");
        breadCrumbLink25.setParent(breadCrumbLink53);
        breadCrumbLink9.setParent(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = breadCrumbLink9.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink33);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setUrl("");
        java.lang.String str40 = breadCrumbLink27.getFamily();
        java.lang.String str41 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getParent();
        breadCrumbLink27.setPrevious(breadCrumbLink46);
        java.lang.Exception exception50 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, exception50);
        java.lang.String str52 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setLabel("hi!");
        java.lang.String str55 = breadCrumbLink27.getLabel();
        java.lang.String str56 = breadCrumbLink27.getLabel();
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
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = breadCrumbLink4.getParent();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList14 = breadCrumbLink13.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        breadCrumbLink19.setCurrentPage(true);
        boolean boolean28 = breadCrumbLink19.isCurrentPage();
        java.lang.String str29 = breadCrumbLink19.getParentKey();
        breadCrumbLink19.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink19.setParent(breadCrumbLink36);
        breadCrumbLink13.addNext(breadCrumbLink36);
        breadCrumbLink36.setParentKey("");
        breadCrumbLink4.addNext(breadCrumbLink36);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "hi!");
        boolean boolean47 = breadCrumbLink46.isCurrentPage();
        java.lang.String str48 = breadCrumbLink46.getLabel();
        breadCrumbLink4.setParent(breadCrumbLink46);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList50 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList50);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink9.addNext(breadCrumbLink14);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink9.getPrevious();
        java.lang.String str17 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        java.lang.String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink9.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        boolean boolean47 = breadCrumbLink40.isCurrentPage();
        breadCrumbLink24.setPrevious(breadCrumbLink40);
        java.lang.String str49 = breadCrumbLink24.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink24.getParent();
        breadCrumbLink24.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        breadCrumbLink57.setCurrentPage(true);
        boolean boolean66 = breadCrumbLink57.isCurrentPage();
        java.lang.String str67 = breadCrumbLink57.getFamily();
        breadCrumbLink57.setUrl("");
        java.lang.String str70 = breadCrumbLink57.getFamily();
        java.lang.String str71 = breadCrumbLink57.getFamily();
        breadCrumbLink24.addNext(breadCrumbLink57);
        breadCrumbLink4.setPrevious(breadCrumbLink24);
        breadCrumbLink24.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = breadCrumbLink24.getParent();
        breadCrumbLink24.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink76);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList9 = breadCrumbLink4.getNext();
        java.lang.String str10 = breadCrumbLink4.getLabel();
        java.lang.String str11 = breadCrumbLink4.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink17.getPrevious();
        java.lang.String str25 = breadCrumbLink17.getFamily();
        breadCrumbLink17.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink32.getPrevious();
        java.lang.String str40 = breadCrumbLink32.getFamily();
        breadCrumbLink32.setUrl("hi!");
        breadCrumbLink17.addNext(breadCrumbLink32);
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList45 = breadCrumbLink4.getNext();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setFamily("");
        breadCrumbLink4.setUrl("");
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
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.lang.String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("");
        java.lang.String str12 = breadCrumbLink4.getUrl();
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        java.lang.String str29 = breadCrumbLink18.getParentKey();
        java.lang.String str30 = breadCrumbLink18.getParentKey();
        java.lang.String str31 = breadCrumbLink18.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList32 = breadCrumbLink18.getNext();
        java.lang.String str33 = breadCrumbLink18.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = null;
        breadCrumbLink18.addNext(breadCrumbLink34);
        java.lang.String str36 = breadCrumbLink18.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink41.addNext(breadCrumbLink46);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getPrevious();
        breadCrumbLink46.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean56 = breadCrumbLink55.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = null;
        breadCrumbLink55.setPrevious(breadCrumbLink57);
        breadCrumbLink46.setPrevious(breadCrumbLink55);
        boolean boolean60 = breadCrumbLink46.isCurrentPage();
        breadCrumbLink46.setFamily("");
        java.lang.String str63 = breadCrumbLink46.getFamily();
        breadCrumbLink46.setCurrentPage(false);
        breadCrumbLink18.addNext(breadCrumbLink46);
        java.lang.String str67 = breadCrumbLink46.getParentKey();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        breadCrumbLink9.setFamily("");
        breadCrumbLink9.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink9.getParent();
        breadCrumbLink9.setUrl("");
        java.lang.String str22 = breadCrumbLink9.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str56 = breadCrumbLink55.getParentKey();
        breadCrumbLink55.setLabel("hi!");
        boolean boolean59 = breadCrumbLink55.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList60 = breadCrumbLink55.getNext();
        java.lang.String str61 = breadCrumbLink55.getLabel();
        breadCrumbLink44.setPrevious(breadCrumbLink55);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink44.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean69 = breadCrumbLink68.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = null;
        breadCrumbLink68.setPrevious(breadCrumbLink70);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = breadCrumbLink68.getPrevious();
        java.lang.String str73 = breadCrumbLink68.getParentKey();
        breadCrumbLink68.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink76 = breadCrumbLink68.getParent();
        breadCrumbLink63.setPrevious(breadCrumbLink76);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink76);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setFamily("");
        java.lang.String str51 = breadCrumbLink44.getUrl();
        java.lang.String str52 = breadCrumbLink44.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = null;
        breadCrumbLink57.setPrevious(breadCrumbLink64);
        breadCrumbLink44.setPrevious(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor67 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest68 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse69 = null;
        org.springframework.web.servlet.ModelAndView modelAndView71 = null;
        breadCrumbInterceptor67.postHandle(httpServletRequest68, httpServletResponse69, (java.lang.Object) "", modelAndView71);
        javax.servlet.http.HttpServletRequest httpServletRequest73 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse74 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink84 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink79.addNext(breadCrumbLink84);
        breadCrumbLink79.setCurrentPage(true);
        boolean boolean88 = breadCrumbLink79.isCurrentPage();
        java.lang.String str89 = breadCrumbLink79.getFamily();
        java.lang.Exception exception90 = null;
        breadCrumbInterceptor67.afterCompletion(httpServletRequest73, httpServletResponse74, (java.lang.Object) breadCrumbLink79, exception90);
        breadCrumbLink79.setFamily("");
        breadCrumbLink57.addNext(breadCrumbLink79);
        java.lang.String str95 = breadCrumbLink79.getUrl();
        java.lang.Class<?> wildcardClass96 = breadCrumbLink79.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean12 = breadCrumbLink11.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        breadCrumbLink22.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str31 = breadCrumbLink30.getParentKey();
        breadCrumbLink30.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str39 = breadCrumbLink38.getParentKey();
        breadCrumbLink38.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink38.getParent();
        breadCrumbLink30.setParent(breadCrumbLink42);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = breadCrumbLink30.getPrevious();
        breadCrumbLink22.setParent(breadCrumbLink30);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList46 = breadCrumbLink30.getNext();
        breadCrumbLink11.setParent(breadCrumbLink30);
        breadCrumbLink4.addNext(breadCrumbLink30);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str54 = breadCrumbLink53.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = breadCrumbLink53.getParent();
        breadCrumbLink4.addNext(breadCrumbLink53);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList57 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList57);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink4.getPrevious();
        boolean boolean33 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setParentKey("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str12 = breadCrumbLink11.getFamily();
        breadCrumbLink11.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink11.getParent();
        java.lang.String str16 = breadCrumbLink11.getLabel();
        breadCrumbLink4.addNext(breadCrumbLink11);
        java.lang.String str18 = breadCrumbLink11.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str37 = breadCrumbLink36.getParentKey();
        breadCrumbLink36.setLabel("hi!");
        breadCrumbLink36.setCurrentPage(false);
        breadCrumbLink26.addNext(breadCrumbLink36);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList43 = breadCrumbLink26.getNext();
        breadCrumbLink26.setCurrentPage(true);
        breadCrumbLink26.setCurrentPage(false);
        java.lang.String str48 = breadCrumbLink26.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setFamily("");
        java.lang.String str11 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setFamily("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink14);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = breadCrumbLink9.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList19 = breadCrumbLink18.getNext();
        breadCrumbLink18.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink26.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList29 = breadCrumbLink26.getNext();
        java.lang.String str30 = breadCrumbLink26.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean36 = breadCrumbLink35.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = null;
        breadCrumbLink35.setPrevious(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink35.getPrevious();
        java.lang.String str40 = breadCrumbLink35.getParentKey();
        breadCrumbLink35.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = breadCrumbLink35.getParent();
        breadCrumbLink35.setFamily("");
        breadCrumbLink35.setCurrentPage(true);
        breadCrumbLink26.setPrevious(breadCrumbLink35);
        breadCrumbLink18.setParent(breadCrumbLink35);
        java.lang.String str50 = breadCrumbLink18.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink18.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink51);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        breadCrumbLink15.setCurrentPage(true);
        boolean boolean24 = breadCrumbLink15.isCurrentPage();
        java.lang.String str25 = breadCrumbLink15.getFamily();
        breadCrumbLink15.setUrl("");
        java.lang.String str28 = breadCrumbLink15.getUrl();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList29 = breadCrumbLink15.getNext();
        breadCrumbLink4.addNext(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList29);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = null;
        breadCrumbLink4.addNext(breadCrumbLink20);
        breadCrumbLink4.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink28.addNext(breadCrumbLink33);
        breadCrumbLink28.setCurrentPage(true);
        boolean boolean37 = breadCrumbLink28.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink42.addNext(breadCrumbLink47);
        breadCrumbLink42.setCurrentPage(true);
        boolean boolean51 = breadCrumbLink42.isCurrentPage();
        breadCrumbLink28.setPrevious(breadCrumbLink42);
        java.lang.String str53 = breadCrumbLink42.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink42.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink59.addNext(breadCrumbLink64);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = breadCrumbLink59.getPrevious();
        java.lang.String str67 = breadCrumbLink59.getFamily();
        breadCrumbLink59.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = breadCrumbLink59.getParent();
        java.lang.String str71 = breadCrumbLink59.getLabel();
        breadCrumbLink42.addNext(breadCrumbLink59);
        boolean boolean73 = breadCrumbLink42.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = null;
        breadCrumbLink42.addNext(breadCrumbLink74);
        breadCrumbLink4.addNext(breadCrumbLink42);
        java.lang.Class<?> wildcardClass77 = breadCrumbLink4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink13 = breadCrumbLink9.getParent();
        boolean boolean14 = breadCrumbLink9.isCurrentPage();
        java.lang.String str15 = breadCrumbLink9.getParentKey();
        breadCrumbLink9.setCurrentPage(true);
        java.lang.String str18 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setFamily("");
        java.lang.String str21 = breadCrumbLink9.getFamily();
        java.lang.String str22 = breadCrumbLink9.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "hi!");
        java.lang.String str5 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setFamily("");
        breadCrumbLink4.setLabel("");
        java.lang.String str10 = breadCrumbLink4.getParentKey();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList11 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (java.lang.Object) 0, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "");
        java.lang.Exception exception18 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) "hi!", exception18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink26.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink34 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink34.setUrl("");
        breadCrumbLink26.addNext(breadCrumbLink34);
        org.springframework.web.servlet.ModelAndView modelAndView38 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest20, httpServletResponse21, (java.lang.Object) breadCrumbLink26, modelAndView38);
        javax.servlet.http.HttpServletRequest httpServletRequest40 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse41 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean47 = breadCrumbLink46.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = null;
        breadCrumbLink46.setPrevious(breadCrumbLink48);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = breadCrumbLink46.getPrevious();
        java.lang.String str51 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setParentKey("hi!");
        java.lang.Exception exception54 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest40, httpServletResponse41, (java.lang.Object) breadCrumbLink46, exception54);
        java.lang.String str56 = breadCrumbLink46.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor32 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest33 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse34 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink39.addNext(breadCrumbLink44);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink39.getPrevious();
        java.lang.String str47 = breadCrumbLink39.getFamily();
        breadCrumbLink39.setUrl("hi!");
        breadCrumbLink39.setFamily("");
        java.lang.Exception exception52 = null;
        breadCrumbInterceptor32.afterCompletion(httpServletRequest33, httpServletResponse34, (java.lang.Object) breadCrumbLink39, exception52);
        javax.servlet.http.HttpServletRequest httpServletRequest54 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse55 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str61 = breadCrumbLink60.getFamily();
        breadCrumbLink60.setCurrentPage(true);
        org.springframework.web.servlet.ModelAndView modelAndView64 = null;
        breadCrumbInterceptor32.postHandle(httpServletRequest54, httpServletResponse55, (java.lang.Object) breadCrumbLink60, modelAndView64);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink70.addNext(breadCrumbLink75);
        breadCrumbLink70.setCurrentPage(true);
        boolean boolean79 = breadCrumbLink70.isCurrentPage();
        java.lang.String str80 = breadCrumbLink70.getFamily();
        breadCrumbLink70.setUrl("");
        java.lang.String str83 = breadCrumbLink70.getFamily();
        java.lang.String str84 = breadCrumbLink70.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = breadCrumbLink70.getPrevious();
        breadCrumbLink70.setUrl("");
        breadCrumbLink60.setPrevious(breadCrumbLink70);
        breadCrumbLink23.setPrevious(breadCrumbLink70);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink90 = breadCrumbLink23.getPrevious();
        boolean boolean91 = breadCrumbLink23.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink92 = breadCrumbLink23.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink92);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        java.lang.String str5 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str11 = breadCrumbLink10.getParentKey();
        breadCrumbLink10.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor14 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink26.addNext(breadCrumbLink32);
        org.springframework.web.servlet.ModelAndView modelAndView35 = null;
        breadCrumbInterceptor14.postHandle(httpServletRequest15, httpServletResponse16, (java.lang.Object) breadCrumbLink32, modelAndView35);
        breadCrumbLink10.addNext(breadCrumbLink32);
        java.lang.String str38 = breadCrumbLink10.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        java.lang.String str55 = breadCrumbLink43.getUrl();
        breadCrumbLink10.setPrevious(breadCrumbLink43);
        breadCrumbLink10.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = breadCrumbLink10.getPrevious();
        breadCrumbLink4.setPrevious(breadCrumbLink59);
        java.lang.String str61 = breadCrumbLink4.getLabel();
        java.lang.String str62 = breadCrumbLink4.getLabel();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList5 = breadCrumbLink4.getNext();
        java.lang.String str6 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setLabel("");
        breadCrumbLink4.setUrl("hi!");
        java.lang.String str13 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setLabel("hi!");
        java.lang.String str13 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink16);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink7 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink7.addNext(breadCrumbLink12);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = breadCrumbLink7.getPrevious();
        java.lang.String str15 = breadCrumbLink7.getFamily();
        breadCrumbLink7.setUrl("hi!");
        breadCrumbLink7.setFamily("");
        java.lang.Exception exception20 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbLink7, exception20);
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str29 = breadCrumbLink28.getFamily();
        breadCrumbLink28.setCurrentPage(true);
        org.springframework.web.servlet.ModelAndView modelAndView32 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest22, httpServletResponse23, (java.lang.Object) breadCrumbLink28, modelAndView32);
        javax.servlet.http.HttpServletRequest httpServletRequest34 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse35 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink40.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink53.addNext(breadCrumbLink58);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = breadCrumbLink53.getPrevious();
        java.lang.String str61 = breadCrumbLink53.getFamily();
        breadCrumbLink53.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink68.addNext(breadCrumbLink73);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = breadCrumbLink68.getPrevious();
        java.lang.String str76 = breadCrumbLink68.getFamily();
        breadCrumbLink68.setUrl("hi!");
        breadCrumbLink53.addNext(breadCrumbLink68);
        breadCrumbLink40.setPrevious(breadCrumbLink68);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList81 = breadCrumbLink40.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink82 = breadCrumbLink40.getPrevious();
        java.lang.Exception exception83 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest34, httpServletResponse35, (java.lang.Object) breadCrumbLink82, exception83);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink89 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str90 = breadCrumbLink89.getFamily();
        java.lang.String str91 = breadCrumbLink89.getFamily();
        breadCrumbLink89.setParentKey("");
        breadCrumbLink82.setParent(breadCrumbLink89);
        boolean boolean95 = breadCrumbLink89.isCurrentPage();
        breadCrumbLink89.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink7 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink7.addNext(breadCrumbLink12);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = breadCrumbLink7.getPrevious();
        java.lang.String str15 = breadCrumbLink7.getFamily();
        breadCrumbLink7.setUrl("hi!");
        breadCrumbLink7.setFamily("");
        java.lang.Exception exception20 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbLink7, exception20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink26.addNext(breadCrumbLink31);
        breadCrumbLink26.setCurrentPage(true);
        boolean boolean35 = breadCrumbLink26.isCurrentPage();
        java.lang.String str36 = breadCrumbLink26.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList37 = breadCrumbLink26.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str43 = breadCrumbLink42.getParentKey();
        breadCrumbLink42.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink42.getParent();
        breadCrumbLink42.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList49 = breadCrumbLink42.getNext();
        breadCrumbLink26.setParent(breadCrumbLink42);
        breadCrumbLink7.setPrevious(breadCrumbLink42);
        breadCrumbLink7.setFamily("");
        breadCrumbLink7.setCurrentPage(false);
        boolean boolean56 = breadCrumbLink7.isCurrentPage();
        breadCrumbLink7.setFamily("");
        java.lang.String str59 = breadCrumbLink7.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        java.lang.String str20 = breadCrumbLink9.getUrl();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor21 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor24 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest25, httpServletResponse26, (java.lang.Object) "", modelAndView28);
        java.lang.Exception exception30 = null;
        breadCrumbInterceptor21.afterCompletion(httpServletRequest22, httpServletResponse23, (java.lang.Object) breadCrumbInterceptor24, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        java.lang.Exception exception35 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest32, httpServletResponse33, (java.lang.Object) 0L, exception35);
        javax.servlet.http.HttpServletRequest httpServletRequest37 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse38 = null;
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest37, httpServletResponse38, (java.lang.Object) 1, modelAndView40);
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        breadCrumbLink48.setCurrentPage(true);
        boolean boolean57 = breadCrumbLink48.isCurrentPage();
        java.lang.String str58 = breadCrumbLink48.getFamily();
        breadCrumbLink48.setUrl("");
        java.lang.String str61 = breadCrumbLink48.getFamily();
        java.lang.String str62 = breadCrumbLink48.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str68 = breadCrumbLink67.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = breadCrumbLink67.getParent();
        breadCrumbLink48.setPrevious(breadCrumbLink67);
        java.lang.Exception exception71 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest42, httpServletResponse43, (java.lang.Object) breadCrumbLink48, exception71);
        java.lang.String str73 = breadCrumbLink48.getFamily();
        breadCrumbLink9.setParent(breadCrumbLink48);
        boolean boolean75 = breadCrumbLink9.isCurrentPage();
        breadCrumbLink9.setLabel("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink82 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str83 = breadCrumbLink82.getFamily();
        java.lang.String str84 = breadCrumbLink82.getFamily();
        breadCrumbLink82.setParentKey("");
        breadCrumbLink9.setPrevious(breadCrumbLink82);
        java.lang.Class<?> wildcardClass88 = breadCrumbLink82.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        breadCrumbLink4.setUrl("");
        java.lang.String str15 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink17.getPrevious();
        java.lang.String str25 = breadCrumbLink17.getFamily();
        breadCrumbLink17.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink32.getPrevious();
        java.lang.String str40 = breadCrumbLink32.getFamily();
        breadCrumbLink32.setUrl("hi!");
        breadCrumbLink17.addNext(breadCrumbLink32);
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList45 = breadCrumbLink4.getNext();
        breadCrumbLink4.setParentKey("hi!");
        boolean boolean48 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setLabel("");
        java.lang.String str51 = breadCrumbLink4.getParentKey();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str29 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.lang.String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("hi!");
        java.lang.String str12 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = breadCrumbLink17.getParent();
        java.lang.String str19 = breadCrumbLink17.getUrl();
        breadCrumbLink17.setParentKey("hi!");
        breadCrumbLink17.setCurrentPage(false);
        breadCrumbLink4.setParent(breadCrumbLink17);
        breadCrumbLink4.setParentKey("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList27 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList27);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink15);
        breadCrumbLink9.setCurrentPage(true);
        java.lang.String str20 = breadCrumbLink9.getUrl();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor21 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor24 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest25, httpServletResponse26, (java.lang.Object) "", modelAndView28);
        java.lang.Exception exception30 = null;
        breadCrumbInterceptor21.afterCompletion(httpServletRequest22, httpServletResponse23, (java.lang.Object) breadCrumbInterceptor24, exception30);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        java.lang.Exception exception35 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest32, httpServletResponse33, (java.lang.Object) 0L, exception35);
        javax.servlet.http.HttpServletRequest httpServletRequest37 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse38 = null;
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor24.postHandle(httpServletRequest37, httpServletResponse38, (java.lang.Object) 1, modelAndView40);
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        breadCrumbLink48.setCurrentPage(true);
        boolean boolean57 = breadCrumbLink48.isCurrentPage();
        java.lang.String str58 = breadCrumbLink48.getFamily();
        breadCrumbLink48.setUrl("");
        java.lang.String str61 = breadCrumbLink48.getFamily();
        java.lang.String str62 = breadCrumbLink48.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str68 = breadCrumbLink67.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = breadCrumbLink67.getParent();
        breadCrumbLink48.setPrevious(breadCrumbLink67);
        java.lang.Exception exception71 = null;
        breadCrumbInterceptor24.afterCompletion(httpServletRequest42, httpServletResponse43, (java.lang.Object) breadCrumbLink48, exception71);
        java.lang.String str73 = breadCrumbLink48.getFamily();
        breadCrumbLink9.setParent(breadCrumbLink48);
        breadCrumbLink9.setCurrentPage(false);
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
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.lang.String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str31 = breadCrumbLink30.getParentKey();
        breadCrumbLink24.setParent(breadCrumbLink30);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = breadCrumbLink24.getParent();
        breadCrumbLink4.addNext(breadCrumbLink33);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = breadCrumbLink33.getParent();
        breadCrumbLink33.setLabel("hi!");
        breadCrumbLink33.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink35);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setLabel("");
        breadCrumbLink4.setFamily("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        java.lang.Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) false, modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink27.setUrl("hi!");
        breadCrumbLink27.setParentKey("");
        org.springframework.web.servlet.ModelAndView modelAndView33 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) breadCrumbLink27, modelAndView33);
        java.lang.String str35 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink45.setUrl("hi!");
        breadCrumbLink27.setPrevious(breadCrumbLink45);
        breadCrumbLink27.setParentKey("");
        java.lang.String str52 = breadCrumbLink27.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink32.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str41 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str49 = breadCrumbLink48.getParentKey();
        breadCrumbLink48.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = breadCrumbLink48.getParent();
        breadCrumbLink40.setParent(breadCrumbLink52);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink40.getPrevious();
        breadCrumbLink32.setParent(breadCrumbLink40);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList56 = breadCrumbLink40.getNext();
        breadCrumbLink40.setUrl("hi!");
        breadCrumbLink40.setFamily("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink65 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str66 = breadCrumbLink65.getParentKey();
        breadCrumbLink65.setLabel("hi!");
        boolean boolean69 = breadCrumbLink65.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList70 = breadCrumbLink65.getNext();
        java.lang.String str71 = breadCrumbLink65.getLabel();
        breadCrumbLink40.setParent(breadCrumbLink65);
        breadCrumbLink9.addNext(breadCrumbLink65);
        java.lang.String str74 = breadCrumbLink9.getUrl();
        breadCrumbLink9.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!" + "'", str74.equals("hi!"));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = breadCrumbLink19.getPrevious();
        java.lang.String str27 = breadCrumbLink19.getFamily();
        breadCrumbLink19.setUrl("hi!");
        breadCrumbLink4.addNext(breadCrumbLink19);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        boolean boolean42 = breadCrumbLink35.isCurrentPage();
        breadCrumbLink19.setPrevious(breadCrumbLink35);
        breadCrumbLink35.setUrl("hi!");
        boolean boolean46 = breadCrumbLink35.isCurrentPage();
        java.lang.String str47 = breadCrumbLink35.getParentKey();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean28 = breadCrumbLink27.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink33.addNext(breadCrumbLink38);
        breadCrumbLink38.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        breadCrumbLink38.addNext(breadCrumbLink46);
        boolean boolean51 = breadCrumbLink38.isCurrentPage();
        breadCrumbLink27.addNext(breadCrumbLink38);
        java.lang.Exception exception53 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, exception53);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink59.addNext(breadCrumbLink64);
        java.lang.String str66 = breadCrumbLink59.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList67 = breadCrumbLink59.getNext();
        breadCrumbLink27.setPrevious(breadCrumbLink59);
        breadCrumbLink59.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList67);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        boolean boolean11 = breadCrumbLink4.isCurrentPage();
        java.lang.String str12 = breadCrumbLink4.getUrl();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList13 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink10.addNext(breadCrumbLink15);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str22 = breadCrumbLink21.getParentKey();
        breadCrumbLink15.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink15.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList25 = breadCrumbLink24.getNext();
        breadCrumbLink24.setCurrentPage(true);
        breadCrumbLink24.setUrl("");
        breadCrumbLink4.addNext(breadCrumbLink24);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink4.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink31);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setFamily("");
        java.lang.String str11 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setFamily("hi!");
        java.lang.String str14 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        java.lang.String str16 = breadCrumbLink4.getLabel();
        breadCrumbLink4.setUrl("");
        breadCrumbLink4.setParentKey("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor3 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        org.springframework.web.servlet.ModelAndView modelAndView7 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest4, httpServletResponse5, (java.lang.Object) "", modelAndView7);
        java.lang.Exception exception9 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) breadCrumbInterceptor3, exception9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        java.lang.Exception exception14 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 0L, exception14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor3.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) 1, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setUrl("");
        java.lang.String str40 = breadCrumbLink27.getFamily();
        java.lang.String str41 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink46.getParent();
        breadCrumbLink27.setPrevious(breadCrumbLink46);
        java.lang.Exception exception50 = null;
        breadCrumbInterceptor3.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) breadCrumbLink27, exception50);
        java.lang.String str52 = breadCrumbLink27.getFamily();
        breadCrumbLink27.setCurrentPage(true);
        java.lang.String str55 = breadCrumbLink27.getLabel();
        java.lang.String str56 = breadCrumbLink27.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = breadCrumbLink27.getParent();
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
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink57);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        java.lang.Object obj8 = null;
        org.springframework.web.servlet.ModelAndView modelAndView9 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, obj8, modelAndView9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        org.springframework.web.servlet.ModelAndView modelAndView17 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) "", modelAndView17);
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        java.lang.Object obj21 = null;
        org.springframework.web.servlet.ModelAndView modelAndView22 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest19, httpServletResponse20, obj21, modelAndView22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        org.springframework.web.servlet.ModelAndView modelAndView27 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest24, httpServletResponse25, (java.lang.Object) false, modelAndView27);
        javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str36 = breadCrumbLink35.getParentKey();
        breadCrumbLink35.setLabel("hi!");
        boolean boolean39 = breadCrumbLink35.isCurrentPage();
        org.springframework.web.servlet.ModelAndView modelAndView40 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest29, httpServletResponse30, (java.lang.Object) boolean39, modelAndView40);
        org.springframework.web.servlet.ModelAndView modelAndView42 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) boolean39, modelAndView42);
        javax.servlet.http.HttpServletRequest httpServletRequest44 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse45 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink50.addNext(breadCrumbLink55);
        breadCrumbLink50.setCurrentPage(true);
        boolean boolean59 = breadCrumbLink50.isCurrentPage();
        java.lang.String str60 = breadCrumbLink50.getFamily();
        breadCrumbLink50.setUrl("");
        java.lang.String str63 = breadCrumbLink50.getUrl();
        breadCrumbLink50.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink70.addNext(breadCrumbLink75);
        breadCrumbLink75.setUrl("hi!");
        breadCrumbLink75.setCurrentPage(true);
        breadCrumbLink50.setPrevious(breadCrumbLink75);
        java.lang.Exception exception82 = null;
        breadCrumbInterceptor0.afterCompletion(httpServletRequest44, httpServletResponse45, (java.lang.Object) breadCrumbLink75, exception82);
        java.lang.Class<?> wildcardClass84 = breadCrumbLink75.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        boolean boolean6 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setFamily("");
        java.lang.String str9 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor10 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        breadCrumbInterceptor10.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) "", modelAndView14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        java.lang.Object obj18 = null;
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        breadCrumbInterceptor10.postHandle(httpServletRequest16, httpServletResponse17, obj18, modelAndView19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        java.lang.Exception exception24 = null;
        breadCrumbInterceptor10.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) true, exception24);
        javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse27 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink32.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str41 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = breadCrumbLink40.getParent();
        breadCrumbLink32.setParent(breadCrumbLink44);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink32.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView47 = null;
        breadCrumbInterceptor10.postHandle(httpServletRequest26, httpServletResponse27, (java.lang.Object) breadCrumbLink32, modelAndView47);
        breadCrumbLink32.setParentKey("");
        breadCrumbLink32.setFamily("hi!");
        java.lang.String str53 = breadCrumbLink32.getParentKey();
        breadCrumbLink32.setParentKey("hi!");
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor18 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        java.lang.Exception exception22 = null;
        breadCrumbInterceptor18.afterCompletion(httpServletRequest19, httpServletResponse20, (java.lang.Object) (-1L), exception22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        java.lang.String str37 = breadCrumbLink30.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList38 = breadCrumbLink30.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink57.addNext(breadCrumbLink62);
        breadCrumbLink57.setCurrentPage(true);
        boolean boolean66 = breadCrumbLink57.isCurrentPage();
        breadCrumbLink43.setPrevious(breadCrumbLink57);
        breadCrumbLink30.setPrevious(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = breadCrumbLink30.getPrevious();
        java.lang.Exception exception70 = null;
        breadCrumbInterceptor18.afterCompletion(httpServletRequest24, httpServletResponse25, (java.lang.Object) breadCrumbLink30, exception70);
        breadCrumbLink4.setPrevious(breadCrumbLink30);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink78 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList79 = breadCrumbLink78.getNext();
        java.lang.String str80 = breadCrumbLink78.getFamily();
        boolean boolean81 = breadCrumbLink78.isCurrentPage();
        breadCrumbLink4.setPrevious(breadCrumbLink78);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!" + "'", str80.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = breadCrumbLink4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = breadCrumbLink16.getLabel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        java.lang.String str15 = breadCrumbLink9.getParentKey();
        java.lang.String str16 = breadCrumbLink9.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList17 = breadCrumbLink9.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink22.addNext(breadCrumbLink27);
        breadCrumbLink22.setCurrentPage(true);
        boolean boolean31 = breadCrumbLink22.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink36.setCurrentPage(true);
        boolean boolean45 = breadCrumbLink36.isCurrentPage();
        breadCrumbLink22.setPrevious(breadCrumbLink36);
        java.lang.String str47 = breadCrumbLink36.getParentKey();
        breadCrumbLink9.setParent(breadCrumbLink36);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "hi!");
        breadCrumbLink49.addNext(breadCrumbLink54);
        java.lang.String str56 = breadCrumbLink54.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = breadCrumbLink54.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink57);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            breadCrumbLink11.setFamily("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        java.lang.String str6 = breadCrumbLink4.getLabel();
        java.lang.String str7 = breadCrumbLink4.getFamily();
        java.lang.String str8 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        breadCrumbLink23.setUrl("hi!");
        java.lang.String str34 = breadCrumbLink23.getLabel();
        breadCrumbLink23.setCurrentPage(true);
        breadCrumbLink23.setUrl("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        boolean boolean15 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getParent();
        java.lang.String str6 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink11.addNext(breadCrumbLink16);
        breadCrumbLink16.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str25 = breadCrumbLink24.getParentKey();
        breadCrumbLink24.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink32.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = breadCrumbLink32.getParent();
        breadCrumbLink24.setParent(breadCrumbLink36);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = breadCrumbLink24.getPrevious();
        breadCrumbLink16.setParent(breadCrumbLink24);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList40 = breadCrumbLink24.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = breadCrumbLink24.getParent();
        breadCrumbLink24.setParentKey("");
        breadCrumbLink24.setUrl("");
        breadCrumbLink4.setPrevious(breadCrumbLink24);
        java.lang.String str47 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        java.lang.String str8 = breadCrumbLink4.getParentKey();
        java.lang.String str9 = breadCrumbLink4.getLabel();
        java.lang.String str10 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str16 = breadCrumbLink15.getParentKey();
        java.lang.String str17 = breadCrumbLink15.getLabel();
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor18 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink25.addNext(breadCrumbLink30);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink25.getPrevious();
        java.lang.String str33 = breadCrumbLink25.getFamily();
        breadCrumbLink25.setUrl("hi!");
        breadCrumbLink25.setFamily("");
        java.lang.Exception exception38 = null;
        breadCrumbInterceptor18.afterCompletion(httpServletRequest19, httpServletResponse20, (java.lang.Object) breadCrumbLink25, exception38);
        javax.servlet.http.HttpServletRequest httpServletRequest40 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse41 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str47 = breadCrumbLink46.getFamily();
        breadCrumbLink46.setCurrentPage(true);
        org.springframework.web.servlet.ModelAndView modelAndView50 = null;
        breadCrumbInterceptor18.postHandle(httpServletRequest40, httpServletResponse41, (java.lang.Object) breadCrumbLink46, modelAndView50);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink61 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink56.addNext(breadCrumbLink61);
        breadCrumbLink56.setCurrentPage(true);
        boolean boolean65 = breadCrumbLink56.isCurrentPage();
        java.lang.String str66 = breadCrumbLink56.getFamily();
        breadCrumbLink56.setUrl("");
        java.lang.String str69 = breadCrumbLink56.getFamily();
        java.lang.String str70 = breadCrumbLink56.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = breadCrumbLink56.getPrevious();
        breadCrumbLink56.setUrl("");
        breadCrumbLink46.setPrevious(breadCrumbLink56);
        breadCrumbLink15.addNext(breadCrumbLink56);
        breadCrumbLink4.addNext(breadCrumbLink15);
        breadCrumbLink4.setFamily("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList79 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList79);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        java.lang.String str15 = breadCrumbLink9.getParentKey();
        java.lang.String str16 = breadCrumbLink9.getLabel();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList17 = breadCrumbLink9.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink18 = breadCrumbLink9.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink23.addNext(breadCrumbLink28);
        breadCrumbLink28.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = breadCrumbLink28.getParent();
        boolean boolean33 = breadCrumbLink28.isCurrentPage();
        java.lang.String str34 = breadCrumbLink28.getFamily();
        breadCrumbLink9.setParent(breadCrumbLink28);
        java.lang.String str36 = breadCrumbLink28.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = null;
        breadCrumbLink4.addNext(breadCrumbLink20);
        breadCrumbLink4.setParentKey("hi!");
        breadCrumbLink4.setParentKey("");
        java.lang.String str26 = breadCrumbLink4.getLabel();
        java.lang.String str27 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        java.lang.String str16 = breadCrumbLink4.getLabel();
        breadCrumbLink4.setParentKey("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList19 = breadCrumbLink4.getNext();
        breadCrumbLink4.setFamily("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList19);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        java.lang.String str32 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink37.addNext(breadCrumbLink42);
        breadCrumbLink37.setCurrentPage(true);
        boolean boolean46 = breadCrumbLink37.isCurrentPage();
        java.lang.String str47 = breadCrumbLink37.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList48 = breadCrumbLink37.getNext();
        java.lang.String str49 = breadCrumbLink37.getUrl();
        breadCrumbLink4.setPrevious(breadCrumbLink37);
        breadCrumbLink4.setCurrentPage(true);
        breadCrumbLink4.setCurrentPage(false);
        java.lang.String str55 = breadCrumbLink4.getFamily();
        boolean boolean56 = breadCrumbLink4.isCurrentPage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink22 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink17.addNext(breadCrumbLink22);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = breadCrumbLink17.getPrevious();
        java.lang.String str25 = breadCrumbLink17.getFamily();
        breadCrumbLink17.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink39 = breadCrumbLink32.getPrevious();
        java.lang.String str40 = breadCrumbLink32.getFamily();
        breadCrumbLink32.setUrl("hi!");
        breadCrumbLink17.addNext(breadCrumbLink32);
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink49.addNext(breadCrumbLink54);
        breadCrumbLink54.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str63 = breadCrumbLink62.getParentKey();
        breadCrumbLink62.setLabel("hi!");
        breadCrumbLink54.addNext(breadCrumbLink62);
        breadCrumbLink4.addNext(breadCrumbLink62);
        breadCrumbLink4.setUrl("hi!");
        java.lang.String str70 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = breadCrumbLink4.getPrevious();
        java.lang.String str10 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink16.addNext(breadCrumbLink21);
        breadCrumbLink21.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink21.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        breadCrumbLink35.setUrl("hi!");
        breadCrumbLink35.setParentKey("");
        breadCrumbLink35.setFamily("");
        breadCrumbLink21.addNext(breadCrumbLink35);
        breadCrumbLink4.addNext(breadCrumbLink35);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink49.addNext(breadCrumbLink54);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = breadCrumbLink49.getPrevious();
        java.lang.String str57 = breadCrumbLink49.getFamily();
        breadCrumbLink49.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink64.addNext(breadCrumbLink69);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = breadCrumbLink64.getPrevious();
        java.lang.String str72 = breadCrumbLink64.getFamily();
        breadCrumbLink64.setUrl("hi!");
        breadCrumbLink49.addNext(breadCrumbLink64);
        breadCrumbLink64.setLabel("hi!");
        breadCrumbLink4.addNext(breadCrumbLink64);
        breadCrumbLink4.setLabel("");
        java.lang.String str81 = breadCrumbLink4.getParentKey();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setCurrentPage(false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink19.addNext(breadCrumbLink24);
        breadCrumbLink24.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
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
        java.lang.String str67 = breadCrumbLink56.getParentKey();
        java.lang.String str68 = breadCrumbLink56.getParentKey();
        java.lang.String str69 = breadCrumbLink56.getLabel();
        breadCrumbLink32.addNext(breadCrumbLink56);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = breadCrumbLink56.getParent();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink71);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("");
        java.lang.String str20 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        breadCrumbLink30.setCurrentPage(true);
        boolean boolean39 = breadCrumbLink30.isCurrentPage();
        java.lang.String str40 = breadCrumbLink30.getFamily();
        breadCrumbLink30.setUrl("");
        java.lang.String str43 = breadCrumbLink30.getFamily();
        breadCrumbLink25.setParent(breadCrumbLink30);
        breadCrumbLink30.setLabel("");
        breadCrumbLink4.setParent(breadCrumbLink30);
        java.lang.String str48 = breadCrumbLink30.getUrl();
        breadCrumbLink30.setFamily("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink4.setFamily("");
        java.lang.String str7 = breadCrumbLink4.getFamily();
        java.lang.String str8 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setLabel("");
        breadCrumbLink4.setParentKey("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink4.setFamily("");
        breadCrumbLink4.setParentKey("hi!");
        java.lang.String str9 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink14.addNext(breadCrumbLink19);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = breadCrumbLink14.getPrevious();
        java.lang.String str22 = breadCrumbLink14.getFamily();
        breadCrumbLink4.addNext(breadCrumbLink14);
        java.lang.String str24 = breadCrumbLink14.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = breadCrumbLink4.getPrevious();
        java.lang.String str10 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink16.addNext(breadCrumbLink21);
        breadCrumbLink21.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink21.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        breadCrumbLink35.setUrl("hi!");
        breadCrumbLink35.setParentKey("");
        breadCrumbLink35.setFamily("");
        breadCrumbLink21.addNext(breadCrumbLink35);
        breadCrumbLink4.addNext(breadCrumbLink35);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList45 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink50.addNext(breadCrumbLink55);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = breadCrumbLink55.getPrevious();
        breadCrumbLink55.setParentKey("");
        breadCrumbLink55.setUrl("");
        java.lang.String str62 = breadCrumbLink55.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str68 = breadCrumbLink67.getUrl();
        breadCrumbLink67.setFamily("hi!");
        breadCrumbLink55.setParent(breadCrumbLink67);
        breadCrumbLink4.setParent(breadCrumbLink67);
        breadCrumbLink67.setFamily("hi!");
        breadCrumbLink67.setFamily("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        breadCrumbLink9.setParentKey("");
        java.lang.String str15 = breadCrumbLink9.getParentKey();
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
        java.lang.String str50 = breadCrumbLink40.getParentKey();
        breadCrumbLink40.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink40.setParent(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink63.addNext(breadCrumbLink68);
        breadCrumbLink63.setCurrentPage(true);
        boolean boolean72 = breadCrumbLink63.isCurrentPage();
        java.lang.String str73 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink80 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink63.setParent(breadCrumbLink80);
        breadCrumbLink40.addNext(breadCrumbLink80);
        breadCrumbLink80.setUrl("");
        breadCrumbLink80.setFamily("");
        breadCrumbLink26.setPrevious(breadCrumbLink80);
        breadCrumbLink9.addNext(breadCrumbLink80);
        java.lang.String str89 = breadCrumbLink9.getLabel();
        java.lang.String str90 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setUrl("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.lang.String str29 = breadCrumbLink18.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink18.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink35.addNext(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = breadCrumbLink35.getPrevious();
        java.lang.String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = breadCrumbLink35.getParent();
        java.lang.String str47 = breadCrumbLink35.getLabel();
        breadCrumbLink18.addNext(breadCrumbLink35);
        breadCrumbLink18.setFamily("");
        java.lang.String str51 = breadCrumbLink18.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        boolean boolean57 = breadCrumbLink56.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink62 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink62.addNext(breadCrumbLink67);
        breadCrumbLink67.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink75 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str76 = breadCrumbLink75.getParentKey();
        breadCrumbLink75.setLabel("hi!");
        breadCrumbLink67.addNext(breadCrumbLink75);
        boolean boolean80 = breadCrumbLink67.isCurrentPage();
        breadCrumbLink56.addNext(breadCrumbLink67);
        boolean boolean82 = breadCrumbLink56.isCurrentPage();
        breadCrumbLink18.setPrevious(breadCrumbLink56);
        breadCrumbLink18.setLabel("");
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
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink4.setLabel("");
        java.lang.String str25 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink4.getParent();
        breadCrumbLink30.setLabel("hi!");
        breadCrumbLink30.setCurrentPage(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink30);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor0 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink12 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink12.addNext(breadCrumbLink17);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink17.getPrevious();
        breadCrumbLink17.setParentKey("");
        breadCrumbLink17.setUrl("");
        breadCrumbLink17.setFamily("hi!");
        org.springframework.web.servlet.ModelAndView modelAndView26 = null;
        breadCrumbInterceptor0.postHandle(httpServletRequest6, httpServletResponse7, (java.lang.Object) breadCrumbLink17, modelAndView26);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        breadCrumbLink37.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = breadCrumbLink37.getParent();
        boolean boolean42 = breadCrumbLink37.isCurrentPage();
        java.lang.String str43 = breadCrumbLink37.getParentKey();
        java.lang.String str44 = breadCrumbLink37.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink49.addNext(breadCrumbLink54);
        java.lang.String str56 = breadCrumbLink54.getUrl();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList57 = breadCrumbLink54.getNext();
        breadCrumbLink37.addNext(breadCrumbLink54);
        breadCrumbLink17.addNext(breadCrumbLink54);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = breadCrumbLink17.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink60);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        java.lang.String str15 = breadCrumbLink4.getUrl();
        boolean boolean16 = breadCrumbLink4.isCurrentPage();
        java.lang.String str17 = breadCrumbLink4.getParentKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getParent();
        breadCrumbLink4.setFamily("");
        java.lang.String str11 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink16.addNext(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str28 = breadCrumbLink27.getParentKey();
        breadCrumbLink21.setParent(breadCrumbLink27);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = breadCrumbLink21.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList31 = breadCrumbLink30.getNext();
        breadCrumbLink30.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", true, "");
        breadCrumbLink38.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList41 = breadCrumbLink38.getNext();
        java.lang.String str42 = breadCrumbLink38.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean48 = breadCrumbLink47.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = null;
        breadCrumbLink47.setPrevious(breadCrumbLink49);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink47.getPrevious();
        java.lang.String str52 = breadCrumbLink47.getParentKey();
        breadCrumbLink47.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = breadCrumbLink47.getParent();
        breadCrumbLink47.setFamily("");
        breadCrumbLink47.setCurrentPage(true);
        breadCrumbLink38.setPrevious(breadCrumbLink47);
        breadCrumbLink30.setParent(breadCrumbLink47);
        breadCrumbLink4.setPrevious(breadCrumbLink47);
        breadCrumbLink4.setFamily("");
        breadCrumbLink4.setCurrentPage(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink55);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink8 = breadCrumbLink4.getPrevious();
        java.lang.String str9 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setUrl("");
        breadCrumbLink4.setUrl("");
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = breadCrumbLink4.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink15);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getPrevious();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("hi!");
        breadCrumbLink4.setFamily("");
        java.lang.String str17 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setFamily("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        java.lang.String str15 = breadCrumbLink4.getUrl();
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
        boolean boolean41 = breadCrumbLink25.isCurrentPage();
        breadCrumbLink25.setFamily("");
        java.lang.String str44 = breadCrumbLink25.getUrl();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        java.lang.String str6 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink11.addNext(breadCrumbLink16);
        breadCrumbLink11.setCurrentPage(true);
        boolean boolean20 = breadCrumbLink11.isCurrentPage();
        java.lang.String str21 = breadCrumbLink11.getFamily();
        breadCrumbLink11.setUrl("");
        java.lang.String str24 = breadCrumbLink11.getUrl();
        breadCrumbLink11.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink31.addNext(breadCrumbLink36);
        breadCrumbLink36.setUrl("hi!");
        breadCrumbLink36.setCurrentPage(true);
        breadCrumbLink11.setPrevious(breadCrumbLink36);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink11.setPrevious(breadCrumbLink47);
        java.lang.String str49 = breadCrumbLink11.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink54.addNext(breadCrumbLink59);
        breadCrumbLink54.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink67.addNext(breadCrumbLink72);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = breadCrumbLink67.getPrevious();
        java.lang.String str75 = breadCrumbLink67.getFamily();
        breadCrumbLink67.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink82 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink87 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink82.addNext(breadCrumbLink87);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink89 = breadCrumbLink82.getPrevious();
        java.lang.String str90 = breadCrumbLink82.getFamily();
        breadCrumbLink82.setUrl("hi!");
        breadCrumbLink67.addNext(breadCrumbLink82);
        breadCrumbLink54.setPrevious(breadCrumbLink82);
        breadCrumbLink11.setParent(breadCrumbLink54);
        breadCrumbLink4.addNext(breadCrumbLink54);
        boolean boolean97 = breadCrumbLink54.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink98 = breadCrumbLink54.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink98);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        java.lang.String str33 = breadCrumbLink23.getParentKey();
        breadCrumbLink23.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink23.setParent(breadCrumbLink40);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink46 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink46.addNext(breadCrumbLink51);
        breadCrumbLink46.setCurrentPage(true);
        boolean boolean55 = breadCrumbLink46.isCurrentPage();
        java.lang.String str56 = breadCrumbLink46.getParentKey();
        breadCrumbLink46.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink46.setParent(breadCrumbLink63);
        breadCrumbLink23.addNext(breadCrumbLink63);
        breadCrumbLink63.setUrl("");
        breadCrumbLink63.setFamily("");
        breadCrumbLink9.setPrevious(breadCrumbLink63);
        boolean boolean71 = breadCrumbLink63.isCurrentPage();
        java.lang.String str72 = breadCrumbLink63.getLabel();
        java.lang.String str73 = breadCrumbLink63.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", true, "hi!");
        breadCrumbLink4.setParentKey("hi!");
        breadCrumbLink4.setParentKey("hi!");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList9 = breadCrumbLink4.getNext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList9);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        breadCrumbLink4.setFamily("");
        breadCrumbLink4.setParentKey("hi!");
        java.lang.String str9 = breadCrumbLink4.getUrl();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink10 = breadCrumbLink4.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList11 = breadCrumbLink4.getNext();
        java.lang.String str12 = breadCrumbLink4.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getFamily();
        java.lang.String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setCurrentPage(true);
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str29 = breadCrumbLink28.getParentKey();
        breadCrumbLink28.setLabel("hi!");
        breadCrumbLink28.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink38.addNext(breadCrumbLink43);
        breadCrumbLink43.setUrl("hi!");
        breadCrumbLink43.setParentKey("");
        breadCrumbLink43.setFamily("");
        java.lang.String str51 = breadCrumbLink43.getFamily();
        breadCrumbLink28.addNext(breadCrumbLink43);
        breadCrumbLink28.setCurrentPage(true);
        breadCrumbLink4.setPrevious(breadCrumbLink28);
        breadCrumbLink28.setUrl("hi!");
        breadCrumbLink28.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink60 = breadCrumbLink28.getPrevious();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink60);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList5 = breadCrumbLink4.getNext();
        java.lang.String str6 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setParentKey("");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor9 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor12 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        org.springframework.web.servlet.ModelAndView modelAndView16 = null;
        breadCrumbInterceptor12.postHandle(httpServletRequest13, httpServletResponse14, (java.lang.Object) "", modelAndView16);
        java.lang.Exception exception18 = null;
        breadCrumbInterceptor9.afterCompletion(httpServletRequest10, httpServletResponse11, (java.lang.Object) breadCrumbInterceptor12, exception18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        java.lang.Exception exception23 = null;
        breadCrumbInterceptor12.afterCompletion(httpServletRequest20, httpServletResponse21, (java.lang.Object) 0L, exception23);
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        breadCrumbInterceptor12.postHandle(httpServletRequest25, httpServletResponse26, (java.lang.Object) (byte) 100, modelAndView28);
        javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse31 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink36.setCurrentPage(true);
        boolean boolean45 = breadCrumbLink36.isCurrentPage();
        breadCrumbLink36.setCurrentPage(false);
        org.springframework.web.servlet.ModelAndView modelAndView48 = null;
        breadCrumbInterceptor12.postHandle(httpServletRequest30, httpServletResponse31, (java.lang.Object) breadCrumbLink36, modelAndView48);
        breadCrumbLink4.setPrevious(breadCrumbLink36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        java.lang.String str8 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        breadCrumbLink20.setUrl("hi!");
        breadCrumbLink20.setParentKey("");
        breadCrumbLink20.setFamily("");
        breadCrumbLink20.setCurrentPage(false);
        breadCrumbLink20.setLabel("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList32 = breadCrumbLink20.getNext();
        java.lang.String str33 = breadCrumbLink20.getParentKey();
        breadCrumbLink4.setPrevious(breadCrumbLink20);
        breadCrumbLink20.setLabel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getFamily();
        java.lang.String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink19 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setCurrentPage(true);
        breadCrumbLink4.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink28 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str29 = breadCrumbLink28.getParentKey();
        breadCrumbLink28.setLabel("hi!");
        breadCrumbLink28.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink38 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink38.addNext(breadCrumbLink43);
        breadCrumbLink43.setUrl("hi!");
        breadCrumbLink43.setParentKey("");
        breadCrumbLink43.setFamily("");
        java.lang.String str51 = breadCrumbLink43.getFamily();
        breadCrumbLink28.addNext(breadCrumbLink43);
        breadCrumbLink28.setCurrentPage(true);
        breadCrumbLink4.setPrevious(breadCrumbLink28);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = breadCrumbLink4.getPrevious();
        java.lang.String str57 = breadCrumbLink4.getLabel();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        breadCrumbLink17.setUrl("hi!");
        java.lang.String str36 = breadCrumbLink17.getLabel();
        java.lang.String str37 = breadCrumbLink17.getLabel();
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList15 = breadCrumbLink4.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str21 = breadCrumbLink20.getParentKey();
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
        java.lang.String str43 = breadCrumbLink35.getFamily();
        breadCrumbLink35.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink50.addNext(breadCrumbLink55);
        breadCrumbLink55.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str64 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        breadCrumbLink55.addNext(breadCrumbLink63);
        breadCrumbLink35.setPrevious(breadCrumbLink63);
        breadCrumbLink20.addNext(breadCrumbLink63);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink70 = breadCrumbLink63.getParent();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink70);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        org.springframework.web.servlet.ModelAndView modelAndView12 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) "", modelAndView12);
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink20.addNext(breadCrumbLink25);
        breadCrumbLink20.setCurrentPage(true);
        boolean boolean29 = breadCrumbLink20.isCurrentPage();
        java.lang.String str30 = breadCrumbLink20.getFamily();
        java.lang.Exception exception31 = null;
        breadCrumbInterceptor8.afterCompletion(httpServletRequest14, httpServletResponse15, (java.lang.Object) breadCrumbLink20, exception31);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink20.getNext();
        breadCrumbLink20.setLabel("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink40 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink45 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink40.addNext(breadCrumbLink45);
        breadCrumbLink40.setCurrentPage(true);
        boolean boolean49 = breadCrumbLink40.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink54.addNext(breadCrumbLink59);
        breadCrumbLink54.setCurrentPage(true);
        boolean boolean63 = breadCrumbLink54.isCurrentPage();
        breadCrumbLink40.setPrevious(breadCrumbLink54);
        java.lang.String str65 = breadCrumbLink54.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink66 = breadCrumbLink54.getParent();
        breadCrumbLink20.addNext(breadCrumbLink54);
        java.lang.String str68 = breadCrumbLink54.getUrl();
        breadCrumbLink4.setPrevious(breadCrumbLink54);
        java.lang.Class<?> wildcardClass70 = breadCrumbLink54.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!" + "'", str65.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink5 = breadCrumbLink4.getParent();
        java.lang.String str6 = breadCrumbLink4.getUrl();
        breadCrumbLink4.setParentKey("hi!");
        breadCrumbLink4.setCurrentPage(true);
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor13 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor16 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest17, httpServletResponse18, (java.lang.Object) "", modelAndView20);
        java.lang.Exception exception22 = null;
        breadCrumbInterceptor13.afterCompletion(httpServletRequest14, httpServletResponse15, (java.lang.Object) breadCrumbInterceptor16, exception22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        breadCrumbLink30.setCurrentPage(true);
        java.lang.String str39 = breadCrumbLink30.getLabel();
        java.lang.Exception exception40 = null;
        breadCrumbInterceptor13.afterCompletion(httpServletRequest24, httpServletResponse25, (java.lang.Object) str39, exception40);
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink48.addNext(breadCrumbLink53);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = breadCrumbLink53.getPrevious();
        org.springframework.web.servlet.ModelAndView modelAndView56 = null;
        breadCrumbInterceptor13.postHandle(httpServletRequest42, httpServletResponse43, (java.lang.Object) breadCrumbLink53, modelAndView56);
        java.lang.String str58 = breadCrumbLink53.getFamily();
        breadCrumbLink53.setFamily("");
        breadCrumbLink4.setParent(breadCrumbLink53);
        breadCrumbLink53.setUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink9.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink17 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str18 = breadCrumbLink17.getParentKey();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str26 = breadCrumbLink25.getParentKey();
        breadCrumbLink25.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = breadCrumbLink25.getParent();
        breadCrumbLink17.setParent(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink17.getPrevious();
        breadCrumbLink9.setParent(breadCrumbLink17);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList33 = breadCrumbLink17.getNext();
        breadCrumbLink17.setUrl("hi!");
        java.lang.String str36 = breadCrumbLink17.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = breadCrumbLink17.getPrevious();
        breadCrumbLink17.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink44.addNext(breadCrumbLink49);
        breadCrumbLink44.setCurrentPage(true);
        boolean boolean53 = breadCrumbLink44.isCurrentPage();
        breadCrumbLink44.setCurrentPage(false);
        java.lang.String str56 = breadCrumbLink44.getLabel();
        breadCrumbLink17.addNext(breadCrumbLink44);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = breadCrumbLink44.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList59 = breadCrumbLink58.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink58);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getFamily();
        java.lang.String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str24 = breadCrumbLink23.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink23.getParent();
        breadCrumbLink4.setPrevious(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        breadCrumbLink32.setCurrentPage(true);
        boolean boolean41 = breadCrumbLink32.isCurrentPage();
        java.lang.String str42 = breadCrumbLink32.getFamily();
        breadCrumbLink32.setUrl("");
        java.lang.String str45 = breadCrumbLink32.getFamily();
        java.lang.String str46 = breadCrumbLink32.getParentKey();
        breadCrumbLink4.setPrevious(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = breadCrumbLink4.getParent();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink48);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink21.addNext(breadCrumbLink26);
        breadCrumbLink21.setCurrentPage(true);
        boolean boolean30 = breadCrumbLink21.isCurrentPage();
        java.lang.String str31 = breadCrumbLink21.getParentKey();
        breadCrumbLink21.setLabel("hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        java.lang.String str35 = breadCrumbLink4.getFamily();
        boolean boolean36 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = breadCrumbLink4.getPrevious();
        breadCrumbLink4.setParentKey("");
        breadCrumbLink4.setLabel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink37);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink53 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        breadCrumbLink44.addNext(breadCrumbLink53);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink59.addNext(breadCrumbLink64);
        breadCrumbLink59.setCurrentPage(true);
        boolean boolean68 = breadCrumbLink59.isCurrentPage();
        java.lang.String str69 = breadCrumbLink59.getFamily();
        breadCrumbLink59.setUrl("");
        java.lang.String str72 = breadCrumbLink59.getFamily();
        breadCrumbLink53.setParent(breadCrumbLink59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = breadCrumbLink4.getPrevious();
        java.lang.String str10 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink11 = breadCrumbLink4.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink16.addNext(breadCrumbLink21);
        breadCrumbLink21.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink21.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink30 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink35 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink30.addNext(breadCrumbLink35);
        breadCrumbLink35.setUrl("hi!");
        breadCrumbLink35.setParentKey("");
        breadCrumbLink35.setFamily("");
        breadCrumbLink21.addNext(breadCrumbLink35);
        breadCrumbLink4.addNext(breadCrumbLink35);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink49.addNext(breadCrumbLink54);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = breadCrumbLink49.getPrevious();
        java.lang.String str57 = breadCrumbLink49.getFamily();
        breadCrumbLink49.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink64 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink69 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink64.addNext(breadCrumbLink69);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink71 = breadCrumbLink64.getPrevious();
        java.lang.String str72 = breadCrumbLink64.getFamily();
        breadCrumbLink64.setUrl("hi!");
        breadCrumbLink49.addNext(breadCrumbLink64);
        breadCrumbLink64.setLabel("hi!");
        breadCrumbLink4.addNext(breadCrumbLink64);
        breadCrumbLink4.setCurrentPage(true);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "hi!", false, "");
        breadCrumbLink4.setLabel("");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        breadCrumbLink4.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str30 = breadCrumbLink29.getFamily();
        java.lang.String str31 = breadCrumbLink29.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink36 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink41 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink36.addNext(breadCrumbLink41);
        breadCrumbLink41.setUrl("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink49 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str50 = breadCrumbLink49.getParentKey();
        breadCrumbLink49.setLabel("hi!");
        breadCrumbLink41.addNext(breadCrumbLink49);
        boolean boolean54 = breadCrumbLink41.isCurrentPage();
        breadCrumbLink29.setParent(breadCrumbLink41);
        breadCrumbLink41.setParentKey("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink58 = breadCrumbLink41.getParent();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str64 = breadCrumbLink63.getParentKey();
        breadCrumbLink63.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor67 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest68 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse69 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink74 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink74.addNext(breadCrumbLink79);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink85 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str86 = breadCrumbLink85.getParentKey();
        breadCrumbLink79.addNext(breadCrumbLink85);
        org.springframework.web.servlet.ModelAndView modelAndView88 = null;
        breadCrumbInterceptor67.postHandle(httpServletRequest68, httpServletResponse69, (java.lang.Object) breadCrumbLink85, modelAndView88);
        breadCrumbLink63.addNext(breadCrumbLink85);
        java.lang.String str91 = breadCrumbLink63.getParentKey();
        breadCrumbLink41.setPrevious(breadCrumbLink63);
        breadCrumbLink4.addNext(breadCrumbLink63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!" + "'", str86.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", true, "");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink14 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink9.addNext(breadCrumbLink14);
        breadCrumbLink9.setCurrentPage(true);
        boolean boolean18 = breadCrumbLink9.isCurrentPage();
        java.lang.String str19 = breadCrumbLink9.getFamily();
        breadCrumbLink9.setUrl("");
        java.lang.String str22 = breadCrumbLink9.getFamily();
        breadCrumbLink4.setParent(breadCrumbLink9);
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList24 = breadCrumbLink9.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink9.getPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = breadCrumbLink25.getFamily();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink25);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor17 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        java.lang.String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink24.setFamily("");
        java.lang.Exception exception37 = null;
        breadCrumbInterceptor17.afterCompletion(httpServletRequest18, httpServletResponse19, (java.lang.Object) breadCrumbLink24, exception37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str60 = breadCrumbLink59.getParentKey();
        breadCrumbLink59.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink59.getParent();
        breadCrumbLink59.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList66 = breadCrumbLink59.getNext();
        breadCrumbLink43.setParent(breadCrumbLink59);
        breadCrumbLink24.setPrevious(breadCrumbLink59);
        breadCrumbLink4.setParent(breadCrumbLink24);
        boolean boolean70 = breadCrumbLink24.isCurrentPage();
        java.lang.String str71 = breadCrumbLink24.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink72 = breadCrumbLink24.getParent();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink72);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        breadCrumbInterceptor19.postHandle(httpServletRequest20, httpServletResponse21, (java.lang.Object) "", modelAndView23);
        java.lang.Exception exception25 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest17, httpServletResponse18, (java.lang.Object) breadCrumbInterceptor19, exception25);
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink33 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.Exception exception34 = null;
        breadCrumbInterceptor16.afterCompletion(httpServletRequest27, httpServletResponse28, (java.lang.Object) false, exception34);
        javax.servlet.http.HttpServletRequest httpServletRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "hi!", false, "");
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        breadCrumbInterceptor16.postHandle(httpServletRequest36, httpServletResponse37, (java.lang.Object) breadCrumbLink42, modelAndView43);
        breadCrumbLink4.setParent(breadCrumbLink42);
        breadCrumbLink4.setLabel("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink52 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink57 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink52.addNext(breadCrumbLink57);
        breadCrumbLink57.setUrl("hi!");
        breadCrumbLink57.setParentKey("");
        breadCrumbLink57.setFamily("");
        breadCrumbLink57.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink67 = breadCrumbLink57.getParent();
        breadCrumbLink4.setParent(breadCrumbLink57);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink73 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink78 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink73.addNext(breadCrumbLink78);
        breadCrumbLink73.setCurrentPage(true);
        boolean boolean82 = breadCrumbLink73.isCurrentPage();
        java.lang.String str83 = breadCrumbLink73.getFamily();
        breadCrumbLink73.setUrl("");
        java.lang.String str86 = breadCrumbLink73.getUrl();
        breadCrumbLink73.setParentKey("");
        breadCrumbLink4.setPrevious(breadCrumbLink73);
        breadCrumbLink4.setCurrentPage(true);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink92 = breadCrumbLink4.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList93 = breadCrumbLink92.getNext();
        java.lang.String str94 = breadCrumbLink92.getUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!" + "'", str94.equals("hi!"));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink21 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink4.setParent(breadCrumbLink21);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink27.addNext(breadCrumbLink32);
        breadCrumbLink27.setCurrentPage(true);
        boolean boolean36 = breadCrumbLink27.isCurrentPage();
        java.lang.String str37 = breadCrumbLink27.getParentKey();
        breadCrumbLink27.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink44 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("hi!", "", false, "hi!");
        breadCrumbLink27.setParent(breadCrumbLink44);
        breadCrumbLink4.addNext(breadCrumbLink44);
        breadCrumbLink44.setUrl("");
        breadCrumbLink44.setFamily("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink55 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str56 = breadCrumbLink55.getParentKey();
        breadCrumbLink55.setLabel("hi!");
        boolean boolean59 = breadCrumbLink55.isCurrentPage();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList60 = breadCrumbLink55.getNext();
        java.lang.String str61 = breadCrumbLink55.getLabel();
        breadCrumbLink44.setPrevious(breadCrumbLink55);
        breadCrumbLink44.setFamily("hi!");
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        java.lang.String str17 = breadCrumbLink4.getFamily();
        java.lang.String str18 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink23 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str24 = breadCrumbLink23.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink25 = breadCrumbLink23.getParent();
        breadCrumbLink4.setPrevious(breadCrumbLink23);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink27 = breadCrumbLink4.getPrevious();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str33 = breadCrumbLink32.getParentKey();
        breadCrumbLink32.setLabel("hi!");
        breadCrumbLink32.setCurrentPage(false);
        breadCrumbLink27.addNext(breadCrumbLink32);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        breadCrumbLink43.setUrl("");
        java.lang.String str56 = breadCrumbLink43.getUrl();
        breadCrumbLink43.setParentKey("");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink68 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink63.addNext(breadCrumbLink68);
        breadCrumbLink68.setUrl("hi!");
        breadCrumbLink68.setCurrentPage(true);
        breadCrumbLink43.setPrevious(breadCrumbLink68);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink79 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", true, "");
        breadCrumbLink43.setPrevious(breadCrumbLink79);
        java.lang.String str81 = breadCrumbLink43.getFamily();
        java.lang.String str82 = breadCrumbLink43.getParentKey();
        breadCrumbLink32.addNext(breadCrumbLink43);
        java.lang.String str84 = breadCrumbLink43.getParentKey();
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "" + "'", str81.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "" + "'", str82.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        boolean boolean5 = breadCrumbLink4.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink6 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink6);
        boolean boolean8 = breadCrumbLink4.isCurrentPage();
        breadCrumbLink4.setUrl("hi!");
        java.lang.String str11 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink16 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str17 = breadCrumbLink16.getParentKey();
        breadCrumbLink16.setLabel("hi!");
        breadCrumbLink16.setCurrentPage(false);
        breadCrumbLink16.setUrl("");
        breadCrumbLink16.setCurrentPage(false);
        java.lang.String str26 = breadCrumbLink16.getFamily();
        breadCrumbLink4.setPrevious(breadCrumbLink16);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink32 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink32.addNext(breadCrumbLink37);
        breadCrumbLink37.setUrl("hi!");
        breadCrumbLink37.setParentKey("");
        breadCrumbLink37.setFamily("");
        breadCrumbLink37.setCurrentPage(false);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink47 = breadCrumbLink37.getParent();
        breadCrumbLink4.addNext(breadCrumbLink37);
        java.lang.String str49 = breadCrumbLink4.getFamily();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink50 = null;
        breadCrumbLink4.setPrevious(breadCrumbLink50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        breadCrumbLink23.setUrl("hi!");
        java.lang.String str34 = breadCrumbLink23.getLabel();
        java.lang.String str35 = breadCrumbLink23.getFamily();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink9 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink4.addNext(breadCrumbLink9);
        breadCrumbLink4.setCurrentPage(true);
        boolean boolean13 = breadCrumbLink4.isCurrentPage();
        java.lang.String str14 = breadCrumbLink4.getFamily();
        breadCrumbLink4.setUrl("");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor17 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink24 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink29 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink24.addNext(breadCrumbLink29);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink31 = breadCrumbLink24.getPrevious();
        java.lang.String str32 = breadCrumbLink24.getFamily();
        breadCrumbLink24.setUrl("hi!");
        breadCrumbLink24.setFamily("");
        java.lang.Exception exception37 = null;
        breadCrumbInterceptor17.afterCompletion(httpServletRequest18, httpServletResponse19, (java.lang.Object) breadCrumbLink24, exception37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink43 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink48 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink43.addNext(breadCrumbLink48);
        breadCrumbLink43.setCurrentPage(true);
        boolean boolean52 = breadCrumbLink43.isCurrentPage();
        java.lang.String str53 = breadCrumbLink43.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList54 = breadCrumbLink43.getNext();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink59 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str60 = breadCrumbLink59.getParentKey();
        breadCrumbLink59.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink63 = breadCrumbLink59.getParent();
        breadCrumbLink59.setFamily("");
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList66 = breadCrumbLink59.getNext();
        breadCrumbLink43.setParent(breadCrumbLink59);
        breadCrumbLink24.setPrevious(breadCrumbLink59);
        breadCrumbLink4.setParent(breadCrumbLink24);
        java.lang.String str70 = breadCrumbLink24.getLabel();
        java.lang.String str71 = breadCrumbLink24.getParentKey();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink4 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str5 = breadCrumbLink4.getParentKey();
        breadCrumbLink4.setLabel("hi!");
        dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor breadCrumbInterceptor8 = new dummiesmind.breadcrumb.springmvc.interceptor.BreadCrumbInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink15 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink20 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink15.addNext(breadCrumbLink20);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink26 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        java.lang.String str27 = breadCrumbLink26.getParentKey();
        breadCrumbLink20.addNext(breadCrumbLink26);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        breadCrumbInterceptor8.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) breadCrumbLink26, modelAndView29);
        breadCrumbLink4.addNext(breadCrumbLink26);
        java.lang.String str32 = breadCrumbLink4.getParentKey();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink37 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink42 = new dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink("", "", false, "hi!");
        breadCrumbLink37.addNext(breadCrumbLink42);
        breadCrumbLink37.setCurrentPage(true);
        boolean boolean46 = breadCrumbLink37.isCurrentPage();
        java.lang.String str47 = breadCrumbLink37.getFamily();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList48 = breadCrumbLink37.getNext();
        java.lang.String str49 = breadCrumbLink37.getUrl();
        breadCrumbLink4.setPrevious(breadCrumbLink37);
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink51 = breadCrumbLink4.getParent();
        java.util.List<dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink> breadCrumbLinkList52 = breadCrumbLink4.getNext();
        java.lang.String str53 = breadCrumbLink4.getLabel();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink54 = breadCrumbLink4.getPrevious();
        boolean boolean55 = breadCrumbLink54.isCurrentPage();
        dummiesmind.breadcrumb.springmvc.breadcrumb.BreadCrumbLink breadCrumbLink56 = breadCrumbLink54.getPrevious();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLinkList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(breadCrumbLink54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(breadCrumbLink56);
    }
}

