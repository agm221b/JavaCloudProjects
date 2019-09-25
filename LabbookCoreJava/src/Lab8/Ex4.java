package Lab8;

import java.io.File;
import java.util.Scanner;

public class Ex4 {

	public void run() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		File f=new File("D:\\JavaCloudProject\\LabbookCoreJava\\"+s);
		if(f.exists())
		{
			System.out.println("File exists");
			if(f.canRead())
			{
				System.out.println("is readable");
			}
			else
			{
				System.out.println("not readable");
			}
			if(f.canWrite())
			{
				System.out.println("is writeable");
			}
			else
			{
				System.out.println("not writeable");
			}
			String []ss=f.getName().split("\\.");
			int n=ss.length;
			System.out.println("File Type :  "+ss[n-1]);
			System.out.println("Size of file : "+f.length()+" bytes");
		}
		else
		{
			System.out.println("doesn't exist");
		}
	}
}
