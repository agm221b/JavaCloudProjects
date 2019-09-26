package Lab9;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {

	public Map getSquares(int[]a) {
		Map<Integer, Integer>m = m=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			m.put(a[i], (a[i]*a[i]));
			
		}
		return m;
		
	}
}
