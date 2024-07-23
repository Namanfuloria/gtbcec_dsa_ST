package week_2;

public  class nsl{
//NEXT SMALLEST TO THE left
    static void display(int[]arr){
        for(int i:arr)
System.out.println(i+" ");
System.out.println();   
 }
 //NEXT SMALLEST TO THE RIGHT , CURRENT IS NOT INCLUDED
 static void NSRNI(int[]nums,int[]arr){
    int minR=100;
    for(int i=0;i<nums.length;i++){
        arr[i]=minR;//store
        minR=Math.min(minR,nums[i]);//Update
    }
 }
//NEXT SMALLEST ELEMENT TO THE RIGHT,CURRENT INCLUDED
static void NSRCI(int[]nums,int[]arr){
    int minR=100;
    for(int i=0;i<nums.length;i++){
        minR=Math.min(minR,nums[i]);//update
        arr[i]=minR;//store
    }
 } 
 public static void main(String[] args) {   
    int[]nums={2,3,1,8,7,3,4};
    int []arr=new int[nums.length];
    NSRNI(nums,arr);
    display(arr); 
    NSRCI(nums, arr);
    display(arr);
}
}
