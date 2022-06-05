import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class prac17 {
  public static void main(String[] args) {
    Random random = new Random(1000);
    try {
      FileWriter myWriter = new FileWriter("123.txt");
      for (int i = 0; i < 100; i++){
          myWriter.write(random.nextInt(100)+" ");
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
