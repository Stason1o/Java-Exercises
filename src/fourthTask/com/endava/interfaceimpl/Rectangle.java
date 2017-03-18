package fourthTask.com.endava.interfaceimpl;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Rectangle extends Square {
    private double longSide;

    public Rectangle() {
    }

    public Rectangle(double longSide) {
        this.longSide = longSide;
    }

    public Rectangle(double side, double longSide) {
        super(side);
        this.setLongSide(longSide);
    }

    public double getLongSide() {
        return longSide;
    }

    public void setLongSide(double longSide) {
        this.longSide = longSide;
    }

    @Override
    public double calcPerimeter() {
        this.perimeter = 2 * sideLength + 2 * longSide;
        return this.getPerimeter();
    }

    @Override
    public double calcArea() {
        this.area = this.getSideLength() * this.getLongSide();
        return this.getArea();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longSide=" + longSide +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
