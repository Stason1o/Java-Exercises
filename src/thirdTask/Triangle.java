package thirdTask;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Triangle extends Figure {
    private float firstSide;
    private float secondSide;
    private float hypotenuse;
    private float height;

    public Triangle() {
        super();
    }

    public Triangle(int sides, float firstSide, float secondSide, float hypotenuse, float height) {
        super(sides);
        this.setFirstSide(firstSide);
        this.setSecondSide(secondSide);
        this.setHypotenuse(hypotenuse);
        this.setHeight(height);
    }

    public float getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(float firstSide) {
        this.firstSide = firstSide;
    }

    public float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(float secondSide) {
        this.secondSide = secondSide;
    }

    public float getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(float hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float calcArea(){
        this.area = ((this.getHeight() * this.getHypotenuse()) / 2);
        return area;
    }

    @Override
    public float calcPerimeter(){
        this.perimeter = this.getFirstSide() + this.getSecondSide() + this.getHypotenuse();
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Float.compare(triangle.firstSide, firstSide) != 0) return false;
        if (Float.compare(triangle.secondSide, secondSide) != 0) return false;
        if (Float.compare(triangle.hypotenuse, hypotenuse) != 0) return false;
        return Float.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (firstSide != +0.0f ? Float.floatToIntBits(firstSide) : 0);
        result = 31 * result + (secondSide != +0.0f ? Float.floatToIntBits(secondSide) : 0);
        result = 31 * result + (hypotenuse != +0.0f ? Float.floatToIntBits(hypotenuse) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", hypotenuse=" + hypotenuse +
                ", height=" + height +
                '}';
    }
}
