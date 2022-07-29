package Newproject;

import java.util.Scanner;

public class Pairoftwodigits {
	
	 static int revnum(int num)
	{
		int re=0;
	
	while(num>0)
	{
		int a;
		a=num%10;
		re=re*10+a;
		num= num/10; 
	}
	return re;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two 2-digits numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int n1=String.valueOf(num1).length();
		int n2=String.valueOf(num2).length();
		
		if(n1==2&&n2==2) {
			
		
		int mul1=num1*num2;
				
		Pairoftwodigits rev1=new Pairoftwodigits();
		//Pairoftwodigits rev2=new Pairoftwodigits();
		
		//int rnum1=rev1.revnum(num1);
		//int rnum2=rev1.revnum(num2);
		
		//int mul2=rnum1*rnum2;
		if(mul1==rev1.revnum(num1)*rev1.revnum(num2))
		{
		System.out.println("yes");
		
		}
		else
			System.out.println("no");
	}

	else
	{
		System.out.println("The number is invalid");
	}
}
}
