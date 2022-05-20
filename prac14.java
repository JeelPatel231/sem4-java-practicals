import java.util.Scanner;

public class prac14 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int userInput = 1; // predefined value to initialize userInput but not 0
        int evenPositive = 0;
        int oddNegative = 0;
        while(userInput != 0){
            System.out.print("Enter the number : ");
            userInput = scr.nextInt();

            if(userInput == 0){
                System.out.println("SUM OF EVEN POSTIVE : "+evenPositive);
                System.out.println("SUM OF ODD NEGATIVE : "+oddNegative);
                scr.close();
                break;
            }

            if(userInput % 2 == 0){
                evenPositive += userInput;
                continue;
            }
            if(userInput % 2 == -1){
                oddNegative += userInput;
                continue;
            }
            
            System.out.println("INVALID INPUT");

        }

    }
}
