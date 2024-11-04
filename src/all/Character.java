package all;

public class Character {

    private int health;
    private int moral;
    private double weight;
    private double height;
    private String name;

    public Character(String name, double height, double weight, int moral) {
        this.moral = moral;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void heal(int health) {
        this.health += health;
    }

    public void injure(int health) {
        this.health -= health;
    }

    public int getMoral() {
        return moral;
    }

    public void change(int moral) {
        this.moral += moral;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "";
    }
}
