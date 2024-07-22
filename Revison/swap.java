package Revison;

public class swap {
    public static void  swap( int a , int b){
        int temp = 0;
        temp = a;
        a = b;
        b=temp;
        System.out.println(" The swapped value of a is " + a);
        System.out.println(" The swapped value of b is " + b);
    
    }
    public static void main(String[] args) {
        swap(23, 51);;
    }
}
