package Day4;

public class Rectangle extends Shape {
    private int lenght;
    private int width;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(String color, int lenght, int width) {
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double getArea() {
        return lenght * width;
    }

    public void show(){
        System.out.println(this.getClass().getSimpleName() + " kolor: " + getColor() + " pole: " + getArea());
    }
}
