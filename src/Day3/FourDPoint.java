package Day3;

import java.awt.*;

public class FourDPoint extends Point {

    int v;
    int z;

    public FourDPoint(int v, int x, int y, int z) {
        super(x, y);
        this.v = v;
        this.z = z;
    }

    public static void main(String[] args) {
        FourDPoint fdp = new FourDPoint(0,5,10, 15);
        System.out.println("FourDPoint: <" + fdp.v + "," + fdp.x + "," + fdp.y + "," + fdp.z + ">");
    }
}
