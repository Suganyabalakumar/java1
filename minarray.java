import java.util.Scanner;

public class guvi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s = 0,i;
        for( i=0;i<n;i++)
        {
        a[i]=sc.nextInt();	
        }
        s=a[0];
        for( i=0;i<n;i++)
        {
        	
         if(a[i]<s) 
         {
        	 s=a[i];
         }
        }
         System.out.println(s);
	}
}
        
	


