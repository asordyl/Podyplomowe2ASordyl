package Day3;

public class Sample {
    public static void main(String[] args) {
//        new A();
//        new A(1);
//        new A("raz, dwa, trzy");
//        new B();
        new C();
    }

}

class A{
    A(){
        System.out.println("konstruuję A");
    }
    /*A(){
        System.out.println("działa konstruktor domyśłny");
    }
    A(int i){
        System.out.println("działa konstruktor z int = " + i);
    }
    A(String str){
        System.out.println("działa konstruktor ze String = " + str);
    }*/
}

class B extends A{
    public B(){
        System.out.println("konstruuję B");
    }
}

class C extends B{
    public C(){
        System.out.println("konstruuję C");
    }
}