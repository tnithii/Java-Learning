package TestPackage;

import java.util.Scanner;

public class Votingcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Age ");
int age = sc.nextInt();
System.out.println("Enter citizen ");
String citizen = sc.next();
String citizen1 = "indian";



if (citizen1.equalsIgnoreCase(citizen)&&age>=18) {
	
	System.out.println(" Your eligible for voting");
	
}

else
{
	System.out.println("Not eligible for voting");
}
//System.out.println(" Your eligible for voting");*/
		
		
	}

}
