package Lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("D:\\JavaCloudProject\\LabbookCoreJava\\sample.txt");
		File fileout = new File("D:\\JavaCloudProject\\LabbookCoreJava\\sampleoutput.txt");
		FileInputStream fip = new FileInputStream(fileout);
		FileOutputStream fout= new FileOutputStream(fileout);
		Ex1 e = new Ex1(fip, fout);
		e.run();
		
		Ex2 e2 = new Ex2();
		e2.run();
	}

}
