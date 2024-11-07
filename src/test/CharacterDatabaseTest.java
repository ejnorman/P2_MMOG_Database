import all.Character;
import all.CharacterDatabase;
import all.CharacterDatabaseInterface;
import all.HashedDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CharacterDatabaseTest {

    @Test
    void addCharacter() {
        CharacterDatabaseInterface db = new CharacterDatabase();
        Character ea = new Character("Ea", 1.86, 71.0, 50);
        db.addCharacter("FB", 1.47, 47.0, -80);
        db.addCharacter("Ea", 1.86, 71.0, 50);
        db.addCharacter("Daegon", 1.80, 75.0, 50);
        assertEquals(db.getCharacter("Ea").getName(), ea.getName());
    }

    @Test
    void removeCharacter() {
        CharacterDatabaseInterface db = new CharacterDatabase();
        Character daegon = new Character("Daegon", 1.80, 75.0, 50);
        db.addCharacter("FB", 1.47, 47.0, -80);
        db.addCharacter("Ea", 1.86, 71.0, 50);
        db.addCharacter("Daegon", 1.80, 75.0, 50);
        db.removeCharacter("Ea");
        assertEquals(db.getCharacter("Daegon").getName(), daegon.getName());
    }

    @Test
    void getCharacter() {
        CharacterDatabaseInterface db = new CharacterDatabase();
        Character daegon = new Character("Daegon", 1.80, 75.0, 50);
        db.addCharacter("FB", 1.47, 47.0, -80);
        db.addCharacter("Ea", 1.86, 71.0, 50);
        db.addCharacter("Daegon", 1.80, 75.0, 50);
        db.removeCharacter("Ea");
        assertEquals(db.getCharacter("Daegon").getName(), daegon.getName());
        assertNull(db.getCharacter("Ea"));
    }

    @Test
    void getHashTable() {
        CharacterDatabaseInterface db = new CharacterDatabase();
        Character daegon = new Character("Daegon", 1.80, 75.0, 50);
        db.addCharacter("FB", 1.47, 47.0, -80);
        db.addCharacter("Ea", 1.86, 71.0, 50);
        db.addCharacter("Daegon", 1.80, 75.0, 50);
        HashedDictionary<String, Integer> table = new HashedDictionary<>();
        table.add("FB", 0);
        table.add("Ea", 1);
        table.add("Daegon", 2);
        assertEquals(db.getHashTable().getValue("Ea"), table.getValue("Ea"));
    }
}
