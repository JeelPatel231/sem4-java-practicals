import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int a[] = new int[3];
        a[0] = scr.nextInt();
        a[1] = scr.nextInt();
        a[2] = scr.nextInt();
 
        Arrays.sort(a);
 
        System.out.printf("%d %d %d\n",a[0],a[1],a[2]);

        scr.close();

    }
}
