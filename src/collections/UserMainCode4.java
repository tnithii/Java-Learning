package collections;

import java.util.HashMap;

public class UserMainCode4 {
	public static int sizeOfResultandHashMap(HashMap<Integer,String> hm) {
		//HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		int size=0;
		for(Integer i:hm.keySet())
			{
			if(i%4!=0)
				size++;
			}
				
		return size;
	}

}
