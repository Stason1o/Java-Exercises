package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.interfaces.Dog;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class DalmatianDog implements Dog {
    @Override
    public void catHunt() {
        System.out.println("Hi, my dear! AWRWARRWRWRA");
    }

    @Override
    public void move() {
        System.out.println("RUN FAST");
    }

    @Override
    public void makeSound() {
        System.out.println("WOF");
    }

    public void lie(){
        System.out.println("SLEEEEP");
    }
}
