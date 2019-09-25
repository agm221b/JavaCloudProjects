package Lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
	public void run() throws IOException {
		FileReader fileReader = new FileReader("D:\\JavaCloudProject\\LabbookCoreJava\\sample.txt");
		BufferedReader br = new BufferedReader(fileReader);
		int i = 1;
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println("Line " + i + " " + str);
			i++;
		}
	}
}
