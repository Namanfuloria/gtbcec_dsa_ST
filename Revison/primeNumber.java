package Revison;
import java.util.*;
public class primeNumber {
         public static boolean primeNumber(int n){
        for(int i=2;i<n;i++){
        if(n%i==0){
        return false;
                            }
    }       return true;
                             }
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter ut number");
        int n=sc.nextInt();
         System.out.println(primeNumber(n));
}
}
