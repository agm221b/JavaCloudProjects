package Lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {

		public void run() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String string = sc.next();
			int sum=0;
			StringTokenizer s1=new StringTokenizer(string);
			while(s1.hasMoreTokens())
			{
				int a=Integer.parseInt(s1.nextToken());
				System.out.println(a);
				sum+=a;
			}
			System.out.println("Sum : "+sum);
		}
	}

	
