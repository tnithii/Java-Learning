package string;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password:");
		String str=sc.next();
		int len=str.length();
		int i;
		if(len>=6&&len<=20)
		{
		i=PasswordValidationUserMainCode.validatePassword(str);
		if(i==1)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		}
		else
			System.out.println("Invalid Password");
		
	}

}
