
import java.util.Scanner;
public class nthfibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int n1=0;
        int n2=1;
        for(int i=0;i<n;i++)
        
        {
              a=n1+n2;
              n1=n2;
              n2=a;






        }
         System.out.println(n1);


    }
}
