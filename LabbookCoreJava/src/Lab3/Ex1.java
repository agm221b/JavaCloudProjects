package Lab3;

import java.util.Arrays;

public class Ex1 {
	
	public int getSecondSmallest(int[] Arr)
	{
		Arrays.parallelSort(Arr);
		return Arr[1];
	}

}
