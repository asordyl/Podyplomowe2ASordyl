package Day3;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Bear("Uszatek");
        animals[2] = new Cat("Filemon");
        animals[3] = new Pig("Prosiaczek");
        animals[4] = new Tiger("Tygrysek");
        animals[5] = new Animal();

        for (Animal animal : animals) {
            animal.introduce();
        }
    }
}

class Animal{
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String ShowName(){
        return "zwierzę " + name;
    }

    String makeSound(){
        return "?????";
    }

    void introduce(){
        System.out.println("Jestem " + ShowName() + ": " + makeSound());
    }
}

class Dog extends Animal{
    public Dog(String name)
    {
        this.name = name;
    }

    @Override
    String ShowName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}

class Cat extends Animal{
    public Cat(String name)
    {
        this.name = name;
    }

    @Override
    String ShowName() {
        return "kot " + name;
    }

    @Override
    String makeSound() {
        return "miau miau";
    }
}

class Pig extends Animal{
    public Pig(String name)
    {
        this.name = name;
    }
}

class Bear extends Animal{
    public Bear(String name)
    {
        this.name = name;
    }

    @Override
    String ShowName() {
        return "miś " + name;
    }

    @Override
    String makeSound() {
        return "grrr grrr";
    }
}

class Tiger extends Animal{
    public Tiger(String name)
    {
        this.name = name;
    }

    @Override
    String ShowName() {
        return "tygrys " + name;
    }

    @Override
    String makeSound() {
        return "wrrr wrrr";
    }
}