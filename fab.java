

import java.util.Scanner;

public class fab{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=1,f2=0,f3,i;
		for(i=1;i<=n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
		}
	}
}
		
	
