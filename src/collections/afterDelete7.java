package collections;


import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class afterDelete7 {
	public static int afterDelete(HashMap<Integer,String> hm) {
		
		int count=0;
		 //hm.entrySet().removeIf(entry -> (entry.getKey())%3==0);
		System.out.println(hm);
			
		for(Integer i:hm.keySet())
		{
			if(i%3==0) {
				count++;
				
				hm.remove(i);
				
			
				/*
				}catch(ConcurrentModificationException er){
					System.out.println(er);
				}*/
			}
		}
		System.out.println(hm);
		return count;
	}

}
