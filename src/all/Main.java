package all;

public class Main {
    public static void main(String[] args) {
        CharacterDatabaseInterface db = new CharacterDatabase();
        db.addCharacter("FB", 1.47, 47.0, -80);
        db.addCharacter("Ea", 1.86, 71.0, 50);
        db.getHashTable().displayHashTable(); //put this here to show the hash index before enlarging table
        db.addCharacter("Daegon", 1.60, 75.0, 50); //enlarges table and rehashes all entries
        db.addCharacter("Gandalf", 1.68, 82.0, 100);
        db.getHashTable().displayHashTable();
        db.removeCharacter("Daegon");
        db.getHashTable().displayHashTable();
        db.printList();
        System.out.println(db.getCharacter("Gandalf").toString());
        db.getCharacter("Gandalf").change(-200);
        db.getCharacter("Gandalf").injure(99);
        db.getCharacter("Gandalf").heal(49);
        System.out.println(db.getCharacter("Gandalf").toString());

    }
}
