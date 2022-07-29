package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<String,String> hm=new HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.next(), sc.next());
		}
		System.out.println(hm);
		System.out.println("Enter the key value");
		String str=sc.next();
		System.out.println(Usermaincode3.getcapital(hm,str));
		

	}

}
