public class Sample {
    public static void main (String[] args){

        /*byte a = 7;
        short b;
        int c;

        c = a;
        b = (short)c;*/

        /*int a = 5;
        double b = 13.5;
        double c = b/a;
        int d = (int)b/a;

        System.out.println(c +", " + d);*/

        /*Employeee emp = new Employeee();
        VicePresident vp = new VicePresident();

        vp = (VicePresident)emp; //niezalecane*/

        int a = 67;
        if (a<0) {
            System.out.println("a mniejsze od 0");
        } else if (a>0){
            System.out.println("a większe od 0");
        } else {
            System.out.println("a równe 0");
        }

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Very good");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("Very bad");
        }

        boolean isOK = false;
        do {
            System.out.println("Jest OK");
        } while (isOK);
        System.out.println("Nie jest dobrze!");

        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 4;
            if (i == 100) {
                arr[i] = 5;
            }
        }

        for (int i : arr) {
            if (i == 5) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

        int[] arr2 = {4,6,8,9,89,45,34};


    }

   /* class Employeee {};
    class VicePresident extends Employeee {};*/


}
