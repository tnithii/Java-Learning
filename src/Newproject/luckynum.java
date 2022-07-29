package Newproject;

import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the valid car no");
		Scanner sc=new Scanner(System.in);
		long carno=sc.nextLong();
		int c=String.valueOf(carno).length();
		//System.out.println(c);
		long add=0;
	
				
		if(c==4&&c>0) 
		{
			while(carno>0)
			{
		
			add=add+carno%10;
			carno=carno/10;
			
			}
			if (add%3==0||add%5==0||add%7==0)
			{
				System.out.println("The addition value is " + add+ " Lucky number");
			}
			else
			{
				System.out.println("The addition value is " + add+ " Not Lucky num");
			}
	
		}
		else 
		{System.out.println("The car num is invalid");
		}
		
			




		// TODO Auto-generated method stub
		
	}

}
