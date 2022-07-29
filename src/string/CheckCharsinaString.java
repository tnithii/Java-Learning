package string;
import java.util.Scanner;
import java.util.Scanner.*;
public class CheckCharsinaString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		int len=str.length();
		/*char arr[]=new char[len];	
		for(int i=0;i<len;i++)
		{
			arr[i]=str.charAt(i);
			
		}
		System.out.println(arr);
		if (arr[0]==arr[len-1])
			System.out.println("valid String");
		
		else
			System.out.println("Invalid String");*/
			
		if(str.charAt(0)==str.charAt(str.length()-1))
	System.out.println("valid String");
		
		else
			System.out.println("Invalid String");
	}

}
