package Revison;
import java.util.*;
public class reverseArray {
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for (int k=0; k<nums.length;k++){
            System.out.print(nums[k]);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        int j = nums.length - 1;
        reverse(nums, 0, 5);
    }
}