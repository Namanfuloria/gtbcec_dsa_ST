package week_5;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
    
    
    HashMap<Integer,Integer> mp = new HashMap<>(); 
    int arr []={1,2,3,4,1,2,3,3,2};
   mp.put(1,2);
   mp.put(3,2);
   mp.put(3,4);
   mp.put(2,2);
   mp.put(3,2);
   mp.put(1,null);
System.out.println(mp);
arr[0]=2;
arr[1]=4;
mp.put(1,1);
mp.put(4,2);
System.out.println(mp.containsKey(3));
System.out.println(mp);
mp.remove(3);
System.out.println(mp);
System.out.println(mp.containsKey(3));
System.out.println(mp.get(4));
// how to iterate over a map
for(Map.Entry m /*this m contain get key & get value*/: mp.entrySet()){
    System.out.println("key value is : "+ m.getKey()+" value is :"+m.getValue());
    // Check the number of keys in the array
    for(int i=0 ; i<arr.length;i++){
        if(mp.containsKey(arr[i])){
            mp.put(arr[i], mp.get(arr[i])+1);
        }
        
    }
}
}
}

