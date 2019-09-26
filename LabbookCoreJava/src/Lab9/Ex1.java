package Lab9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
	public List<String> getValues(HashMap<Integer, String> hm) {
		Collection<String> c = hm.values();
		List<String> sortedList = new ArrayList<String>(c);
		Collections.sort(sortedList);
		return sortedList;

	}



}
