package Lab8;

import java.util.Calendar;
import java.util.Scanner;

public class Ex6 {

	public void run() {
		Calendar calendar = Calendar.getInstance();
		// System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println("Enter date in format DD-MM-YYYY");
		@SuppressWarnings("resource")
		String sc = new Scanner(System.in).next();
		String[] arr = sc.split("\\-");
		if ((Integer.parseInt(arr[2]) - (calendar.get(Calendar.YEAR))) > 0) {
			System.out.println("Invalid Date");
		} else {
			System.out.println("Duration is : ");

			System.out.println("Days: " + ((calendar.get(Calendar.DATE)) - Integer.parseInt(arr[0])));
			System.out.println("Months: " + (Integer.parseInt(arr[1]) - (calendar.get(Calendar.MONTH) + 1)));
			System.out.println("Year: " + ((calendar.get(Calendar.YEAR)) - Integer.parseInt(arr[2])));
		}
	}
}
