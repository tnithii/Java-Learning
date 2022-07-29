package Newproject;

import java.util.Scanner;

public class Pencilcount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the std");
	int std=sc.nextInt();
	int i,sum=0;
	for(i=1;i<std;i++) {
		sum=sum+i*i;
	
	}
	System.out.println(sum);

	}

}
