package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.interfaces.Dog;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class HunterDog implements Dog {
    @Override
    public void catHunt() {
        System.out.println("U CAN RUN, BUT U CAN'T HIDE AHAHAHAHAH");
    }

    @Override
    public void move() {
        System.out.println("VERY FAST RUN");
    }

    @Override
    public void makeSound() {
        System.out.println("GAV GAV");
    }
}
