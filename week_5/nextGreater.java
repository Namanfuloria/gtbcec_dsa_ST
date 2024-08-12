package week_5;
import java.util.*;
public class nextGreater{

        public static void main(String[] args) {
            int[] arr = { 4, 2, 9, 7, 5,1, 3, 6, 8, 0 };
            int n = arr.length;
            int[] nextGreater = new int[n];
            for (int i = 0; i < n; i++) {
                nextGreater[i] = -1;
            }
    
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] < arr[j]) {
                        nextGreater[i] = arr[j];
                        break;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(nextGreater[i] + " ");
            }
        }
    
    }

