import java.util.Random;

public class prac10 { 
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 100; i++){
            System.out.format("%d ",random.nextInt(49));
        }
        System.out.println();
    }
}