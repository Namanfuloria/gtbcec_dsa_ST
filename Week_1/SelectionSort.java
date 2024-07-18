package Week_1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.*;
public class SelectionSort {
 /* *   // binary search
    static boolean binarySearch(int arr[],int key){
        int start =0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
            return true;}
            if(arr[mid]>key)
            end=mid+1;
        }return false;
    }
    //Find the minimum element from an array:
    static int minimumValue(int[]arr){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        mini=Math.min(mini,arr[i]);
        return mini;
    }
    //ALSO FIND THE MINIMUM ELEMENT INDEX FROM ARRAY:

    static int minimumValuE(int[]arr){
        int mini=0;
        for(int i=1;i<arr.length;i++)
       if(arr[mini]>arr[i])
       mini=i;
        return mini;}
 /*    public static void main(String[] args) {
        int [] arr ={11,23,3,4,5};
       // int min=Collection.max(Arrays.aslist(arr));
        System.out.println(minimumValuE(arr));
    }*/ 
/*/  return the imdex
static int binarySearchnew(int arr[],int key){
    int start =0,end=arr.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(mid==key){
        return 1;}
        if(arr[mid]>key)
        end=mid+1;
    }return -1;}
     lower bound*/
  /*   static int lowerBound(int arr[],int key){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr [mid]==key){
             ans=mid;
            end=mid-1;}
        else if(arr[mid]>key){
            end=mid-1;
        }    else 
        start=mid+1;
        }
        return ans;
        }*/
        // upper bound
        static int upperBound(int arr[],int key){
            int start=0,end=arr.length-1;
            int ans=-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr [mid]==key){
                 ans=mid;
                start=mid+1;}
            else if(arr[mid]>key){
                end=mid-1;
            }    else 
            start=mid+1;
            }
            return ans;
            }
            public static void main(String[] args) {
                int arr[]={1,2,3,4,4,4,4,4,5};
                Arrays.sort(arr);
                System.out.println("sorted array " + Arrays.toString(arr));
                System.out.println("our upperbound index is ");
                System.out.println(upperBound(arr, 4));
            }
            }
