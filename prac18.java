import java.util.ArrayList;
import java.util.List;

class prac18 {

    public static String getElement(ArrayList<String> al, int index){
        try{
            return al.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBounds, returning null.");
            return null;
        }
    }

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>(
            List.of("String1", "String2", "String3","String4","String5")
        );

        System.out.println(
            getElement(al,2)
        );

    }
}