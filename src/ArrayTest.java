import java.awt.*;

public class ArrayTest {
    public static void main (String[] args){

        Point[] points = {new Point(1,1), new Point(2,3), new Point(4,1)};
        String[] titles = {"Pani","Pan","Państwo","Panna","Doktor"};
        System.out.println(points[0].x);
        System.out.println(titles[4]);

        System.out.println(points.length);


    }
}
