public class StaticMember {
    public static void main (String[] args){
        FamillyMember dad = new FamillyMember();
        dad.name = "Piotr";
        dad.age = 39;

        FamillyMember mum = new FamillyMember();
        mum.name = "Katarzyna";
        mum.age = 37;

        FamillyMember kid = new FamillyMember();
        kid.name = "Zosia";
        kid.age = 12;

        show(mum);
        show(dad);
        show(kid);
        FamillyMember.surname = "Kowlaska";
        show(mum);

    }

    static void show(FamillyMember familyMember){
        System.out.print(familyMember.name);
        System.out.print(" ");
        System.out.print(familyMember.surname);
        System.out.print(" ");
        System.out.print(familyMember.age);
        System.out.println(" lat/a");
    }
}

class FamillyMember {
    static String surname = "Nowak";
    String name;
    int age;
}