public class StaticMember {
    public static void main (String[] args){
        FamilyMember dad = new FamilyMember();
        dad.name = "Piotr";
        dad.age = 39;

        FamilyMember mum = new FamilyMember();
        mum.name = "Katarzyna";
        mum.age = 37;

        FamilyMember kid = new FamilyMember();
        kid.name = "Zosia";
        kid.age = 12;

        show(mum);
        show(dad);
        show(kid);
        FamilyMember.surname = "Kowalska";
        show(mum);

    }

    static void show(FamilyMember familyMember){
        System.out.print(familyMember.name);
        System.out.print(" ");
        System.out.print(familyMember.surname);
        System.out.print(" ");
        System.out.print(familyMember.age);
        System.out.println(" lat/a");
    }
}

class FamilyMember {
    static String surname = "Nowak";
    String name;
    int age;
}