package fourthTask;

import fourthTask.com.endava.complexfigures.*;
import fourthTask.com.endava.interfaceimpl.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogdanschi on 16/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();
        list.add(new Circle(3.5));
        list.add(new Square(4));
        list.add(new Triangle(10, 6, 8, 4));
        list.add(new Ellipse(10,15));
        list.add(new EquilateralTriangle(10, 10, 7, 9));
        list.add(new IsoscelesTriangle(10, 10, 10, 8));
        list.add(new Rectangle(3, 5));
        list.add(new ResizableCircle(4));
        list.add(new Rhombus(3,4,5));


        for (Figure figure: list){
            System.out.println(figure);
        }
    }
}
