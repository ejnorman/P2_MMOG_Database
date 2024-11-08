package all;

import java.util.ArrayList;

public class CharacterDatabase implements CharacterDatabaseInterface{
    private ArrayList<Character> characters;
    private HashedDictionary<String, Integer> hashTable;

    /**
     * Creates CharacterDatabase object with ArrayList of Character objects and
     * HashedDictionary of character names and index in list
     */
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
        if(!hashTable.contains(name)) {
            return;
        }
        int index = hashTable.getValue(name);
        characters.set(index, null); //to not shift every object in list
        hashTable.remove(name);
    }

    public Character getCharacter(String name) {
        if(!hashTable.contains(name)) {
            return null;
        }
        int index = hashTable.getValue(name);
        return characters.get(index);
    }

    public HashedDictionary<String, Integer> getHashTable() {
        return hashTable;
    }

    public void printList() {
        System.out.println("Character List\n----------------");
        for (Character character : characters) {
            if (character == null) {
                System.out.println("null");
            }else {
                System.out.println(character.getName());
            }
        }
    }
}
