import java.util.LinkedList;
import java.util.Scanner;

public class prac19 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("String1");
        ll.add("String2");
        ll.add("String3");
        ll.add("String4");
        ll.add("String5");

        Scanner scn = new Scanner(System.in);
        System.out.println("Search for an element : ");
        String var = scn.nextLine();

        System.out.println(
            ll.contains(var)
        );

        scn.close();
    }
}
