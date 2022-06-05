import java.util.InputMismatchException;
import java.util.Scanner;

public class prac11 {
    public static void main(String[] args) {
        while(true){
            try {
                Scanner scr = new Scanner(System.in);
                System.out.print("Enter the number 1 : ");
                int x = scr.nextInt();
                System.out.print("Enter the number 2 : ");
                int y = scr.nextInt();
                System.out.println(x+y);
            } catch(InputMismatchException e) {
                System.out.println("Input mismatch, try again\n\n");
            }
        }
            
    }
}
