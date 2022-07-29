package string;

public class Stringbufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.length());
		sb.append("world");
		System.out.println(sb);
		sb.insert(5,"_java");
		System.out.println(sb);
		sb.setCharAt(5, ' ');
		System.out.println(sb);
		System.out.println("Character at 6th position: "+sb.charAt(6));
		sb.deleteCharAt(3);
		System.out.println(sb);
		System.out.println("capacity of string buffer object: "+sb.capacity());
		
		System.out.println("Reversed String is "+sb.reverse());
	}

}
