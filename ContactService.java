package ContactService;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		contacts.put(contact.getContactId(), contact);
	}
	
	public void deleteContact(String contactId) {
		contacts.remove(contactId);
	}
	
	public void updateContact(Contact updatedContact) {
		contacts.put(updatedContact.getContactId(), updatedContact);
	}
	
	public Contact getContactById(String contactId) {
		return contacts.get(contactId);
	}
}
