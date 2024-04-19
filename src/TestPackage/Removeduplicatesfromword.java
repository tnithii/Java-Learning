package TestPackage;

import java.util.LinkedHashSet;

public class Removeduplicatesfromword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nithyakala";
		char[] ch=new char[str.length()];
		for(int i =0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			//System.out.println(ch[i]);
		}
LinkedHashSet<Character> set=new LinkedHashSet<Character>();
for(int j=0;j<str.length();j++)
	
{
	set.add(ch[j]);
	
}
for(char c:set)
{
	System.out.println(c);
}
	}

}
