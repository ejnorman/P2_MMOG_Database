package all;

public interface CharacterDatabaseInterface {

    public void addCharacter(String name, double height, double weight, int moral);

    public void removeCharacter(String name);

    public Character getCharacter(String name);

    public HashedDictionary<String, Integer> getHashTable();

    public void printList();
}
