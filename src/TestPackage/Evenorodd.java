package TestPackage;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("the num is even");
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+" * "+a+" = "+ (i*a));
				
			}
		}
		
		else
			{
			for(int i=1;i<=10;i++)
			
			{
				System.out.println(i+" * "+a+" = "+ (i*a));
				
			}
			

	}

}
}