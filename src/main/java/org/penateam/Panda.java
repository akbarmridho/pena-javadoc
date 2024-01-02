package org.penateam;

/**
 * Class for Panda entity
 *
 * @author Akbar
 * @version 1.0
 * @since 1.0
 * @see Animal
 * @animalclass Mammal
 */
public class Panda extends Animal {
    /**
     * Species name for Panda
     */
    protected static final String species = "Pandamus Maximus";

    /**
     * Panda base class constructor
     *
     * @param name The panda name
     * @param age The panda age in year
     * @throws InvalidAgeException happen when the age is less than zero
     */
    public Panda(String name, int age) throws InvalidAgeException {
        super(name, age);
    }

    /**
     * Tell Panda to eat. <br/>
     * Will print <b>Yum yum yum</b>
     */
    @Override
    public void eat() {
        System.out.println("Yum yum yum");
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public boolean isFriendly() {
        return true;
    }
}