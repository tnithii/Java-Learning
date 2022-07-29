package collections;

import java.util.*;

public class SumofLowestmarks6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hashmap size");
		int n=sc.nextInt();
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(hm);
		
		System.out.println("Sum of the lowest three marks: "+Usermaincode6.getLowest(hm));

	}
 
}
