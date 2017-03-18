package thirdTask;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Figure {
    protected int sides;
    protected float perimeter;
    protected float area;

    public Figure(){
        sides = 0;
        perimeter = 0;
        area = 0;
    }

    public Figure(int sides) {
        this.sides = sides;
    }

    public float calcPerimeter(){ return 0; }

    public float calcArea(){ return 0;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;

        Figure figure = (Figure) o;

        if (sides != figure.sides) return false;
        if (Float.compare(figure.perimeter, perimeter) != 0) return false;
        return Float.compare(figure.area, area) == 0;
    }

    @Override
    public int hashCode() {
        int result = sides;
        result = 31 * result + (perimeter != +0.0f ? Float.floatToIntBits(perimeter) : 0);
        result = 31 * result + (area != +0.0f ? Float.floatToIntBits(area) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "sides=" + sides +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
