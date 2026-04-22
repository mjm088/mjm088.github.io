import pytest
from contact import Contact


def test_contact_class():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    assert contact.contact_id == "12345"
    assert contact.first_name == "Micah"
    assert contact.last_name == "McClure"
    assert contact.phone_number == "1888888888"
    assert contact.address == "456 Maple Street, Apt 2B"


def test_contact_class_id_too_long():
    with pytest.raises(ValueError):
        Contact("012345678910", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")


def test_contact_class_id_null():
    with pytest.raises(ValueError):
        Contact(None, "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")


def test_contact_class_first_name_too_long():
    with pytest.raises(ValueError):
        Contact("12345", "Micahhhhhhhhh", "McClure", "1888888888", "456 Maple Street, Apt 2B")


def test_contact_class_first_name_null():
    with pytest.raises(ValueError):
        Contact("12345", None, "McClure", "1888888888", "456 Maple Street, Apt 2B")


def test_contact_class_last_name_too_long():
    with pytest.raises(ValueError):
        Contact("12345", "Micah", "McClureeeeeeee", "1888888888", "456 Maple Street, Apt 2B")


def test_contact_class_last_name_null():
    with pytest.raises(ValueError):
        Contact("12345", "Micah", None, "1888888888", "456 Maple Street, Apt 2B")


def test_contact_class_phone_number_too_long():
    with pytest.raises(ValueError):
        Contact("12345", "Micah", "McClure", "18888888888888", "456 Maple Street, Apt 2B")


def test_contact_class_phone_number_null():
    with pytest.raises(ValueError):
        Contact("12345", "Micah", "McClure", None, "456 Maple Street, Apt 2B")


def test_contact_class_address_too_long():
    with pytest.raises(ValueError):
        Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B, Richmond, VA")


def test_contact_class_address_null():
    with pytest.raises(ValueError):
        Contact("12345", "Micah", "McClure", "1888888888", None)


# Setter Tests

def test_contact_class_set_first_name():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    contact.first_name = "Mike"
    assert contact.first_name == "Mike"


def test_contact_class_set_first_name_is_null():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.first_name = None


def test_contact_class_set_first_name_is_too_long():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.first_name = "Micahhhhhhhhhhhhh"


def test_contact_class_set_last_name():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    contact.last_name = "McClung"
    assert contact.last_name == "McClung"


def test_contact_class_set_last_name_is_null():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.last_name = None


def test_contact_class_set_last_name_is_too_long():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.last_name = "McClureeeeeeeeeeeeeeee"


def test_contact_class_set_phone_number():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    contact.phone_number = "1000000000"
    assert contact.phone_number == "1000000000"


def test_contact_class_set_phone_number_is_null():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.phone_number = None


def test_contact_class_set_phone_number_is_too_long():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.phone_number = "18888888888888"


def test_contact_class_set_address():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    contact.address = "180 Apple Street Rd"
    assert contact.address == "180 Apple Street Rd"


def test_contact_class_set_address_is_null():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.address = None


def test_contact_class_set_address_is_too_long():
    contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        contact.address = "180 Apple Street Lane Rd 140, Apartment 10000000000000000000"