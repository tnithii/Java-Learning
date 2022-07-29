package TestPackage;

import java.util.Scanner;

public class Daysofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the number to display weeks ");
		System.out.println("Enter the character to find vowel or constant");
		Scanner sc=new Scanner(System.in);
		String value=sc.next();
		switch(value) {
		case "a":
			System.out.println(value+" - The character is vowel");
			break;
		case "e":
			System.out.println(value+" - The character is vowel");
			break;
		case "i":
			System.out.println(value+" - The character is vowel");
			break;
		case "o":
			System.out.println(value+" - The character is vowel");
			break;
		case "u":
			System.out.println(value+" - The character is vowel");
			break;
			default:
				System.out.println(value +" -The charater is constant");
		}
		/*int num=sc.nextInt();
		switch(num){
		case 1:
			System.out.println("The day is Sunday");
			break;
		case 2:
			System.out.println("The day is Monday");
			break;	
		case 3:
			System.out.println("The day is Tuesday");
			break;
		case 4:
			System.out.println("The day is Wednesday");
			break;
		case 5:
			System.out.println("The day is Thursday");
			break;
		case 6:
			System.out.println("The day is Friday");
			break;
		case 7:
			System.out.println("The day is Saturday");
			break;
			default:
				System.out.println("the number is invalid");
		}*/

	}

}
