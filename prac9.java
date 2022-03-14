import java.util.Scanner;

public class prac9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("insert x : ");
        int x = obj.nextInt();
        System.out.println("insert y : ");
        int y = obj.nextInt();
        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++){
            if(x%i==0 && y%i==0)
            gcd = i;  
        }
        System.out.printf("GCD of %d and %d is: %d \n", x, y, gcd);  
    }
}
