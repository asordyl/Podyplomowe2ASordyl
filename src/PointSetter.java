import java.awt.*;

public class PointSetter {
    public static void main (String[] args){
        Point location = new Point(4, 13);
        System.out.println("Położenie początkowe:");
        PointSetter.show(location);
        PointSetter.changePoint(location, 7, 6);
        PointSetter.show(location, "Położenie końcowe:");
    }

    static void show(Point point){
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

    static void show(Point point, String description){
        System.out.println("\n" + description);
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

    static void changePoint(Point point, int x, int y){
        System.out.println("\nPrzejście do (" + x + "," + y + ")");
        point.x = x;
        point.y = y;
    }
}
