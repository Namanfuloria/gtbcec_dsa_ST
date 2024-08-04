package week_3;

public class pointer2approach {
    public static void pointer2(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
            System.out.println(s.substring(i,j));
            }   
        }
     }
public static void main(String[] args) {
    String str="mcqe";
    pointer2(str);
}
}
