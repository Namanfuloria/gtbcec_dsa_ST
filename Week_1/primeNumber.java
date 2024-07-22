package Week_1;
import java.util.Scanner;

/*public class primeNumber {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++)
        if(n%i==0)
            return false;
            return true;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        }
    }*/
    // reverse number

public class primeNumber {

    public static int reverseInteger(int n){
        int temp=0;
        while(n!=0){
            temp=temp*10+n%10;
        n/=10;
    }return temp;
    }
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(reverseInteger(n));
}
/*/ amstrong number
public static int lengthNumber(int n){
    int count = 0;
    int temp=n;
    while(temp != 0){
        temp = temp/10;
        count++;
    }
    return count;
}
public static boolean armstrongNumber( int n){
    int temp = n;
    int count = lengthNumber(n);
    int sum = 0;
    while(temp != 0){
        int digit = temp % 10;
        sum += Math.pow(digit, count);
        temp = temp/10;
        
        return sum ==temp;
        }

    return true;
}
public static void main(String[] args) {
    int n = 4;
    
    System.out.println(lengthNumber(n));
    System.out.println(armstrongNumber(n));
}*/
}

