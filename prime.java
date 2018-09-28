import java.util.Scanner;

public class guvi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int p=0,j,i;
        for(i=n;i<=n1;i++)
        {
        	p=0;
        	for(j=1;j<=i;j++)
        	{
         
        	if(i%j==0)
        	{
        		p++;
             }
        }
        if(p==2)
        {
     
		System.out.print(i+" ");	
        }
        }
	}
}
        
      
        
	


