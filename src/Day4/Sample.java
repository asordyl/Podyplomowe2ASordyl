package Day4;

public class Sample {
    //public static final double PI = 3.14;

    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.setCounter(3);
        aaa.setName("Arek");
//        BBB bbb = new BBB();
//        bbb.show();
        System.out.println(aaa.getCounter());
        System.out.println(aaa.getName());

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveClothes();
        washingMachine.showSettings();
        washingMachine.modeForTowelsAndBedLinen();
        washingMachine.showSettings();

        Rectangle rectangle = new Rectangle("czerwony", 14, 5);
        rectangle.show();
    }


    static synchronized protected final void specialMethod(){

    }
}

class AAA {
    int counter;
    String name;

    final public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter > 20){
            System.out.println("Przekroczyłeś zakres");
        }
        else if (counter < 0) {
            System.out.println("Nie możesz ustawić wartości ujemnej");
        } else {
            System.out.print("Ustawiamy licznik: ");
            this.counter = counter;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class BBB extends AAA {
    void show(){
        System.out.println("licznik: " + getCounter());
        System.out.println("nazwa: " + name);

    }

    /*public int getCounter() {

    }*/
}