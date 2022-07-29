package Newproject;

import java.util.Scanner;

/* Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink */

/*Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
*/


public class Billgeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Rs.100/pizza\r\n"
				+ "Rs.20/puffs\r\n"
				+ "Rs.10/cooldrink");
		System.out.println("Enter the no of pizzas");
		
		int pizza=sc.nextInt();
		System.out.println("Enter the no of puffs");
		int puffs=sc.nextInt();
		System.out.println("Enter the no of cool drinks");
		int cooldrink=sc.nextInt();
		int total=100*pizza+20*puffs+10*cooldrink;
		System.out.println("Total "+total);
		
	}
}
