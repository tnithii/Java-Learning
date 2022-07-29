package collections;

import java.util.HashMap;
import java.util.Scanner;

public class RemovingelementsfromHashMap7 {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the hashmap:");
int n=sc.nextInt();
System.out.println("enter the Hashmap elements:");
HashMap<Integer, String> hm=new HashMap<Integer,String>();
for(int i=0;i<n;i++)
{
	hm.put(sc.nextInt(),sc.next());
}
System.out.println("after remove the elements from hashmap, the size is: "+afterDelete7.afterDelete(hm));
	}

}
