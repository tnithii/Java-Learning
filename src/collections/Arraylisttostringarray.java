package collections;


	

	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	import java.util.Scanner;

	public class Arraylisttostringarray {
	    public static String[] convertToStringArray(ArrayList<String> l){
	    String b[]=new String[l.size()];
	    l.toArray(b);
	    System.out.println("before sorting");
	    for(String s:l)
        {
            System.out.println(s);
            
        }
	 
	    Arrays.sort(b);
	    System.out.println("After sorting");
	    return b;
	    }
	   public static void main(String[] args){
	       Scanner sc=new Scanner(System.in);
	       int n=Integer.parseInt(sc.nextLine());
	       ArrayList<String> str=new ArrayList<String>();
	       for(int i=0;i<=n;i++)
	           str.add(sc.next());
	       System.out.println(str);
	       
	            for(String s:Arraylisttostringarray.convertToStringArray(str))
	            {
	                System.out.println(s);
	                
	            }
	          
	   }
	}



