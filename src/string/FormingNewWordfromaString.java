package string;

import java.util.Scanner;

public class FormingNewWordfromaString {
	
	public static String formNewWord(String s,int n)
	{
		int len=s.length(); 
		if(len>=2*n)
		{
			String s1=(s.substring(0,n)).concat(s.substring(len-n, len));
			return s1;
			//instead of 12th and 13th line we can use the below also. 
			
			/*String s1=s.substring(0,n);
			String s2=s.substring(len-n, len);
			return s1.concat(s2);*/
		}
		else 
			return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
	System.out.println(formNewWord(str,n));
	}

}
