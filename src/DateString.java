import java.util.StringTokenizer;

public class DateString {
    public static void main (String[] args){
        StringTokenizer str;
        String data = "02/12/2018";
        str = new StringTokenizer(data, "/");

        System.out.println("Dzień: " + str.nextToken());
        System.out.println("Miesiąc: " + str.nextToken());
        System.out.println("Rok: " + str.nextToken());

    }
}
