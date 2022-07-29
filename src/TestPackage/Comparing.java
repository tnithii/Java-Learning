package TestPackage;

import java.util.Scanner;

public class Comparing {
	
	 void regvalue(String name, String email, int mobile,String gender,int age)
	{
		System.out.println("name is "+ name);
		System.out.println("email is "+ email);
		System.out.println("mobile num is "+ mobile);
		System.out.println("gender is "+ gender);
		System.out.println("age is "+ age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String emailid=sc.nextLine();
		String gender=sc.nextLine();
		int mobile=sc.nextInt();
		int age=sc.nextInt();
		Comparing rv=new Comparing();
		
		
		
		switch (gender){
		case("female"):
		{
			
		if(age>15)
			rv.regvalue(name,emailid,mobile,gender,age);
		else
			System.out.println("not eligible");
		break;
		}
		case("male"):
		{
			
		if(age>18)
			rv.regvalue(name,emailid,mobile,gender,age);
		else
			System.out.println("not eligible");
		break;
		}
		
		

	}
		}
	}
	


