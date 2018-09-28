import java.util.*;
public class sum1{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n>0)
        {
            n=n/10;
            s++;
        }
        
        System.out.println(s);
     }
}
