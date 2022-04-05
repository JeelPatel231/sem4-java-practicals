import java.util.Scanner;

class StringTooLongException extends Exception{
    StringTooLongException(String e){
        super(e);
    }
}

public class c03q1 {
    public static void main(String[] args) throws StringTooLongException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string of atleast 5 letters");

        String str = scn.nextLine();
        scn.close();

        if(str.length() > 5){
            throw new StringTooLongException("String too long, 5 or less letters accepted");
        }
        System.out.printf("Inputted String : %s \n",str);

    }
}
