package TestPackage;

import java.util.Scanner;

class student{
	int rollno;
	String name;
	void insertRecord(int r, String n)
		{  
		  rollno=r;  
		  name=n;  
		 }  
		 void displayInformation()
		 	{
			 System.out.println(rollno+" "+name);
			 }  
}

public class Objclasmeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
student s1=new student();
student s2=new student();
Scanner sc=new Scanner(System.in);
String n2=sc.next();
String n4=sc.nextLine();
int n1=sc.nextInt();

int n3=sc.nextInt();



s1.insertRecord(n1,n2);
s2.insertRecord(n3,n4);

s1.displayInformation();
s2.displayInformation();

	
	}

}
 