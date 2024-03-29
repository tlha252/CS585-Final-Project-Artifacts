/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 12 23:19:17 GMT 2019
 */

package net.guides.springboot.todomanagementspringboot.evo_sixty_seconds.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
import net.guides.springboot.todomanagement.model.Todo;
import net.guides.springboot.todomanagement.repository.TodoRepository;
import net.guides.springboot.todomanagement.service.TodoService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TodoService_ESTest extends TodoService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      Vector<Todo> vector0 = new Vector<Todo>();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(todoRepository0).findByUserName(anyString());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      List<Todo> list0 = todoService0.getTodosByUser("");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      Vector<Todo> vector0 = new Vector<Todo>();
      MockDate mockDate0 = new MockDate(395, 15, 15);
      Todo todo0 = new Todo("", "", mockDate0, true);
      vector0.add(todo0);
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(todoRepository0).findByUserName(anyString());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      List<Todo> list0 = todoService0.getTodosByUser("vRC:HXA=?C)<(W*tee");
      assertTrue(list0.contains(todo0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      Optional<Todo> optional0 = todoService0.getTodoById((-1L));
      assertNull(optional0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      Todo todo0 = new Todo();
      Optional.of(todo0);
      // Undeclared exception!
      try { 
        todoService0.getTodosByUser("Optional[net.guides.springboot.todomanagement.model.Todo@2]");
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
      Instant instant0 = MockInstant.ofEpochSecond(0L, 560L);
      Date date0 = Date.from(instant0);
      Todo todo0 = new Todo((String) null, (String) null, date0, false);
      Optional<Todo> optional0 = Optional.ofNullable(todo0);
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      todoService0.deleteTodo(0L);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(todoRepository0).findById(anyLong());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      // Undeclared exception!
      try { 
        todoService0.deleteTodo((-2037L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.guides.springboot.todomanagement.service.TodoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TodoService todoService0 = new TodoService();
      TodoRepository todoRepository0 = mock(TodoRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(todoRepository0).findByUserName(anyString());
      Injector.inject(todoService0, (Class<?>) TodoService.class, "todoRepository", (Object) todoRepository0);
      Injector.validateBean(todoService0, (Class<?>) TodoService.class);
      List<Todo> list0 = todoService0.getTodosByUser("");
      assertNull(list0);
  }
}
