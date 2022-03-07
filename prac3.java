import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int meter = object.nextInt();
        System.out.println("entered value = "+meter);
        System.out.println("value in feet = "+meter*3.28084);
    }
}
