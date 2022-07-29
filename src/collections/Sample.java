package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	//List<String> a1=new ArrayList<String>();
	ArrayList<String> a=new ArrayList<String>();
	a.add("nithya");
	a.add("nithya");
	a.add("selva");
	a.add("yazh");
	a.add("magi");
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<=2;i++)
	{
		a.add(sc.next());
	}
	for(String s:a)
		System.out.println(s);

	}

}
