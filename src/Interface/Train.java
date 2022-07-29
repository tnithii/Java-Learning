package Interface;

public class Train implements IVehicle,IPublictransport {

	public void drive()
	 {
		 System.out.println("train is in drive mode");
	 }
	 
	public void turnleft()
	 {
		 System.out.println("Turnleft");
	 }
	public void Break()
	 {
		 System.out.println("The train is in a brake mode");
		 
	 }
	
	public void getnoofpeople()
	{
		System.out.println("No of people 100");
	}
}
