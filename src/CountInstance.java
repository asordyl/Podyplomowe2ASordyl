public class CountInstance {
    public static void main (String[] args){

        Licznik one = new Licznik();
        System.out.println(Licznik.licznik);
        Licznik two = new Licznik();
        System.out.println(Licznik.licznik);
        Licznik three = new Licznik();
        System.out.println(Licznik.licznik);
    }
}
class Licznik{
    static int licznik;
    Licznik(){
        licznik++;
    }
}
