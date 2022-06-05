import java.util.Random;
import java.util.Scanner;

public class prac12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] arr = new int[100];
        Random random = new Random(1000);
        for (int i = 0; i < 100; i++){
            arr[i] = random.nextInt(1000);
        }

        System.out.print("enter a number between and including 0 and 99 : ");
        System.out.println(arr[scr.nextInt()]);
        
        scr.close();
    }
}
