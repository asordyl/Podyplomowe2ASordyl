package Homework1;

public class Dog extends Animal implements Voice {

    public void showVoice(){

        System.out.println("Hau, hau \n");
    }

    void showDog() {
        Animal animal = new Animal();
        animal.name = "Pies";
        animal.speed = 40;
        System.out.println("Nazwa: " + name);
        System.out.println("Prędkość: " + speed);
        showVoice();
    }
}
