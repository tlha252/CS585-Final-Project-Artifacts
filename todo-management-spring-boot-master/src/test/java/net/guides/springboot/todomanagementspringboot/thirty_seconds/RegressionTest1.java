package net.guides.springboot.todomanagementspringboot.thirty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) 'a');
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, false);
        long long6 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        java.util.Date date14 = todo4.getTargetDate();
        String str15 = todo4.getDescription();
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
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
        todo5.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, true);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getDescription();
        todo4.setId((long) (byte) 0);
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        String str8 = todo5.getDescription();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        todo5.setUserName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        todo5.setId((long) 100);
        String str20 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        String str15 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setId((long) (short) 10);
        String str13 = todo5.getUserName();
        todo5.setUserName("hi!");
        String str16 = todo5.getUserName();
        todo5.setDescription("");
        String str19 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        String str19 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(32L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        long long12 = todo4.getId();
        todo4.setDescription("");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        todo5.setUserName("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        String str12 = todo4.getUserName();
        todo4.setUserName("");
        long long15 = todo4.getId();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
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
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        long long14 = todo4.getId();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setDescription("hi!");
        todo4.setId(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        String str21 = todo4.getUserName();
        String str22 = todo4.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        long long14 = todo4.getId();
        String str15 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str14 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        todo6.setId((long) (short) -1);
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        todo5.setId(10L);
        todo5.setId((long) 1);
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
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
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
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) '#');
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        todo0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        String str15 = todo4.getDescription();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        long long16 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getUserName();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        long long13 = todo4.getId();
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
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
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setId((long) (short) 10);
        String str13 = todo5.getUserName();
        String str14 = todo5.getDescription();
        String str15 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        String str15 = todo4.getDescription();
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        long long9 = todo4.getId();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setId(32L);
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
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
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        todo4.setId((long) '#');
        todo4.setId((long) (short) -1);
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        long long13 = todo4.getId();
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setUserName("hi!");
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        long long14 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setDescription("");
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setDescription("");
        todo4.setId((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        String str8 = todo4.getUserName();
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        String str13 = todo5.getUserName();
        java.util.Date date14 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, false);
        todo5.setUserName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        todo5.setId((-1L));
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        todo4.setUserName("hi!");
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
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setDescription("");
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        String str14 = todo4.getUserName();
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setDescription("");
        todo4.setDescription("");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getDescription();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        long long3 = todo0.getId();
        todo0.setId((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setId((long) (short) 1);
        String str13 = todo4.getUserName();
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
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setId((long) '#');
        todo5.setId((long) (short) -1);
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        todo4.setId(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        String str8 = todo5.getDescription();
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
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        todo4.setId((long) (byte) -1);
        Class<?> wildcardClass20 = todo4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        java.util.Date date9 = todo6.getTargetDate();
        java.util.Date date10 = todo6.getTargetDate();
        String str11 = todo6.getUserName();
        todo6.setId((long) (byte) 10);
        org.springframework.validation.BindingResult bindingResult14 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str15 = todoController0.updateTodo(modelMap1, todo6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        java.util.Date date9 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getDescription();
        long long11 = todo5.getId();
        long long12 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        String str13 = todo4.getUserName();
        java.util.Date date14 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass15 = date14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        todo4.setDescription("hi!");
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
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, false);
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
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
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setId((long) (short) 10);
        String str13 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        todo6.setId((long) 'a');
        todo6.setDescription("");
        todo6.setId((long) (short) 100);
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
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        java.util.Date date9 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        String str18 = todo6.getDescription();
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        String str11 = todo4.getDescription();
        todo4.setDescription("");
        long long14 = todo4.getId();
        String str15 = todo4.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        String str14 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setId(1L);
        String str13 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        java.util.Date date5 = todo0.getTargetDate();
        todo0.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        todo5.setId(10L);
        todo5.setId((-1L));
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        long long1 = todo0.getId();
        todo0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
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
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        java.util.Date date7 = todo0.getTargetDate();
        String str8 = todo0.getUserName();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        todo4.setId((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        String str9 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        todo4.setId((long) (-1));
        long long13 = todo4.getId();
        long long14 = todo4.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        long long20 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
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
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        todo4.setId((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        long long13 = todo4.getId();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
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
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
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
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        long long6 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setUserName("hi!");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
        long long18 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
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
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
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
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
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
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setDescription("hi!");
        String str10 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
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
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        todo0.setDescription("hi!");
        todo0.setId((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        long long11 = todo4.getId();
        String str12 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setId(0L);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        String str17 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        String str11 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
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
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
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
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
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
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        todo4.setId((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
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
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
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
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        todo4.setId((-1L));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
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
        todo4.setUserName("hi!");
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
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date9 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        todo0.setId((long) 10);
        Class<?> wildcardClass5 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
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
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
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
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        String str5 = todo4.getUserName();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setDescription("");
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
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
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
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
        String str16 = todo4.getDescription();
        long long17 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
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
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
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
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setDescription("");
        todo0.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
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
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        long long10 = todo4.getId();
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
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
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
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
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
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
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
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
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
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
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
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
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
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
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
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
        String str16 = todo4.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setId((long) (short) 10);
        String str5 = todo0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setId(32L);
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
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
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setUserName("hi!");
        String str15 = todo4.getDescription();
        todo4.setId((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
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
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
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
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
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
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
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
        long long21 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
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
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        todo0.setDescription("hi!");
        long long11 = todo0.getId();
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
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
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
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, false);
        String str5 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
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
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setDescription("hi!");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
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
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        todo4.setUserName("");
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
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
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
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
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
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
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
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
        long long14 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
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
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        long long4 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setDescription("");
        String str13 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
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
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
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
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        todo0.setId(97L);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
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
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
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
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
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
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
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
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setUserName("hi!");
        java.util.Date date5 = todo0.getTargetDate();
        String str6 = todo0.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
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
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
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
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
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
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
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
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setDescription("");
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        long long7 = todo0.getId();
        java.util.Date date8 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
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
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
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
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
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
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
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
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
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
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setUserName("");
        todo4.setUserName("");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
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
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
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
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        todo4.setDescription("hi!");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
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
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        todo0.setId((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
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
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
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
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        todo4.setUserName("hi!");
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
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
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
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
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
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
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        String str19 = todo4.getDescription();
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
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setId(32L);
        todo4.setId((long) 1);
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
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
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
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
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
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        java.util.Date date10 = todo4.getTargetDate();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
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
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
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
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
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
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
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
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
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
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
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
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        java.util.Date date9 = todo4.getTargetDate();
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
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        String str3 = todo0.getUserName();
        todo0.setUserName("hi!");
        todo0.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
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
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
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
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
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
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
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
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
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
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
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
        todo4.setUserName("");
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
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
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
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setId(32L);
        todo4.setId(1L);
        todo4.setUserName("");
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
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
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
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
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
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
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setDescription("");
        String str11 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
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
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
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
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setId((long) '#');
        String str10 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        String str7 = todo4.getDescription();
        todo4.setId((long) (short) 1);
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
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
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
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
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
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
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
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
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
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
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
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
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
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
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
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
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
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
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
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
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
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
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
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
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        String str10 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
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
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        long long12 = todo4.getId();
        todo4.setDescription("");
        String str15 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        java.util.Date date12 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
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
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
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
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
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
        java.util.Date date14 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        long long7 = todo0.getId();
        String str8 = todo0.getUserName();
        todo0.setId((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
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
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
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
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        todo0.setDescription("hi!");
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
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
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
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
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
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
        java.util.Date date14 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
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
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        String str8 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
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
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
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
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
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
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
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
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
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
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
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
        todo4.setId((long) 100);
        String str17 = todo4.getDescription();
        todo4.setId((long) '#');
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
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
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
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
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
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
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
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
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
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
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
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
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, false);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setDescription("hi!");
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        String str7 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
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
        todo4.setDescription("hi!");
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
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
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
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
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
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
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
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
        todo4.setUserName("");
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
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
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
        String str16 = todo4.getUserName();
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
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
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
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
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
        java.util.Date date16 = todo4.getTargetDate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
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
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
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
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
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
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
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
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
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
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
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
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
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
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setId(97L);
        todo4.setUserName("");
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
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
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
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
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("hi!");
        java.util.Date date9 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setId((long) (short) 10);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("");
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
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
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
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
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
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
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        todo0.setId((long) 10);
        todo0.setUserName("hi!");
        todo0.setId(100L);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setDescription("");
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        todo4.setUserName("");
        todo4.setId((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
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
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
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
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
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
        String str13 = todo4.getUserName();
        todo4.setId((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, false);
        todo4.setId(0L);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setId(97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
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
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
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
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
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
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
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
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        todo4.setId(100L);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
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
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
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
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
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
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        java.util.Date date12 = todo4.getTargetDate();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
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
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
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
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
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
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
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
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
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
        java.util.Date date17 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
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
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
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
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
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
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId((long) 'a');
        long long14 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
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
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setDescription("");
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        long long7 = todo0.getId();
        long long8 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
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
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setId(1L);
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        long long10 = todo4.getId();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
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
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
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
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test967");
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
}

