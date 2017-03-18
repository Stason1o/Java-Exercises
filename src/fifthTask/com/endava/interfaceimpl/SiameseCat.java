package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.interfaces.Cat;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class SiameseCat implements Cat {
    @Override
    public void birdHunt() {
        System.out.println("Jump and eat");
    }

    @Override
    public void move() {
        System.out.println("SLEEEEEEP");
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }

    public void sleep(){
        System.out.println("Zzzzzz");
    }
}
