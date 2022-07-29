package Interface;

import java.util.Scanner;

/*interface Percentage1{ // in same file we can't give public interface Percentage1{}
	public float rateOfInterest = 10.5f;
	public double calculateInterest1(double amount);
}
class InterestCalc implements Percentage1{ //in same file we can't give public class InterestCalc implements Percentage1
	public double calculateInterest1(double amount) {
		float amt=(float)(amount*rateOfInterest/100);
		return amt;
	}
	
}*/



public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Percentage i=new InterestCalc(); // we can also give =====> InterestCalc i=new InterestCalc();
			System.out.println("Enter the amount:");
			double amount=sc.nextInt();
			System.out.println("The interest amount is: "+i.calculateInterest1(amount));
			
		}

	}


