package all;

public class Main {
    public static void main(String[] args) {
        CharacterDatabaseInterface db = new CharacterDatabase();
        db.addCharacter("FB", 1.47, 47.0, -80);
        db.addCharacter("Ea", 1.86, 71.0, 50);
        db.addCharacter("Daegon", 1.86, 71.0, 50);
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
