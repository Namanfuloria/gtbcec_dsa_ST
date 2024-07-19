package Week_1;
public class subArray{
/*public static void subArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++)
            System.out.print(arr[k]);
            System.out.println();
        }
    }
}
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
subArray(arr);
}*/
/*/ sum of subArray 
public static void subArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];}
            System.out.println(sum);
        }
    }
}
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
subArray(arr);
}*/
//FIND THE MAXIMUM SUM FROM ALL THE SUB ARRAYS
public static void subArray(int[]arr){
    int maxSum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++)
            sum+=arr[k];
            maxSum=Math.max(sum,maxSum);
        }
    }
    System.out.println(maxSum);
}
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
subArray(arr);
}  
/*/ kadane algo
int KadaneAlgo(int[]arr){
    int maxSum=Integer.MIN_VALUE;
    int currSum=0;
    for(int i=0;i<arr.length;i++){
        currSum+=arr[i];
        maxSum=Math.max(currSum,maxSum);
        if(currSum<0)
        currSum=0;
    }
    return maxSum;
}
public int maxSubArray(int[]nums){
    return KadaneAlgo(nums);
}*/
/*ARRAY IS GIVEN FOR EG:
|1|2|3|4|5|6|7|
SO ROTATE BY 1 WHICH MEANS
|7|1|2|3|4|5|6|
*/
/* 
public class Practice {
    public static void RotatedByOne(int[]arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        arr[i]=arr[i-1];
   arr[0]=temp;
    }  
//rotate by an array
    class Solution {
        public void rotate(int[] nums, int k) {
        int[]arr=new int[nums.length];
        for(int i=0;i<arr.length;i++)
        arr[(i+k)%arr.length]=nums[i];
        //Shallow copy
        //nums=arr;
        //Deep copy
        for(int i=0;i<arr.length;i++)
        nums[i]=arr[i];

    }
    }

}
*/
/*/ reverse of an array
    public void reverse(int[]nums,int i,int j) {
        //REVERSE
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[]nums,int k){
        //reverse(nums,2,4);
        k%=nums.length;
        reverse(nums,0,nums.length-1);
         reverse(nums,0,k-1);
          reverse(nums,k,nums.length-1);
    }*/
}
