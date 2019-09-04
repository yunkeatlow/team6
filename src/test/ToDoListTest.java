package test;

import java.util.Collection;
import java.util.HashMap;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;
import src.Task;
import src.ToDoList;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	private Task task1;
	private Task task2;
	private Task task3;
	private ToDoList todolist;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
		task1 = new Task("Task 1");
		task2 = new Task("Task 2");
		task3 = new Task("Task 3");
		
		todolist = new ToDoList();
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
		task1 = null;
		task2 = null;
		task3 = null;
		
		todolist = null;
	}

	@Test
	public void testAddTask() {
		assertNotNull(todolist);
		todolist.addTask(task1);
		assertEquals(1,todolist.getAllTasks().size());
		assertEquals(task1, todolist.getTask(task1.getDescription()));
	}

	@Test
	public void testRemoveTask() {
		assertNotNull(todolist);
		todolist.addTask(task1);
		todolist.addTask(task2);
		
		todolist.removeTask(task1.getDescription());
		assertNull(todolist.getTask(task1.getDescription()));
	}
	@Test
	public void testSetCompletedTasks() {
		fail("Not implemented yet");
	}
	@Test
	public void getAllTasksTest() {
		assertNotNull(todolist);
		todolist.addTask(task1);
		todolist.addTask(task2);
		todolist.getAllTasks();
//		assertEquals(todolist);
		
	}
}
