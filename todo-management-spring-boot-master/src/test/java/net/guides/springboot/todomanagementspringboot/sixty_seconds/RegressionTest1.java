package net.guides.springboot.todomanagementspringboot.sixty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        String str12 = todo6.getUserName();
        todo6.setDescription("hi!");
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        java.util.Date date7 = null;
        todo2.setTargetDate(date7);
        long long9 = todo2.getId();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo2, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, false);
        todo6.setUserName("hi!");
        long long9 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        todo4.setUserName("");
        long long16 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        String str12 = todo4.getDescription();
        todo4.setId((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult27 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str28 = todoController0.addTodo(modelMap1, todo6, bindingResult27);
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        todo6.setId((long) (short) 100);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setUserName("");
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        String str14 = todo6.getUserName();
        todo6.setDescription("hi!");
        long long17 = todo6.getId();
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
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) 'a');
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass10 = date9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        java.util.Date date11 = null;
        todo5.setTargetDate(date11);
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
        String str12 = todo5.getUserName();
        String str13 = todo5.getUserName();
        java.util.Date date14 = todo5.getTargetDate();
        String str15 = todo5.getDescription();
        String str16 = todo5.getUserName();
        todo5.setId((long) 'a');
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        todo5.setUserName("hi!");
        todo5.setId((long) (byte) 1);
        String str10 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        todo5.setUserName("hi!");
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
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        String str12 = todo5.getDescription();
        todo5.setId((long) (short) 100);
        long long15 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        String str17 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        long long5 = todo4.getId();
        long long6 = todo4.getId();
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "", date3, true);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        todo4.setId(32L);
        todo4.setUserName("hi!");
        todo4.setUserName("");
        Class<?> wildcardClass25 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        java.util.Date date10 = todo4.getTargetDate();
        String str11 = todo4.getDescription();
        String str12 = todo4.getUserName();
        Class<?> wildcardClass13 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        String str8 = todo4.getUserName();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setId((long) (short) 100);
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
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        java.util.Date date16 = null;
        todo5.setTargetDate(date16);
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
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        todo5.setId((-1L));
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        todo4.setId((long) 'a');
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        long long7 = todo2.getId();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo2, bindingResult8);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (byte) 10);
        String str15 = todo4.getUserName();
        String str16 = todo4.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        todo6.setId((long) (short) -1);
        String str14 = todo6.getUserName();
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        todo4.setUserName("hi!");
        String str9 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setDescription("");
        String str13 = todo5.getUserName();
        String str14 = todo5.getDescription();
        java.util.Date date15 = null;
        todo5.setTargetDate(date15);
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
        java.util.Date date19 = null;
        todo5.setTargetDate(date19);
        todo5.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        java.util.Date date7 = todo0.getTargetDate();
        todo0.setUserName("");
        Class<?> wildcardClass10 = todo0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getDescription();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        java.util.Date date9 = todo5.getTargetDate();
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        String str12 = todo5.getUserName();
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        String str8 = todo4.getUserName();
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        todo5.setUserName("");
        long long18 = todo5.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        Class<?> wildcardClass16 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
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
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        String str11 = todo6.getDescription();
        long long12 = todo6.getId();
        todo6.setId(1L);
        todo6.setDescription("");
        java.util.Date date17 = todo6.getTargetDate();
        String str18 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        java.util.Date date13 = todo6.getTargetDate();
        String str14 = todo6.getUserName();
        String str15 = todo6.getUserName();
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, false);
        todo6.setDescription("hi!");
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        String str12 = todo4.getUserName();
        todo4.setUserName("hi!");
        String str15 = todo4.getUserName();
        todo4.setDescription("");
        String str18 = todo4.getDescription();
        todo4.setId((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        java.util.Date date8 = todo5.getTargetDate();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setId((long) (byte) 10);
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        todo5.setDescription("hi!");
        todo5.setId((long) 10);
        String str10 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.updateTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        String str16 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setId((-1L));
        todo5.setDescription("");
        java.util.Date date15 = todo5.getTargetDate();
        java.util.Date date16 = todo5.getTargetDate();
        todo5.setDescription("");
        todo5.setUserName("hi!");
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        org.springframework.validation.BindingResult bindingResult23 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str24 = todoController0.updateTodo(modelMap1, todo6, bindingResult23);
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        todo4.setDescription("hi!");
        todo4.setUserName("");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
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
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        String str17 = todo4.getDescription();
        java.util.Date date18 = todo4.getTargetDate();
        String str19 = todo4.getDescription();
        String str20 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        todo6.setId((long) (byte) 100);
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setId(97L);
        long long11 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        todo0.setId((long) 10);
        Class<?> wildcardClass5 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
        String str12 = todo5.getUserName();
        String str13 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        String str12 = todo4.getDescription();
        todo4.setId(0L);
        todo4.setDescription("hi!");
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
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setDescription("");
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        Class<?> wildcardClass13 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        Class<?> wildcardClass22 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        java.util.Date date13 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
        todo6.setUserName("hi!");
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
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setUserName("hi!");
        String str14 = todo5.getDescription();
        java.util.Date date15 = null;
        todo5.setTargetDate(date15);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        String str11 = todo5.getUserName();
        todo5.setId((long) 0);
        String str14 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        todo6.setDescription("hi!");
        String str18 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        long long5 = todo0.getId();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        java.util.Date date5 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass6 = date5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setId((long) (byte) 100);
        String str14 = todo5.getUserName();
        java.util.Date date15 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        todo4.setDescription("hi!");
        String str17 = todo4.getUserName();
        Class<?> wildcardClass18 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(52L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setId((long) (byte) 100);
        String str14 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setId((long) (short) 100);
        todo6.setDescription("");
        todo6.setId((long) ' ');
        todo6.setDescription("");
        java.util.Date date20 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
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
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        String str16 = todo6.getDescription();
        long long17 = todo6.getId();
        java.util.Date date18 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
        String str14 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        java.util.Date date8 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) (byte) 1);
        String str11 = todo6.getUserName();
        java.util.Date date12 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.updateTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        long long10 = todo4.getId();
        String str11 = todo4.getUserName();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, false);
        String str5 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
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
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        String str6 = todo5.getDescription();
        String str7 = todo5.getUserName();
        long long8 = todo5.getId();
        String str9 = todo5.getUserName();
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        Class<?> wildcardClass16 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
        String str12 = todo5.getUserName();
        String str13 = todo5.getUserName();
        java.util.Date date14 = todo5.getTargetDate();
        String str15 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setId((long) (short) 10);
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
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
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        todo2.setId(100L);
        java.util.Date date9 = todo2.getTargetDate();
        String str10 = todo2.getUserName();
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo2, bindingResult11);
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        todo5.setDescription("hi!");
        long long15 = todo5.getId();
        java.util.Date date16 = null;
        todo5.setTargetDate(date16);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        todo0.setId(97L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        todo6.setId((long) (byte) 0);
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo6, bindingResult10);
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        todo4.setDescription("hi!");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.util.Date date17 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        long long14 = todo6.getId();
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        long long14 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setId(32L);
        long long7 = todo4.getId();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        todo5.setDescription("hi!");
        java.util.Date date15 = null;
        todo5.setTargetDate(date15);
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        todo6.setId(10L);
        todo6.setId((-1L));
        String str18 = todo6.getDescription();
        java.util.Date date19 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
        String str12 = todo6.getDescription();
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        String str12 = todo5.getDescription();
        todo5.setId((long) (short) 100);
        long long15 = todo5.getId();
        String str16 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
        todo4.setUserName("");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        todo4.setUserName("");
        Class<?> wildcardClass16 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        long long11 = todo4.getId();
        String str12 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        todo5.setUserName("");
        todo5.setId(32L);
        todo5.setId(1L);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        String str13 = todo5.getUserName();
        todo5.setUserName("");
        long long16 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        String str14 = todo4.getUserName();
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        String str16 = todo4.getUserName();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, true);
        todo5.setUserName("");
        long long8 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        String str5 = todo0.getDescription();
        java.util.Date date6 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        long long5 = todo4.getId();
        String str6 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        String str17 = todo6.getDescription();
        java.util.Date date18 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setDescription("");
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        String str16 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult17 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str18 = todoController0.updateTodo(modelMap1, todo6, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setDescription("");
        String str13 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setId((-1L));
        todo5.setId((long) (-1));
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
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        String str15 = todo6.getDescription();
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
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
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        String str18 = todo4.getDescription();
        long long19 = todo4.getId();
        String str20 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        todo5.setDescription("");
        java.util.Date date16 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
        java.util.Date date13 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.updateTodo(modelMap1, todo6, bindingResult12);
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
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        java.util.Date date13 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        todo6.setDescription("");
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
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("");
        String str16 = todo4.getDescription();
        String str17 = todo4.getUserName();
        String str18 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        java.util.Date date14 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (byte) 10);
        todo4.setDescription("");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        String str7 = todo2.getDescription();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.util.Date date14 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        String str12 = todo4.getUserName();
        todo4.setId((long) (byte) 0);
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        todo0.setUserName("");
        todo0.setDescription("");
        Class<?> wildcardClass11 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, false);
        org.springframework.validation.BindingResult bindingResult7 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str8 = todoController0.updateTodo(modelMap1, todo6, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        String str12 = todo4.getUserName();
        todo4.setId((long) (byte) 100);
        long long15 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        todo0.setDescription("hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        todo5.setUserName("hi!");
        java.util.Date date15 = todo5.getTargetDate();
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setId((long) (byte) 10);
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        java.util.Date date13 = todo6.getTargetDate();
        String str14 = todo6.getUserName();
        String str15 = todo6.getUserName();
        java.util.Date date16 = todo6.getTargetDate();
        java.util.Date date17 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = todo5.getTargetDate();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setDescription("hi!");
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setId((long) (short) 100);
        todo6.setDescription("");
        todo6.setId((long) ' ');
        todo6.setDescription("");
        java.util.Date date20 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult21 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str22 = todoController0.addTodo(modelMap1, todo6, bindingResult21);
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
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        String str17 = todo4.getUserName();
        Class<?> wildcardClass18 = todo4.getClass();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setDescription("");
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
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) (byte) 1);
        String str11 = todo6.getUserName();
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setId((long) (byte) 100);
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
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setUserName("hi!");
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        todo2.setId(100L);
        todo2.setDescription("hi!");
        todo2.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo2, bindingResult13);
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
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        todo5.setUserName("hi!");
        todo5.setId((long) (byte) 1);
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        long long17 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
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
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        String str12 = todo5.getUserName();
        String str13 = todo5.getUserName();
        todo5.setId((long) 'a');
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        String str14 = todo5.getUserName();
        todo5.setId(32L);
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        java.util.Date date6 = todo5.getTargetDate();
        java.util.Date date7 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        long long13 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        String str11 = todo5.getUserName();
        todo5.setId((long) 0);
        String str14 = todo5.getDescription();
        todo5.setId((long) 100);
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
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
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("");
        String str16 = todo4.getDescription();
        String str17 = todo4.getUserName();
        java.util.Date date18 = todo4.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setDescription("");
        String str14 = todo4.getDescription();
        todo4.setDescription("hi!");
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        long long9 = todo4.getId();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setDescription("");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        todo4.setDescription("");
        java.util.Date date11 = todo4.getTargetDate();
        Class<?> wildcardClass12 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        todo4.setDescription("");
        String str17 = todo4.getDescription();
        Class<?> wildcardClass18 = todo4.getClass();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        todo5.setDescription("");
        java.util.Date date16 = todo5.getTargetDate();
        todo5.setUserName("");
        todo5.setDescription("hi!");
        String str21 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        java.util.Date date17 = todo6.getTargetDate();
        todo6.setUserName("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        long long3 = todo0.getId();
        todo0.setUserName("");
        Class<?> wildcardClass6 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        long long9 = todo4.getId();
        todo4.setDescription("hi!");
        long long12 = todo4.getId();
        java.util.Date date13 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass14 = date13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        String str14 = todo6.getUserName();
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        todo5.setDescription("hi!");
        todo5.setId((long) 10);
        todo5.setUserName("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        String str12 = todo6.getUserName();
        todo6.setId((long) 0);
        long long15 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.util.Date date15 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass16 = date15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) '#');
        todo4.setUserName("");
        todo4.setId((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        todo5.setUserName("hi!");
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
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        String str14 = todo6.getUserName();
        String str15 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        todo4.setDescription("hi!");
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo6, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        java.util.Date date7 = todo0.getTargetDate();
        String str8 = todo0.getDescription();
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, false);
        long long5 = todo4.getId();
        String str6 = todo4.getUserName();
        String str7 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
        java.util.Date date14 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        String str14 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setId(32L);
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        todo4.setUserName("");
        long long11 = todo4.getId();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        java.util.Date date12 = todo5.getTargetDate();
        String str13 = todo5.getUserName();
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        todo4.setId(0L);
        todo4.setUserName("hi!");
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
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getUserName();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.updateTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        todo4.setDescription("hi!");
        todo4.setId(0L);
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        java.util.Date date15 = todo5.getTargetDate();
        String str16 = todo5.getDescription();
        todo5.setDescription("");
        todo5.setUserName("hi!");
        long long21 = todo5.getId();
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
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        String str10 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        String str6 = todo5.getDescription();
        String str7 = todo5.getUserName();
        todo5.setDescription("hi!");
        String str10 = todo5.getDescription();
        String str11 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
        String str15 = todo6.getUserName();
        todo6.setId((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        long long16 = todo6.getId();
        java.util.Date date17 = null;
        todo6.setTargetDate(date17);
        String str19 = todo6.getDescription();
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setId((long) (short) 10);
        String str13 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        java.util.Date date10 = todo5.getTargetDate();
        long long11 = todo5.getId();
        String str12 = todo5.getDescription();
        todo5.setDescription("");
        long long15 = todo5.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setDescription("hi!");
        java.util.Date date10 = todo5.getTargetDate();
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
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        Class<?> wildcardClass20 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, false);
        todo6.setId((-1L));
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setDescription("");
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        todo4.setDescription("");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = todo5.getTargetDate();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        todo4.setDescription("");
        todo4.setUserName("hi!");
        Class<?> wildcardClass20 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        todo4.setId((long) '4');
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        long long11 = todo4.getId();
        java.util.Date date12 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        long long12 = todo4.getId();
        todo4.setDescription("hi!");
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        java.util.Date date13 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setDescription("");
        String str13 = todo5.getUserName();
        todo5.setId((long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, true);
        todo5.setUserName("");
        String str8 = todo5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        todo0.setUserName("");
        String str9 = todo0.getUserName();
        Class<?> wildcardClass10 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        todo4.setDescription("hi!");
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getUserName();
        todo6.setId(32L);
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
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
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        long long15 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        long long16 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        todo2.setUserName("");
        long long7 = todo2.getId();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.updateTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        todo4.setDescription("hi!");
        todo4.setId((long) '#');
        long long14 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        todo4.setDescription("");
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
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        long long12 = todo4.getId();
        todo4.setUserName("");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.util.Date date16 = null;
        todo5.setTargetDate(date16);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
        todo4.setDescription("");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        long long13 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        String str9 = todo6.getDescription();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
        java.util.Date date12 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
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
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        String str12 = todo5.getUserName();
        todo5.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        todo2.setUserName("");
        todo2.setDescription("hi!");
        todo2.setUserName("");
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo2, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        long long12 = todo4.getId();
        todo4.setUserName("");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        java.util.Date date13 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) '#');
        todo4.setId((long) (short) -1);
        long long15 = todo4.getId();
        todo4.setDescription("hi!");
        String str18 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setId((long) (byte) 0);
        String str9 = todo6.getDescription();
        todo6.setId((long) (short) 1);
        long long12 = todo6.getId();
        java.util.Date date13 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.updateTodo(modelMap1, todo6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setDescription("");
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        todo6.setDescription("");
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
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        String str11 = todo5.getDescription();
        todo5.setUserName("hi!");
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
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
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
        todo6.setId(32L);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        java.util.Date date14 = todo6.getTargetDate();
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        String str13 = todo4.getDescription();
        java.util.Date date14 = todo4.getTargetDate();
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setId((long) (byte) 100);
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.updateTodo(modelMap1, todo6, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        long long10 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setDescription("");
        String str13 = todo5.getUserName();
        String str14 = todo5.getDescription();
        String str15 = todo5.getDescription();
        long long16 = todo5.getId();
        java.util.Date date17 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("hi!");
        todo4.setDescription("");
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setId((-1L));
        java.util.Date date13 = todo5.getTargetDate();
        todo5.setUserName("hi!");
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        String str11 = todo4.getUserName();
        todo4.setDescription("hi!");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        long long23 = todo6.getId();
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        java.util.Date date5 = todo0.getTargetDate();
        String str6 = todo0.getUserName();
        todo0.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        todo4.setId((long) (short) 0);
        todo4.setDescription("");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        todo2.setDescription("");
        java.util.Date date7 = null;
        todo2.setTargetDate(date7);
        long long9 = todo2.getId();
        long long10 = todo2.getId();
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo2, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.util.Date date18 = null;
        todo6.setTargetDate(date18);
        java.util.Date date20 = null;
        todo6.setTargetDate(date20);
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        todo5.setId((long) ' ');
        todo5.setDescription("");
        java.util.Date date19 = todo5.getTargetDate();
        long long20 = todo5.getId();
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
        org.junit.Assert.assertNull(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        String str3 = todo0.getUserName();
        todo0.setId((long) (byte) 1);
        String str6 = todo0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getUserName();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        String str11 = todo6.getDescription();
        long long12 = todo6.getId();
        todo6.setId(1L);
        todo6.setDescription("");
        java.util.Date date17 = todo6.getTargetDate();
        todo6.setUserName("");
        todo6.setDescription("hi!");
        String str22 = todo6.getUserName();
        long long23 = todo6.getId();
        String str24 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult25 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str26 = todoController0.updateTodo(modelMap1, todo6, bindingResult25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        todo6.setId((long) 100);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getUserName();
        todo6.setUserName("");
        String str13 = todo6.getUserName();
        todo6.setDescription("");
        todo6.setUserName("");
        todo6.setDescription("");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        todo0.setUserName("");
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        java.util.Date date9 = todo5.getTargetDate();
        long long10 = todo5.getId();
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        long long16 = todo6.getId();
        java.util.Date date17 = null;
        todo6.setTargetDate(date17);
        String str19 = todo6.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        java.util.Date date13 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass14 = date13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        String str18 = todo4.getDescription();
        Class<?> wildcardClass19 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, true);
        todo6.setId(32L);
        long long9 = todo6.getId();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
        java.util.Date date12 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        java.util.Date date10 = todo4.getTargetDate();
        String str11 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) (byte) 1);
        String str11 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        todo5.setId((long) 'a');
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        String str9 = todo0.getDescription();
        String str10 = todo0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setUserName("");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        java.util.Date date11 = todo5.getTargetDate();
        long long12 = todo5.getId();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        long long15 = todo5.getId();
        String str16 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getDescription();
        todo4.setDescription("hi!");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        todo4.setDescription("hi!");
        Class<?> wildcardClass17 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        todo5.setId((long) (-1));
        long long14 = todo5.getId();
        todo5.setId(97L);
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setId(97L);
        todo4.setUserName("");
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
        todo5.setUserName("");
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
        todo6.setId((long) '#');
        todo6.setId((long) (short) -1);
        long long14 = todo6.getId();
        String str15 = todo6.getUserName();
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        todo4.setId((long) 'a');
        long long15 = todo4.getId();
        todo4.setDescription("hi!");
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        java.util.Date date12 = todo5.getTargetDate();
        todo5.setId((long) (-1));
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
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
        String str21 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date9 = todo4.getTargetDate();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str9 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
        java.util.Date date12 = todo6.getTargetDate();
        long long13 = todo6.getId();
        String str14 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
        String str12 = todo6.getDescription();
        todo6.setUserName("hi!");
        java.util.Date date15 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        Class<?> wildcardClass18 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setDescription("hi!");
        String str4 = todo1.getUserName();
        todo1.setId((long) (byte) 1);
        todo1.setUserName("");
        java.util.Date date9 = null;
        todo1.setTargetDate(date9);
        todo1.setId(100L);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        todo6.setId((long) (short) -1);
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        todo5.setDescription("");
        todo5.setId((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        todo6.setId((long) (byte) 0);
        todo6.setDescription("hi!");
        String str14 = todo6.getDescription();
        java.util.Date date15 = null;
        todo6.setTargetDate(date15);
        String str17 = todo6.getUserName();
        String str18 = todo6.getUserName();
        todo6.setUserName("hi!");
        todo6.setId(0L);
        String str23 = todo6.getUserName();
        org.springframework.validation.BindingResult bindingResult24 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str25 = todoController0.updateTodo(modelMap1, todo6, bindingResult24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        String str13 = todo6.getUserName();
        java.util.Date date14 = todo6.getTargetDate();
        todo6.setDescription("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        todo5.setUserName("");
        todo5.setId(32L);
        todo5.setId(1L);
        todo5.setUserName("");
        java.util.Date date16 = null;
        todo5.setTargetDate(date16);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        todo6.setUserName("");
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
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
        todo6.setDescription("");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        java.util.Date date12 = todo5.getTargetDate();
        java.util.Date date13 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        java.util.Date date16 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult21 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str22 = todoController0.addTodo(modelMap1, todo6, bindingResult21);
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
        todo6.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        long long13 = todo5.getId();
        todo5.setDescription("");
        String str16 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        todo6.setId((long) (byte) 0);
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        long long5 = todo0.getId();
        Class<?> wildcardClass6 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        java.util.Date date13 = todo6.getTargetDate();
        todo6.setDescription("");
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
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        String str6 = todo5.getUserName();
        String str7 = todo5.getDescription();
        String str8 = todo5.getDescription();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        todo4.setId(10L);
        todo4.setId((-1L));
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        long long18 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        todo5.setId((long) (byte) 0);
        String str8 = todo5.getDescription();
        todo5.setId((long) (short) 1);
        long long11 = todo5.getId();
        java.util.Date date12 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) (byte) 10);
        todo4.setId(0L);
        todo4.setId((long) (byte) 1);
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        String str12 = todo4.getUserName();
        todo4.setId((long) (byte) 0);
        todo4.setId((long) (short) 1);
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setUserName("hi!");
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        todo4.setId((long) (byte) 10);
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
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.updateTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        todo4.setUserName("hi!");
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        String str14 = todo5.getUserName();
        java.util.Date date15 = todo5.getTargetDate();
        todo5.setUserName("hi!");
        todo5.setUserName("");
        String str20 = todo5.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        todo5.setUserName("hi!");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        String str17 = todo4.getDescription();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        String str13 = todo4.getDescription();
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        String str12 = todo6.getUserName();
        todo6.setDescription("hi!");
        todo6.setId((long) (byte) 10);
        java.util.Date date17 = null;
        todo6.setTargetDate(date17);
        String str19 = todo6.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        long long7 = todo2.getId();
        String str8 = todo2.getDescription();
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.updateTodo(modelMap1, todo2, bindingResult9);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        todo6.setId((long) (byte) 10);
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setDescription("");
        todo4.setId((long) (byte) 10);
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.util.Date date21 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        String str16 = todo4.getUserName();
        java.util.Date date17 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, true);
        todo6.setId(32L);
        long long9 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.updateTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
        java.util.Date date12 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        long long15 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        todo4.setId((long) 'a');
        String str11 = todo4.getDescription();
        String str12 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str9 = todo4.getUserName();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setDescription("");
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
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        String str21 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setId((long) '4');
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        todo2.setId((long) (short) 10);
        String str7 = todo2.getDescription();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
        String str12 = todo5.getUserName();
        String str13 = todo5.getUserName();
        java.util.Date date14 = todo5.getTargetDate();
        String str15 = todo5.getDescription();
        String str16 = todo5.getUserName();
        todo5.setId((long) 'a');
        long long19 = todo5.getId();
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
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        todo2.setId((long) (short) 10);
        String str7 = todo2.getDescription();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.updateTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getDescription();
        todo4.setId((long) (byte) 0);
        long long14 = todo4.getId();
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
        String str10 = todo5.getDescription();
        long long11 = todo5.getId();
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        todo4.setId((-1L));
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        todo4.setUserName("");
        String str13 = todo4.getUserName();
        long long14 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        long long17 = todo6.getId();
        todo6.setDescription("hi!");
        todo6.setId((long) (byte) -1);
        String str22 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult23 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str24 = todoController0.addTodo(modelMap1, todo6, bindingResult23);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        String str14 = todo6.getDescription();
        java.util.Date date15 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.updateTodo(modelMap1, todo6, bindingResult16);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setDescription("");
        String str13 = todo5.getUserName();
        String str14 = todo5.getDescription();
        java.util.Date date15 = null;
        todo5.setTargetDate(date15);
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setUserName("");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        todo4.setDescription("hi!");
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
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setId(1L);
        String str13 = todo4.getUserName();
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        java.util.Date date12 = todo5.getTargetDate();
        java.util.Date date13 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        todo5.setUserName("");
        java.util.Date date18 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        todo2.setUserName("");
        String str7 = todo2.getUserName();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.updateTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        java.util.Date date18 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        long long12 = todo4.getId();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        Class<?> wildcardClass6 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        todo4.setId(0L);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        Class<?> wildcardClass18 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str13 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getDescription();
        String str11 = todo5.getDescription();
        todo5.setDescription("");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setDescription("");
        String str13 = todo5.getUserName();
        todo5.setId((long) (short) 0);
        todo5.setDescription("");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setId(97L);
        java.util.Date date15 = todo4.getTargetDate();
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        String str5 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        todo2.setUserName("");
        todo2.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.updateTodo(modelMap1, todo2, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        todo2.setUserName("hi!");
        java.util.Date date7 = todo2.getTargetDate();
        todo2.setUserName("");
        todo2.setUserName("hi!");
        todo2.setUserName("");
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.addTodo(modelMap1, todo2, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str15 = todo4.getDescription();
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        todo4.setUserName("hi!");
        Class<?> wildcardClass17 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getUserName();
        todo4.setId((long) (short) 1);
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getUserName();
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
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
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
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        todo4.setDescription("hi!");
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setId((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        todo4.setId((long) ' ');
        String str20 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        todo5.setUserName("");
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        String str15 = todo6.getDescription();
        java.util.Date date16 = todo6.getTargetDate();
        String str17 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        String str11 = todo5.getDescription();
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
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        String str6 = todo5.getUserName();
        todo5.setId((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        String str7 = todo0.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        Class<?> wildcardClass7 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        String str8 = todo4.getDescription();
        todo4.setUserName("");
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getUserName();
        todo6.setUserName("");
        todo6.setId((long) ' ');
        todo6.setId((long) 100);
        java.util.Date date17 = null;
        todo6.setTargetDate(date17);
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        todo4.setDescription("hi!");
        java.util.Date date14 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        String str14 = todo6.getUserName();
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setDescription("hi!");
        String str4 = todo1.getUserName();
        todo1.setId((long) (byte) 1);
        todo1.setUserName("");
        java.util.Date date9 = null;
        todo1.setTargetDate(date9);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setId((-1L));
        java.util.Date date13 = todo5.getTargetDate();
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setId((-1L));
        String str13 = todo5.getDescription();
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        java.util.Date date12 = todo5.getTargetDate();
        todo5.setId((long) (-1));
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        long long13 = todo4.getId();
        long long14 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        todo4.setId((long) (byte) 1);
        todo4.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        todo5.setDescription("hi!");
        todo5.setId((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        String str14 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        String str11 = todo5.getUserName();
        todo5.setId((long) 0);
        todo5.setDescription("");
        String str16 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(35L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        todo5.setUserName("hi!");
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
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        todo5.setId((long) (-1));
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
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        todo6.setId(32L);
        java.util.Date date18 = null;
        todo6.setTargetDate(date18);
        java.util.Date date20 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        long long5 = todo4.getId();
        todo4.setUserName("hi!");
        long long8 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        long long9 = todo4.getId();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        long long22 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult23 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str24 = todoController0.updateTodo(modelMap1, todo6, bindingResult23);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setUserName("");
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setUserName("");
        todo4.setId((long) (-1));
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setDescription("");
        todo1.setDescription("");
        java.util.Date date6 = null;
        todo1.setTargetDate(date6);
        long long8 = todo1.getId();
        java.util.Date date9 = todo1.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
        String str15 = todo6.getUserName();
        todo6.setId(0L);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setUserName("hi!");
        todo0.setDescription("");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        String str14 = todo6.getUserName();
        java.util.Date date15 = todo6.getTargetDate();
        java.util.Date date16 = null;
        todo6.setTargetDate(date16);
        java.util.Date date18 = todo6.getTargetDate();
        todo6.setId((long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        String str11 = todo5.getUserName();
        long long12 = todo5.getId();
        todo5.setUserName("");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 0);
        todo4.setDescription("");
        long long15 = todo4.getId();
        java.util.Date date16 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        todo4.setId(100L);
        String str11 = todo4.getUserName();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        String str8 = todo5.getDescription();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        java.util.Date date15 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        String str18 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, false);
        long long5 = todo4.getId();
        String str6 = todo4.getUserName();
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        long long13 = todo5.getId();
        java.util.Date date14 = null;
        todo5.setTargetDate(date14);
        long long16 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setDescription("hi!");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setDescription("");
        todo4.setDescription("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        todo4.setUserName("");
        todo4.setDescription("hi!");
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        String str14 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setDescription("");
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        String str13 = todo5.getDescription();
        String str14 = todo5.getDescription();
        long long15 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
        todo5.setDescription("hi!");
        long long17 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        todo4.setDescription("hi!");
        long long12 = todo4.getId();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
        java.util.Date date12 = todo6.getTargetDate();
        long long13 = todo6.getId();
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        long long16 = todo6.getId();
        String str17 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = todo4.getTargetDate();
        long long12 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = todo6.getTargetDate();
        String str12 = todo6.getDescription();
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setUserName("hi!");
        String str12 = todo6.getUserName();
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        todo4.setDescription("");
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
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
        String str12 = todo5.getUserName();
        String str13 = todo5.getUserName();
        java.util.Date date14 = todo5.getTargetDate();
        String str15 = todo5.getDescription();
        String str16 = todo5.getUserName();
        todo5.setId((long) 'a');
        String str19 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        long long14 = todo6.getId();
        todo6.setDescription("");
        String str17 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        String str14 = todo6.getUserName();
        String str15 = todo6.getDescription();
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getDescription();
        todo4.setId((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getUserName();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        String str10 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        String str6 = todo5.getUserName();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }
}

