package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;


class ContactTest {

	@Test
	public void testContactId() {
		//test that null Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact(null, "firstName", "lastName", "0123456789", "address");
		});
	
		//test that an 11+ character Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact("ELEVENCHARS", "firstName", "lastName", "0123456789", "address");
		});
		
		//test updating Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			Contact testContact = new Contact("1234", "firstName", "lastName", "01123456789", "address");
			testContact.setContactId ("newId");
		});
	}
	
	
	@Test
	public void testFirstName() {
		//test that a null first name throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", null, "lastName", "0123456789", "address");
		});
	
		//test that an 11+ character Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "ELEVENCHARS", "lastName", "0123456789", "address"); 
		});
	}

	
	@Test
	public void testLastName() {
		//test that null last name throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "firstName", null, "0123456789", "address");
		});
		
		//test that an 11+ character Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "firstName", "ELEVENCHARS", "0123456789","address");
		});	
	}
	
	@Test
	public void testPhoneNumber() {
		//test that null last name throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "firsName", "lastName", null, "address");
		});
		
		//test that an 11+ character Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "firstName", "lastName", "ELEVENCHARS", "address");
		});	
	}
	
	@Test 
	public void testAddress() {
		//test that null last name throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "firstNamw", "lastName", "0123456789", null);
		});
		
		//test that an 11+ character Contact ID throws an exception
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("0123456789", "firstName", "lastNamw", "0123456789", "THIRTY_ONE_CHARACTERS_TOO_MANY_");
		});		
	}
	
	@Test
	public void testAccetableContactInfo () {
		//test a good a good Contact!!
		Contact testContact = new Contact("1234", "firstName", "lastName", "0123456789", "address");
		
		assertTrue(testContact.getContactId().equals("1234"));
		assertTrue(testContact.getFirstName().equals("firstName"));
		assertTrue(testContact.getLastName().equals("lastName"));
		assertTrue(testContact.getPhone().equals("0123456789"));
		assertTrue(testContact.getAddress().equals("address"));

	}
}




