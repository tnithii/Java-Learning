package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Hashset1 {

	public static void main(String[] args) {
		//HashSet<String> a=new HashSet<String>();
		TreeSet<String> a=new TreeSet<String>();
		a.add("nithya");
		a.add("nithya");
		a.add("selva");
		a.add("yazh");
		a.add("magi");
		//a.add(null);
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=2;i++)
		{
			a.add(sc.next());
		}
		for(String s:a)
			System.out.println(s);

		}

	}



