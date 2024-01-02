package org.penateam;

/**
 * This is abstract base class for animal entity that we will be using
 *
 * @author Akbar
 * @version 1.0
 * @since 1.0
 */
public abstract class Animal {
    /**
     * The animal name
     */
    protected String name;

    /**
     * <p>
     *     The animal name in <b>year</b>
     * </p>
     */
    protected int age;

    /**
     * Animal base class constructor
     *
     * @param name The animal name
     * @param age The animal age in year
     * @throws InvalidAgeException happen when the age is less than zero
     */
    public Animal(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }

        this.name = name;
        this.age = age;
    }

    /**
     * Animal base class constructor
     *
     * @param name The animal name
     * @param age The animal age in year
     * @throws InvalidAgeException happen when the age is less than zero
     * @deprecated
     */
    public Animal(int age, String name) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }

        this.name = name;
        this.age = age;
    }

    /**
     * Getter for animal name
     *
     * @return The animal name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for animal age
     *
     * @return the animal age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Tell the animal to eat
     */
    abstract public void eat();

    /**
     * Getter for animal species name that follow binomial nomenclature rule
     *
     * @return animal species name
     */

    abstract public String getSpecies();

    /**
     * Method to check whether the animal is friendly or not
     *
     * @return true if the animal is friendly
     */

    abstract public boolean isFriendly();
}
