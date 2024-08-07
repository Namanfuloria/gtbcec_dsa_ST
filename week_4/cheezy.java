package week_4;

public class cheezy {
    static int sum=0;
    static void sumArray(int arr[],int i,int k){
        //  int sum = 0;
         if(i==arr.length || i==k)return;
        // for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
          if(sum>k){
            sum -=arr[i];
            return;
          }
          sumArray(arr,i+1,k);

        //   System.out.println(sum);
        //             }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        sumArray(arr,0,15);
        System.out.println(sum);
    }
}
