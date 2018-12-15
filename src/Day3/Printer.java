package Day3;

public class Printer {

    int x = 0;
    int y = 1;

    void printMe(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());
    }
}
