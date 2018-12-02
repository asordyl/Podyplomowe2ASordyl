public class ListYear extends DayCounter{
    public static void main (String[] args){

       int year = 2016;

       for (int i = 1; i <= 12; i++) {

           for (int d = 1; d <= DayCounter.countDays(i, year); d++)
                System.out.println(d +"/"+ i + "/" + year);
           }
       }
}
