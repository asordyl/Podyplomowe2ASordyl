import java.util.Locale;

public class StringFormatter {
    public static void main (String[] args){
        int accountBalance = 15_005;
        System.out.printf("Saldo : %,d zł %n", accountBalance);  //d - format liczby całkowite

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.6f", pi); //f - format liczby zmiennoprzecikowej
        System.out.println(" ");
        System.out.printf(new Locale("us"), "%.6f", pi);
    }
}
