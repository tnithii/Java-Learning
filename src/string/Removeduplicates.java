package string;

import java.util.*;

public class Removeduplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		StringBuilder sb=new StringBuilder();
		
		/*Set<Character> se=new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			
			se.add(str.charAt(i));
			
		}
		
		for(Character ch:se)
			sb.append(ch);
		System.out.println(sb);*/
		
		//===================================
	/* Another method */
				
		char[] arr=str.toCharArray();
		 
	for(int i=0;i<str.length();i++)
	{boolean repeat=false;
		for(int j=i+1;j<str.length();j++)
		{
			if(arr[i]==arr[j])
			{
				repeat=true;
				break;
			}
		}
		if(repeat==false)
			sb.append(arr[i]);
		
	}
		
System.out.println(sb);
	}

}
