package all;

public class Character {

    private int health;
    private int moral;
    private double weight;
    private double height;
    private String name;

    /**
     * Create Character object with set parameters and base 100 health
     * @param name of character
     * @param height of character in meters
     * @param weight of character in kilograms
     * @param moral of character (between -100 and 100)
     */
    public Character(String name, double height, double weight, int moral) {
        this.moral = moral;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.health = 100;
    }

    /**
     * Get current heath of character
     * @return current health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Give character health, cannot exceed 100 health
     * @param healed amount of health to be given
     */
    public void heal(int healed) {
        this.health += healed;
        if (this.health > 100) {
            this.health = 100;
        }
    }

    /**
     * Remove character health, cannot go below 0 health
     * @param damage amount of health to be removed
     */
    public void injure(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    /**
     * Get current moral alignment value
     * @return moral alignment value
     */
    public int getMoral() {
        return moral;
    }

    /**
     * Change current moral alignment value (cannot be below -100 and cannot be above 100)
     * @param moral negative or positive value to be added
     */
    public void change(int moral) {
        this.moral += moral;
        if (this.moral > 100) {
            this.moral = 100;
        }
        if (this.moral < -100) {
            this.moral = -100;
        }
    }

    /**
     * Get character weight
     * @return character weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set character weight in kilograms
     * @param weight in kilograms
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Get character height
     * @return character height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set character height in meters
     * @param height in meters
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get character name
     * @return character name
     */
    public String getName() {
        return name;
    }

    /**
     * String representation of character attributes (name, height, weight, health, moral)
     * @return String of character sheet
     */
    public String toString(){
        return "\nName: " + name +
                "\nHeight: " + height +
                "\nWeight: " + weight +
                "\nHealth: " + health +
                "\nMoral: " + moral;
    }
}
