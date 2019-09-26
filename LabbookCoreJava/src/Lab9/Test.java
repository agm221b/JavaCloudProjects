package Lab9;

import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
		System.out.println("Enter the length:");
		int n= sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			String k=sc.next();
			hashMap.put(p, k);
			
		}
		Ex1 e = new Ex1();
		
		System.out.println(e.getValues(hashMap));
		
		Ex2 e2 = new Ex2();
		System.out.println("Enter the length:");
		n= sc.nextInt();
		char a[] = new char[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().charAt(0);
		}
		e2.countCharacter(a);
		
		Ex3 e3 = new Ex3();
		System.out.println("Enter the length");
		n= sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		e3.getSquares(ar);
	}

}
