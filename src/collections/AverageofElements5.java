package collections;

import java.util.HashMap;
import java.util.Scanner;

public class AverageofElements5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hashmap size");
		int n=sc.nextInt();
		HashMap<Integer,Float> hm=new HashMap<Integer,Float>();
		System.out.println("Enter the keys and values");
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextFloat());
		}
System.out.println("The average is: "+Usermaincode5.avgOfEven(hm));

	}

}
