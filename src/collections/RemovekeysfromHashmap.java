package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/* ==========================================
hm.entrySet() .removeIf(entry -> entry.getKey().equals("Grape"));

here hm is Hashmap name.
=============================================*/

public class RemovekeysfromHashmap {

	public static void main(String[] args) {
			
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		HashMap<Integer, String> hmnew=new HashMap<Integer,String>();
hm.put(1, "nithya");
hm.put(2, "selva");
hm.put(3, "magi");
hm.put(4, "yazh");
//System.out.println(hm);
//hm.remove(1);
hmnew.putAll(hm);
//System.out.println(hmnew);
//int keyToBeRemoved=3;


/*for(Integer i: hm.keySet()) {
	if(i%2==0) {
		
	hm.remove(i);
	
	}*/
	 hm.entrySet().removeIf(entry -> (entry.getKey())%2==0);
	 
	System.out.println(hm);
	
}

	}


