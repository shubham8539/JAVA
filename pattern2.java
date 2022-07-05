public class pattern2 {
    public static void main(String[] args) {
          int n=4;
          int i=1;
          int v=1;
          while(i<=n){

            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space=space+1;
            }
              int j=1;
              while(j<=i){
                    
                System.out.print(v);
                v=v+1;
                j=j+1;


              }
              System.out.println();
              i=i+1;







          }






    }


}

