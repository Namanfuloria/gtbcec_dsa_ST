package week_2;

public class ngl {

        //NEXT GREATEST TO THE LEFT also CURRENT ELEMENT IS NOT INCLUDED
        static void display(int[]arr){
            for(int i:arr)
    System.out.println(i+" ");
    System.out.println();   
     }
     static void NGLNI(int[]nums,int[]arr){
        int maxR=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=maxR;//store
            maxR=Math.max(maxR,nums[i]);//Update
        }
     }
     //NEXT GREATEST ELEMENT TO THE LEFT,CURRENT INCLUDED
     static void NGLCI(int[]nums,int[]arr){
        int maxR=0;
        for(int i=0;i<nums.length;i++){
            maxR=Math.max(maxR,nums[i]);//update
            arr[i]=maxR;//store
        }
     } 
        public static void main(String[] args) {
            
            int[]nums={2,3,1,8,7,3,4};
            int []arr=new int[nums.length];
            NGLNI(nums,arr);
            display(arr); 
            NGLCI(nums, arr);
            display(arr);
        }
    }

