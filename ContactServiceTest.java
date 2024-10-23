package ContactService;

public class ContactServiceTest {
	
	public void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("T1", "Test", "Case", "987654321", "222 Test Street");
		contactService.addContact(contact);
		
		assertNotNull(contactService.getContactById("C1"));
	}

	private void assertNotNull(Contact contactId) {
		// TODO Auto-generated method stub
		
	}
}
