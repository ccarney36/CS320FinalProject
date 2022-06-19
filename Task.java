package main;

public class Task {
	
	//variables needed
	private String taskId;
	private String name;
	private String description;
	
	
	
	//object for the class
	public Task(String taskId, String name, String description) {
		//checking if taskId is null or length longer than 10
		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		
		//checking if name is null or length longer than 10
		if (name == null || name.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		//checking if description is null or length longer than 50
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		//handle if no exception
		this.taskId = taskId;
		this.name = name;
		this.description = description;
	}
	
	//getters
	public String getTaskId() {
		return taskId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	//setters
	public void setTaskId(String Id) {
		throw new IllegalAccessError("Task ID cannot be changed"); //ID can't be modified 
	}
	
	public void setName(String tName) {
		if (tName == null || tName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}
		this.name = tName;
	}
	
	public void setDescription(String tDescription) {
		if (tDescription == null || tDescription.length() > 50) {
			throw new IllegalArgumentException("Description Invalid");
		}
		this.description = tDescription;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
