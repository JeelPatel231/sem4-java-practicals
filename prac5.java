import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        int a = object.nextInt();
        int b = object.nextInt();
        int c = object.nextInt();

        int abs_max = Math.max(a, Math.max(b, c));
        int abs_min = Math.min(a, Math.min(b, c));
        int mid = 0;

        if (a != abs_max && a != abs_min){ mid = a;}
        if (b != abs_max && b != abs_min){ mid = b;}
        if (c != abs_max && c != abs_min){ mid = c;}

        System.out.printf("sorted : %d %d %d\n",abs_max,mid,abs_min);

    }
}
