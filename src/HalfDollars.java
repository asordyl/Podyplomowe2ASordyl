public class HalfDollars {
    public static void main(String[] arguments) {
        int[] denver = { 1_700_000, 4_600_000, 2_100_000 };
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;
        int averageC = 0;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 1_800_000;

        for (int i = 0; i < denver.length; i++){
            total[i] = denver[i] + philadelphia[i];
            averageC += total[i];
            System.out.print("Produkcja w " + (i+1) + "-ym roku: ");
            System.out.format("%,d%n", total[i]);
        }
        average = averageC / denver.length;
        System.out.print("Średnia produkcja: ");
        System.out.format("%,d%n", average);

        /*total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];
        average = (total[0] + total[1] + total[2]) / 3;

        System.out.print("Produkcja w 2012: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.format("%,d%n", total[2]);
        System.out.print("Średnia produkcja: ");
        System.out.format("%,d%n", average);*/


        /*int[][][] arr3D = new int[4][][];
        arr3D[0] = new int[2][];
        arr3D[0][0] = new int[2];
        arr3D[0][0][1] = 3;
        arr3D[0][0][0] = 5;
        System.out.println(arr3D[0][0][1]);
        System.out.println(arr3D[0][0][0]);
        //System.out.println(arr3D[0][0][2]);*/

    }
}
