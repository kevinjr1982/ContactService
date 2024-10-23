package ContactService;

public class ContactTest {
	
	public void testContactCreation() {
		Contact contact = new Contact("C1", "John", "Doe", "987654321", "111 Test st");
		assertEquals("P1", contact.getContactId());
		assertEquals("Contact", contact.getFirstName());
		assertEquals("Test", contact.getLastName());
		assertEquals("987654321", contact.getPhone());
		assertEquals("111 Test Street", contact.getAddress());
	}

	private void assertEquals(String string, String contactId) {
		// TODO Auto-generated method stub
		
	}
}
