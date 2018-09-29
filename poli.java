import java.util.Scanner;

public class gg {

	public static void main(String ai[]) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String sd="";
		for(int i=s.length()-1;i>=0;i--)
		{
		sd=sd+s.charAt(i);
	  } 
		if(sd==s)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");	
		}
}
}
