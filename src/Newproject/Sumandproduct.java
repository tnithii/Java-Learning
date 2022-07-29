package Newproject;

import java.util.Scanner;

public class Sumandproduct {

	public static void main(String[] args) {

	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3,n4;
			int rvs=0;
			if(n1>0 && n2>0) {
				n3=n1+n2;
				n4=n1*n2;
				while(n3>0)
				{
					rvs=rvs*10+ n3 % 10;
					n3=n3/10;
				}
				if(rvs==n4) {
					System.out.println("your Lucky");
					
				}
				else
					System.out.println("Better luck next time");
			}
			else {
				System.out.println("invalid number");
			}
			
			
			}

}
