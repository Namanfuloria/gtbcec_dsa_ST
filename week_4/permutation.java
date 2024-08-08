package week_4;

public class permutation {
    static void permut(int n,int j,int arr []){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=j;
                System.out.print(j+" ");
            }
        }
    }
    public static void main(String[] args) {
        // 
    }
}
