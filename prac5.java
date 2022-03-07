import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        int a = object.nextInt();
        int b = object.nextInt();
        int c = object.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println("sorted = "+list);

    }
}
