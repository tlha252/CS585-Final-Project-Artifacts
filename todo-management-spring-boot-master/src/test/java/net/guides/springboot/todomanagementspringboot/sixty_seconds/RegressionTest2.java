package net.guides.springboot.todomanagementspringboot.sixty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        todo5.setDescription("");
        String str17 = todo5.getDescription();
        String str18 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setDescription("hi!");
        todo4.setId(100L);
        String str15 = todo4.getUserName();
        String str16 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        String str5 = todo2.getUserName();
        todo2.setId((long) (byte) 1);
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
        String str10 = todo5.getDescription();
        long long11 = todo5.getId();
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
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        todo4.setId(10L);
        todo4.setId((long) 1);
        todo4.setId(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, false);
        todo6.setId((-1L));
        String str9 = todo6.getDescription();
        todo6.setUserName("hi!");
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
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setId((long) (byte) 100);
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
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        todo4.setUserName("");
        java.util.Date date17 = todo4.getTargetDate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setId((long) '#');
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        todo5.setUserName("");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, false);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        java.util.Date date12 = todo5.getTargetDate();
        String str13 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        todo4.setUserName("hi!");
        java.util.Date date14 = todo4.getTargetDate();
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setId((long) (short) 10);
        todo5.setId((long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        todo5.setId((-1L));
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.util.Date date19 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        todo4.setUserName("");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        todo5.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult5 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str6 = todoController0.addTodo(modelMap1, todo2, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        todo2.setUserName("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) (byte) 1);
        String str11 = todo6.getUserName();
        java.util.Date date12 = todo6.getTargetDate();
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult15 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str16 = todoController0.addTodo(modelMap1, todo6, bindingResult15);
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        java.util.Date date12 = todo5.getTargetDate();
        java.util.Date date13 = null;
        todo5.setTargetDate(date13);
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        todo4.setDescription("hi!");
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setDescription("");
        String str7 = todo4.getUserName();
        long long8 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "", date3, true);
        todo5.setId(32L);
        long long8 = todo5.getId();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        java.util.Date date11 = todo5.getTargetDate();
        String str12 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        String str5 = todo4.getUserName();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        todo4.setDescription("");
        long long17 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        todo5.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        String str17 = todo4.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        long long8 = todo5.getId();
        String str9 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.util.Date date23 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        String str17 = todo4.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        String str19 = todo5.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setUserName("hi!");
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        todo4.setDescription("hi!");
        todo4.setUserName("");
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        Class<?> wildcardClass3 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        String str11 = todo4.getDescription();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.util.Date date16 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        todo4.setUserName("");
        todo4.setDescription("hi!");
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setDescription("hi!");
        java.util.Date date13 = todo4.getTargetDate();
        String str14 = todo4.getUserName();
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.util.Date date17 = todo5.getTargetDate();
        todo5.setId((long) (byte) 0);
        java.util.Date date20 = todo5.getTargetDate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        String str21 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        todo4.setId(52L);
        todo4.setUserName("");
        long long22 = todo4.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setDescription("");
        todo0.setUserName("");
        java.util.Date date9 = todo0.getTargetDate();
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        String str9 = todo0.getDescription();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setDescription("");
        String str15 = todo4.getUserName();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setId((long) 100);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        long long9 = todo4.getId();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        todo4.setId((long) (byte) 10);
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        todo5.setId((long) (short) 10);
        java.util.Date date12 = null;
        todo5.setTargetDate(date12);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        String str5 = todo0.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        todo4.setDescription("");
        String str9 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        String str19 = todo4.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        String str16 = todo4.getUserName();
        java.util.Date date17 = todo4.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 1);
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "", date3, true);
        todo5.setId(32L);
        long long8 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        todo6.setUserName("hi!");
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        todo4.setId((long) (-1));
        todo4.setUserName("");
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "", date3, true);
        todo5.setDescription("");
        todo5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        long long8 = todo4.getId();
        String str9 = todo4.getDescription();
        todo4.setId((long) (short) 10);
        todo4.setId((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
        todo5.setId(32L);
        todo5.setId((long) 1);
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
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = todo5.getTargetDate();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setDescription("hi!");
        String str11 = todo5.getDescription();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        todo0.setId((long) (short) 100);
        java.util.Date date5 = null;
        todo0.setTargetDate(date5);
        String str7 = todo0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setDescription("hi!");
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, false);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setUserName("hi!");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        long long11 = todo6.getId();
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        java.util.Date date21 = null;
        todo4.setTargetDate(date21);
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        String str22 = todo6.getDescription();
        String str23 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        todo4.setId(52L);
        todo4.setUserName("");
        java.util.Date date22 = todo4.getTargetDate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        String str16 = todo4.getUserName();
        String str17 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        String str5 = todo2.getUserName();
        todo2.setId((long) (byte) 1);
        todo2.setUserName("");
        todo2.setDescription("");
        String str12 = todo2.getUserName();
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo2, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        String str16 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        todo4.setId((long) (-1));
        String str14 = todo4.getDescription();
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        todo4.setUserName("");
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        todo4.setUserName("hi!");
        todo4.setUserName("hi!");
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
        String str12 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        String str12 = todo6.getUserName();
        java.util.Date date13 = null;
        todo6.setTargetDate(date13);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
        todo6.setId((long) (-1));
        long long15 = todo6.getId();
        todo6.setId(97L);
        long long18 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setUserName("hi!");
        java.util.Date date14 = todo4.getTargetDate();
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setUserName("hi!");
        todo4.setId(32L);
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setDescription("hi!");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        java.util.Date date5 = todo4.getTargetDate();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setId((long) '#');
        String str10 = todo4.getDescription();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        long long11 = todo4.getId();
        String str12 = todo4.getDescription();
        String str13 = todo4.getUserName();
        long long14 = todo4.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.util.Date date15 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, false);
        todo6.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.addTodo(modelMap1, todo6, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        String str14 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setUserName("hi!");
        String str11 = todo5.getUserName();
        java.util.Date date12 = null;
        todo5.setTargetDate(date12);
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
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        long long16 = todo5.getId();
        java.util.Date date17 = null;
        todo5.setTargetDate(date17);
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        todo5.setDescription("hi!");
        java.util.Date date15 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        String str8 = todo4.getDescription();
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        String str6 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        String str14 = todo6.getDescription();
        todo6.setId((long) '4');
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getDescription();
        java.util.Date date11 = todo5.getTargetDate();
        String str12 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        todo5.setId((long) (short) -1);
        todo5.setDescription("");
        java.util.Date date20 = null;
        todo5.setTargetDate(date20);
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        todo4.setId((long) 'a');
        todo4.setUserName("");
        java.util.Date date17 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = todo6.getTargetDate();
        String str12 = todo6.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        long long17 = todo6.getId();
        todo6.setUserName("");
        todo6.setId(52L);
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        String str15 = todo4.getUserName();
        todo4.setId(10L);
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
            String str14 = todoController0.updateTodo(modelMap1, todo2, bindingResult13);
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        long long13 = todo4.getId();
        todo4.setDescription("hi!");
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        todo6.setId(0L);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        todo4.setUserName("");
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        todo0.setId((long) ' ');
        String str5 = todo0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        long long16 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        String str15 = todo4.getDescription();
        String str16 = todo4.getUserName();
        todo4.setUserName("hi!");
        todo4.setUserName("hi!");
        java.util.Date date21 = todo4.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        todo4.setId((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        todo6.setId((long) 'a');
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        String str10 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        todo4.setDescription("hi!");
        todo4.setUserName("");
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        todo4.setDescription("");
        String str15 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str11 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        todo5.setDescription("hi!");
        java.util.Date date14 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, true);
        todo6.setId(0L);
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.addTodo(modelMap1, todo6, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        String str8 = todo6.getDescription();
        java.util.Date date9 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        Class<?> wildcardClass15 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        todo2.setDescription("");
        todo2.setUserName("");
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
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
        todo6.setId((long) '#');
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        todo4.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        String str15 = todo6.getDescription();
        String str16 = todo6.getDescription();
        String str17 = todo6.getDescription();
        String str18 = todo6.getUserName();
        todo6.setUserName("hi!");
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.util.Date date16 = todo4.getTargetDate();
        long long17 = todo4.getId();
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
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        java.util.Date date7 = todo0.getTargetDate();
        String str8 = todo0.getUserName();
        todo0.setUserName("hi!");
        java.util.Date date11 = null;
        todo0.setTargetDate(date11);
        long long13 = todo0.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        String str18 = todo4.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.util.Date date15 = null;
        todo5.setTargetDate(date15);
        long long17 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.util.Date date20 = null;
        todo4.setTargetDate(date20);
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
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        String str8 = todo4.getUserName();
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        long long5 = todo4.getId();
        long long6 = todo4.getId();
        java.util.Date date7 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        String str22 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = todo4.getTargetDate();
        String str6 = todo4.getDescription();
        String str7 = todo4.getDescription();
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        long long11 = todo4.getId();
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        long long16 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        todo5.setId((long) (short) -1);
        todo5.setId((long) (short) 1);
        java.util.Date date19 = null;
        todo5.setTargetDate(date19);
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
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        String str11 = todo5.getUserName();
        String str12 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setId(32L);
        todo4.setId((long) 1);
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        java.util.Date date5 = todo4.getTargetDate();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        String str19 = todo6.getUserName();
        todo6.setUserName("");
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        long long20 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        java.util.Date date18 = null;
        todo6.setTargetDate(date18);
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = todo5.getTargetDate();
        String str9 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        String str17 = todo4.getUserName();
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
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((long) (byte) 10);
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        long long26 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        todo4.setDescription("hi!");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        String str7 = todo4.getDescription();
        todo4.setId((long) (short) 1);
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        todo4.setId(0L);
        long long14 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = todo6.getTargetDate();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        Class<?> wildcardClass18 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.util.Date date18 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        todo4.setDescription("");
        String str17 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        String str16 = todo4.getUserName();
        todo4.setId((long) (short) 1);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        String str21 = todo5.getDescription();
        String str22 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        todo4.setDescription("hi!");
        java.util.Date date18 = null;
        todo4.setTargetDate(date18);
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        String str18 = todo4.getUserName();
        String str19 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        String str11 = todo4.getUserName();
        todo4.setUserName("hi!");
        todo4.setId((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        todo4.setId((long) (short) -1);
        todo4.setDescription("");
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
        String str21 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setId(32L);
        String str11 = todo4.getDescription();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        long long8 = todo5.getId();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        java.util.Date date11 = todo5.getTargetDate();
        todo5.setDescription("hi!");
        long long14 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        long long16 = todo4.getId();
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.util.Date date16 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        todo4.setId((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setUserName("");
        String str9 = todo4.getDescription();
        long long10 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        long long14 = todo4.getId();
        todo4.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        java.util.Date date12 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        String str9 = todo0.getDescription();
        todo0.setId((long) '#');
        long long12 = todo0.getId();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setUserName("hi!");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
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
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setId(32L);
        long long7 = todo4.getId();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getUserName();
        todo4.setId((long) (short) 1);
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        String str7 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        todo6.setId((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        todo4.setId((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        java.util.Date date9 = todo6.getTargetDate();
        java.util.Date date10 = null;
        todo6.setTargetDate(date10);
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        todo5.setId((long) 'a');
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        java.util.Date date12 = todo4.getTargetDate();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        todo4.setDescription("hi!");
        todo4.setUserName("");
        todo4.setDescription("");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
        String str12 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        String str15 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setUserName("hi!");
        String str11 = todo4.getUserName();
        java.util.Date date12 = todo4.getTargetDate();
        long long13 = todo4.getId();
        String str14 = todo4.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        String str13 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        todo4.setDescription("hi!");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setId((long) (short) 100);
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date17 = todo4.getTargetDate();
        String str18 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        todo4.setDescription("hi!");
        long long12 = todo4.getId();
        String str13 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
        todo6.setId((long) (-1));
        long long15 = todo6.getId();
        long long16 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        String str18 = todo4.getDescription();
        long long19 = todo4.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getUserName();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        todo4.setDescription("hi!");
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        long long11 = todo4.getId();
        String str12 = todo4.getDescription();
        todo4.setId((long) (byte) 0);
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        String str11 = todo5.getDescription();
        java.util.Date date12 = null;
        todo5.setTargetDate(date12);
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
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setUserName("hi!");
        java.util.Date date4 = null;
        todo1.setTargetDate(date4);
        String str6 = todo1.getDescription();
        todo1.setId((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setDescription("hi!");
        long long14 = todo5.getId();
        todo5.setUserName("hi!");
        String str17 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        todo4.setId(35L);
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        long long16 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.util.Date date16 = todo6.getTargetDate();
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setId((long) (byte) 0);
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
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
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.util.Date date15 = todo4.getTargetDate();
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
        long long13 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        String str15 = todo4.getUserName();
        java.util.Date date16 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, false);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        long long7 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setUserName("hi!");
        long long7 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult26 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str27 = todoController0.addTodo(modelMap1, todo6, bindingResult26);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
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
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setId(32L);
        String str11 = todo4.getDescription();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setId(32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        todo4.setId((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        todo4.setId((long) 'a');
        todo4.setUserName("hi!");
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        String str8 = todo5.getDescription();
        java.util.Date date9 = null;
        todo5.setTargetDate(date9);
        String str11 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        String str25 = todo4.getUserName();
        todo4.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        todo0.setDescription("hi!");
        todo0.setId(0L);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        todo4.setDescription("");
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        todo4.setId((long) 100);
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        String str7 = todo4.getDescription();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        long long24 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        java.util.Date date17 = todo5.getTargetDate();
        todo5.setId((long) (byte) 0);
        java.util.Date date20 = null;
        todo5.setTargetDate(date20);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.util.Date date15 = todo4.getTargetDate();
        todo4.setId(10L);
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setId((long) (byte) 0);
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        todo5.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        Class<?> wildcardClass15 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) (byte) 1);
        String str11 = todo6.getUserName();
        java.util.Date date12 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        String str15 = todo5.getUserName();
        todo5.setDescription("");
        String str18 = todo5.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, false);
        long long5 = todo4.getId();
        String str6 = todo4.getUserName();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        String str5 = todo4.getUserName();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        String str8 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date17 = todo4.getTargetDate();
        long long18 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = todo4.getTargetDate();
        todo4.setUserName("hi!");
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        java.util.Date date10 = todo4.getTargetDate();
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        long long16 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setDescription("");
        todo4.setId((long) ' ');
        String str16 = todo4.getUserName();
        String str17 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        String str13 = todo4.getDescription();
        String str14 = todo4.getDescription();
        long long15 = todo4.getId();
        java.util.Date date16 = todo4.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        String str17 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        todo6.setId(0L);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = todo6.getTargetDate();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setDescription("hi!");
        String str12 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo6, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        java.util.Date date11 = todo4.getTargetDate();
        String str12 = todo4.getUserName();
        java.util.Date date13 = todo4.getTargetDate();
        java.util.Date date14 = todo4.getTargetDate();
        todo4.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        String str10 = todo4.getUserName();
        String str11 = todo4.getUserName();
        todo4.setUserName("");
        long long14 = todo4.getId();
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        long long19 = todo4.getId();
        String str20 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.util.Date date21 = null;
        todo6.setTargetDate(date21);
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
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "", date3, true);
        todo5.setUserName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        String str6 = todo5.getDescription();
        String str7 = todo5.getUserName();
        long long8 = todo5.getId();
        String str9 = todo5.getUserName();
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        todo5.setId((long) 10);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) (short) 100);
        todo4.setDescription("");
        todo4.setId((long) ' ');
        String str16 = todo4.getUserName();
        String str17 = todo4.getUserName();
        String str18 = todo4.getUserName();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        todo6.setId((long) (byte) 10);
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.updateTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        todo6.setDescription("hi!");
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        todo5.setUserName("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        long long7 = todo4.getId();
        todo4.setId(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        todo4.setUserName("hi!");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        Class<?> wildcardClass15 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        long long15 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        String str17 = todo4.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
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
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        long long21 = todo6.getId();
        java.util.Date date22 = null;
        todo6.setTargetDate(date22);
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setId((long) (byte) 0);
        todo6.setUserName("hi!");
        todo6.setUserName("hi!");
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getUserName();
        String str12 = todo4.getUserName();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        String str7 = todo0.getDescription();
        java.util.Date date8 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
            todoService0.updateTodo(todo5);
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
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
        String str10 = todo5.getUserName();
        todo5.setUserName("");
        String str13 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
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
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        todo6.setId((long) 'a');
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        String str14 = todo6.getDescription();
        todo6.setId((long) '4');
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        java.util.Date date16 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        todo4.setId((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        long long20 = todo4.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        long long8 = todo5.getId();
        long long9 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        java.util.Date date16 = todo4.getTargetDate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setDescription("");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        todo4.setUserName("hi!");
        todo4.setUserName("");
        java.util.Date date17 = todo4.getTargetDate();
        String str18 = todo4.getUserName();
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
            String str13 = todoController0.updateTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        String str11 = todo4.getDescription();
        todo4.setId((long) (byte) 0);
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setUserName("hi!");
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        java.util.Date date7 = todo4.getTargetDate();
        todo4.setDescription("");
        String str10 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        Class<?> wildcardClass21 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        String str12 = todo6.getUserName();
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        String str6 = todo5.getUserName();
        todo5.setId((long) (byte) 100);
        java.util.Date date9 = todo5.getTargetDate();
        java.util.Date date10 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.util.Date date20 = null;
        todo6.setTargetDate(date20);
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        String str21 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        String str12 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        String str13 = todo4.getDescription();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setId(32L);
        todo4.setId(1L);
        todo4.setUserName("");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = todo6.getTargetDate();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        String str13 = todo4.getDescription();
        todo4.setId((long) (byte) 100);
        Class<?> wildcardClass16 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        todo4.setUserName("");
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        todo5.setDescription("");
        todo5.setId((long) (byte) 10);
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
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = todo6.getTargetDate();
        String str10 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        todo5.setUserName("");
        todo5.setId(32L);
        todo5.setId(1L);
        todo5.setUserName("");
        todo5.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, false);
        todo5.setUserName("hi!");
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        todo4.setUserName("");
        java.util.Date date11 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
        todo5.setUserName("");
        todo5.setId((long) ' ');
        todo5.setId((long) 100);
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) (byte) 1);
        String str11 = todo6.getUserName();
        java.util.Date date12 = todo6.getTargetDate();
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        todo4.setUserName("");
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        java.util.Date date8 = todo4.getTargetDate();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        todo4.setDescription("hi!");
        java.util.Date date15 = todo4.getTargetDate();
        String str16 = todo4.getUserName();
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        Class<?> wildcardClass23 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        todo0.setId(35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
        todo6.setId((long) (-1));
        long long15 = todo6.getId();
        todo6.setId(97L);
        java.util.Date date18 = null;
        todo6.setTargetDate(date18);
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        todo4.setDescription("");
        todo4.setUserName("");
        long long15 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        java.util.Date date16 = todo5.getTargetDate();
        todo5.setId((long) ' ');
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("");
        todo0.setDescription("");
        Class<?> wildcardClass5 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setDescription("hi!");
        todo5.setId((long) (byte) 10);
        String str16 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        long long13 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        java.util.Date date12 = todo4.getTargetDate();
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setDescription("");
        todo5.setUserName("");
        todo5.setUserName("hi!");
        todo5.setUserName("");
        java.util.Date date18 = todo5.getTargetDate();
        String str19 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        String str5 = todo2.getUserName();
        todo2.setId((long) (byte) 1);
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
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
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
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        Class<?> wildcardClass18 = todo4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        todo4.setId(0L);
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        java.util.Date date14 = todo6.getTargetDate();
        long long15 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        todo4.setId(10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setDescription("hi!");
        todo5.setId((long) (byte) 10);
        java.util.Date date16 = null;
        todo5.setTargetDate(date16);
        String str18 = todo5.getUserName();
        java.util.Date date19 = null;
        todo5.setTargetDate(date19);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        todo5.setId((long) (byte) 0);
        todo5.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        todo4.setUserName("");
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        todo4.setId((long) (byte) 1);
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
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
        todo6.setId((long) '#');
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setUserName("");
        String str11 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        long long9 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        String str5 = todo0.getDescription();
        todo0.setId((long) (short) 1);
        String str8 = todo0.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getDescription();
        String str11 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.util.Date date16 = todo5.getTargetDate();
        todo5.setId((long) ' ');
        java.util.Date date19 = null;
        todo5.setTargetDate(date19);
        String str21 = todo5.getUserName();
        String str22 = todo5.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("");
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        String str16 = todo5.getDescription();
        java.util.Date date17 = todo5.getTargetDate();
        String str18 = todo5.getUserName();
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
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
        todo5.setUserName("");
        todo5.setId((long) ' ');
        todo5.setId((long) 100);
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        todo6.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = todoController0.addTodo(modelMap1, todo6, bindingResult16);
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 100);
        String str12 = todo4.getUserName();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setId(32L);
        String str11 = todo4.getDescription();
        java.util.Date date12 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        String str16 = todo4.getDescription();
        Class<?> wildcardClass17 = todo4.getClass();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str9 = todo4.getUserName();
        todo4.setId(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        java.util.Date date11 = todo4.getTargetDate();
        todo4.setDescription("hi!");
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        String str13 = todo4.getDescription();
        long long14 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        todo4.setId(1L);
        String str16 = todo4.getDescription();
        todo4.setId((long) 'a');
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        String str21 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getDescription();
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        todo4.setId((long) (short) -1);
        todo4.setDescription("");
        java.util.Date date19 = null;
        todo4.setTargetDate(date19);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        Class<?> wildcardClass14 = todo4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setDescription("");
        todo4.setId((long) (byte) 10);
        todo4.setUserName("");
        todo4.setId(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        todo4.setDescription("");
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        String str10 = todo4.getDescription();
        String str11 = todo4.getDescription();
        java.util.Date date12 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, true);
        todo6.setId(0L);
        String str9 = todo6.getUserName();
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setId((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.util.Date date14 = todo5.getTargetDate();
        java.util.Date date15 = todo5.getTargetDate();
        todo5.setId(52L);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        java.util.Date date14 = null;
        todo4.setTargetDate(date14);
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        long long12 = todo4.getId();
        String str13 = todo4.getDescription();
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        todo4.setUserName("");
        todo4.setUserName("hi!");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, false);
        long long7 = todo6.getId();
        String str8 = todo6.getUserName();
        todo6.setId(32L);
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.util.Date date25 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        long long14 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.util.Date date15 = todo4.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        todo4.setUserName("hi!");
        todo4.setId((long) ' ');
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        todo4.setUserName("");
        todo4.setUserName("");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        String str3 = todo2.getDescription();
        java.util.Date date4 = todo2.getTargetDate();
        String str5 = todo2.getDescription();
        String str6 = todo2.getDescription();
        todo2.setId(100L);
        todo2.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.updateTodo(modelMap1, todo2, bindingResult11);
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        todo4.setUserName("");
        String str18 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        java.util.Date date18 = todo6.getTargetDate();
        java.util.Date date19 = null;
        todo6.setTargetDate(date19);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        todo2.setDescription("");
        java.util.Date date7 = null;
        todo2.setTargetDate(date7);
        long long9 = todo2.getId();
        java.util.Date date10 = todo2.getTargetDate();
        todo2.setId((long) 1);
        org.springframework.validation.BindingResult bindingResult13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = todoController0.addTodo(modelMap1, todo2, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "", date3, false);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        String str5 = todo2.getUserName();
        todo2.setUserName("hi!");
        java.util.Date date8 = todo2.getTargetDate();
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.updateTodo(modelMap1, todo2, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.util.Date date13 = null;
        todo4.setTargetDate(date13);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        String str3 = todo0.getDescription();
        String str4 = todo0.getDescription();
        todo0.setId(100L);
        todo0.setDescription("hi!");
        todo0.setDescription("hi!");
        todo0.setId((long) (short) 10);
        java.util.Date date13 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        java.util.Date date17 = null;
        todo4.setTargetDate(date17);
        todo4.setId((long) 100);
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
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        todo2.setUserName("hi!");
        java.util.Date date7 = todo2.getTargetDate();
        todo2.setUserName("");
        todo2.setUserName("hi!");
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo2, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) '#');
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.util.Date date20 = null;
        todo6.setTargetDate(date20);
        String str22 = todo6.getUserName();
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        long long7 = todo6.getId();
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult10 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str11 = todoController0.addTodo(modelMap1, todo6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        java.util.Date date12 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        String str5 = todo4.getDescription();
        String str6 = todo4.getUserName();
        long long7 = todo4.getId();
        String str8 = todo4.getUserName();
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        todo4.setDescription("");
        todo4.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        todo4.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        todo4.setDescription("hi!");
        Class<?> wildcardClass18 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        long long19 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.util.Date date16 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setUserName("hi!");
        todo4.setId(97L);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        long long10 = todo4.getId();
        String str11 = todo4.getUserName();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        String str15 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        String str12 = todo4.getDescription();
        todo4.setId((long) 10);
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        String str10 = todo4.getUserName();
        java.util.Date date11 = todo4.getTargetDate();
        java.util.Date date12 = null;
        todo4.setTargetDate(date12);
        todo4.setDescription("");
        java.util.Date date16 = todo4.getTargetDate();
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
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setId((long) (short) 10);
        String str11 = todo4.getUserName();
        String str12 = todo4.getDescription();
        String str13 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, true);
        todo6.setUserName("hi!");
        todo6.setId((long) 'a');
        org.springframework.validation.BindingResult bindingResult11 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        String str6 = todo5.getUserName();
        todo5.setId((long) (byte) 100);
        java.util.Date date9 = todo5.getTargetDate();
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
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        todo5.setId((long) (byte) 0);
        String str8 = todo5.getDescription();
        todo5.setId((long) (short) 1);
        long long11 = todo5.getId();
        java.util.Date date12 = todo5.getTargetDate();
        todo5.setDescription("");
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        java.util.Date date10 = todo4.getTargetDate();
        long long11 = todo4.getId();
        String str12 = todo4.getDescription();
        Class<?> wildcardClass13 = todo4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        String str11 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        long long10 = todo4.getId();
        todo4.setDescription("hi!");
        String str13 = todo4.getUserName();
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        todo4.setId((long) 'a');
        String str11 = todo4.getDescription();
        todo4.setId(35L);
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
    }
}

