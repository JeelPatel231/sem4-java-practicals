import java.util.PriorityQueue;

class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
    MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
    }
}

public class prac20 {
    public static void main(String[] args) {   
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
    
        try{
            MyPriorityQueue<String> queue1 = (MyPriorityQueue<String>)(queue.clone());
            System.out.println(queue1);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
