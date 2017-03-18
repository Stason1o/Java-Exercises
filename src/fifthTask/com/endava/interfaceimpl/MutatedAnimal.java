package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.parents.AlienAnimal;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class MutatedAnimal extends AlienAnimal {
    @Override
    public void move() {
        System.out.println("I move slowly but i can teleport");
    }

    @Override
    public void makeSound() {
        System.out.println("THE COMBINATION OF MEOW, GAV, ARRRRRRRR, etc.");
    }
}
