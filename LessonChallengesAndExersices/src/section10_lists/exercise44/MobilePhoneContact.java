package section10_lists.exercise44;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhoneContact {
    private Contact contact;
    private ArrayList<Contact> contacts;

    public MobilePhoneContact() {
        this.contact = new Contact("myName", "69326468");
        this.contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addNewContact(String name, String phoneNumber) {
        if (!Objects.equals(contact.getPhoneNumber(), phoneNumber)) {
            contact = new Contact(name, phoneNumber);
            contacts.add(contact);
            System.out.printf("Contact with phone '%s' successfully created.\n", phoneNumber);
        } else {
            System.out.println("Contact already exist.");
        }
    }

    public boolean updateContact(String name, String phoneNumber, Contact contact2) {
        boolean updateWasSuccessful = false;

        for (Contact contact : contacts) {
            if (contact.getName().equals(name) && contact.getPhoneNumber().equals(phoneNumber)) {
                int index = contacts.indexOf(contact);
                contacts.set(index, contact2);
                updateWasSuccessful = true;
                break;
            }
        }

        if (updateWasSuccessful) {
            System.out.println("Contact successfully updated.");
        } else {
            System.out.println("Contact not found. Update failed to proceed");
        }
        return updateWasSuccessful;
    }

    @Override
    public String toString() {
        return "MobilePhoneContact list:\n" +
                contacts;
    }
}
