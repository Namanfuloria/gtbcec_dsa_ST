package week_5;
import java.util.*;
public class nextGreaterSir {
    static int[] nextGreater(int[] arr) {
        int[] NGE = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            // Step 1
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }
            // Step 2
            if (stk.empty()) {
                NGE[i] = -1;
            } else {
                NGE[i] = stk.peek();
            }
            // Step 3
            stk.push(arr[i]);
        }

        return NGE;
    }

    public static void main(String[] args) {
        int[] arr = { 7,3,4,5,9,2 };
        int[] result = nextGreater(arr);
        for(int n:result){
            System.out.print(n+" ");
        }
}
}

