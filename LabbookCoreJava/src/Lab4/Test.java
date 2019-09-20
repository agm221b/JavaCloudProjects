package Lab4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int n = sc.nextInt();
		sumOfCubes(n);
		sc.close();
	}
	
	static void sumOfCubes(int n) {
		int cube=0, r=0, nu=n;
		
		while(n>0) {
			r=n%10;
			cube+=r*r*r;
			n=n/10;
		}
		System.out.println("Sum of cubes of digits of "+nu+" is "+cube);
	}

}
