public class ArrayCopier {
    public static void main(String[] args){
        int[] arrSrc = {7,4,8,1,4,1,4};
        double[] arrTarget = new double[arrSrc.length];

        System.out.print("arrSrc: [");
        for (int i = 0; i < arrSrc.length; i++) {
            System.out.print(arrSrc[i] + " ");
        }
        System.out.print("]");

        int count = 0;

        System.out.print("\narrTarget: [");
        while (count < arrSrc.length && arrSrc[count] != 1) {
            arrTarget[count] = arrSrc[count];
            System.out.print(arrTarget[count++] + " ");
        }
        System.out.print("]");
    }
}
