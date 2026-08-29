import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {

    private Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact(
                "Ada Lovelace",
                "+1 617 555 0101");
    }

    @Test
    void getNameReturnsCorrectName() {
        assertEquals("Ada Lovelace", contact.getName());
    }

    @Test
    void getPhoneReturnsCorrectPhone() {
        assertEquals("+1 617 555 0101", contact.getPhone());
    }

    @Test
    void toStringContainsName() {
        assertTrue(contact.toString().contains("Ada Lovelace"));
    }

    @Test
    void toStringContainsPhone() {
        assertTrue(
                contact.toString().contains("+1 617 555 0101"));
    }

    @Test
    void toStringReturnsCorrectFormat() {
        assertEquals(
                "Ada Lovelace | +1 617 555 0101",
                contact.toString());
    }

    // Additional test
    @Test
    void twoContactsWithSameNameAreIndependentObjects() {

        Contact first = new Contact("Alan Turing", "111-111-1111");

        Contact second = new Contact("Alan Turing", "222-222-2222");

        assertEquals("Alan Turing", first.getName());
        assertEquals("Alan Turing", second.getName());

        assertNotEquals(
                first.getPhone(),
                second.getPhone());

        assertNotSame(first, second);
    }
}