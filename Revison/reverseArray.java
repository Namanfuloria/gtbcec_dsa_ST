package Revison;
import java.util.*;
public class reverseArray {
    // public static void reverse(int[] nums, int i, int j) {
    //     while (i < j) {
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     for (int k=0; k<nums.length;k++){
    //         System.out.print(nums[k]);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] nums = { 1, 2, 3, 4, 5, 6 };
    //     int i = 0;
    //     int j = nums.length - 1;
    //     reverse(nums, 0, 5);
    // }
    public static void reverseArray1(int []array1){
        int i=0; 
        int j = array1.length-1;
        while (i<j)
        change(array1,i++,j--);
    }
    public static void  change(int [] adii , int i, int j){
        int temp = adii[i];
        adii[i]=adii[j];
        adii[j]=temp;

    }
    public static void printArray(int [ ] arr){
          for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
       }

    public static void main(String[] args) {
        int [] arr1  = { 4 , 5, 7 ,78,9};
        reverseArray1(arr1);
        // change(arr1,1,3 );
    
        printArray(arr1);;
    }

}