package week_4;

public class fibonacci {
    static int fib(int n){
        if(n ==0 || n==1)
        return n;
        return fib(n-1)+fib(n-2);
        
    }
    static int fibTail(int n,int a,int b){
        if(n==0){
            return a;
        }return fibTail(n-1,b,a+b);
    }
    public static void main(String[] args) {
        int n = 7;
      //  System.out.println("Fibonacci series up to " + n + " terms: ");
        System.out.println(fib(n));
        System.out.println(fibTail(n,0,1));
    }
}
