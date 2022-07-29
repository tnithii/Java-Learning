package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Usermaincode6 {
	public static int getLowest(HashMap<Integer,Integer> hm) {
		int sum=0;
		Collection<Integer> c=hm.values();
		List<Integer> l=new ArrayList<Integer>(c);
		Collections.sort(l);
		sum=l.get(0)+l.get(1)+l.get(2);
		return sum;

		
	}

}
