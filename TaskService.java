package main;

//used to store task info
import java.util.TreeMap;

public class TaskService {
	//using the TreeMap to be able to access info via key
	public TreeMap<String, Task> tasks = new TreeMap<String, Task>();
	
	public void newTask (Task task) {
		//add new task
		if ((this.tasks.get(task.getTaskId()) == null)) { //must be unique task
			this.tasks.put(task.getTaskId(), task);
		}
		else {
			throw new IllegalArgumentException ("Task with given ID already exists!");

		}
	}
	
	//remove task Id
	public void removeTask(String taskId) {
		this.tasks.remove(taskId);
	}
	
	//update name
	public void updateName(String taskId, String name) {
		Task task = tasks.get(taskId);
		task.setName(name);
	}
	
	//update description
	public void updateDescription(String taskId, String description) {
		Task task = tasks.get(taskId);
		task.setDescription(description);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
