package collections;

import java.util.HashMap;
import java.util.*;

public class LargestKeyinHashMap {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the hashmap:");
	int n=sc.nextInt();
	System.out.println("enter the Hashmap elements:");
	HashMap<Integer,String> hm=new HashMap<>();
	for(int i=0;i<n;i++)
	{
		hm.put(sc.nextInt(), sc.next());
	}
	System.out.println("The value is: "+getMaxKeyValue(hm,n));
	}

	private static String getMaxKeyValue(HashMap<Integer, String> hm,int i) {
	
		Collection<Integer> c=hm.keySet();
		List<Integer> l=new ArrayList<Integer>(c);
		Collections.sort(l);
		System.out.println(l);
		return hm.get(l.get(i-1));
		/*Set<Integer> s=h.keySet();
		Integer a[]=new Integer[s.size()];
		s.toArray(a);
		Arrays.sort(a);
		return h.get(a[a.length-1]);*/	
		
	}

}
