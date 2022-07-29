package Newproject;

import java.util.Scanner;

public class Associate {

	public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the associate id:");
	String asid=sc.next();
	System.out.println("Enter the associate name:");
	String asname=sc.next();
	System.out.println("Enter the number of days:");
	int no_of_days=sc.nextInt();
	Associate1 a1=new Associate1(asid,asname);
	
	
	System.out.println("Associate name:"+a1.getAsname());
	System.out.println("Associate name:"+a1.getAsid());
	System.out.println("The associate ram work status:" +a1.trackstatus(no_of_days));
	}
  
}
