package Newproject;

import java.util.Scanner;

public class Currencycalculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String[] code= {"CAD","USD","HKD","SGD"};
		String[] country= {"Canada","USA","Hong Kong","Singapore"};
		double[] ex_rate= {52.08,69.55, 8.86, 51.29};
		System.out.println("Enter the Contry code");
		Scanner sc=new Scanner(System.in);
	String code1=sc.nextLine().toUpperCase();
		System.out.println("Enter the amount");
		double amt=sc.nextDouble();
		double indian_currency;
		int i=0;
		for(i=0;i<5;i++) {
			if (code1==country[i]) {
			indian_currency=ex_rate[i]*amt;
			System.out.println("The indian currency o f"+country[i]+code[i]+" is "+indian_currency);
			
			break;
			}
		}
		

	}

}
