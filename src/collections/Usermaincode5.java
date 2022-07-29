package collections;

import java.util.HashMap;

public class Usermaincode5 {
	 
	
	

	public static float avgOfEven(HashMap<Integer, Float> hm){
		Float a=0.0f,b=0.0f;
		for(Integer i:hm.keySet())
		{
			
			if(i%2==0)
			{
				a=a+hm.get(i);
				b++;
				
			}
		}return Math.round((a/b)*100.0f)/100.0f;
	}

}
