package collections;

import java.util.Arrays;
import java.util.Collections;
	import java.util.Scanner;

	public class Findwordfromsentence {
	             public static void main(String[] args) 
	             {
	            	 String str = "I am on my way";
	            	 String[] ch=new String[str.length()];
	            	 ch=str.split(" ");
	            	 String findword="an";
	            	 int a=0;
	            	 for(String i:ch)
	            	 {
	            		 //System.out.println(i);
	            		 if(findword.equals(i))
	            		 {
	            			 a++;
	            		 System.out.println("Able to find the given word:" + i);
	            		 }
	            		 
	            	 }
	            	 if(a==0)
	            	 {
	            		 System.out.println("The given word is not present in the sentence");
	            	 }
	            	 
	            		 
	            	 System.out.println(ch[0]);
	   }
	}



