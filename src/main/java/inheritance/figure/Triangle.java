package inheritance.figure;

public class Triangle implements Figure {
    public double height;
    public double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }


    @Override
    public double area() {
        return (height*base)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
