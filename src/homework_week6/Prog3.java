package homework_week6;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Prog3 {
    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Prog3.surname);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Prog3 programme_3 = new Prog3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Prog3 programme_3 = new Prog3();
        programme_3.instanceMethod();
        staticMethod();
    }
}



