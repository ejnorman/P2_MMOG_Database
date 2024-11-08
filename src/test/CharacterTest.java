import all.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterTest {

    @Test
    void getHealth() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        assertEquals(100, player.getHealth());
    }

    @Test
    void heal() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        player.injure(50);
        player.heal(25);
        assertEquals(75, player.getHealth());
    }

    @Test
    void injure() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        player.injure(50);
        assertEquals(50, player.getHealth());
    }

    @Test
    void getMoral() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        assertEquals(-80, player.getMoral());
    }

    @Test
    void change() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        player.change(80);
        assertEquals(0, player.getMoral());
    }

    @Test
    void getWeight() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        assertEquals(47.0, player.getWeight());
    }

    @Test
    void setWeight() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        player.setWeight(50.5);
        assertEquals(50.5, player.getWeight());
    }

    @Test
    void getHeight() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        assertEquals(1.47, player.getHeight());
    }

    @Test
    void setHeight() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        player.setHeight(1.60);
        assertEquals(1.60, player.getHeight());
    }

    @Test
    void getName() {
        Character player = new Character("FB", 1.47, 47.0, -80);
        assertEquals("FB", player.getName());
    }
}
