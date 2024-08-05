package week_4;

public class factorial {
    // head recursion
    static int factorial(int n){
        if(n== 0 || n == 1)
        return 1;
        return n*factorial(n-1);
    }
    // tail recusrion
    static int factTail(int n ,int ans ){
        if(n==0 || n==1)return ans;
        return factTail(n-1, n*ans);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=1;
        System.out.println(factorial(n));
        System.out.println(factTail(n, ans));
    }
}
