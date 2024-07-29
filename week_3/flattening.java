package week_3;

public class flattening {
        static int[]flayArray(int[][]arr){
        int rows=arr.length,cols=arr[0].length;
        int[]nums=new int[rows*cols];
            for(int i=0;i<rows;i++)
                for(int j=0;j<cols;j++){
                   nums[arr[0].length*i+j]=arr[i][j]; 
            }
            return nums;
    }

    static void display(int[]nums){
    for(int i:nums)
    System.out.println(i+" ");
    System.out.println();
    }
    public static void main(String[] args) {
        int[][]arr={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
                    {10,11,12}};
        int[]nums=flayArray(arr);
        display(nums);
    } 
}
