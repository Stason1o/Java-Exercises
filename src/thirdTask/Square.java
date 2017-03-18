package thirdTask;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Square extends Figure{
    private int side;

    public Square() {
    }

    public Square(int sides, int side) {
        super(sides);
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public float calcArea(){
        area = (float)(Math.pow(this.getSide(), 2));
        return area;
    }

    @Override
    public float calcPerimeter(){
        perimeter = (float)(4 * this.getSide());
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return side == square.side;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + side;
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
