package contactService;

public class Contact {
	private final String ID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public Contact(String ID, String firstName, String lastName, String phoneNumber, String address) {
		if (ID == null || ID.length() > 10) {
			throw new IllegalArgumentException(
					"Contact ID can't be null and can't be more than 10 characters in length");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException(
					"Contact first name can't be null and can't be more than 10 characters in length");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException(
					"Contact last name can't be null and can't be more than 10 characters in length");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException(
					"Contact phone number can't be null and has to be 10 characters in length");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException(
					"Contact address can't be null and can't be more than 30 characters in length");
		}

		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException(
					"Contact first name can't be null and can't be more than 10 characters in length");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException(
					"Contact last name can't be null and can't be more than 10 characters in length");
		}
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException(
					"Contact phone number can't be null and has to be 10 characters in length");
		}
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException(
					"Contact address can't be null and can't be more than 30 characters in length");
		}
		this.address = address;
	}

	public String getID() {
		return ID;
	}

}
