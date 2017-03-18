package fourthTask.com.endava.interfaceimpl;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Ellipse extends Circle {
    private double majorDiameter;
    private double minorDiameter;

    public Ellipse() {
    }

    public Ellipse(double majorDiameter, double minorDiameter) {
        this.setMajorDiameter(majorDiameter);
        this.setMinorDiameter(minorDiameter);
    }

    public double getMajorDiameter() {
        return majorDiameter;
    }

    public void setMajorDiameter(double majorDiameter) {
        this.majorDiameter = majorDiameter;
    }

    public double getMinorDiameter() {
        return minorDiameter;
    }

    public void setMinorDiameter(double minorDiameter) {
        this.minorDiameter = minorDiameter;
    }

    @Override
    public double calcPerimeter() {
        this.perimeter = 4 * (Math.PI * this.getMajorDiameter() * this.getMinorDiameter() +
                (this.getMajorDiameter() - this.getMinorDiameter()) / (this.getMajorDiameter() + this.getMinorDiameter()));
        return this.perimeter;
    }

    @Override
    public double calcArea() {
        this.area = Math.PI * minorDiameter * majorDiameter;
        return this.area;
    }


    @Override
    public String toString() {
        return "Ellipse{" +
                "majorDiameter=" + majorDiameter +
                ", minorDiameter=" + minorDiameter +
                ", area=" + calcArea() + ", perimeter=" + calcPerimeter();
    }
}
