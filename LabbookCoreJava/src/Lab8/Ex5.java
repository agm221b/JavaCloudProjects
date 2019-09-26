package Lab8;

import java.util.Scanner;

public class Ex5 {

	public void run() {
		String sc=new Scanner(System.in).nextLine();
		int flag=0;
		for(int i=1;i<sc.length();i++)
		{
			if((int)sc.charAt(i)<(int)(sc.charAt(i-1)))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("Not Positive String");
		}
	}
}
