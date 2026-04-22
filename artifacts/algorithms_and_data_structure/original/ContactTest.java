package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		assertTrue(contact.getID().equals("12345"));
		assertTrue(contact.getFirstName().equals("Micah"));
		assertTrue(contact.getLastName().equals("McClure"));
		assertTrue(contact.getPhoneNumber().equals("1888888888"));
		assertTrue(contact.getAddress().equals("456 Maple Street, Apt 2B"));
	}

	@Test
	void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678910", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micahhhhhhhhh", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "McClure", "1888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micah", "McClureeeeeeee", "1888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micah", null, "1888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micah", "McClure'", "18888888888888", "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micah", "McClure'", null, "456 Maple Street, Apt 2B");
		});
	}

	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micah", "McClure'", "1888888888", "456 Maple Street, Apt 2B, Richmond, VA");
		});
	}

	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Micah", "McClure'", "1888888888", null);
		});
	}

	@Test
	void testContactClassSetFirstName() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		contact.setFirstName("Mike");

	}

	@Test
	void testContactClassSetFirstNameIsNull() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}

	@Test
	void testContactClassSetFirstNameIsTooLong() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("Micahhhhhhhhhhhhh");
		});
	}

	@Test
	void testContactClassSetLastName() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		contact.setLastName("McClung");

	}

	@Test
	void testContactClassSetLastNameIsNull() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(null);
		});
	}

	@Test
	void testContactClassSetLastNameIsTooLong() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName("McClureeeeeeeeeeeeeeee");
		});
	}

	@Test
	void testContactClassSetPhoneNumber() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		contact.setPhoneNumber("1000000000");

	}

	@Test
	void testContactClassSetPhoneNumberIsNull() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhoneNumber(null);
		});
	}

	@Test
	void testContactClassSetPhoneNumberIsTooLong() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhoneNumber("18888888888888");
		});
	}

	@Test
	void testContactClassSetAddress() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		contact.setAddress("180 Apple Street Rd");

	}

	@Test
	void testContactClassSetAddressIsNull() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(null);
		});
	}

	@Test
	void testContactClassSetAddressIsTooLong() {
		Contact contact = new Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("180 Apple Street Lane Rd 140, Apartment 10000000000000000000");
		});
	}

}
