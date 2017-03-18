package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.parents.Bird;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class KolibriBird extends Bird {
    @Override
    public void move() {
        System.out.println("FLYYYYYYY");
    }

    @Override
    public void makeSound() {
        System.out.println("i can't write them xD");
    }
}
