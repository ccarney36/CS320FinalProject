package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;

class TaskTest {

	@Test
	public void testTaskId() {
		//testing if null task ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Task (null, "name", "description");
		});
		
		//testing if +11 characters throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Task ("taskId", "ELEVENCHARS", "descripiton");
		});
		
		//testing if attempting to update taskId throws an exception
		Assertions.assertThrows (IllegalAccessError.class, () -> {
			Task testTask = new Task ("1234", "name", "description");
			testTask.setTaskId("newId");
		});
	}
	
	@Test
	public void testName() {
		//testing to make sure name isn't null
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Task ("taskId", null, "description");
		});
		
		//testing to make sure name isn't 11+ characters
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Task ("taskId", "ELEVENCHARS", "description");
		});	
	}
	
	@Test
	public void testDescription() {
		//testing if description is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task ("taskId", "name", null);
		});
		
		//testing if description is more than 50 characters
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task ("taskId", "name", "This whole sentence is precisely fifty characters.."); //51 character
		});
	}
	
	@Test
	public void testAcceptableTaskId() {
		//test a good taskId
		Task testTask  = new Task ("1234", "name", "description");
		
		assertTrue(testTask.getTaskId().equals("1234"));
		assertTrue(testTask.getName().equals("name"));
		assertTrue(testTask.getDescription().equals("description"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
