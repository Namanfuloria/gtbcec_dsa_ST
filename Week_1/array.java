package Week_1;
class array{
  public static void displayArray(int[]arr){
        // code for displaying an array
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
          int []/*size*/  arr /*name */= new int [10]; 
         System.out.println(arr);
        //  char [] arr = new char[5];
        arr[1]=10;
        arr[2]=110;
        arr[6]=110;
        arr[9]=101;
displayArray(arr);}
public static int lengthNumber(int n){
    int count = 0;
    int temp=n;
    while(temp != 0){
        temp = temp/10;
        count++;
    }
    return count;
}}