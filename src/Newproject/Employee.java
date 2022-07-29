package Newproject;

public class Employee {
	private String employeeId;
	private double salary;
	private double incre=0;
	private String[] certification;
	private int rating;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String empid,double sal,String[] str) {
		employeeId=empid;
		salary=sal;
		certification=str;
	} 
	
	public double getSalary() {
		return salary;
	}
	/*public int getIncre() {
		return incre;
	}*/
	
	
	
	public void findrating()
	 {
		rating=1;
		for(int j = 0; j < certification.length; j++) {
		 if(certification[j].equalsIgnoreCase("java")||certification[j].equalsIgnoreCase("oracle")||certification[j].equalsIgnoreCase("GCUX")||certification[j].equalsIgnoreCase("ccna")||certification[j].equals("AWS"))
		
				rating++;
		 
		}
		 
	 }
	public int getRating() {
		findrating();
		return rating;
	}
	 public double calculateincrement()
	 {
		 //this.findrating();
		 
		switch(rating) {
		 case 1:
			 incre=salary*2/100;
			 salary+=incre;
			 return incre;
		 case 2:
			 incre=salary*3.5/100;
			 salary+=incre;
			 return incre;
		 case 3:
			 incre=salary*5/100;
			 salary+=incre;
			 return incre;
		 case 4:
			 incre=salary*7.5/100;
			 salary+=incre;
			 return incre;
		 case 5:
			 incre=salary*10/100;
			 salary+=incre;
			 return incre;
		 
		 default:
			 salary+=incre;
			 
		 return salary;
		 }
	 }
}

