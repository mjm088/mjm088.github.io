class Contact:
    # Represents a single contact with validation rules
    def __init__(self, contact_id: str, first_name: str, last_name: str, phone_number: str, address: str):
        # Validate contact ID
        if contact_id is None or len(contact_id) > 10:
            raise ValueError("Contact ID can't be null and can't be more than 10 characters in length")

        # Validate first name
        if first_name is None or len(first_name) > 10:
            raise ValueError("Contact first name can't be null and can't be more than 10 characters in length")

        # Validate last name
        if last_name is None or len(last_name) > 10:
            raise ValueError("Contact last name can't be null and can't be more than 10 characters in length")

        # Validate phone number (must be exactly 10 digits)
        if phone_number is None or len(phone_number) != 10:
            raise ValueError("Contact phone number can't be null and has to be 10 characters in length")

        # Validate address
        if address is None or len(address) > 30:
            raise ValueError("Contact address can't be null and can't be more than 30 characters in length")

        # Initialize contact attributes
        self._contact_id = contact_id
        self._first_name = first_name
        self._last_name = last_name
        self._phone_number = phone_number
        self._address = address

    @property
    def contact_id(self) -> str:
        # Return immutable contact ID
        return self._contact_id

    @property
    def first_name(self) -> str:
        return self._first_name

    @first_name.setter
    def first_name(self, value: str) -> None:
        # Validate updated first name
        if value is None or len(value) > 10:
            raise ValueError("Contact first name can't be null and can't be more than 10 characters in length")
        self._first_name = value

    @property
    def last_name(self) -> str:
        return self._last_name

    @last_name.setter
    def last_name(self, value: str) -> None:
        # Validate updated last name
        if value is None or len(value) > 10:
            raise ValueError("Contact last name can't be null and can't be more than 10 characters in length")
        self._last_name = value

    @property
    def phone_number(self) -> str:
        return self._phone_number

    @phone_number.setter
    def phone_number(self, value: str) -> None:
        # Validate updated phone number
        if value is None or len(value) != 10:
            raise ValueError("Contact phone number can't be null and has to be 10 characters in length")
        self._phone_number = value

    @property
    def address(self) -> str:
        return self._address

    @address.setter
    def address(self, value: str) -> None:
        # Validate updated address
        if value is None or len(value) > 30:
            raise ValueError("Contact address can't be null and can't be more than 30 characters in length")
        self._address = value