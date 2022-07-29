package Inheritance;

public class ClassB extends ClassA {
	
	public ClassB() {
		super();
		System.out.println("hello");
		int a=15;
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		ClassB c1=new ClassB();
	
		//System.out.println(super.a);
	}

}
