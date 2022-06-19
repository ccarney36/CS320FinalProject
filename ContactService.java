//Chase Carney
//05-19-2022
//Course ID: CS-320-T5615 
//Description: This is the contactService class

package main;

//used to store data
import java.util.TreeMap;

public class ContactService {
	//using a TreeMap allows us to access by key
	public TreeMap<String, Contact> contacts = new TreeMap<String, Contact>();
	
	public void newContact(Contact contact) {
		//add new contact
		if ((this.contacts.get(contact.getContactId()) == null)) { //ID must be unique
			this.contacts.put(contact.getContactId(), contact);
		} 
		else {
			throw new IllegalArgumentException ("Contact with given ID already exists!");
		}
				
	}
	
	//remove contact by ID
	public void removeContact(String contactId) {
		this.contacts.remove(contactId);
	}
	
	//update first name
	public void updateContactFirstName (String contactId, String firstName) {
		Contact contact = contacts.get(contactId);
		contact.setFirstName(firstName);
	}
	
	//update last name
	public void updateContactLastName(String contactId, String lastName) {
		Contact contact = contacts.get(contactId);
		contact.setLastName(lastName);
	}
	
	//update phone number
	public void updateContactPhoneNumber(String contactId, String phoneNumber) {
		Contact contact = contacts.get(contactId);
		contact.setPhone(phoneNumber);
	}
	
	//update address
	public void updateContactAddress(String contactId, String address) {
		Contact contact = contacts.get(contactId);
		contact.setAddress(contactId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
