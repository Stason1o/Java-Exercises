package thirdTask;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Circle extends Figure {

    private float diameter;

    public Circle() {
    }

    public Circle(int sides, float diameter) {
        super(sides);
        this.setDiameter(diameter);
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public float calcArea(){
        this.area = (float)(Math.PI * Math.pow(this.getDiameter()/2,2)) / 2;
        return area;
    }

    @Override
    public float calcPerimeter(){
        this.perimeter = (float)(2 * Math.PI * (this.getDiameter() / 2));
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Float.compare(circle.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (diameter != +0.0f ? Float.floatToIntBits(diameter) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                '}';
    }
}
