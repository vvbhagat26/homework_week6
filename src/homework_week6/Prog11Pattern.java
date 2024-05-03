package homework_week6;
/**Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */
public class Prog11Pattern {
    public static void main(String[] args) {
        Prog11Pattern t = new  Prog11Pattern();
        System.out.println("---------------------------------------------");
        t.javaPattern();
    }
    // Printing the Java Pattern
    public void javaPattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}
