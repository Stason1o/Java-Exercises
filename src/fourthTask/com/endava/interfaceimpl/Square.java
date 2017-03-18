package fourthTask.com.endava.interfaceimpl;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Square extends Figure {
    protected double sideLength;

    public Square() {
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(double sideLength) {
        this.sides = 4;
        this.setSideLength(sideLength);
    }

    @Override
    public double calcPerimeter() {
        area = Math.pow(sideLength, 2);
        return area;
    }

    @Override
    public double calcArea() {
        perimeter = 4 * this.getSideLength();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", area=" + calcArea() +
                ", perimeter" + calcPerimeter() +
                '}';
    }

}
