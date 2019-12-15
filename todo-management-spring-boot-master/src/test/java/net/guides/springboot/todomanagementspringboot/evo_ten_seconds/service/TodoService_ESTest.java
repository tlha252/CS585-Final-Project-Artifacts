/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 23:04:43 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evo_ten_seconds.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.guides.springboot.todomanagement.model.Todo;
import net.guides.springboot.todomanagement.repository.TodoRepository;
import net.guides.springboot.todomanagement.service.TodoService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TodoService_ESTest extends TodoService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(todoRepository0).findByUserName(anyString());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      List<Todo> list0 = todoService0.getTodosByUser("uu+1HVJ%In");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      ArrayList<Todo> arrayList0 = new ArrayList<Todo>();
      Todo todo0 = new Todo();
      arrayList0.add(todo0);
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(todoRepository0).findByUserName(anyString());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      List<Todo> list0 = todoService0.getTodosByUser("");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      Optional<Todo> optional0 = todoService0.getTodoById(1634L);
      assertNull(optional0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      // Undeclared exception!
      try { 
        todoService0.getTodosByUser("Mapping function must not be null!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.guides.springboot.todomanagement.service.TodoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      // Undeclared exception!
      try { 
        todoService0.deleteTodo((-472L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.guides.springboot.todomanagement.service.TodoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      Todo todo0 = new Todo();
      Optional<Todo> optional0 = Optional.of(todo0);
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      todoService0.deleteTodo(4365L);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      Optional<Todo> optional0 = Optional.empty();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      todoService0.deleteTodo(1L);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      ArrayList<Todo> arrayList0 = new ArrayList<Todo>();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(todoRepository0).findByUserName(anyString());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      List<Todo> list0 = todoService0.getTodosByUser("");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      Optional<Todo> optional0 = Optional.empty();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      Optional<Todo> optional1 = todoService0.getTodoById(1L);
      assertSame(optional1, optional0);
  }
}