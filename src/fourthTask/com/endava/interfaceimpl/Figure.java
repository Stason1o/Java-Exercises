package fourthTask.com.endava.interfaceimpl;

import fourthTask.com.endava.interfaces.Shape;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public abstract class Figure implements Shape {
    public int sides;
    public double perimeter;
    public double area;

    public Figure() {
    }

    public Figure(int sides, double perimeter, double area) {
        this.sides = sides;
        this.perimeter = perimeter;
        this.area = area;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "{" +
                "sides=" + sides +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
