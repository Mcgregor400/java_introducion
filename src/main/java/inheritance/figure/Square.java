package inheritance.figure;

public class Square implements Figure {
    public double bok;

    public Square(double bok) {
        this.bok = bok;
    }

    @Override
    public double area() {
        return bok*bok;
    }

    @Override
    public String toString() {
        return "Square{" +
                "bok=" + bok +
                '}';
    }
}
