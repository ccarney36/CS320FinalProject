//Chase Carney
//05/19/2022
//Course ID: CS-320-T5615 
//Description: This is the contact class, it creates and stores contact information

package main;

public class Contact {
	
	//variables for the class
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	//object for the class
	public Contact(String contactId, String firstName, String lastName, String phone, String address ) {
		//checking if ID is null or length longer than 10
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//checking if first name is null or length longer than 10
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invaild First Name");
		}
		
		//checking if last name is null or length longer than 10
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invaild Last Name");
		}
		
		//checking if phone number is null or length longer than 10
		if (phone == null || phone.length() > 10) {
			throw new IllegalArgumentException("Invaild Phone Number");
		}
		
		//checking if address is null or length longer than 30
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invaild Address");
		}
		
		//handling if no exceptions
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		
	}
	
	//getters
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	//setters
	public void setContactId (String Id) {
		throw new IllegalAccessError("Contact ID cannot be changed"); //ID can't be modified 
	}
	
	public void setFirstName (String fName) {
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name!");
		}
		this.firstName = fName;
		
	}
	
	public void setLastName (String lName) {
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name!");
		}
		this.lastName = lName;
	}
	
	public void setPhone (String newPhone) {
		
		if (newPhone == null || newPhone.length() > 10)  {
			throw new IllegalArgumentException("Invalid Phone Number!");
		
		}
			this.phone = newPhone;
			
	}
	
	public void setAddress (String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address!");
		}
		this.address = newAddress;
	}
	

}
