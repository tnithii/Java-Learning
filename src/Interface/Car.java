package Interface;

public class Car extends Motorisedvehicle implements IVehicle  {

	public void drive()
	 {
		 System.out.println("Driving the car");
	 }
	 
	public void turnleft()
	 {
		 System.out.println("Turnleft");
	 }
	public void Break()
	 {
		 System.out.println("The car is in a brake mode");
		 
	 }
	 
	
}


