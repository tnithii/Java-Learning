package Newproject;

import java.util.Scanner;

public class EmployeeMain {

		public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			String[] certification;
			System.out.println("Enter the employee Id:");
			String EmpId=sc.next();
			System.out.println("Enter the Salary");
			double salary=sc.nextDouble();
			System.out.println("enter the no of certifiction complete");
			int num=sc.nextInt();
			certification=new String[num];
			if(num>0) {
				System.out.println("enter the name of the certifications");
				for(int a=0; a<certification.length; a++)
					certification[a]=sc.next();
			}
			
			Employee e1=new Employee(EmpId, salary, certification);
			
			
			
			
			//e1.findrating(certification);
			
	        System.out.println("Your rating is " + e1.getRating());
	        System.out.println("Increment amount is " + e1.calculateincrement());
	        System.out.println("Current salary " + e1.getSalary());
			
			}
	

	}



