package Newproject;

import java.util.Scanner;

public class validatingdep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
		 */
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of students placed in CSE");
int cse=sc.nextInt();
System.out.println("Enter the no of students placed in ECE");
int ece=sc.nextInt();
System.out.println("Enter the no of students placed in MECH");
int mech=sc.nextInt();
if (cse<0||ece<0||mech<0)
{
	System.out.println("Input is invalid");
}
else if (cse==ece&&cse>mech)
{
	System.out.println("highest placement in cse and ece");
}
else if (cse==mech&&cse>ece)
{
	System.out.println("highest placement in cse and mech");
}
else if (ece==mech&&ece>cse)
{
	System.out.println("highest placement in ece and mech");
	}
else if (ece==mech&&ece==cse&&cse==mech)
{
	System.out.println("all are same");
	}

else if (cse>mech&&cse>ece)
{
	System.out.println("highest placement in cse");	
}

else if (cse<mech&&mech>ece)
{
	System.out.println("highest placement in mech");	
}
else if (cse<ece&&mech<ece)
{
	System.out.println("highest placement in ece");	
}
	}
}













