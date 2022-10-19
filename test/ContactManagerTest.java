import fortests.Contact;
import fortests.ContactManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    static ContactManager contactManager;

    @BeforeAll
    public static void setup(){
        System.out.println("Before All");
        contactManager=new ContactManager();
    }

//    @BeforeEach
//    public void setup(){
//        System.out.println("Before Each");
//        contactManager=new ContactManager();
//    }

    @Test
    @DisplayName("Should create a contact")
    public void shouldCreateContact(){
        contactManager.addContact("first1","last1","0852147963");
        //contactManager.addContact("first2","last2","0853147963");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1,contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("should Not Create When Firstname Is Null")
    public void shouldNotCreateWhenFirstnameIsNull(){
        assertThrows(RuntimeException.class,()->contactManager.addContact(null,"","01452"));
    }

    @Test
    @DisplayName("should Not Create When Lastname Is Null")
    public void shouldNotCreateWhenLastnameIsNull(){
        assertThrows(RuntimeException.class,()->contactManager.addContact("sdfa",null,"01452"));
    }

    @Test
    @DisplayName("should Not Create When Phone Is Null")
    public void shouldNotCreateWhenPhoneIsNull(){
        assertThrows(RuntimeException.class,()->contactManager.addContact("wrefsdv","afacs",null));
    }
}