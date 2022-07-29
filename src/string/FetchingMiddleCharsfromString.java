package string;

import java.util.Scanner;

public class FetchingMiddleCharsfromString {
	public static String getMiddleChars(String s)
	{
		
			int len=s.length();
			System.out.println(len);
			String s1=s.charAt(len/2-1)+""+s.charAt(len/2)+"";
			return s1;
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the even number String:");
		String str=sc.nextLine();
		int len=str.length();
		
		System.out.println(FetchingMiddleCharsfromString.getMiddleChars(str));
		
	

	}

}
