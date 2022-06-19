package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;
import main.TaskService;

class TaskServiceTest {

	@Test
	void testAddTask() {
		//test if taskId was added correctly
		TaskService taskService = new TaskService();
		Task testTask = new Task ("1234", "name", "description");
		taskService.newTask(testTask);
		
		assertTrue (taskService.tasks.containsKey(testTask.getTaskId()));
		
		//test if duplicate taskId throws an exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.newTask(testTask);
			throw new IllegalArgumentException ("Invalid ID");
		});
	}

	@Test
	void testRemoveTask() {
		//test if removed correctly
		TaskService taskService = new TaskService();
		Task testTask = new Task ("1234", "name", "description");
		taskService.newTask(testTask);
		taskService.removeTask(testTask.getTaskId());
		
		assertFalse (taskService.tasks.containsKey(testTask.getTaskId()));
	}
	
	@Test
	void testUpdateTaskFields() {
		TaskService taskService = new TaskService();
		Task testTask = new Task ("1234", "name", "description");
		taskService.newTask(testTask);
		
		taskService.updateName("1234", "newName");
		taskService.updateDescription("1234", "newDescription");
		
		Task updateTask = taskService.tasks.get("1234");
		
		assertTrue (updateTask.getName().equals("newName"));
		assertTrue (updateTask.getDescription().equals("newDescription"));
	}
}
