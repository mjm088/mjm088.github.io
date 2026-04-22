package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest {

	private ContactService service;
	private Contact contact;

	@BeforeEach
	void testSetup() {
		service = new ContactService();
		contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		service.addContact(contact);
	}

	@Test
	void testContactServiceClassAddNewContact() {
		Contact contact = new Contact("123456", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		service.addContact(contact);
	}

	@Test
	void testContactServiceClassAddDuplicateContact() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact);
		});
	}

	@Test
	void testContactServiceClassDeleteContact() {
		service.deleteContact("12345");
		contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		service.addContact(contact);
	}

	@Test
	void testContactServiceClassDeleteNonExistentContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("123456");
		});
	}

	@Test
	void testContactServiceClassUpdateFirstName() {
		service.updateFirstName("12345", "Mike");
		assertTrue(contact.getFirstName().equals("Mike"));
	}

	@Test
	void testContactServiceClassUpdateLastName() {
		service.updateLastName("12345", "McClung");
		assertTrue(contact.getLastName().equals("McClung"));
	}

	@Test
	void testContactServiceClassUpdateNumber() {
		service.updatePhone("12345", "8008008080");
		assertTrue(contact.getPhoneNumber().equals("8008008080"));
	}

	@Test
	void testContactServiceClassUpdateAddress() {
		service.updateAddress("12345", "100 Avenue Drive");
		assertTrue(contact.getAddress().equals("100 Avenue Drive"));
	}
}
