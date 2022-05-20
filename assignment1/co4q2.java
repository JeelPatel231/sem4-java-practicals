import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
public class co4q2 {
    public static void main(String[] args) throws IOException {
        Scanner myReader = new Scanner(new File("file.txt"));
 
        String line;
        int characterCount = 0;
        int lineCount = 0;
  
        while (myReader.hasNextLine()) {
            line = myReader.nextLine();
            characterCount += line.length();
            lineCount++;
        }
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Total number of lines = "+ lineCount);
    }
}