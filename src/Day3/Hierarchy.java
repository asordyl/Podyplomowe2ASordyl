package Day3;

public class Hierarchy {
    public static void main(String[] args) {
        //instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
        /*new AA();
        new BB();*/
        new CC();

        //instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
        //instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora
        // (kosntruktory klas bazowych milczą)
        /*new AA(true);
        new BB(true);
        new CC(true);*/
        //new AA(false);
        //new BB(false);
        new CC(true);
        new AA(false);
        new BB(false);
        new CC(false);
    }
}

class AA{
    public AA(){
        System.out.println("-------------");
        System.out.println("konstruuję AA");
    }

    public AA(boolean i){
        if (!i){
            System.out.println("----------------------------------");
            System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());
        }
    }
}

class BB extends AA{
    public BB(){
        System.out.println("konstruuję BB");
    }

    public BB(boolean i){
        super(true);
        if (!i){
            System.out.println("----------------------------------");
            System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());
        }
    }
}

class CC extends BB{
    public CC(){
        System.out.println("konstruuję CC");
    }

    public CC(boolean i){
        super(true);
        if (!i){
            System.out.println("----------------------------------");
            System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());
        }
    }
}