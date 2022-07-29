package Array;

import java.util.Scanner;

public class array1 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the even number String:");
			String str=sc.nextLine();
			int len=str.length();
			char arr[]=new char[len];	
				
	for(int i=0;i<len;i++)
	{
		arr[i]=str.charAt(i);
		
	}
	System.out.println(arr);
	for(char ch:arr)
	System.out.println(ch);

}
}

