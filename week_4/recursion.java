package week_4;

public class recursion {
    // static void print(int n){
    //     // base case
    //     if(n==10){
    // System.out.println(n);
    // return;
    //     }
    //     System.out.println(n);
    //     print(n+1);
    // }
    // public static void main(String[] args) {
    //     int n=1;
    //   print(n);
    // //   while(n<=10)
    // // System.out.println(n);
    // // n++;
    // }
    // Tail Recursion
    static int sum(int n,int a){
        // base case
        if(n==1){
            return a+n;
        }
       return sum(n-1,a+n);
    }
    // Head Recursion
    static int sumHead(int n){
        // base case
        if(n==1)
        return 1;
        // assumption
        int prevValueSum=sumHead(n-1);
        // proof
        return n+prevValueSum;

    }
    // head recursion
    static int count(int n){
        // base case
        if(n==1){
            return 0;
        }
        if(n%2==0)
        return 1+count(n-1);
        else return count(n-1);
    }
    static int countEven(int n,int count){
        if(n==1)
        return count;
        if(n%2==0)count++;
        return countEven(n-1,count);
    }
    public static void main(String[] args) {
        // int n=10;
        // int sum=0;
        // for(int i=1;i<=n;i++)
        // sum +=i;
        // System.out.println(sum); 
        // int n=10;
        // int sum=sum(n,0);
        // System.out.println(sum);
        // int count =0;
        // int n=10;
        // while(n>1){
        //     if(n%2==0)
        //     count ++;
        //     n--;

        // }
        // System.out.println(count);
        // int n=10;
        // int sum=0;
        // // System.out.println(countEven(n, 0));
        // sum=sumHead(n);
        // System.err.println(sum);
        int n=10;
        System.out.println(count(n));
    }
}
