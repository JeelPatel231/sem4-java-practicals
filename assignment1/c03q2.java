import java.util.Scanner;

class NegativeXException extends Exception{
      NegativeXException(String e){
        super(e);
    }
}

public class c03q2 {

    static int checkAndThrow() throws NegativeXException{
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        scn.close();
        if (x < 0){
            throw new NegativeXException("Negative value in X coordinate");
        }
        return x;
    }
    
    public static void main(String[] args) throws NegativeXException{
        try{
            checkAndThrow();
        } 
        catch (NegativeXException e) {
            System.out.println(e);
        }
    }
}
