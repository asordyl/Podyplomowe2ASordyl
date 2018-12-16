package pl.edu.wszib.java;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Konstruuję PackagePresenter!");

    }

    public void showPackage(){
        System.out.print("To jest obiekt klasy: " + this.getClass().getName());
        System.out.println(" w pakiecie: " + this.getClass().getPackage());
    }
}
