import java.util.Scanner;

public class countdigits1{
    public static void main(String[] args) {
        int count=0;
        Scanner raw = new Scanner(System.in);
        try{

                System.out.println("How many digits u wanna enter ?:");
                int n = raw.nextInt();

                System.out.println("Great ! Enter "+n+"digits:");

                int[]a = new int[n];

                for(int i=0; i<n ; i++){
                    a[i]=raw.nextInt();
                }

                for(int i=0 ; i<n ; i++){
                    System.out.print(a[i]);
                }

                System.out.println();


                
                System.out.println("Enter the number u wanna search for ?");
                int adi = raw.nextInt();

                for(int i =0 ; i<a.length ; i++){
                    if(adi==a[i]){
                        count++;
                    }
                }
                System.out.println(count);
            }
        finally{
                raw.close();
            }
    }
}
