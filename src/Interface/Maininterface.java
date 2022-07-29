package Interface;

public class Maininterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Train t=new Train();
		
		c.Break();
		c.drive();
		c.turnleft();
		c.checkmotor();
		t.Break();
		t.drive();
		t.turnleft();
		t.getnoofpeople();
		
	}

}
