import java.util.*;
public class leetcode1 {

    public static void main(String[] args) {
        String[] operations={"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));

    }
    

        public static int finalValueAfterOperations(String[] operations) {
            int x=0;
            int n=operations.length;
            for(int i=0;i<n;i++)
            {
                if(operations[i]=="++X" | operations[i]=="X++")
                {
                    x=x+1;
                }
                if(operations[i]=="X--" | operations[i]=="--X")
                {
                    x=x-1;
                }
                
                
                
            }
            
            return x;
            
        }
    }

   
