package collections;

import java.util.HashMap;
import java.util.Scanner;

public class RemovingKeysfromHashMap4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of hashmap: ");
	int n=sc.nextInt();
	HashMap<Integer,String> hm=new HashMap<Integer, String>();
	System.out.println("Enter the keys and values for Hashmap");
	for(int i=0;i<n;i++)
	{
		hm.put(sc.nextInt(),sc.next());
	}
	System.out.println(hm);
	System.out.println("the size is:" + UserMainCode4.sizeOfResultandHashMap(hm));

	}

}
