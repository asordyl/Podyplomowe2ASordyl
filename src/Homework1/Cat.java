package Homework1;

public class Cat extends Animal implements Voice {

    void showCat() {
        Animal animal = new Animal();
        animal.name = "Kot";
        animal.speed = 30;
        System.out.println("Nazwa: " + name);
        System.out.println("Prędkość: " + speed);
        showVoice();
    }

    public void showVoice(){
        System.out.println("Miau, miau \n");
    }
}
