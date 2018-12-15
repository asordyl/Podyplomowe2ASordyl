package Day3;

public class SubPrinter extends Printer{
    int z = 3;

    void printMe(){
        super.printMe();
        System.out.println("z = " + z);
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
        System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());
    }
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printMe();

        System.out.println("------------------------------------------");

        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
    }
}
