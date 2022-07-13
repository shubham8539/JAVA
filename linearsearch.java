import java.util.*;
public class linearsearch {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    int[] arr={4,6,7,45,44,78};
    System.out.println("ENTER NO TO BE SEARCHED");
    int x=s.nextInt();
    for(int i=0;i<6;i++)
    {  if(arr[i]==x)
        {

        System.out.println("YOUR NO. IS PRESENT IN ARRAY AT " + (i+1) + " POSITION");
    }

    }

}
}
