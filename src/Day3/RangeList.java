package Day3;

public class RangeList {

    int [] makeRange(int lower, int upper){
        int[] range = new int[(upper-lower)+1];

        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;
        }

        return range;
    }

    void show(int[] range){

        System.out.print("Tablica: [ ");
        for(int i : range){
            System.out.print(i + " ");
            }
            System.out.println("]");
    }
    public static void main(String[] args) {
        int[] range;

        RangeList rangeList = new RangeList();
        range = rangeList.makeRange(4,13);

        rangeList.show(range);

        /*System.out.print("[ ");
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i]+" ");
        }
        System.out.print("]");*/

    }
}
