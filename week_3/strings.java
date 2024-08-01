package week_3;

//import Revison.reverse;

public class strings {
   /*  public static String printIndex(String name){
        String ans="";
        for(int i=0;)
        return ans;
    }
        */



   /*  public static String changeName(String name){
        String ans="";
        for(int i=0;i<name.length();i++){
            ans+=(char)(name.charAt(i)+1);
        }

        return ans;
    }
*/
    //Return the reverse of the string
 /* 
    public static String reverseString(String name){    
    String ans="";
    for(int i=name.length()-1;i>=0;i--){
        ans+=(char)(name.charAt(i));
    }

    return ans;
    }


    //PALLINDROME:MADAM ,BOB,MOM,BOOB,TIT
    
    
    public static boolean pallinDrome(String name){    
    return (name.equals(reverseString(name)));    
    }
    */
    /*
ReverseFunc(String s){
s= s.trim();
String[] arr= s.split"\s+";
String ans= "";
for(i: arr.length-1->0)
ans+=arr[i];
return ans.trim();
}
     */
//reverse the sentence:
/* 
    public static String reverseWords(String s){
        s= s.trim();
        String[] arr= s.split(" ");
        String ans= "";
        for(int i=arr.length-1;i>=0;i--){
        ans+=arr[i]+"  ";
        }
        return ans.trim();
    }
        */

        //AAARRAV
public static int count(String s){
    int ans=0;
    char curr=s.charAt(0);
    int len=1;
    for(int i=1;i<s.length();i++){
        if(s.charAt(i)==curr){
            len++;
        }else{
            curr=s.charAt(i);
            ans=Math.max(ans, len);
            len=1;
        }

    }
    return ans;

}


    public static void main(String[] args) {
      String s2="aaaaarrrravvvvv";
      System.out.println(count(s2));
        //String s2="PArabolla";
       // System.out.println(s2.substring(4,8));

         
       // String s1="   today is thursday     ";
        //String s2="a";
        //System.out.println(s1.compareTo(s2) );
       // String s3="hi";
        //char[]s4={'h','i'};
        //char[]s5={'h','i'};
        // System.out.println(s4[0]);
        // System.out.println(s4[1]+""+s1.charAt(1));
        // System.out.println(s4[1]==s1.charAt(1));


// create a string s ="your name"
        //System.out.println(changeName("Sahil"));
       // System.out.println(reverseString("Lakra"));

       //System.out.println(pallinDrome("naman"));


      // System.out.println(reverseWords(s1));
    }
}
