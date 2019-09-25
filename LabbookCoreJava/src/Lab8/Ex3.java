package Lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public void run() throws IOException {
		File f=new File("D:\\JavaCloudProject\\LabbookCoreJava\\sample.txt");
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader is=new InputStreamReader(fi);
		BufferedReader reader=new BufferedReader(is);
		String line;
		int countWord=0;
		int countLine=0;
		int countChar=0;
		while((line=reader.readLine())!=null)
		{
			if(!(line.equals("")))
			{
				countChar+=line.length();
				String []s=line.split("\\s+");
				countWord+=s.length;
			}
			countLine++;
		}
		System.out.println("Word : "+countWord);
		System.out.println("Character : "+countChar);
		System.out.println("Line : "+countLine);
		
	}
}
