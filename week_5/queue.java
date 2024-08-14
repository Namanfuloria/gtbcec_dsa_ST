package week_5;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue <Integer>q=new LinkedList<>();
        // q.elements() gives exception when q is empty
        System.out.println(q.peek());
        // System.out.println(q.remove()); throws exception
        System.out.println(q.poll());
        q.add(1);
        q.add(2);
        q.add(3);
        q.offer(4);//if queue is full then it will give false while add will give exception
        System.out.println(q);
        q.remove();
        System.out.println(q.remove());
        System.out.println(q.poll());//to delete
    }
}
