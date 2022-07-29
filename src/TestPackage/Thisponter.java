package TestPackage;

public class Thisponter{

	static int a=78;
	
	public void disp(int ab) {
		 
	a=ab;
		
		System.out.println("display method: "+ab);
		
	}

	public void show1()
	{
		System.out.println(a);
	}
	public void disp1(int a) {
		
		
		
		System.out.println("display method: "+a);
		
	}
	public static void main(String[] args) {
		
		Thisponter t = new Thisponter();
		
		t.disp(15);
		System.out.println(a);
		t.disp1(20);
		t.show1();
	}


}
