package week_4;

public class genSubsequence {
    static void subsequence(String ques,String ans ){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }else{
        subsequence(ques.substring(1),ans+ques.charAt(0));
        subsequence(ques.substring(1),ans);
        }
    }
    public static void main(String[] args) {
        String s= "CAR";
        subsequence("CAR", "");
    }
}
