package Lab10;

import java.time.LocalTime;

public class Ex2 {

	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
	
}
