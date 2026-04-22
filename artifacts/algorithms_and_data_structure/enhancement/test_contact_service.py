import pytest
from contact import Contact
from contact_service import ContactService


@pytest.fixture
def service():
    return ContactService()


@pytest.fixture
def sample_contact():
    return Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")


def test_contact_service_class_add_new_contact(service, sample_contact):
    service.add_contact(sample_contact)

    new_contact = Contact("123456", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    service.add_contact(new_contact)

    assert len(service.contacts) == 2


def test_contact_service_class_add_duplicate_contact(service, sample_contact):
    service.add_contact(sample_contact)

    duplicate_contact = Contact("12345", "Micah", "McClure", "1888888888", "456 Maple Street, Apt 2B")
    with pytest.raises(ValueError):
        service.add_contact(duplicate_contact)


def test_contact_service_class_delete_contact(service, sample_contact):
    service.add_contact(sample_contact)
    service.delete_contact("12345")

    assert "12345" not in service.contacts


def test_contact_service_class_delete_non_existent_contact(service, sample_contact):
    service.add_contact(sample_contact)

    with pytest.raises(ValueError):
        service.delete_contact("123456")


def test_contact_service_class_update_first_name(service, sample_contact):
    service.add_contact(sample_contact)
    service.update_first_name("12345", "Mike")

    assert service.contacts["12345"].first_name == "Mike"


def test_contact_service_class_update_last_name(service, sample_contact):
    service.add_contact(sample_contact)
    service.update_last_name("12345", "McClung")

    assert service.contacts["12345"].last_name == "McClung"


def test_contact_service_class_update_number(service, sample_contact):
    service.add_contact(sample_contact)
    service.update_phone("12345", "1000000000")

    assert service.contacts["12345"].phone_number == "1000000000"


def test_contact_service_class_update_address(service, sample_contact):
    service.add_contact(sample_contact)
    service.update_address("12345", "180 Apple Street Rd")

    assert service.contacts["12345"].address == "180 Apple Street Rd"


def test_contact_service_class_update_missing_contact_raises_error(service):
    with pytest.raises(ValueError):
        service.update_first_name("99999", "Mike")