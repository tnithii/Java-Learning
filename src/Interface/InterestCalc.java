package Interface;

public class InterestCalc implements Percentage{
	public double calculateInterest1(double amount) 
	{
		float amt=(float)(amount*rateOfInterest/100);
		return amt;
	}
}
