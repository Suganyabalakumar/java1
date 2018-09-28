import java.util.Scanner;

public class guvi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0;
        int no=n;
        while(n>0)
        {
        	r=n%10;
        	s=s+r*r*r;
        	n=n/10;
        }
        if(no==s)
        {
        	System.out.println("yes");
        }
        else
        {
        	System.out.println("no");	
        }
	}
}
        
	


