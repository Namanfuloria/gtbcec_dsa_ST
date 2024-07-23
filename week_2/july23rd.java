package week_2;

public class july23rd {
    

    // public int maxProfit(int[] prices) {
    //     int maxProfit=0;
    //     int minElement=Integer.MAX_VALUE;
    //      for(int i:prices){
    //   //    int currElement=arr[i];
    //        minElement=Math.min(minElement,i);
    //       maxProfit = Math.max(maxProfit,i- minElement);
    //      } return maxProfit;
    // }

    //NEXT GREATEST TO THE RIGHT also CURRENT ELEMENT IS NOT INCLUDED
    static void display(int[]arr){
        for(int i:arr)
System.out.println(i+" ");
System.out.println();   
 }
 static void NGRNI(int[]nums,int[]arr){
    int maxR=0;
    for(int i=nums.length-1;i>=0;i--){
        arr[i]=maxR;//store
        maxR=Math.max(maxR,nums[i]);//Update
    }
 }
 //NEXT GREATEST ELEMENT TO THE RIGHT,CURRENT 
 static void NGRCI(int[]nums,int[]arr){
    int maxR=0;
    for(int i=nums.length-1;i>=0;i--){
        maxR=Math.max(maxR,nums[i]);//update
        arr[i]=maxR;//store
    }
 } 
    public static void main(String[] args) {
        
        int[]nums={2,3,1,8,7,3,4};
        int []arr=new int[nums.length];
        NGRNI(nums,arr);
        display(arr); 
        NGRCI(nums, arr);
        display(arr);
    }
}


