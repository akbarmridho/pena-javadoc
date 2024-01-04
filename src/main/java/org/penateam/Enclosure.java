package org.penateam;

import java.util.ArrayList;

/**
 * Class that hold one class of {@link org.penateam.Animal}
 *
 *
 * {@snippet class=EnclosureExample region=main}
 * @param <T> Derivative class that extend Animal abstract class
 */
public class Enclosure<T extends Animal> {
    /**
     * Instance of animals holder
     *
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList reference</a>
     */
    private final ArrayList<T> animals;

    /**
     * Default constructor
     */
    public Enclosure() {
        this.animals = new ArrayList<>();
    }

    /**
     * Getter to get animal count inside the enclosure
     *
     * @return The animal count inside the enclosure
     */
    public int getAnimalCount() {
        return this.animals.size();
    }

    /**
     * Method to add an animal to enclosure
     *
     * @param animal animal to add
     */
    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    /**
     * Method to get animal that reside at certain index inside the enclosure
     *
     * @param i animal index
     * @return The animal instance
     * @throws IndexOutOfBoundsException When i < 0 or i >= enclosure size
     */
    public T getAnimalAt(int i) {
        return this.animals.get(i);
    }

    /**
     * Method to remove animal that reside at certain index inside the enclosure
     *
     * @param i animal index
     * @throws IndexOutOfBoundsException When i < 0 or i >= enclosure size
     */
    public void removeAnimalAt(int i) {
        this.animals.remove(i);
    }

    /**
     * Method to check if the enclosure is empty
     *
     * @return true if the enclosure is empty
     */
    public boolean isEmpty() {
        return this.animals.isEmpty();
    }

    /**
     * Method that will describe the enclosure and print it to stdout
     */
    public void describe() {
        if (this.isEmpty()){
            System.out.println("This enclosure is empty ...");
        } else {
            System.out.println("This enclosure contain " + this.getAnimalCount() + " animals;");
            for(int i = 0; i < this.getAnimalCount(); i++){
                System.out.println((i+1) + ". " + this.getAnimalAt(i).getName() + ", species " + this.getAnimalAt(i).getSpecies() + ", age " + this.getAnimalAt(i).getAge() + " year");
            }
        }
    }

    /**
     * Method that will tell every animal inside the enclosure to eat
     */
    public void feed() {
        if (this.isEmpty()){
            System.out.println("This enclosure is empty ...");
        } else {
            for (Animal animal : this.animals) {
                animal.eat();
            }
        }
    }

    /**
     * Method that will check if there's an animal that not friendly inside the enclosure
     * {@snippet :
     *      var enclosure = new Enclosure<Panda>();
     *      // add some pandas
     *      if (enclosure.safeForPetting()) {
     *          enclosure.feed();
     *      }
     * }
     * @return true if all animal inside enclosure is friendly
     */
    public boolean safeForPetting() {
        for(Animal animal : this.animals) {
            if (!animal.isFriendly()) {
                return false;
            }
        }

        return true;
    }
}
