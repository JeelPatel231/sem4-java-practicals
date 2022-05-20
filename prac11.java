import java.util.Scanner;

public class prac11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter the number of rows : ");
        int rows = scr.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = scr.nextInt();
        
        int arr[][] = new int[rows][column];
        
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < column ; k++){
                System.out.print("Enter Matrix element ["+i+"]["+k+"] : ");
                arr[i][k] = scr.nextInt();
            }
        }

        System.out.println("Matrix form : ");
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < column ; k++){
                System.out.print(arr[i][k]+"\t");
            }
            System.out.println();
        }
        
        scr.close();
    }
}
