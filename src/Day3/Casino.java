package Day3;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Random;

public class Casino {

    public static final int JACKPOT_NEMBER = 10_000;
    public static void main(String[] args) {
        Random random = new Random();
        Jackpot[] jackpots = new Jackpot[JACKPOT_NEMBER];
        Jackpot jackpot = new Jackpot(7,7,7);

        for (int i = 0; i < jackpots.length; i++) {
            jackpots[i] = new Jackpot(random);
            System.out.println(jackpots[i]);
        }

        for (int j = 1; j < jackpots.length; j++) {
            if (jackpot.equals(jackpots[j])){
                System.out.println("Jackpot w " + j + " próbie");
            }
        }

        /*int k = 1;
        do {
            Jackpot jack = new Jackpot(random);
            System.out.println("Jack w " + k + " próbie");
            k = k++;
        }
        while (jackpot.equals(jackpots));*/

    }
}

class Jackpot {

    int x;
    int y;
    int z;

    public Jackpot(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Jackpot(Random random) {
        this.x = draw(random);
        this.y = draw(random);
        this.z = draw(random);
    }

    private int draw(Random random) {
        return random.nextInt(10);
    }

    @Override
    public String toString() {
        return "Jackpot{" +
                "jackpot1=" + x +
                ", jackpot2=" + y +
                ", jackpot3=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jackpot jackpot = (Jackpot) o;
        return x == jackpot.x &&
                y == jackpot.y &&
                z == jackpot.z;
    }


}