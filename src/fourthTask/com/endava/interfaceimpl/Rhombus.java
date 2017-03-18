package fourthTask.com.endava.interfaceimpl;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Rhombus extends Square {
    private double diagonal1;
    private double diagonal2;

    public Rhombus() {
    }

    public Rhombus(double side, double diagonal1, double diagonal2) {
        super(side);
        this.setDiagonal1(diagonal1);
        this.setDiagonal2(diagonal2);
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calcPerimeter() {
        this.perimeter = super.calcPerimeter();
        return this.perimeter;
    }

    @Override
    public double calcArea() {
        this.area = (this.getDiagonal1() * this.getDiagonal2()) / 2;
        return this.getArea();
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "diagonal1=" + diagonal1 +
                ", diagonal2=" + diagonal2 +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
