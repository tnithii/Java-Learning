package Polymorphism;

import java.util.Scanner;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius for circle");
		float r=sc.nextFloat();
		System.out.println("Enter the color for circle");
		String Ccolor=sc.next();
		System.out.println("Enter the Length and Breadth for circle");
		float lb=sc.nextFloat();
		System.out.println("Enter the color for Square");
		String Scolor=sc.next();
		
		Circle c1=new Circle();
		Square s1=new Square();
		c1.setColor(Ccolor);
		s1.setColor(Scolor);
		c1.setRadius(r);
		s1.setLb(lb);
		c1.calculatearea(); 
		s1.calculatearea();
		

	}

}
