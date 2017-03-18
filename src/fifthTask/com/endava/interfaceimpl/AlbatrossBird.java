package fifthTask.com.endava.interfaceimpl;

import fifthTask.com.endava.parents.Bird;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class AlbatrossBird extends Bird {

    @Override
    public void move() {
        System.out.println("I'm flying HIIIIIIGH");
    }

    @Override
    public void makeSound() {
        System.out.println("AronChupa - I'm an Albatraoz");
    }
}
