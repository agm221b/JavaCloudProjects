package Lab5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws UserDefExcp {
		// TODO Auto-generated method stub

		Ex1 e = new Ex1();
		e.run();
		
		Fibo fib = new Fibo();
		fib.run();
		
		Prime p1 = new Prime();
		p1.run();
		
		try {
			
		
		Ex4 ex4 = new Ex4();
		ex4.run();
		}catch (EmployeeException e1) {
			// TODO: handle exception
			System.out.println(e1.getMessage());
		}
		
		

	}
}
