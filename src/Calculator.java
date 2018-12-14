public class Calculator {
    public static void main (String[] args){
        //Wersja ze stałymi
        int a = 4;
        int b = 6;
        System.out.println("Wersja ze stałymi:");
        System.out.println("Suma: " + calculateSUM(a, b));
        System.out.println("Różnica: " + calculateDIFF(a, b));
        System.out.println("Iloczyn: " + calculateMULTI(a, b) + "\n");

        //Wersja z odczytaniem parametrów
        int c = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        System.out.println("Wersja z odczytaniem parametrów:");
        System.out.println("Suma: " + calculateSUM(c, d));
        System.out.println("Różnica: " + calculateDIFF(c, d));
        System.out.println("Iloczyn: " + calculateMULTI(c, d) + "\n");

    }

    static int calculateSUM(int x, int y)
    {
        int c = Math.addExact(x, y);
        return c;
    }

    static int calculateDIFF(int x, int y)
    {
        int c = Math.subtractExact(x, y);
        return c;
    }

    static int calculateMULTI(int x, int y)
    {
        int c = Math.multiplyExact(x, y);
        return c;
    }
}
