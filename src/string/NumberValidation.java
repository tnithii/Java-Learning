package string;

import java.util.Scanner;
/*
 * 2.    Number Validation
Write a program to read a string of 10 digit number , 
check whether the string contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit.

Sample Input 1:
123-456-7895
Sample Output 1:
Valid number format

Sample Input 2:
-123-12344322
Sample Output 2:
Invalid number format

 */

public class NumberValidation {

	public static String validateNumber(String s) 
	{
		if(s.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}"))
			return "Valid number";
		return "inValid number";

	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 digit number");
		String s1=sc.nextLine();
		System.out.println(validateNumber(s1));

	}

}
