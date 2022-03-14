import java.util.Scanner;

public class prac10 {
    public static void main(String[] args) {
        Candidate cand1 = new Candidate();
        cand1.getDetails();
        cand1.displayDetails();
    }
}

class Candidate{
    String name;
    double id;
    int age;
    double weight;
    double height;

    void getDetails(){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("enter name:");
        name = scannerObj.nextLine();
        System.out.println("enter id:");
        id = scannerObj.nextDouble();
        System.out.println("enter age:");
        age = scannerObj.nextInt();
        System.out.println("enter weight:");
        weight = scannerObj.nextDouble();
        System.out.println("enter height:");
        height = scannerObj.nextDouble();
    }
    void displayDetails(){
        System.out.println("\nCANDIDATE DETAILS:");
        System.out.println("id: "+id+"\nname : "+name+"\nage: "+age+"\nweight: "+weight+"\nheight: "+height);
    }

}