import java.util.*;
public class pol{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int r,s=0;
          while(n>0)
          {
              r=n%10;
              s=s*10+r;
              n=n/10;
          }
    
          if(t==s)
          {
        System.out.println("yes");
          }
          else
          {
             System.out.println("no");  
          }
     }
}
