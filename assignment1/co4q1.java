import java.util.Arrays;
import java.util.ArrayList;

interface CustomList{
    String getItem(int index);
    int getPosition(String item) throws Exception;
    void addItem(Object o);
    void deleteItem(int position);
    void deleteItem(String item) throws Exception;
    String toString();
    int length();
}

class ConcreteList implements CustomList{
    private ArrayList<String> data = new ArrayList<>();

    public String getItem(int index){
        return data.get(index);
    }

    public int getPosition(String item) throws Exception {
        for (int i=0; i < data.size();i++){
            if(data.get(i).equals(item)){
                return i;
            }
        }
        throw new Exception("Item not found in List");
    }

    public void addItem(String o){
        data.addAll(Arrays.asList(o.split(",")));
    }

    public void addItem(Object o){
        data.add(o.toString());
    }

    public void deleteItem(int position){
        data.remove(position);
    }

    public void deleteItem(String item) throws Exception {
        deleteItem(getPosition(item));
    }

    public String toString(){
        return data.toString();
    }

    public int length(){
        return data.size();
    }
}

public class co4q1 {
    public static void main(String[] args) {
        ConcreteList listFromString = new ConcreteList();
        listFromString.addItem("a,b,c,d,12,dog");

        try {
            System.out.println( listFromString.getPosition("d") );
            listFromString.addItem("new");
            listFromString.deleteItem("a");
            listFromString.deleteItem(2);
            System.out.println( listFromString.toString() );
            System.out.println( listFromString.length() );
            System.out.println( listFromString.getItem(1) );
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}