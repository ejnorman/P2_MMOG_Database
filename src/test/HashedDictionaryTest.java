import all.HashedDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashedDictionaryTest {

    @Test
    void add() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.add("Madrid", "Spain");
        hd.add("Oslo", "Norway");
        assertEquals("France", hd.getValue("Paris"));
    }

    @Test
    void remove() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.add("Madrid", "Spain");
        hd.add("Oslo", "Norway");
        assertEquals("France", hd.remove("Paris"));
    }

    @Test
    void getValue() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.add("Madrid", "Spain");
        hd.add("Oslo", "Norway");
        assertEquals("France", hd.getValue("Paris"));
    }

    @Test
    void contains() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.add("Madrid", "Spain");
        hd.add("Oslo", "Norway");
        assertTrue(hd.contains("Paris"));
    }

    @Test
    void isEmpty() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        assertFalse(hd.isEmpty());
        hd.remove("London");
        assertTrue(hd.isEmpty());
    }

    @Test
    void getSize() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.add("Madrid", "Spain");
        hd.add("Oslo", "Norway");
        assertEquals(4, hd.getSize());
    }

    @Test
    void clear() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.clear();
        assertEquals(0, hd.getSize());
    }

    @Test
    void getProbes() {
        HashedDictionary<String, String> hd = new HashedDictionary<>();
        hd.add("London", "England");
        hd.add("Paris", "France");
        hd.add("Madrid", "Spain");
        hd.add("Oslo", "Norway");
        assertEquals(1, hd.getProbes());
    }
}
