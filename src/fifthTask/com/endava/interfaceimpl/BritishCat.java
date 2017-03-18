package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.interfaces.Cat;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class BritishCat implements Cat {
    @Override
    public void birdHunt() {
        System.out.println("OMNOMNOM, DELICIOUS!");
    }

    @Override
    public void move() {
        System.out.println("RUN, VASEA, RUN");
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }
}
