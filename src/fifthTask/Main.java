package fifthTask;

import fifthTask.com.endava.interfaceimpl.*;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        BritishCat bc = new BritishCat();
        DalmatianDog dd = new DalmatianDog();
        HunterDog hd = new HunterDog();
        KolibriBird kb = new KolibriBird();
        SiameseCat sc = new SiameseCat();
        MutatedAnimal ma = new MutatedAnimal();
        AlbatrossBird ab = new AlbatrossBird();

        bc.move();
        ma.eatAnimals();
        hd.catHunt();
        kb.makeSound();
        dd.lie();
        sc.sleep();
        ab.makeSound();
    }
}
