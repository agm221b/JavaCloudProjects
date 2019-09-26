package Lab11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {

	public static void main(String[] args) {
		Runnable r=()->{System.out.println(Thread.currentThread().getName());};

		ExecutorService ex=Executors.newFixedThreadPool(5);
		for(int i=0;i<6;i++) {
			ex.execute(r);
		}

		ExecutorService ex1=Executors.newSingleThreadExecutor();
		for(int i=0;i<6;i++) {
			ex1.execute(r);
		}

		ExecutorService ex2=Executors.newCachedThreadPool();
		for(int i=0;i<6;i++) {
			ex2.execute(r);
		}
	}
}