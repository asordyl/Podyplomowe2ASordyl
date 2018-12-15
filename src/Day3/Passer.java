package Day3;

import java.awt.*;

public class Passer {
    public static void main(String[] args) {

        Passer passer = new Passer();

        /*System.out.println(passer.point);
        passer.changePoint(passer.point);
        System.out.println(passer.point);

        System.out.println(passer.x);
        passer.changeX(passer.x);
        System.out.println(passer.x);*/

        passer.toUpperCase(args);
        for (String str : args) {
            System.out.println(str);
        }
    }

    Point point = new Point(1,1);
    int x = 1;
    void changeX(int x){
        x = 8;
    }

    void changePoint(Point point){
        point.x = 7;
        point.y = 9;
    }

    void toUpperCase(String[] text){
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();
        }
    }
}
