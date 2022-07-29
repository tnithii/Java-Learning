package methodslearning;

import java.util.Scanner;

public class methodcalling {
	
	static int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum = add(n1,n2);
		System.out.println(sum);
		
	}
	
}
