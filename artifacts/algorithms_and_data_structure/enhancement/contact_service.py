from contact import Contact


class ContactService:
    # Manages contacts using a dictionary keyed by contact ID
    def __init__(self):
        # Dictionary allows fast lookup instead of list traversal
        self.contacts: dict[str, Contact] = {}

    def add_contact(self, contact: Contact) -> None:
        # Prevent duplicate contact IDs
        if contact.contact_id in self.contacts:
            raise ValueError(f"Contact with ID {contact.contact_id} already exists.")

        # Add contact to dictionary
        self.contacts[contact.contact_id] = contact

    def delete_contact(self, contact_id: str) -> None:
        # Ensure contact exists before deletion
        if contact_id not in self.contacts:
            raise ValueError("A contact with this ID does not exist.")

        # Remove contact from dictionary
        del self.contacts[contact_id]

    def update_first_name(self, contact_id: str, first_name: str) -> None:
        # Ensure contact exists before update
        if contact_id not in self.contacts:
            raise ValueError("A contact with this ID does not exist.")

        # Update first name
        self.contacts[contact_id].first_name = first_name

    def update_last_name(self, contact_id: str, last_name: str) -> None:
        # Ensure contact exists before update
        if contact_id not in self.contacts:
            raise ValueError("A contact with this ID does not exist.")

        # Update last name
        self.contacts[contact_id].last_name = last_name

    def update_phone(self, contact_id: str, phone_number: str) -> None:
        # Ensure contact exists before update
        if contact_id not in self.contacts:
            raise ValueError("A contact with this ID does not exist.")

        # Update phone number
        self.contacts[contact_id].phone_number = phone_number

    def update_address(self, contact_id: str, address: str) -> None:
        # Ensure contact exists before update
        if contact_id not in self.contacts:
            raise ValueError("A contact with this ID does not exist.")

        # Update address
        self.contacts[contact_id].address = address