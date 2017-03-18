package thirdTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();
        list.add(new Circle(0, 3.5f));
        list.add(new Square(4,5));
        list.add(new Triangle(3, 10, 6, 8, 4));

        for(Figure figure: list){
            System.out.println(figure);
            System.out.println("Area: " + figure.calcArea() + "\nPerimeter: " + figure.calcPerimeter());
        }
    }
}
