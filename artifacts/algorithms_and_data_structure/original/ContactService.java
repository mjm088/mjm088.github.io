package contactService;

import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contacts = new ArrayList<>();

	public ContactService() {
		this.contacts = new ArrayList<>();
	}

	public void addContact(Contact contact) {
		for (Contact c : contacts) {
			if (contact.getID().equals(c.getID())) {
				throw new IllegalArgumentException("Contact with ID " + contact.getID() + " already exists.");
			}
		}
		contacts.add(contact);
	}

	public void deleteContact(String ID) {
		int index = -1;
		for (Contact c : contacts) {
			if (ID.equals(c.getID())) {
				index = contacts.indexOf(c);
			}
		}
		if (index != -1) {
			contacts.remove(index);
		} else {
			throw new IllegalArgumentException("A contact with this ID does not exist.");
		}
	}

	public void updateFirstName(String ID, String firstName) {
		for (Contact c : contacts) {
			if (ID.equals(c.getID())) {
				c.setFirstName(firstName);
			}
		}

	}

	public void updateLastName(String ID, String lastName) {
		for (Contact c : contacts) {
			if (ID.equals(c.getID())) {
				c.setLastName(lastName);
			}
		}

	}

	public void updatePhone(String ID, String phoneNumber) {
		for (Contact c : contacts) {
			if (ID.equals(c.getID())) {
				c.setPhoneNumber(phoneNumber);
			}
		}

	}

	public void updateAddress(String ID, String address) {
		for (Contact c : contacts) {
			if (ID.equals(c.getID())) {
				c.setAddress(address);
			}
		}

	}

}
