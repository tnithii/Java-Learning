package collections;

import java.util.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapsample {

	public static void main(String[] args) {
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	ht.put(1, "nithya");
	ht.put(2, "selva");
	//hm.put(0, null);
	ht.put(3, "yazh");
	ht.put(2, "selva");
	System.out.println(ht);
	for(Map.Entry m:ht.entrySet())
	{
		System.out.println(m.getKey()+" and "+m.getValue());
	}
 
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple"); 
   map.put(0, null);
   map.put(5, null);
   map.put(3,"Banana");   
   map.put(2,"Apple");   
   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}    
