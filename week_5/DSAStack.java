package week_5;
import java.util.*;
public class DSAStack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    Stack<Integer> stk=new Stack<>();
    // Add element to the stack
 stk.push(1);
 stk.push(2);
stk.push(20);
stk.push(200);
System.out.println(stk.peek());//top most value
System.out.println(stk.pop());//last value hta dega 
System.out.println(stk);
System.out.println(stk.search(20));
System.out.println(stk.size()-stk.search(20));
int n=9;
// for(int i=0;i<n;i++){
    // stk.push(i);
    // System.out.println(stk.pop());}
    // for(int i=0;i<n;i++){
    //     int a=sc.nextInt();
    //     stk.push(a);

    // }
    while(sc.hasNextInt()){
        int a= sc.nextInt();
        stk.push(a);
        // System.out.println(stk.peek());

    }
    int n1=sc.nextInt();
        System.out.println("StackSize: "+n1);
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(stk.push(a));

}
while( !stk.isEmpty()){
    System.out.println(stk.pop());
}
System.out.println(stk.search(2));
}
}

