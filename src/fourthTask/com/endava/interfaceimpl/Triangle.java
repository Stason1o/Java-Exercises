package fourthTask.com.endava.interfaceimpl;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Triangle extends Figure{
    protected double firstSide;
    protected double secondSide;
    protected double hypotenuse;
    protected double height;

    public Triangle() {
    }

    public Triangle(double firstSide, double secondSide, double hypotenuse, double height) {
        this.setFirstSide(firstSide);
        this.setSecondSide(secondSide);
        this.setHypotenuse(hypotenuse);
        this.setHeight(height);
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcPerimeter() {
        this.area = ((height * hypotenuse) / 2);
        return area;
    }

    @Override
    public double calcArea() {
        this.perimeter = firstSide + secondSide + hypotenuse;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", hypotenuse=" + hypotenuse +
                ", height=" + height +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
