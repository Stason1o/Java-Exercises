package fourthTask.com.endava.complexfigures;

import fourthTask.com.endava.interfaceimpl.Triangle;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle() {
    }

    public IsoscelesTriangle(double firstSide, double secondSide, double hypotenuse, double height) {
        super(firstSide, secondSide, hypotenuse, height);
    }

    @Override
    public double calcArea() {
        this.area = (this.hypotenuse * this.height) / 2;
        return this.area;
    }

    @Override
    public double calcPerimeter() {
        this.perimeter = super.calcPerimeter();
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" + super.toString() + "}" ;
    }
}
