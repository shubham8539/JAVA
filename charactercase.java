import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class charactercase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char c=str.charAt(0);
        if(c>='A' && c<='Z'){

            System.out.println(1);


        }
        else if(c>='a'&& c<='z'){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    
        





    }
}
