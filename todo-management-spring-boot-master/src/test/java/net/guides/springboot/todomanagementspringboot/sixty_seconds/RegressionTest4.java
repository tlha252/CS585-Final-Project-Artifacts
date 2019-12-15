package net.guides.springboot.todomanagementspringboot.sixty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        String str12 = todo4.getUserName();
        todo4.setDescription("");
        todo4.setId((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        todo0.setUserName("");
        String str9 = todo0.getUserName();
        String str10 = todo0.getDescription();
        java.util.Date date11 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("hi!");
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        java.util.Date date7 = todo0.getTargetDate();
        todo0.setUserName("");
        java.util.Date date10 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setDescription("");
        todo4.setId((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setUserName("hi!");
        String str13 = todo6.getUserName();
        java.util.Date date14 = todo6.getTargetDate();
        long long15 = todo6.getId();
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        org.springframework.validation.BindingResult bindingResult18 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str19 = todoController0.addTodo(modelMap1, todo6, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        java.util.Date date8 = todo4.getTargetDate();
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        String str5 = todo4.getUserName();
        String str6 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        String str13 = todo4.getDescription();
        String str14 = todo4.getUserName();
        long long15 = todo4.getId();
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, false);
        String str7 = todo6.getUserName();
        todo6.setId((long) (byte) 100);
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.updateTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        todo4.setDescription("");
        todo4.setId((long) 10);
        todo4.setId(35L);
        String str18 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
        String str13 = todo6.getUserName();
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        String str16 = todo6.getUserName();
        todo6.setUserName("");
        java.util.Date date19 = null;
        todo6.setTargetDate(date19);
        todo6.setId(32L);
        todo6.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult25 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str26 = todoController0.addTodo(modelMap1, todo6, bindingResult25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        String str9 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("");
        java.util.Date date7 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setUserName("hi!");
        String str12 = todo6.getUserName();
        String str13 = todo6.getUserName();
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        long long16 = todo6.getId();
        todo6.setUserName("");
        todo6.setId((long) (short) 0);
        todo6.setId((-1L));
        String str23 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult24 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str25 = todoController0.addTodo(modelMap1, todo6, bindingResult24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        todo4.setDescription("hi!");
        long long12 = todo4.getId();
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = todo4.getTargetDate();
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        long long13 = todo4.getId();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 0);
        String str13 = todo4.getDescription();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getUserName();
        todo6.setId((long) (short) 10);
        todo6.setDescription("hi!");
        todo6.setDescription("");
        todo6.setUserName("");
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult22 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str23 = todoController0.addTodo(modelMap1, todo6, bindingResult22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        todo5.setUserName("");
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setDescription("");
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        String str15 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        todo6.setDescription("hi!");
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        todo6.setDescription("");
        String str20 = todo6.getDescription();
        long long21 = todo6.getId();
        todo6.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult24 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str25 = todoController0.addTodo(modelMap1, todo6, bindingResult24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        String str7 = todo4.getDescription();
        todo4.setId((long) (short) 1);
        long long10 = todo4.getId();
        java.util.Date date11 = todo4.getTargetDate();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setId((long) (short) 10);
        String str13 = todo6.getUserName();
        String str14 = todo6.getUserName();
        java.util.Date date15 = todo6.getTargetDate();
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult20 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str21 = todoController0.updateTodo(modelMap1, todo6, bindingResult20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        java.util.Date date11 = null;
        todo5.setTargetDate(date11);
        java.util.Date date13 = todo5.getTargetDate();
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = todo4.getTargetDate();
        todo4.setDescription("");
        todo4.setDescription("");
        String str16 = todo4.getDescription();
        java.util.Date date17 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        String str13 = todo4.getDescription();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        String str7 = todo4.getDescription();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setDescription("hi!");
        String str10 = todo5.getDescription();
        String str11 = todo5.getDescription();
        java.util.Date date12 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        todo4.setId((long) '#');
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        long long7 = todo4.getId();
        String str8 = todo4.getUserName();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setId((long) 10);
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        String str13 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        long long11 = todo4.getId();
        long long12 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        long long12 = todo6.getId();
        String str13 = todo6.getDescription();
        todo6.setDescription("");
        long long16 = todo6.getId();
        String str17 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult18 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str19 = todoController0.updateTodo(modelMap1, todo6, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("hi!");
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        todo4.setUserName("");
        todo4.setId((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setUserName("hi!");
        long long16 = todo4.getId();
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        todo4.setUserName("hi!");
        todo4.setUserName("hi!");
        java.util.Date date24 = null;
        todo4.setTargetDate(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        String str11 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        long long11 = todo4.getId();
        String str12 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        todo0.setUserName("");
        java.util.Date date9 = null;
        todo0.setTargetDate(date9);
        java.util.Date date11 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        String str7 = todo2.getUserName();
        todo2.setUserName("");
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.updateTodo(modelMap1, todo2, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        String str14 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult15 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str16 = todoController0.updateTodo(modelMap1, todo6, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setUserName("");
        todo4.setUserName("");
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setId((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        long long9 = todo4.getId();
        todo4.setId(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        todo4.setDescription("hi!");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        long long14 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, false);
        todo6.setId((-1L));
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.updateTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setDescription("");
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        String str20 = todo4.getDescription();
        todo4.setUserName("hi!");
        todo4.setId((-1L));
        String str25 = todo4.getDescription();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = todo4.getTargetDate();
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getDescription();
        String str15 = todo4.getUserName();
        todo4.setId((long) 'a');
        todo4.setId((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        todo4.setId((long) '#');
        todo4.setId((long) (short) -1);
        long long12 = todo4.getId();
        String str13 = todo4.getUserName();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        todo2.setDescription("");
        todo2.setUserName("");
        java.util.Date date11 = todo2.getTargetDate();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.updateTodo(modelMap1, todo2, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (-1));
        todo4.setId((long) 1);
        String str19 = todo4.getUserName();
        java.util.Date date20 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        String str13 = todo4.getUserName();
        java.util.Date date14 = todo4.getTargetDate();
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setUserName("");
        todo4.setId((long) (short) -1);
        String str17 = todo4.getUserName();
        String str18 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        String str14 = todo4.getDescription();
        java.util.Date date15 = todo4.getTargetDate();
        long long16 = todo4.getId();
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        java.util.Date date12 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        todo4.setId((-1L));
        todo4.setDescription("");
        todo4.setDescription("hi!");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setId((long) 100);
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setUserName("");
        java.util.Date date16 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        todo5.setId((long) (-1));
        todo5.setUserName("hi!");
        String str16 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        String str11 = todo5.getDescription();
        todo5.setUserName("hi!");
        String str14 = todo5.getUserName();
        java.util.Date date15 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = todo6.getTargetDate();
        String str8 = todo6.getDescription();
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        todo4.setId((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        String str5 = todo0.getDescription();
        String str6 = todo0.getUserName();
        todo0.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        todo4.setUserName("");
        java.util.Date date14 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        long long14 = todo4.getId();
        todo4.setUserName("");
        todo4.setId((long) (short) 0);
        String str19 = todo4.getDescription();
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str9 = todo4.getUserName();
        todo4.setUserName("hi!");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        todo4.setId((long) 'a');
        String str16 = todo4.getUserName();
        todo4.setId(97L);
        String str19 = todo4.getUserName();
        String str20 = todo4.getUserName();
        Class<?> wildcardClass21 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        todo4.setId((long) 'a');
        String str15 = todo4.getDescription();
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        String str13 = todo6.getDescription();
        todo6.setId((long) (byte) 0);
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.addTodo(modelMap1, todo6, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        long long12 = todo4.getId();
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        todo5.setUserName("");
        java.util.Date date15 = todo5.getTargetDate();
        todo5.setId((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
        todo6.setDescription("hi!");
        String str16 = todo6.getDescription();
        todo6.setId(1L);
        org.springframework.validation.BindingResult bindingResult19 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str20 = todoController0.updateTodo(modelMap1, todo6, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        java.util.Date date3 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        java.util.Date date10 = todo6.getTargetDate();
        String str11 = todo6.getUserName();
        todo6.setId((-1L));
        todo6.setDescription("");
        java.util.Date date16 = todo6.getTargetDate();
        long long17 = todo6.getId();
        java.util.Date date18 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult19 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str20 = todoController0.updateTodo(modelMap1, todo6, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
        String str14 = todo6.getDescription();
        todo6.setId((long) 'a');
        todo6.setUserName("hi!");
        java.util.Date date19 = todo6.getTargetDate();
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult22 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str23 = todoController0.updateTodo(modelMap1, todo6, bindingResult22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        todo6.setDescription("hi!");
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        todo6.setDescription("");
        todo6.setId((long) (-1));
        org.springframework.validation.BindingResult bindingResult22 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str23 = todoController0.updateTodo(modelMap1, todo6, bindingResult22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getDescription();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        String str13 = todo6.getUserName();
        java.util.Date date14 = todo6.getTargetDate();
        java.util.Date date15 = null;
        todo6.setTargetDate(date15);
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.addTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        java.util.Date date7 = todo0.getTargetDate();
        String str8 = todo0.getUserName();
        todo0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        todo4.setUserName("hi!");
        todo4.setUserName("hi!");
        Class<?> wildcardClass24 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        todo4.setId(1L);
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        String str16 = todo4.getDescription();
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = todo4.getTargetDate();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getDescription();
        todo4.setDescription("hi!");
        java.util.Date date17 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getDescription();
        String str15 = todo4.getUserName();
        todo4.setId((long) 'a');
        todo4.setDescription("");
        todo4.setId((long) (short) 100);
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        String str15 = todo5.getUserName();
        todo5.setUserName("");
        java.util.Date date18 = null;
        todo5.setTargetDate(date18);
        java.util.Date date20 = todo5.getTargetDate();
        java.util.Date date21 = null;
        todo5.setTargetDate(date21);
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        String str13 = todo5.getUserName();
        todo5.setDescription("hi!");
        long long16 = todo5.getId();
        todo5.setId(0L);
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        String str13 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        java.util.Date date19 = todo4.getTargetDate();
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        Class<?> wildcardClass22 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setDescription("hi!");
        String str13 = todo6.getUserName();
        String str14 = todo6.getDescription();
        java.util.Date date15 = null;
        todo6.setTargetDate(date15);
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.updateTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        String str14 = todo4.getUserName();
        todo4.setId((long) '#');
        java.util.Date date17 = todo4.getTargetDate();
        Class<?> wildcardClass18 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        todo4.setId((long) (short) -1);
        todo4.setId((long) (short) 1);
        java.util.Date date18 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        long long13 = todo4.getId();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        todo4.setUserName("");
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        todo4.setDescription("");
        todo4.setUserName("hi!");
        String str26 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        todo4.setUserName("hi!");
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setDescription("");
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = todo4.getTargetDate();
        long long15 = todo4.getId();
        String str16 = todo4.getUserName();
        String str17 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setDescription("hi!");
        java.util.Date date7 = todo0.getTargetDate();
        long long8 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        java.util.Date date7 = null;
        todo2.setTargetDate(date7);
        todo2.setUserName("");
        String str11 = todo2.getUserName();
        String str12 = todo2.getDescription();
        todo2.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult15 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str16 = todoController0.updateTodo(modelMap1, todo2, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setId((long) ' ');
        todo4.setId((long) 100);
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        todo4.setId((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = todo6.getTargetDate();
        java.util.Date date10 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.updateTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
        java.util.Date date14 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult15 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str16 = todoController0.addTodo(modelMap1, todo6, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setUserName("");
        java.util.Date date11 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        todo6.setDescription("hi!");
        todo6.setId(100L);
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.addTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        todo4.setId(1L);
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setUserName("");
        todo4.setDescription("hi!");
        long long20 = todo4.getId();
        todo4.setUserName("hi!");
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
        long long14 = todo6.getId();
        java.util.Date date15 = null;
        todo6.setTargetDate(date15);
        long long17 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult18 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str19 = todoController0.updateTodo(modelMap1, todo6, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getDescription();
        long long15 = todo4.getId();
        java.util.Date date16 = todo4.getTargetDate();
        todo4.setId((long) 100);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setUserName("hi!");
        String str12 = todo6.getUserName();
        String str13 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.updateTodo(modelMap1, todo6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        long long11 = todo4.getId();
        long long12 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setUserName("hi!");
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.addTodo(modelMap1, todo6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        Class<?> wildcardClass5 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, true);
        long long7 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.updateTodo(modelMap1, todo6, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        todo4.setDescription("");
        todo4.setId((long) 10);
        todo4.setUserName("hi!");
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        todo4.setDescription("");
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getDescription();
        java.util.Date date16 = todo4.getTargetDate();
        String str17 = todo4.getUserName();
        String str18 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        String str14 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str17 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        long long14 = todo4.getId();
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        String str17 = todo4.getDescription();
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        Class<?> wildcardClass22 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        todo4.setDescription("");
        java.util.Date date17 = todo4.getTargetDate();
        long long18 = todo4.getId();
        long long19 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setDescription("");
        String str14 = todo6.getUserName();
        String str15 = todo6.getDescription();
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        todo6.setId((long) (short) 100);
        String str20 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult21 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str22 = todoController0.updateTodo(modelMap1, todo6, bindingResult21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        todo4.setId(97L);
        todo4.setUserName("hi!");
        java.util.Date date10 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        todo4.setId((long) (-1));
        long long13 = todo4.getId();
        todo4.setId(97L);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        todo4.setDescription("hi!");
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        String str9 = todo4.getUserName();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
        todo4.setUserName("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getDescription();
        String str16 = todo4.getDescription();
        long long17 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        todo4.setId((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setId((long) 'a');
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = todo4.getTargetDate();
        todo4.setId((long) (byte) 0);
        java.util.Date date19 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass20 = date19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        String str7 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setUserName("");
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getDescription();
        todo4.setId((long) (byte) 0);
        String str14 = todo4.getDescription();
        long long15 = todo4.getId();
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        long long11 = todo4.getId();
        todo4.setDescription("hi!");
        todo4.setDescription("");
        todo4.setId((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.updateTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        String str12 = todo5.getDescription();
        todo5.setId((long) (byte) 0);
        String str15 = todo5.getDescription();
        long long16 = todo5.getId();
        String str17 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        long long12 = todo4.getId();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        java.util.Date date12 = todo4.getTargetDate();
        long long13 = todo4.getId();
        String str14 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setDescription("hi!");
        long long15 = todo4.getId();
        todo4.setId(97L);
        todo4.setUserName("");
        long long20 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        todo4.setDescription("");
        todo4.setUserName("hi!");
        java.util.Date date16 = todo4.getTargetDate();
        String str17 = todo4.getDescription();
        Class<?> wildcardClass18 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
        java.util.Date date13 = todo6.getTargetDate();
        java.util.Date date14 = todo6.getTargetDate();
        String str15 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.addTodo(modelMap1, todo6, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setId((long) (short) 10);
        String str13 = todo6.getUserName();
        String str14 = todo6.getUserName();
        java.util.Date date15 = todo6.getTargetDate();
        String str16 = todo6.getDescription();
        String str17 = todo6.getUserName();
        todo6.setUserName("hi!");
        String str20 = todo6.getDescription();
        java.util.Date date21 = null;
        todo6.setTargetDate(date21);
        todo6.setUserName("hi!");
        java.util.Date date25 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult26 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str27 = todoController0.updateTodo(modelMap1, todo6, bindingResult26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setId(32L);
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setDescription("hi!");
        todo4.setDescription("");
        todo4.setId((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        long long11 = todo4.getId();
        todo4.setUserName("");
        todo4.setUserName("");
        String str16 = todo4.getUserName();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (-1));
        todo4.setId((long) 1);
        String str19 = todo4.getUserName();
        String str20 = todo4.getUserName();
        Class<?> wildcardClass21 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setUserName("");
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        todo4.setId(1L);
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setUserName("");
        todo4.setDescription("hi!");
        String str20 = todo4.getUserName();
        long long21 = todo4.getId();
        String str22 = todo4.getDescription();
        Class<?> wildcardClass23 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
        long long12 = todo6.getId();
        long long13 = todo6.getId();
        String str14 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult15 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str16 = todoController0.updateTodo(modelMap1, todo6, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (-1));
        todo4.setId((long) 1);
        String str19 = todo4.getUserName();
        String str20 = todo4.getUserName();
        todo4.setUserName("hi!");
        java.util.Date date23 = null;
        todo4.setTargetDate(date23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult15 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str16 = todoController0.updateTodo(modelMap1, todo6, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        todo5.setId(1L);
        String str17 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        String str13 = todo4.getDescription();
        java.util.Date date14 = todo4.getTargetDate();
        long long15 = todo4.getId();
        todo4.setUserName("");
        todo4.setDescription("");
        todo4.setId(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        String str20 = todo4.getDescription();
        todo4.setUserName("hi!");
        todo4.setId((-1L));
        String str25 = todo4.getDescription();
        long long26 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        todo4.setUserName("hi!");
        long long10 = todo4.getId();
        String str11 = todo4.getDescription();
        todo4.setId((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        String str7 = todo4.getUserName();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        java.util.Date date10 = todo5.getTargetDate();
        long long11 = todo5.getId();
        todo5.setUserName("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setId(97L);
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.updateTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        todo0.setDescription("hi!");
        long long11 = todo0.getId();
        java.util.Date date12 = todo0.getTargetDate();
        todo0.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        String str12 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        todo4.setUserName("");
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        todo0.setDescription("hi!");
        todo0.setDescription("");
        java.util.Date date8 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        java.util.Date date10 = todo5.getTargetDate();
        long long11 = todo5.getId();
        todo5.setUserName("");
        todo5.setId((long) (short) 1);
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        long long12 = todo4.getId();
        todo4.setUserName("");
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("");
        String str9 = todo6.getDescription();
        String str10 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        String str13 = todo5.getDescription();
        String str14 = todo5.getDescription();
        String str15 = todo5.getUserName();
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        long long14 = todo4.getId();
        todo4.setUserName("");
        todo4.setId((long) (short) 0);
        String str19 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        String str13 = todo4.getUserName();
        String str14 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = todo4.getTargetDate();
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getUserName();
        long long16 = todo4.getId();
        String str17 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        java.util.Date date12 = todo4.getTargetDate();
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        String str12 = todo4.getUserName();
        String str13 = todo4.getUserName();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        String str16 = todo4.getDescription();
        String str17 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        todo5.setId((-1L));
        todo5.setDescription("hi!");
        todo5.setUserName("");
        java.util.Date date12 = null;
        todo5.setTargetDate(date12);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = todo4.getTargetDate();
        String str12 = todo4.getDescription();
        todo4.setId((long) '4');
        long long15 = todo4.getId();
        String str16 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        todo4.setUserName("");
        todo4.setId((long) (short) 1);
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setUserName("");
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        todo4.setId((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        long long7 = todo0.getId();
        String str8 = todo0.getUserName();
        todo0.setId((-1L));
        todo0.setId((long) 10);
        java.util.Date date13 = null;
        todo0.setTargetDate(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        todo4.setId((long) (short) 0);
        long long15 = todo4.getId();
        todo4.setDescription("");
        String str18 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        todo4.setId((long) (short) 0);
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        String str20 = todo4.getUserName();
        java.util.Date date21 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setDescription("hi!");
        todo4.setUserName("");
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setUserName("hi!");
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        todo4.setId(1L);
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setUserName("");
        todo4.setDescription("hi!");
        String str20 = todo4.getDescription();
        String str21 = todo4.getDescription();
        Class<?> wildcardClass22 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getUserName();
        todo4.setId(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getUserName();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        String str15 = todo5.getUserName();
        todo5.setUserName("");
        java.util.Date date18 = null;
        todo5.setTargetDate(date18);
        todo5.setId(32L);
        long long22 = todo5.getId();
        long long23 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        java.util.Date date5 = todo4.getTargetDate();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setDescription("hi!");
        java.util.Date date12 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
        long long12 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.updateTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date9 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        long long9 = todo4.getId();
        todo4.setId((long) (-1));
        todo4.setDescription("");
        long long14 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        String str10 = todo4.getUserName();
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        java.util.Date date11 = null;
        todo5.setTargetDate(date11);
        java.util.Date date13 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        long long11 = todo4.getId();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setId((long) '4');
        java.util.Date date18 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        todo4.setId((long) '#');
        todo4.setId((long) (short) -1);
        long long12 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        String str13 = todo4.getDescription();
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        todo5.setDescription("hi!");
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setUserName("");
        String str12 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        String str14 = todo4.getDescription();
        todo4.setId(1L);
        todo4.setId((long) 100);
        long long19 = todo4.getId();
        long long20 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        todo4.setId(1L);
        todo4.setDescription("");
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setUserName("");
        todo4.setId((long) (short) 10);
        String str20 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        java.util.Date date12 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        long long9 = todo4.getId();
        todo4.setDescription("hi!");
        long long12 = todo4.getId();
        todo4.setId(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        String str12 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("hi!");
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        String str16 = todo4.getDescription();
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        todo4.setUserName("hi!");
        String str22 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
        java.util.Date date21 = null;
        todo4.setTargetDate(date21);
        todo4.setId((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        java.util.Date date5 = todo0.getTargetDate();
        todo0.setUserName("");
        todo0.setUserName("hi!");
        todo0.setUserName("");
        java.util.Date date12 = null;
        todo0.setTargetDate(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        String str3 = todo0.getUserName();
        todo0.setId((long) (byte) 1);
        todo0.setUserName("");
        todo0.setDescription("");
        Class<?> wildcardClass10 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        todo6.setDescription("hi!");
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        todo6.setDescription("");
        String str20 = todo6.getDescription();
        long long21 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult22 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str23 = todoController0.addTodo(modelMap1, todo6, bindingResult22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        Class<?> wildcardClass18 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        java.util.Date date9 = todo6.getTargetDate();
        String str10 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setId((long) ' ');
        todo4.setId((long) 100);
        todo4.setId((long) (byte) 1);
        long long17 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setDescription("");
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        java.util.Date date7 = null;
        todo0.setTargetDate(date7);
        long long9 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        String str13 = todo4.getUserName();
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
        long long12 = todo6.getId();
        long long13 = todo6.getId();
        todo6.setDescription("hi!");
        String str16 = todo6.getDescription();
        String str17 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult18 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str19 = todoController0.addTodo(modelMap1, todo6, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        java.util.Date date5 = todo0.getTargetDate();
        todo0.setUserName("");
        todo0.setUserName("hi!");
        java.util.Date date10 = null;
        todo0.setTargetDate(date10);
        todo0.setId(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = todo4.getTargetDate();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        todo4.setDescription("");
        long long14 = todo4.getId();
        String str15 = todo4.getUserName();
        java.util.Date date16 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        String str12 = todo4.getDescription();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        todo4.setId((long) (short) 0);
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setId((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        todo4.setUserName("");
        long long11 = todo4.getId();
        todo4.setDescription("");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date11 = todo4.getTargetDate();
        java.util.Date date12 = todo4.getTargetDate();
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        String str12 = todo6.getUserName();
        long long13 = todo6.getId();
        todo6.setUserName("");
        java.util.Date date16 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.addTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        todo4.setDescription("hi!");
        todo4.setId((long) '#');
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setId((long) '#');
        String str10 = todo4.getDescription();
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = todo4.getTargetDate();
        todo4.setId((long) (byte) 0);
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        long long12 = todo6.getId();
        todo6.setUserName("");
        todo6.setId((long) (short) 1);
        java.util.Date date17 = todo6.getTargetDate();
        long long18 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult19 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str20 = todoController0.addTodo(modelMap1, todo6, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        String str13 = todo5.getDescription();
        long long14 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        todo4.setId(1L);
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        todo4.setDescription("hi!");
        String str17 = todo4.getDescription();
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 0);
        String str13 = todo4.getDescription();
        todo4.setId((long) 100);
        String str16 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        todo4.setId(10L);
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setId((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getDescription();
        todo4.setId((long) (short) 100);
        long long14 = todo4.getId();
        String str15 = todo4.getDescription();
        String str16 = todo4.getDescription();
        todo4.setId(10L);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setUserName("hi!");
        String str13 = todo4.getDescription();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        String str16 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        String str10 = todo4.getUserName();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        long long10 = todo4.getId();
        todo4.setId((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, false);
        String str7 = todo6.getDescription();
        String str8 = todo6.getUserName();
        todo6.setDescription("hi!");
        String str11 = todo6.getDescription();
        String str12 = todo6.getDescription();
        String str13 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.addTodo(modelMap1, todo6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
        java.util.Date date12 = todo6.getTargetDate();
        String str13 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.addTodo(modelMap1, todo6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        String str8 = todo4.getDescription();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setId((long) ' ');
        todo4.setId((long) 100);
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        long long13 = todo4.getId();
        todo4.setUserName("hi!");
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        String str18 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        String str11 = todo5.getDescription();
        String str12 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        String str7 = todo4.getDescription();
        long long8 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        todo4.setId((long) 'a');
        String str16 = todo4.getUserName();
        todo4.setId(97L);
        String str19 = todo4.getUserName();
        String str20 = todo4.getUserName();
        todo4.setId((long) (short) 0);
        todo4.setId((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setId(1L);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setUserName("hi!");
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getUserName();
        java.util.Date date16 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setId((long) ' ');
        todo4.setId((long) 100);
        String str15 = todo4.getDescription();
        String str16 = todo4.getDescription();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        java.util.Date date11 = todo5.getTargetDate();
        java.util.Date date12 = null;
        todo5.setTargetDate(date12);
        long long14 = todo5.getId();
        long long15 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        todo4.setId((long) 'a');
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        todo4.setUserName("");
        todo4.setId((long) (short) 1);
        todo4.setUserName("");
        long long17 = todo4.getId();
        todo4.setId(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) '#');
        todo4.setId((long) '4');
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("");
        todo6.setDescription("");
        java.util.Date date11 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setDescription("hi!");
        long long19 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getUserName();
        todo6.setUserName("");
        todo6.setDescription("");
        String str15 = todo6.getUserName();
        String str16 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.updateTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        String str13 = todo4.getDescription();
        String str14 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str17 = todo4.getDescription();
        java.util.Date date18 = todo4.getTargetDate();
        long long19 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        long long5 = todo0.getId();
        todo0.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
        todo5.setUserName("");
        String str12 = todo5.getUserName();
        todo5.setDescription("");
        todo5.setUserName("");
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        todo4.setId((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        java.util.Date date12 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        long long12 = todo4.getId();
        String str13 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        java.util.Date date11 = todo4.getTargetDate();
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setUserName("");
        java.util.Date date17 = todo4.getTargetDate();
        String str18 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 1);
        Class<?> wildcardClass19 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        todo4.setDescription("");
        todo4.setUserName("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        String str13 = todo5.getUserName();
        String str14 = todo5.getDescription();
        todo5.setId((long) 'a');
        String str17 = todo5.getUserName();
        todo5.setId(97L);
        String str20 = todo5.getUserName();
        todo5.setUserName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        todo4.setDescription("hi!");
        todo4.setId((long) ' ');
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        todo4.setUserName("hi!");
        java.util.Date date17 = todo4.getTargetDate();
        todo4.setId(0L);
        String str20 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setUserName("hi!");
        todo5.setId((long) 100);
        java.util.Date date16 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setId((long) (short) 10);
        String str13 = todo6.getUserName();
        String str14 = todo6.getUserName();
        java.util.Date date15 = todo6.getTargetDate();
        String str16 = todo6.getDescription();
        String str17 = todo6.getUserName();
        todo6.setDescription("hi!");
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult22 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str23 = todoController0.addTodo(modelMap1, todo6, bindingResult22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        todo4.setId(35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setUserName("");
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        todo4.setDescription("hi!");
        todo4.setId((-1L));
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, false);
        todo6.setDescription("hi!");
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.updateTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 0);
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        long long12 = todo6.getId();
        todo6.setUserName("");
        todo6.setId((long) (short) 1);
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult19 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str20 = todoController0.addTodo(modelMap1, todo6, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        String str13 = todo5.getDescription();
        String str14 = todo5.getDescription();
        String str15 = todo5.getUserName();
        todo5.setDescription("hi!");
        String str18 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setDescription("");
        java.util.Date date18 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setUserName("hi!");
        todo4.setUserName("hi!");
        long long14 = todo4.getId();
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setDescription("hi!");
        String str12 = todo5.getUserName();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        String str12 = todo5.getUserName();
        String str13 = todo5.getDescription();
        String str14 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        String str14 = todo6.getDescription();
        todo6.setDescription("");
        String str17 = todo6.getUserName();
        String str18 = todo6.getUserName();
        long long19 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult20 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str21 = todoController0.addTodo(modelMap1, todo6, bindingResult20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) (short) 100);
        todo5.setDescription("");
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        todo0.setDescription("hi!");
        long long6 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (byte) 10);
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        todo4.setId((long) (short) 100);
        todo4.setId((long) (byte) 0);
        java.util.Date date21 = null;
        todo4.setTargetDate(date21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setDescription("");
        java.util.Date date10 = todo4.getTargetDate();
        long long11 = todo4.getId();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        long long7 = todo4.getId();
        String str8 = todo4.getUserName();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setId((long) 10);
        java.util.Date date13 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        todo5.setUserName("");
        todo5.setId((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        String str15 = todo4.getUserName();
        java.util.Date date16 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        java.util.Date date12 = null;
        todo5.setTargetDate(date12);
        String str14 = todo5.getDescription();
        todo5.setDescription("");
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
        todo5.setDescription("");
        java.util.Date date21 = null;
        todo5.setTargetDate(date21);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        String str18 = todo4.getDescription();
        todo4.setId(35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        String str12 = todo4.getDescription();
        java.util.Date date13 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str16 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        todo4.setId(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        String str14 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        String str13 = todo5.getDescription();
        todo5.setId((long) 'a');
        String str16 = todo5.getDescription();
        todo5.setId((long) (short) 1);
        todo5.setId((long) (byte) 100);
        String str21 = todo5.getDescription();
        long long22 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        java.util.Date date11 = todo4.getTargetDate();
        java.util.Date date12 = todo4.getTargetDate();
        long long13 = todo4.getId();
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        todo4.setId((long) 'a');
        String str15 = todo4.getDescription();
        todo4.setId((long) (short) 1);
        todo4.setId((long) (byte) 100);
        long long20 = todo4.getId();
        java.util.Date date21 = null;
        todo4.setTargetDate(date21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setId((long) (short) 10);
        todo5.setDescription("hi!");
        todo5.setUserName("hi!");
        todo5.setUserName("");
        java.util.Date date19 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        todo6.setId(1L);
        String str15 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.addTodo(modelMap1, todo6, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        String str11 = todo4.getDescription();
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        java.util.Date date9 = todo5.getTargetDate();
        todo5.setId((long) '#');
        String str12 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        long long13 = todo4.getId();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        todo4.setUserName("");
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        String str22 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        String str14 = todo4.getUserName();
        long long15 = todo4.getId();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        java.util.Date date10 = todo6.getTargetDate();
        todo6.setId((long) '#');
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.updateTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setDescription("");
        todo0.setUserName("");
        java.util.Date date9 = todo0.getTargetDate();
        java.util.Date date10 = todo0.getTargetDate();
        Class<?> wildcardClass11 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setId(32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getUserName();
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setDescription("hi!");
        long long13 = todo4.getId();
        String str14 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        todo5.setDescription("hi!");
        String str15 = todo5.getDescription();
        todo5.setId(1L);
        String str18 = todo5.getUserName();
        String str19 = todo5.getUserName();
        todo5.setUserName("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setDescription("");
        todo4.setId((long) (-1));
        long long20 = todo4.getId();
        long long21 = todo4.getId();
        String str22 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        todo4.setId((long) (short) -1);
        todo4.setId((long) (short) 1);
        todo4.setDescription("hi!");
        String str20 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setId(0L);
        java.util.Date date7 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass8 = date7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        String str9 = todo4.getUserName();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        todo4.setId((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setDescription("");
        String str14 = todo6.getUserName();
        todo6.setId((long) (short) 0);
        java.util.Date date17 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult20 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str21 = todoController0.addTodo(modelMap1, todo6, bindingResult20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) '#');
        todo4.setId((long) '4');
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setId((long) ' ');
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult18 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str19 = todoController0.updateTodo(modelMap1, todo6, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        long long7 = todo0.getId();
        java.util.Date date8 = todo0.getTargetDate();
        String str9 = todo0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setDescription("");
        todo6.setUserName("");
        java.util.Date date15 = null;
        todo6.setTargetDate(date15);
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.updateTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setId((long) '#');
        String str10 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setDescription("");
        todo4.setId((long) (-1));
        long long20 = todo4.getId();
        java.util.Date date21 = null;
        todo4.setTargetDate(date21);
        Class<?> wildcardClass23 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        String str14 = todo4.getUserName();
        todo4.setDescription("hi!");
        long long17 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str13 = todo4.getDescription();
        todo4.setId((long) (short) 100);
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        String str9 = todo4.getUserName();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        todo4.setId(52L);
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getDescription();
        String str15 = todo4.getUserName();
        todo4.setUserName("hi!");
        String str18 = todo4.getDescription();
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
        todo4.setId(52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        todo5.setId((long) (byte) 0);
        todo5.setDescription("hi!");
        java.util.Date date13 = todo5.getTargetDate();
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
        String str10 = todo5.getDescription();
        long long11 = todo5.getId();
        todo5.setId(1L);
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
        todo5.setUserName("hi!");
        todo5.setDescription("");
        String str20 = todo5.getDescription();
        todo5.setId((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        java.util.Date date10 = todo4.getTargetDate();
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
        todo6.setDescription("hi!");
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        java.util.Date date18 = null;
        todo6.setTargetDate(date18);
        org.springframework.validation.BindingResult bindingResult20 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str21 = todoController0.updateTodo(modelMap1, todo6, bindingResult20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (-1));
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        String str19 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        java.util.Date date10 = todo4.getTargetDate();
        String str11 = todo4.getDescription();
        String str12 = todo4.getDescription();
        todo4.setDescription("");
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        long long12 = todo6.getId();
        todo6.setUserName("");
        String str15 = todo6.getUserName();
        java.util.Date date16 = todo6.getTargetDate();
        long long17 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult18 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str19 = todoController0.updateTodo(modelMap1, todo6, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        todo4.setDescription("");
        todo4.setDescription("hi!");
        todo4.setId((long) (short) 0);
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        String str11 = todo4.getDescription();
        todo4.setId((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }
}

