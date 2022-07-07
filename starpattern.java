public class starpattern {

    public static void main(String[] args) {
        int n=3;
int i=1;
        while(i<=n)
        {

            int space=1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space=space+1;
            }
              int j=1;
              while(j<=i)
              {
                    
                System.out.print("*");
                j=j+1;
                


              }
              System.out.println();
              i=i+1;




            }
            int in=1;
            while(in<=n)
            {
    
                
                  int j=1;
                  while(j<=in-1)
                  {
                        
                    System.out.print("*");
                    j=j+1;
                    
    
    
                  }
                  System.out.println();
                  in=in+1;
    
    
    
    
                }


          }



    }
    

