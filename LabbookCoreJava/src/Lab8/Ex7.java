package Lab8;

import java.util.Scanner;

public class Ex7 {

	public boolean validate(String s)
	{
		String []arr=s.split("\\_");
		if(!(arr[arr.length-1].equals("job")))
		{
			return false;
		}
		else
		{
			if((s.length()-4)<8)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
	public void run() {
		String s=new Scanner(System.in).next();
		boolean b=validate(s);
		if(b)
		{
			System.out.println("Validation Passed");
		}
		else
		{
			System.out.println("validation Failed");
		}
	}
}
