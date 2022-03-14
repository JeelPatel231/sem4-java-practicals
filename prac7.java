import java.util.Scanner;

public class prac7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        // To store the values of five subjects
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();

        float percent = (sub_1+sub_2+sub_3+sub_4+sub_5)/5;

     
        System.out.println(percent);
        if(percent <= 35){System.out.println("FAIL");}
        else if(percent <= 45){System.out.println("PASS CLASS");}
        else if(percent <= 60){System.out.println("SECOND CLASS");}
        else if(percent <= 70){System.out.println("FIRST CLASS");}
        else{System.out.println("DISTINCTION");}
    }
}
