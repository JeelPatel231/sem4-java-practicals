import java.util.Scanner;

public class prac8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("0:addition\n1:subtraction\n2:division\n3:multiplication");
        int operator = obj.nextInt();

        System.out.println("insert a");
        int a = obj.nextInt();
        System.out.println("insert b");
        int b = obj.nextInt();


        switch(operator){
            case 0:
                System.out.println("Addition : " + (a+b));
                break;
            case 1:
                System.out.println("Subtraction : "+(a-b));
                break;
            case 2:
                System.out.println("Division : " + ((float)a/b));
                break;
            case 3:
                System.out.println("Multiplication : "+(a*b));
                break;
        }

    }
}
