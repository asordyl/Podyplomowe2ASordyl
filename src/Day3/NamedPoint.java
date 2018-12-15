package Day3;

import java.awt.*;

public class NamedPoint extends Point {

    String name;

    public NamedPoint(int x, int y, String name) {
        //super(x, y);
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5,5,"SmallPoint");
        System.out.println("x = " + np.x);
        System.out.println("y = " + np.y);
        System.out.println("name = " + np.name);
    }
}
