public class EqualsTester {
    public static void main (String[] args){

        /*String str1, str2, str3;
        str1 = "raz dwa trzy";
        str2 = "raz dwa trzy";
        str3 = new String("raz dwa trzy");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Czy ten sam obiekt?  " + (str1 == str2)); //porównanie obiektów, nie zawartości
        System.out.println("Czy ten sam obiekt?  " + (str1 == str3)); //porównanie obiektów, nie zawartości
        System.out.println("Czy ta sama wartość?  " + (str1.equals(str2))); //porównanie zawartości*/

        String name = "Tomek";
        System.out.println(name.getClass());
        System.out.println(name.getClass().getName());
        System.out.println(name.getClass().getSimpleName());

        System.out.println();
        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);

        Object object = new Object();
        object = name;
        System.out.println(object instanceof Integer);

    }
}
