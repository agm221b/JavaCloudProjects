package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the question number:");
		Ex1 e = new Ex1();
		Ex2 e2 = new Ex2();
		Ex3 e3 = new Ex3();
		Ex4 e4 = new Ex4();
		Scanner sc = new Scanner(System.in);
		int n,ch;
		ch=sc.nextInt();
		int Arr[];
		switch(ch)
		{
		case 1: 
			System.out.println("Enter the size of array");
			n = sc.nextInt();
			Arr= new int[n];
			System.out.println("Enter the array:");
			for(int i=0;i<n;i++)
				Arr[i]=sc.nextInt();
			System.out.println("Second Smallest element is: "+e.getSecondSmallest(Arr));
			break;

		case 2: 
			System.out.println("Enter the size of array");
			n = sc.nextInt();
			String Arr2[]= new String[n];
			System.out.println("Enter the array:");
			for(int i=0;i<n;i++)
				Arr2[i]=sc.next();
			Arr2= e2.getArray(Arr2);
			System.out.println(Arrays.toString(Arr2));
			break;

		case 3:
			System.out.println("Enter the size of array");
			n = sc.nextInt();
			Arr= new int[n];
			System.out.println("Enter the array:");
			for(int i=0;i<n;i++)
				Arr[i]=sc.nextInt();
			System.out.println("Reverse array is: ");
			for(int i=0;i<n;i++)
				System.out.println(e3.getSorted(Arr)[i]);
			break;
			
		case 4:
			System.out.println("Enter the size of array");
			n = sc.nextInt();
			char[] ch1= new char[n];
			System.out.println("Enter the character array:");
			for(int i=0;i<n;i++)
				ch1[i]=sc.next().charAt(0);
			e4.getFreq(ch1);
			//System.out.println();
		}
		
		sc.close();
	}



	
}


