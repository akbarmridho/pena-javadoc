package org.penateam;

/**
 * Class for Lion entity
 *
 * @author Akbar
 * @version 1.0
 * @since 1.0
 * @see Animal
 * @animalclass Mammal
 */
public class Lion extends Animal {
    /**
     * Species name for Lion
     */
    protected static final String species = "Lionus Maximus";

    /**
     * Lion base class constructor
     *
     * @param name The lion name
     * @param age The lion age in year
     * @throws InvalidAgeException happen when the age is less than zero
     */
    public Lion(String name, int age) throws InvalidAgeException {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public boolean isFriendly() {
        return this.age <= 1;
    }
}