package string;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="nithyakala";
		System.out.println("name: "+name);
		System.out.println("3rd character of name: "+name.charAt(2));
		System.out.println("Nithyakala compare to selvakumar: "+name.compareTo("Selvakumar"));
		System.out.println("Is nithyakala is eqqual to nithyakala?: "+name.equals("nithyakala"));
		System.out.println("length of teh name: "+name.length());
		System.out.println("replace 'a' with 'e' "+name.replace('a', 'e'));
		int index=name.indexOf('l');
		System.out.println(index);
		String t=name.substring(0,3);
		System.out.println(t);
		
	}

}
