/**Loop conditions
 * 
 */
package TestPackage;

import java.util.Scanner;

public class Javaloop {


public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner cost=new Scanner(System.in);
	System.out.println("enter your amount");
	int a=cost.nextInt();
	
	int pencost=10;
	int spen=20;
	if (a >= spen) {
		System.out.println("u can buy a spen");
	}
	else if (a >= pencost) {
		System.out.println("u can buy a normal pen ");
	}
	else {
		System.out.println("pen cost is more than " + a);
	}

	
	}

}
