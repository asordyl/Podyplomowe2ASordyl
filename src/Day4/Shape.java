package Day4;

abstract public class Shape {
    private String color;
    abstract double getArea();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
