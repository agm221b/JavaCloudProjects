package Lab3;

import java.util.Arrays;

public class Ex2 {

	public String[] getArray(String[] Arr)
	{
		
		for(int i=0;i<Arr.length;i++)
			Arr[i]=Arr[i].toLowerCase();
		Arrays.sort(Arr);
		for(int i=0;i<Math.ceil(Arr.length/2);i++)
			Arr[i]=Arr[i].toUpperCase();
			
		return Arr;
	}

}
