package week_4;

public class countSequence {
   // head
   static int sequenceCount(String ques){
    if(ques.isEmpty()){
        return 1;
    }
    int num1=sequenceCount(ques.substring(1));
    int num2=sequenceCount(ques.substring(1));
    return num1+num2;
}
public static void main(String[] args) {
    String s="NAMAN";
    System.out.println(sequenceCount(s));
} 
}
