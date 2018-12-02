public class ArrayLister {
    public static void main (String[] args){

        int[][][] array = {{{1},{1,2,3}},{{1,2},{2}}};
        int counti = 0;
        int countj;
        int countk ;
        //System.out.println(array[0][0][0]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("array["+i+"]"+"["+j+"]"+"["+k+"] = " + array[i][j][k]);
                }
            }

        }

        System.out.println();

        /*for (int[][] i : array){
            countj = 0;
            for (int[] j : i) {
                countk = 0;
                for (int k : j) {
                    System.out.println("array["+counti+"]"+"["+countj+"]"+"["+countk+"] = " + k);
                    countk++;
                }
                countj++;

            }
            counti++;
        }*/

    }

}
