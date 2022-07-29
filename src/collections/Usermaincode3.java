package collections;

import java.util.HashMap;

public class Usermaincode3 {

	public static String getcapital(HashMap<String, String> hm1,String s)
	{
		String a=hm1.get(s);
		a=a+"$"+s;
		return a;
		
	}
}
