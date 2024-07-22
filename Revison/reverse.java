package Revison;
import java.util.*;
public class reverse {
    public static int reverseNumber(int n) {
     int temp = 0;
     while (n != 0) {
     temp = temp*10 + n % 10;
     n = n/10;
   }
     return temp;
     }
  public static void main(String[] args) {
     int n = 1234;
     System.out.println(reverseNumber(n));

     }
}
