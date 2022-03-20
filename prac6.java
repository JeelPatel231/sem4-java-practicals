import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        String input = object.nextLine();
        
        switch (input) {
            case "a":
                System.out.println("vowel");
                break;
            case "e":
                System.out.println("vowel");
                break;
            case "i":
                System.out.println("vowel");
                break;
            case "o":
                System.out.println("vowel");
                break;
            case "u":
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }
    }
}
