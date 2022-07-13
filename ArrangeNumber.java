import java.util.*;
public class ArrangeNumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter NUM");
         int n=sc.nextInt();
         int[] arr=new int[n];
         int i=0;
         int j=n-1;
         int num=1;
         while(i<j)
         {
            arr[i]=num;
            i++;
            num++;
            arr[j]=num;
            j--;
            num++;

                   if(i==j){
                    arr[i]=num;
                   }


         }
         for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
         }

    }
}
