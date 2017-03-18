package fourthTask.com.endava.complexfigures;

import fourthTask.com.endava.interfaceimpl.Circle;
import fourthTask.com.endava.interfaces.Resizable;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle() {
    }

    public ResizableCircle(double diameter) {
        super(diameter);
    }

    @Override
    public void increase(float param) {
        this.diameter *= param;
    }

    @Override
    public void decrease(float param) {
        this.diameter /= param;
    }

    @Override
    public double calcArea() {
        this.area = super.calcArea();
        return this.area;
    }

    @Override
    public double calcPerimeter() {
        this.perimeter = super.calcPerimeter();
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" + super.toString() + "}";
    }
}
