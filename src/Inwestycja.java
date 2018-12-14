public class Inwestycja {
    public static void main(String[] args) {
        double inw = 14000;
        double inwPierwszyRok, inwDrugiRok, inwTrzeciRok;

        inwPierwszyRok = 0.4*inw;
        inw += 0.4*inw;
        System.out.println("Wzrost/spadek inwestycji w 1 roku: " + inwPierwszyRok);
        System.out.println("Wartość inwestycji po 1 roku: " + inw + "\n");

        inwDrugiRok = -1500;
        inw = inw + inwDrugiRok;
        System.out.println("Wzrost/spadek inwestycji w 2 roku o: " + inwDrugiRok);
        System.out.println("Wartość inwestycji po 2 roku: " + inw + "\n");

        inwTrzeciRok = 0.12*inw;
        inw += 0.12*inw;
        System.out.println("Wzrost/spadek inwestycji w 3 roku: " + inwTrzeciRok);
        System.out.println("Wartość inwestycji po 3 roku: " + inw + "\n");

        int x = 23;
        int y = 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Wynik dzielenia INT i reszta: " + x/y +"\t" + x%y);
        double z = 3;
        System.out.println("z = " + z);
        System.out.println("Wynik dzielenia DOUBLE i reszta: " + x/z +"\t" + x%y);

        int a = 125;
        System.out.println("\na = " + a);
        System.out.println("a binarnie: " + Integer.toBinaryString(a));
        System.out.println("a szesnastkowo: " + Integer.toHexString(a));
        System.out.println("a ósemkowo: " + Integer.toOctalString(a));
    }
}
