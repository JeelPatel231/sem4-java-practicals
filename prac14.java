import java.util.Scanner;

public class prac14 {
    static int bin2dec(String str){
        int answer = 0;
        int len = str.length()-1;

        // scan the string from right to left
        for(int i = len; i >= 0; i--){
        
            // if character is 1, calculate using power and add it to the answer
            if(str.charAt(i) == '1'){
                answer += Math.pow(2, len-i);
                continue;
            }
        
            // if character is 0, ignore
            if(str.charAt(i) == '0') continue;

            // if anything else, throw NumberFormatException
            throw new NumberFormatException("String is not a valid Binary string");
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.print("Enter your binary string : ");
        Scanner s = new Scanner(System.in);
        System.out.println(bin2dec(s.nextLine()));
        s.close(); 
    } 
}
