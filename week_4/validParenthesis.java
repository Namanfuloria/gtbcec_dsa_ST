package week_4;

public class validParenthesis {
    static void validParenthesis(int n,int l,int r,String ans){
        if(l==n && l==r){
            System.out.println(ans);
            return;
    }
    if(l>n || r>l)return;
    validParenthesis(n,l+1,r,ans+"{");
    validParenthesis(n,l,r+1,ans+"}");
}
public static void main(String[] args) {
    validParenthesis(3, 0, 0, "");
}
}
