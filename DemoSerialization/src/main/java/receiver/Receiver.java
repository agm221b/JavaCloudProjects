package receiver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import test.Person;

public class Receiver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File f2 = new File("D:\\JEECloud\\serial.txt");
		InputStream iStream = new FileInputStream(f2);
		ObjectInputStream inputStream = new ObjectInputStream(iStream);
		Person p2 = (Person) inputStream.readObject();
		inputStream.close();
		iStream.close();
		System.out.println("OK "+p2);
	}

}
