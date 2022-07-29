package TestPackage;

import java.util.Scanner;

public class Arrayaddevennum {
	
/*	void compare(int num )
	{
		for(int i=0;i<num;i++) {
		  if (str1[i]%2])
			}
	
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter the array size");
int num=sc.nextInt();
int i,b=0,c=0;


if(num>0 && num<=10) {
	int str1[]=new int[num];
	int str2[]=new int[num];
	int str3[]=new int[b];
	System.out.println("Enter the first array elements");
	for(i=0;i<num;i++) {
		str1[i]=sc.nextInt();
		}
	System.out.println("Enter the second array elements");
	for(i=0;i<num;i++) {
		str2[i]=sc.nextInt();
		}
	for( i=0;i<num;i++) {
		  if (str1[i]%2==0 && str2[i]%2==0) {
			 
			  //System.out.println(str1[i]+str2[i]);
			 int add=str1[i]+str2[i];
			 System.out.println(add);
			 //str3[c]=4;
			 //c++;
		
		  }
		  else
		  {
			  b++;
		  }
	
			}
	if(num==b) {
		System.out.println("no even num in both arrays");
	}
	//System.out.println("addtion of even numbers");   
}
else 
{
	System.out.println("The num is invalid");
}

	}

}
