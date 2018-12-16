public class Test {
    public static void main(String[] args) {
        pl.edu.wszib.java.PackagePresenter javaPackagePresenter = new pl.edu.wszib.java.PackagePresenter();
        pl.edu.wszib.podyplomowe.PackagePresenter podyplomowePackagePresenter = new pl.edu.wszib.podyplomowe.PackagePresenter();

        Test test = new Test();
        System.out.println("Pakiet klasy test: " + test.getClass().getPackage());

        javaPackagePresenter.showPackage();
        podyplomowePackagePresenter.showPackage();
    }
}
