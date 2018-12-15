package Day3;

import java.awt.*;

class BuildBox2{
    int x1;
    int y1;
    int x2;
    int y2;

    BuildBox2(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    BuildBox2(Point topLeft, Point bottomRight){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }
    BuildBox2(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
    }

    void printBox2(){
        System.out.print("Box2: <");
        System.out.print(x1 + "," + y1);
        System.out.print(",");
        System.out.print(x2 + "," + y2);
        System.out.print(">\n");
    }
}

public class Box2 {
    public static void main(String[] args) {
        BuildBox2 box2;
        System.out.println("Wywołanie buildBox ze współrzędnymi (25,25) i (50,50)");
        box2 = new BuildBox2(25,25,50,50);
        box2.printBox2();

        //z punktami (10,10) i (20,20)

        System.out.println("Wywołanie buildBox z punkatmi (10,10) i (20,20)");
        Point topLeft = new Point(10,10);
        Point bottomRight = new Point(20,20);
        box2 = new BuildBox2(topLeft, bottomRight);
        box2.printBox2();

        //z punktem (12,12) i width/high (30,40)
        System.out.println("Wywołanie buildBox z punktem (12,12) i width/high (30,40)");
        topLeft.x = 12;
        topLeft.y = 12;
        int w = 30;
        int h = 40;
        box2 = new BuildBox2(topLeft, w, h);
        box2.printBox2();
    }


}
