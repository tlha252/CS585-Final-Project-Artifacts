package net.guides.springboot.todomanagementspringboot.sixty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        net.guides.springboot.todomanagement.controller.LogoutController logoutController0 = new net.guides.springboot.todomanagement.controller.LogoutController();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str2 = todoController0.showAddTodoPage(modelMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        net.guides.springboot.todomanagement.controller.ErrorController errorController0 = new net.guides.springboot.todomanagement.controller.ErrorController();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.web.servlet.ModelAndView modelAndView3 = errorController0.handleException(httpServletRequest1, exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        net.guides.springboot.todomanagement.controller.WelcomeController welcomeController0 = new net.guides.springboot.todomanagement.controller.WelcomeController();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        Class<?> wildcardClass6 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.web.bind.WebDataBinder webDataBinder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoController0.initBinder(webDataBinder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (-1), modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("hi!", "", date3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (short) 0, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("", "", date3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application todoManagementSpringBoot2Application0 = new net.guides.springboot.todomanagement.TodoManagementSpringBoot2Application();
        Class<?> wildcardClass1 = todoManagementSpringBoot2Application0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
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
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        Class<?> wildcardClass5 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setId((long) ' ');
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (short) -1, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (byte) 1, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.addTodo(modelMap1, todo6, bindingResult9);
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("hi!", "hi!", date3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo6, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (byte) 100, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        Class<?> wildcardClass3 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(10L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = todo4.getTargetDate();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) '4', modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) 1, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) 'a', modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, false);
        Class<?> wildcardClass5 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("", "hi!", date3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
        java.util.Date date12 = todo5.getTargetDate();
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        org.springframework.validation.BindingResult bindingResult5 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str6 = todoController0.updateTodo(modelMap1, todo2, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        long long13 = todo5.getId();
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(1L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(0L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        long long11 = todo4.getId();
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "", date2, true);
        todo4.setUserName("hi!");
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, false);
        org.springframework.validation.BindingResult bindingResult7 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str8 = todoController0.addTodo(modelMap1, todo6, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        java.util.Date date10 = todo6.getTargetDate();
        String str11 = todo6.getUserName();
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("", "", date3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("hi!", "hi!", date3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
            String str12 = todoController0.addTodo(modelMap1, todo6, bindingResult11);
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        String str8 = todo5.getUserName();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) ' ', modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getUserName();
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        java.util.Date date10 = todo5.getTargetDate();
        long long11 = todo5.getId();
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setDescription("");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (short) 100, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        long long13 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setDescription("hi!");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (byte) -1, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.updateTodo(modelMap1, todo6, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        todo4.setDescription("hi!");
        String str14 = todo4.getDescription();
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
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
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("");
        org.springframework.validation.BindingResult bindingResult5 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str6 = todoController0.updateTodo(modelMap1, todo2, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) 10, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, false);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getDescription();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date4, true);
        org.springframework.validation.BindingResult bindingResult7 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str8 = todoController0.addTodo(modelMap1, todo6, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = null;
        org.springframework.validation.BindingResult bindingResult3 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str4 = todoController0.addTodo(modelMap1, todo2, bindingResult3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((-1L), modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, false);
        org.springframework.validation.BindingResult bindingResult7 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str8 = todoController0.addTodo(modelMap1, todo6, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("hi!", "", date3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setUserName("hi!");
        java.util.Date date4 = null;
        todo1.setTargetDate(date4);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        todo6.setId((long) (-1));
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getUserName();
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
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getDescription();
        todo4.setDescription("hi!");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        Class<?> wildcardClass9 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(100L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        todo5.setId((long) ' ');
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        String str11 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        todo6.setDescription("");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setUserName("hi!");
        java.util.Date date3 = null;
        todo0.setTargetDate(date3);
        String str5 = todo0.getUserName();
        todo0.setDescription("hi!");
        Class<?> wildcardClass8 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.addTodo("", "hi!", date3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setDescription("hi!");
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
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
        java.util.Date date11 = null;
        todo6.setTargetDate(date11);
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
        long long10 = todo6.getId();
        String str11 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        java.util.Date date12 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        String str5 = todo4.getUserName();
        String str6 = todo4.getDescription();
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setId(0L);
        todo4.setDescription("");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
            String str11 = todoController0.updateTodo(modelMap1, todo6, bindingResult10);
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        java.util.Date date9 = todo5.getTargetDate();
        String str10 = todo5.getUserName();
        todo5.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        long long8 = todo5.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (short) 10, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = null;
        todo6.setTargetDate(date8);
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        org.springframework.validation.BindingResult bindingResult7 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str8 = todoController0.updateTodo(modelMap1, todo2, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.util.Date date17 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        long long8 = todo5.getId();
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
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
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
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        org.springframework.validation.BindingResult bindingResult7 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str8 = todoController0.addTodo(modelMap1, todo2, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        todo5.setUserName("hi!");
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        todo4.setId((long) ' ');
        String str9 = todo4.getUserName();
        todo4.setDescription("");
        String str12 = todo4.getUserName();
        todo4.setId((long) (short) 0);
        java.util.Date date15 = null;
        todo4.setTargetDate(date15);
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        todo6.setId(100L);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setUserName("hi!");
        java.util.Date date4 = null;
        todo1.setTargetDate(date4);
        String str6 = todo1.getUserName();
        todo1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        String str1 = todo0.getDescription();
        java.util.Date date2 = todo0.getTargetDate();
        long long3 = todo0.getId();
        Class<?> wildcardClass4 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        String str13 = todo4.getUserName();
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
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
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, false);
        String str7 = todo6.getDescription();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.updateTodo(modelMap1, todo6, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
        String str12 = todo6.getUserName();
        todo6.setUserName("hi!");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) '#', modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getDescription();
        java.util.Date date10 = todo6.getTargetDate();
        String str11 = todo6.getUserName();
        todo6.setDescription("hi!");
        todo6.setId((long) 'a');
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
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) 100, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        java.util.Date date9 = todo4.getTargetDate();
        long long10 = todo4.getId();
        String str11 = todo4.getDescription();
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = todo5.getTargetDate();
        todo5.setId((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        todo4.setId(32L);
        java.util.Date date16 = null;
        todo4.setTargetDate(date16);
        Class<?> wildcardClass18 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        todo4.setDescription("");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        String str9 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
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
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        String str5 = todo0.getUserName();
        Class<?> wildcardClass6 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
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
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        long long6 = todo5.getId();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        todo5.setUserName("hi!");
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (byte) 0, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        String str6 = todo5.getUserName();
        String str7 = todo5.getDescription();
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        todo4.setId(32L);
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
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        Class<?> wildcardClass14 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 0);
        long long13 = todo4.getId();
        Class<?> wildcardClass14 = todo4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        todo4.setId(100L);
        String str10 = todo4.getDescription();
        todo4.setUserName("hi!");
        String str13 = todo4.getUserName();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.addTodo(modelMap1, todo6, bindingResult9);
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        String str10 = todo6.getDescription();
        java.util.Date date11 = todo6.getTargetDate();
        java.util.Date date12 = null;
        todo6.setTargetDate(date12);
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
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        java.util.Date date6 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        String str12 = todo5.getDescription();
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
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, true);
        todo4.setUserName("");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setUserName("hi!");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getDescription();
        long long9 = todo4.getId();
        Class<?> wildcardClass10 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        long long1 = todo0.getId();
        Class<?> wildcardClass2 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        Class<?> wildcardClass7 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        String str9 = todo6.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        String str12 = todo4.getDescription();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        todo4.setUserName("");
        todo4.setUserName("");
        Class<?> wildcardClass14 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        java.util.Date date9 = todo4.getTargetDate();
        String str10 = todo4.getUserName();
        todo4.setId((long) 0);
        todo4.setId(0L);
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
        todo6.setId((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
        String str12 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        todo5.setDescription("hi!");
        long long11 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        todo6.setUserName("");
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.updateTodo(modelMap1, todo6, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        long long16 = todo4.getId();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage(97L, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        String str7 = todo2.getUserName();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        todo5.setId((-1L));
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        todo5.setId((long) (byte) 0);
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
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        java.util.Date date9 = null;
        todo6.setTargetDate(date9);
        String str11 = todo6.getDescription();
        java.util.Date date12 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
        todo5.setId((long) (byte) 0);
        String str8 = todo5.getDescription();
        todo5.setId((long) (short) 1);
        long long11 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) 0, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        long long7 = todo6.getId();
        long long8 = todo6.getId();
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.addTodo(modelMap1, todo6, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setDescription("hi!");
        String str11 = todo6.getDescription();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "", date4, true);
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        String str11 = todo5.getDescription();
        todo5.setUserName("hi!");
        java.util.Date date14 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        java.util.Date date7 = null;
        todo6.setTargetDate(date7);
        todo6.setUserName("");
        todo6.setId(32L);
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        Class<?> wildcardClass14 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        java.util.Date date6 = null;
        todo5.setTargetDate(date6);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, true);
        todo5.setUserName("");
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        todo6.setDescription("");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = null;
        org.springframework.validation.BindingResult bindingResult3 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str4 = todoController0.updateTodo(modelMap1, todo2, bindingResult3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        java.util.Date date8 = todo6.getTargetDate();
        String str9 = todo6.getDescription();
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        java.util.Date date10 = null;
        todo4.setTargetDate(date10);
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
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
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = todo6.getTargetDate();
        org.springframework.validation.BindingResult bindingResult8 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str9 = todoController0.addTodo(modelMap1, todo6, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        todo5.setId(0L);
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
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        String str10 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getDescription();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        todo5.setDescription("hi!");
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        Class<?> wildcardClass14 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        long long5 = todo4.getId();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
            todoService0.updateTodo(todo5);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 1);
        String str9 = todo4.getUserName();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date3, true);
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        todo0.setUserName("");
        java.util.Date date5 = todo0.getTargetDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setUserName("hi!");
        java.util.Date date5 = null;
        todo2.setTargetDate(date5);
        java.util.Date date7 = null;
        todo2.setTargetDate(date7);
        org.springframework.validation.BindingResult bindingResult9 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str10 = todoController0.addTodo(modelMap1, todo2, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        Class<?> wildcardClass14 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        java.util.Date date6 = todo5.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            todoService0.saveTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        long long10 = todo4.getId();
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getDescription();
        todo5.setId(100L);
        java.util.Date date11 = todo5.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = null;
        todo4.setTargetDate(date6);
        todo4.setId((long) (byte) 0);
        todo4.setDescription("hi!");
        String str12 = todo4.getDescription();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        java.util.Date date16 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        todo5.setId(0L);
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
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        todo4.setUserName("hi!");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setDescription("hi!");
        todo4.setUserName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        java.util.Date date9 = null;
        todo4.setTargetDate(date9);
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        String str5 = todo4.getUserName();
        long long6 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        long long3 = todo2.getId();
        org.springframework.validation.BindingResult bindingResult4 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str5 = todoController0.updateTodo(modelMap1, todo2, bindingResult4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
            String str9 = todoController0.updateTodo(modelMap1, todo2, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        String str8 = todo5.getUserName();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setDescription("");
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
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        java.util.Date date11 = todo4.getTargetDate();
        String str12 = todo4.getDescription();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        Class<?> wildcardClass11 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        long long9 = todo5.getId();
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
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date3, false);
        String str6 = todo5.getUserName();
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
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        Class<?> wildcardClass18 = todo4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        java.util.Date date9 = todo5.getTargetDate();
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
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "", date2, false);
        todo4.setDescription("hi!");
        todo4.setId((long) 10);
        String str9 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        todo6.setId((long) ' ');
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        String str11 = todo5.getUserName();
        todo5.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        long long7 = todo4.getId();
        Class<?> wildcardClass8 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
            String str13 = todoController0.updateTodo(modelMap1, todo6, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (byte) 10, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        todo6.setId(0L);
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        java.util.Date date11 = null;
        todo4.setTargetDate(date11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        todo6.setId(0L);
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
        org.junit.Assert.assertNull(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        todo4.setId((long) (short) -1);
        long long12 = todo4.getId();
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        java.util.Date date7 = todo4.getTargetDate();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, false);
        todo5.setId((-1L));
        String str8 = todo5.getDescription();
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        String str8 = todo5.getDescription();
        String str9 = todo5.getDescription();
        long long10 = todo5.getId();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = null;
        todo5.setTargetDate(date7);
        todo5.setId((long) (byte) 0);
        todo5.setDescription("hi!");
        String str13 = todo5.getDescription();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        net.guides.springboot.todomanagement.model.Todo todo2 = new net.guides.springboot.todomanagement.model.Todo();
        todo2.setDescription("hi!");
        String str5 = todo2.getUserName();
        org.springframework.validation.BindingResult bindingResult6 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str7 = todoController0.updateTodo(modelMap1, todo2, bindingResult6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        Class<?> wildcardClass17 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        String str7 = todo5.getDescription();
        long long8 = todo5.getId();
        todo5.setId((long) (byte) 10);
        todo5.setId((long) (short) -1);
        todo5.setUserName("hi!");
        java.util.Date date15 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getDescription();
        String str10 = todo4.getDescription();
        long long11 = todo4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        String str8 = todo4.getUserName();
        todo4.setUserName("");
        String str11 = todo4.getUserName();
        todo4.setDescription("hi!");
        String str14 = todo4.getDescription();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setId((long) (-1));
        java.util.Date date12 = todo5.getTargetDate();
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
        org.junit.Assert.assertNull(date12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date2, true);
        todo4.setUserName("hi!");
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        String str9 = todo4.getUserName();
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
            todoService0.updateTodo(todo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        todo6.setDescription("");
        todo6.setId((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        net.guides.springboot.todomanagement.model.Todo todo1 = new net.guides.springboot.todomanagement.model.Todo();
        todo1.setUserName("hi!");
        java.util.Date date4 = null;
        todo1.setTargetDate(date4);
        String str6 = todo1.getDescription();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        java.util.Date date7 = todo6.getTargetDate();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
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
        org.junit.Assert.assertNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        todo4.setDescription("hi!");
        String str9 = todo4.getUserName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        String str16 = todo6.getUserName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str3 = todoController0.showUpdateTodoPage((long) (short) 1, modelMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        long long9 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.util.Date date21 = todo6.getTargetDate();
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
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        long long6 = todo4.getId();
        String str7 = todo4.getDescription();
        java.util.Date date8 = todo4.getTargetDate();
        String str9 = todo4.getUserName();
        todo4.setId((-1L));
        java.util.Date date12 = todo4.getTargetDate();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass13 = date12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        String str3 = todo0.getUserName();
        todo0.setId((long) (byte) 1);
        long long6 = todo0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setUserName("hi!");
        Class<?> wildcardClass15 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        java.util.Date date5 = null;
        todo4.setTargetDate(date5);
        String str7 = todo4.getDescription();
        java.util.Date date8 = null;
        todo4.setTargetDate(date8);
        todo4.setUserName("hi!");
        Class<?> wildcardClass12 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        String str6 = todo4.getDescription();
        long long7 = todo4.getId();
        todo4.setId((long) (byte) 10);
        String str10 = todo4.getUserName();
        todo4.setDescription("hi!");
        Class<?> wildcardClass13 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("", "hi!", date4, true);
        String str7 = todo6.getUserName();
        String str8 = todo6.getDescription();
        java.util.Date date9 = todo6.getTargetDate();
        todo6.setDescription("");
        org.springframework.validation.BindingResult bindingResult12 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str13 = todoController0.addTodo(modelMap1, todo6, bindingResult12);
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        String str8 = todo6.getDescription();
        todo6.setId((long) ' ');
        String str11 = todo6.getUserName();
        todo6.setUserName("");
        java.util.Date date14 = null;
        todo6.setTargetDate(date14);
        java.util.Date date16 = todo6.getTargetDate();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        todo0.setDescription("hi!");
        long long3 = todo0.getId();
        todo0.setUserName("");
        Class<?> wildcardClass6 = todo0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        java.util.Date date7 = null;
        todo4.setTargetDate(date7);
        todo4.setId((long) (-1));
        todo4.setId((long) (byte) 100);
        todo4.setUserName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, false);
        todo4.setId((-1L));
        String str7 = todo4.getDescription();
        todo4.setUserName("hi!");
        todo4.setId((long) (byte) 100);
        todo4.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        net.guides.springboot.todomanagement.controller.TodoController todoController0 = new net.guides.springboot.todomanagement.controller.TodoController();
        org.springframework.ui.ModelMap modelMap1 = null;
        java.util.Date date4 = null;
        net.guides.springboot.todomanagement.model.Todo todo6 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date4, true);
        String str7 = todo6.getDescription();
        long long8 = todo6.getId();
        long long9 = todo6.getId();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        todo6.setDescription("hi!");
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
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        long long7 = todo5.getId();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        java.util.Date date10 = null;
        todo5.setTargetDate(date10);
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        net.guides.springboot.todomanagement.service.TodoService todoService0 = new net.guides.springboot.todomanagement.service.TodoService();
        java.util.Date date3 = null;
        net.guides.springboot.todomanagement.model.Todo todo5 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date3, true);
        String str6 = todo5.getDescription();
        java.util.Date date7 = todo5.getTargetDate();
        java.util.Date date8 = null;
        todo5.setTargetDate(date8);
        todo5.setDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Date date2 = null;
        net.guides.springboot.todomanagement.model.Todo todo4 = new net.guides.springboot.todomanagement.model.Todo("hi!", "hi!", date2, true);
        String str5 = todo4.getDescription();
        java.util.Date date6 = todo4.getTargetDate();
        String str7 = todo4.getDescription();
        todo4.setDescription("hi!");
        Class<?> wildcardClass10 = todo4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        net.guides.springboot.todomanagement.model.Todo todo0 = new net.guides.springboot.todomanagement.model.Todo();
        long long1 = todo0.getId();
        todo0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
}

