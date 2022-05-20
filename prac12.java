import java.util.Scanner;

public class prac12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int rows = 4;
        int column = 4;
        
        int arr[][] = new int[rows][column];
        
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < column ; k++){
                System.out.print("Enter Matrix element ["+i+"]["+k+"] : ");
                arr[i][k] = scr.nextInt();
            }
        }

        System.out.println("Row sum : ");
        for(int i = 0; i < rows; i++){
            int answer = 0;
            for(int k = 0; k < column ; k++){
                answer += arr[i][k];
            }
            System.out.println(answer);
        }

        System.out.println("column sum : ");
        for(int i = 0; i < column; i++){
            int answer = 0;
            for(int k = 0; k < rows ; k++){
                answer += arr[k][i];
            }
            System.out.println(answer);
        }
        
        scr.close();
    }
}
