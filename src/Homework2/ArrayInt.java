package Homework2;

public class ArrayInt {
    public static void main(String[] args) {
        /*Napisz program, który:
        stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
                wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
        wyświetli zawartość tablicy,
                dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
        wyświetli zawartyość przekonwertowanej tablicy,
        fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.*/

        int arrayLenght = Integer.parseInt(args[0]);
        int[] arrayInt;
        int[] arrayIntConv;

        ArrayInt arrayInteger = new ArrayInt();
        arrayInt = arrayInteger.makeArray(arrayLenght);
        arrayInteger.showArray(arrayInt);
        arrayIntConv = arrayInteger.convertArray(arrayLenght);
        arrayInteger.showArrayConv(arrayIntConv);
    }

    int[] makeArray(int arrayLenght){
        int[] arrayInt = new int[arrayLenght];

        for (int i = 1; i <= arrayLenght; i++) {
            arrayInt[(i-1)] = i;
        }

        return arrayInt;
    }

    void showArray(int[] arrayInt){

        System.out.print("Tablica wejściowa: [ ");
        for(int i : arrayInt){
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    int[] convertArray(int arrayLenght){
        int[] arrayIntConv = new int[arrayLenght];

        for (int i = arrayLenght; i >= 1; i--) {
            arrayIntConv[(i-1)] = i;
        }

        return arrayIntConv;
    }

    void showArrayConv(int[] arrayIntConv){

        System.out.print("Tablica skonwertowana: [ ");
        for (int i = arrayIntConv.length; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

}
