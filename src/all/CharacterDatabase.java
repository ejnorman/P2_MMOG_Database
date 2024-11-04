package all;

import java.util.ArrayList;

public class CharacterDatabase implements CharacterDatabaseInterface{
    private ArrayList<Character> characters;
    private HashedDictionary<String, Integer> hashTable;

    public CharacterDatabase() {
        characters = new ArrayList<>();
        hashTable = new HashedDictionary<>();
    }

    public void addCharacter(String name, double height, double weight, int moral) {
        Character player = new Character(name, height, weight, moral);
        characters.add(player);
        hashTable.add(name, characters.indexOf(player));
    }

    public void removeCharacter(String name) {
        int index = hashTable.getValue(name);
        characters.set(index, null);
    }

    public Character getCharacter(String name) {
        int index = hashTable.getValue(name);
        return characters.get(index);
    }

    public HashedDictionary<String, Integer> getHashTable() {
        return hashTable;
    }

    public void printList() {

    }
}
