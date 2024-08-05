package week_4;

public class power {
    // head recursion
    static int power(int base,int pow){
        if(pow==0)
        return 1;
       return  base*power (base,pow-1);
    }
    // tail recursion
    static int powertail(int base,int pow,int ans){
        if(pow==0)
        return ans;
        return powertail(base, pow-1, ans*base);
    }
    public static void main(String[] args) {
        int base=2;
        int pow=3;
        System.out.println(powertail(base, pow, 1));
    }
}
