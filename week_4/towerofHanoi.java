package week_4;

public class towerofHanoi {
    static void towerofHanoi(int n,String a,String b,String c){
        if(n==1){
            System.out.println("Move disk from rod "+a+" to rod "+c);
        }else{
            System.out.println("Move disk from rod "+a+"to rod "+b);
            towerofHanoi(n-1, a, c, b);
            System.out.println("Move disk from rod "+a+" to rod "+c);
            towerofHanoi(n-1, b, a, c);
        }
    }
    public static void main(String[] args) {
       towerofHanoi(3, "A", "B", "C");
    }
}
