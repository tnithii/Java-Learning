package collections;

import java.util.ArrayList;
import java.util.List;

public class Evennumber {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>() ;
		List<Integer> even=new ArrayList<Integer>() ;
		
		for(int i=1;i<20;i++)
		{
			num.add(i);
		}
	System.out.println(num);
	
	for(int i:num){
	if((i%2)==0)
	{
		even.add(i);
	}
	}
	System.out.println(even);
	}
	}


