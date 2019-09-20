package Lab3;

import java.util.Arrays;

public class Ex3 {
	
	public int[] getSorted(int[] Arr) {
		
		int[] Arr3 = new int[Arr.length];
		StringBuilder[] Arr2 = new StringBuilder[Arr.length];
		for (int i=0; i<Arr.length;i++) {
			Arr2[i]= new StringBuilder(""+(Arr[i]));	
			Arr2[i].reverse();
		}
		for (int i=0;i<Arr2.length;i++) {
			Arr3[i]=Integer.parseInt(new String(Arr2[i]));
		}
		Arrays.parallelSort(Arr3);
		return Arr3;
	}

}
