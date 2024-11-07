package all;

public interface CharacterDatabaseInterface {

    /**
     * Create Character object and add it to list and HashTable
     * @param name of character
     * @param height of character in meters
     * @param weight of character in kilograms
     * @param moral of character (between -100 and 100)
     */
    public void addCharacter(String name, double height, double weight, int moral);

    /**
     * Removes Character object from list (replaced with a null) and HashTable
     * @param name of character
     */
    public void removeCharacter(String name);

    /**
     * Gets Character object from list using HashedDictionary to get index
     * @param name of character
     * @return Character object
     */
    public Character getCharacter(String name);

    /**
     * Returns HashTable of character names as the keys and index in character list as value
     * @return HashTable of character names and index values
     */
    public HashedDictionary<String, Integer> getHashTable();

    /**
     * Prints the list of characters and the removed characters (indicated by null)
     */
    public void printList();
}
