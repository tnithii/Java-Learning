package methodslearning;
public class method1 {
	
	static int add(int a,int b)
	{

		int  c;
        c= a+b;
        return c;
	}
	static void sub(int a,int b)
	{

		int  c;
        c= a-b;
     //return c; //we cant use this here coz it will throw the error.since method has a void statement.
        System.out.println("the sub is " + c);
	}
	static int mul(int a,int b)
	{
	
        int c= a*b;
        return c;
	}
	static int div(int a,int b)
	{

		
        return a/b;
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		//int sum = add(10,13);

		System.out.println("the sum is " + add(10,11));
		//System.out.println("the sub is " + sub(13,11));
		sub(10,16); //we can call this sub method but we can't print the value here.
					//we can write the print statement in the sub method itself. 
					//sub method will not return any value since it has a void.(static void sub(int a,int b))
		System.out.println("the mul is " + mul(15,11));
		System.out.println("the div is " + div(17,11));
	}
	
}
