package Revison;
import java.util.*;
public class array {
    // function class of displaying an array
    public static void displayArray(int [] arr){
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static int lengthNumber(int n){
        int count = 0;
        int temp=n;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int arr[]= new int [10];
        arr[1]=1;
        arr[3]=3;
        arr[9]=9;
        arr[8]=8;
        arr[2]=2;
// arr=sc.nextInt();
     displayArray(arr);
    // System.out.println(arr[5]);
    lengthNumber(10);
    }
}
