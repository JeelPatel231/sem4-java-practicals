import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        Character input = object.next().charAt(0);
        
        if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
