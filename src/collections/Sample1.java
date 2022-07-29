package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
	//List<String> a1=new ArrayList<String>();
	ArrayList<Object> a=new ArrayList<Object>();
	a.add(1);
	a.add("nithya");
	a.add("selva");
	a.add("yazh");
	a.add("magi");
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<=2;i++)
	{
		a.add(sc.next());
	}
	for(Object s:a)
		System.out.println(s);

	}

}
