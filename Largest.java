
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else{
              if(b>=c){
                System.err.println(b);
              }
              else{
                System.out.println(c);
              }



        }



    }


}
