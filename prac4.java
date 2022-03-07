import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double weight = object.nextDouble();
        double height = object.nextDouble();

        double weightInKg = weight*0.45359237;
        double heightInM = height*0.0254;

        System.out.println("Value of BMI = "+(weightInKg/(heightInM*heightInM)));

    }
}
