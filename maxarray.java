import java.util.Scanner;

public class guvi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int big=0,i;
        for( i=0;i<n;i++)
        {
        a[i]=sc.nextInt();	
        }
        for( i=0;i<n;i++)
        {
         if(a[i]>big) 
         {
        	 big=a[i];
         }
        }
         System.out.println(big);
	}
}
        
	


