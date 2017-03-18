package fourthTask.com.endava.interfaceimpl;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Circle extends Figure{
    protected double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public double calcPerimeter() {
        this.area = Math.PI * Math.pow(this.getDiameter()/2, 2) / 2;
        return area;
    }

    @Override
    public double calcArea() {
        this.perimeter = 2 * Math.PI * (this.getArea() / 2);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                '}';
    }
}
