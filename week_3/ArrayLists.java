package week_3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        //  ArrayList <Integer>arr=new ArrayList <>(2);//syntax
        // System.out.println(arr);
        // System.out.println(arr.size());

       ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
         arr.add(2);
         arr.add(3);
         arr.add(4);
         arr.add(5);
         System.out.println(arr.get(0));
         System.out.println(arr.get(0));
        // remove
         System.out.println(arr.remove(0));
    //    update
         System.out.println(arr.set(0,10));
        System.out.println(arr);
        System.out.println(arr.get(1));
    // sorting 
    Collections.sort(arr);
    System.out.println(arr);
    }
    
}
