package Week_0.day2;

import java.util.Scanner;

public class patterPractice {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("ur number");
        n = sc.nextInt();
       /*  1.SQUARE 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            System.out.print("* ");
        }System.out.println();
    }                          
*/
/*2.RYT FACING TRIANGLE
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
 }
    System.out.println();
}
*/
/* 
3.RYT INVERTED FACING TRIANGLE
for(int i=n;i>=1;i--){                                 
 for (int j=1;j<=i;j++){
    System.out.print("*");
}System.out.println();
}*/
/*/ 4.LEFT FACING TRIANGLE
for (int i=1;i<=n;i++){
    for(int k=1;k<=(n-i);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();

}*/
/*/ 3.INVERTED RYT FACING TRIANGLE (another way)
for (int i=n;i>=1;i--){
    for(int k=1;k<=(n-1);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();
}*/
/*/ 5.INVERTED LEFT FACING TRIANGLE
for(int i=n;i>=1;i--){
    for(int k=1;k<=(n-i);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();
}*/
 /*/ QUES 6.
for(int i=n;i>=1;i--){
    for(int k=1;k<=(n-i)+1;k++)
    System.out.print("    ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();
}*/
/*/ QUES 7.
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if (i==n || j==n || i==1||j==1 ) {
            System.out.print("* ");
        }else
    System.out.print("  ");
}System.out.println();
}  */
/*/   QUES 8.
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if (i==j||i+j==n+1||i==n && j==n ) {
            System.out.print("* ");
        }else
    System.out.print("  ");
}System.out.println();
} */
/*/ QUES 9.
for (int i=1; i<=n; i++){
    for (int k=1; k<=(n-i); k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++)
        System.out.print("* ");
    for (int j2=1; j2<=i-1; j2++)
        System.out.print("* ");
    System.out.println();
}*/
/*/  QUES 10.
for (int i=n; i>=1; i--){
    for (int k=1; k<=(n-i); k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++)
        System.out.print("* ");
    for (int j2=1; j2<=i-1; j2++)
        System.out.print("* ");
    System.out.println();
}*/
/*/  QUES 11.
for (int i=1; i<=n; i++){
    for (int k=1; k<=n-i; k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++)
        System.out.print(" * ");
    System.out.println();
}*/
/*/ QUES 12.
for (int i=1; i<=n; i++){
    for (int k=1; k<=n-i; k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++){
    System.out.print("* ");
        if(i>j1){
System.out.print("! ");
        }
    }
        
    System.out.println();
}*/
/*/ QUES 13.
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
    System.out.print("* ");}
System.out.println();
}
for(int i=n;i>=1;i--){
    for(int j=1;j<=i-1;j++){
        System.out.print("* ");
    }System.out.println();
}*/
/*/ QUES 14.
for (int i=1;i<=n;i++){
    for(int k=1;k<=(n-i);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();

}
 for(int i=n-1;i>=1;i--){
for(int k=1;k<=(n-i);k++)
System.out.print("  ");
     for(int j=1;j<=i;j++){
         System.out.print("* ");
    }System.out.println();
}*/
/*/ QUES 15.
for(int i=n;i>=1;i--){
    for(int k=1;k<=(n-i);k++)
    System.out.print("    ");
         for(int j=1;j<=i;j++){
             System.out.print("* ");
        }System.out.println();
    }
    for (int i=2;i<=n;i++){
        for(int k=1;k<=(n-i);k++)
        System.out.print("    ");
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }System.out.println();
    
    }*/
    /*/ QUES 16.
    for(int i=n;i>=1;i--){
        for(int k=1;k<=i;k++)
        System.out.print("  ");                                 
        for (int j=1;j<=i;j++){
           System.out.print("* ");
       }System.out.println();
       }
    for(int i=2;i<=n;i++){    
         for(int k=1;k<=i;k++)
         System.out.print("  ");                             
        for (int j=1;j<=i;j++){
           System.out.print("* ");
       }System.out.println();
       }*/
/*/ QUES 17.
for(int i=n-4;i>=1;i--){                                 
        for (int j=1;j<=i;j++){
           System.out.print("* ");
       }
        for(int k=4;k<=(n-i);k++)
        System.out.print("");
        for(int k=4;k<=(n-i);k++)
        System.out.print("    ");
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }System.out.println();
    }System.out.println();
    for(int i=1;i<=n-4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");}
            for(int k=4;k<=(n-i);k++)
            System.out.print("  ");
            for(int k=4;k<=n-i;k++)
            System.out.print("  ");
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        
        }
        
*/

/*/ QUES 18.
for (int i=1; i<=n; i++){
    for (int k=1; k<=(n-i); k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++)
        System.out.print("* ");
    for (int j2=1; j2<=i-1; j2++)
        System.out.print("* ");
    System.out.println();
}
for (int i=n-1; i>=1; i--){
    for (int k=1; k<=(n-i); k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++)
        System.out.print("* ");
    for (int j2=1; j2<=i-1; j2++)
        System.out.print("* ");
    System.out.println();
}*/
// QUES 19.
/*for(int i=n;i>=1;i--){                                 
     for (int j=1;j<=i;j++){
        System.out.print("* ");}
        for(int k=1;k<=n;k++)
        System.out.print("");
        for(int k=1;k<=n-1;k++)
        System.out.print(" ");
         for(int j=1;j<=n-i;j++)
         System.out.print("* ");
         System.out.println();
    }
 /*for(int i=2;i<=n;i++){
    for(int k=n;k>=n;k--)
    System.out.print("");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();
}*/
/*for (int i = 1; i <= n - 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }


}*/
// QUES.21
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
        for(int k=1;k<=(n-i);k++)
        System.out.print("  ");
        for(int k=2;k<=(n-i);k++)
        System.out.print("  ");
        for(int j=1;j<=i && j<n;j++){
            System.out.print("* ");
        }System.out.println();
    
    }

}}