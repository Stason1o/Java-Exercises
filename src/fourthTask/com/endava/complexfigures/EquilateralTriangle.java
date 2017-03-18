package fourthTask.com.endava.complexfigures;

import fourthTask.com.endava.interfaceimpl.Triangle;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle() {
    }

    public EquilateralTriangle(double firstSide, double secondSide, double hypotenuse, double height) {
        super(firstSide, secondSide, hypotenuse, height);
    }

    @Override
    public double calcArea() {
        this.area = Math.pow(this.firstSide, 2) * Math.sqrt(3) / 4;
        return this.area;
    }

    @Override
    public double calcPerimeter() {
        this.perimeter = super.calcPerimeter();
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" + super.toString() + "}" ;
    }
}
