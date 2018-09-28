import java.util.*;
public class odd{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int n1=sc.nextInt();
        int p=0;
        for(int i=n+1;i<n1;i++)
          if(i%2!=0)
          {
          
        System.out.print(i+" ");
          }
         
     }
}
