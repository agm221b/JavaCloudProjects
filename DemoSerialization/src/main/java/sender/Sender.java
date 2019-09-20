package sender;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import test.Person;

public class Sender {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("D:\\JEECloud\\serial.txt");
		OutputStream iStream = new FileOutputStream(f1);
		ObjectOutputStream o = new ObjectOutputStream(iStream);
		o.writeObject(new Person("Mohan","2342csdf1","1234155"));
		o.close();
		iStream.close();
		System.out.println("OK");
		
	}

}
