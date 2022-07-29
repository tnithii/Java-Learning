package TestPackage;
import java.util.Scanner;
public class Greaternum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		/*  if(a>b) {
			if(a>c) {
				    System.out.println("the greater number is " +a);
			        }
			else {
				    if(b>c){
					System.out.println("the greater number is " +b);
				     }
				else {
					System.out.println("the greater number is " +c);
				     }
			     }
		   }
		else {
			if(b>c){
				System.out.println("the greater number is " +b);
			}
			else {
				System.out.println("the greater number is " +c);
			}
		}*/
		
		if (a>b && a>c)
		
			System.out.println("The greater number "+ a);
		
		else {
			if (b>c) 
				System.out.println("The greater number "+ b);
					
			else 
				System.out.println("The greater number "+ c);
				  
				
			  }
		   
		}

	}


