package Newproject;

public class Associate1 {
	
	private String asname;
	private String asid;
	private int no_of_days;
	private String workstatus;
	
	public String getWorkstatus() {
		return workstatus;
	}

	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public Associate1(String name,String id){
		asname=name;
		asid=id;
	}

	public String getAsname() {
		return asname;
	}

	public void setAsname(String asname) {
		this.asname = asname;
	}

	public String getAsid() {
		return asid;
	}

	public void setAsid(String asid) {
		this.asid = asid;
	}
	public String trackstatus(int days)
	{
	no_of_days=days;
	
	if(no_of_days>=0&&no_of_days<=20)
	{
		workstatus="Core skills";
	return workstatus;
	}
	
	else if(no_of_days>=20&&no_of_days<=40)
		{
		workstatus=	"Advanced modules";
	return workstatus;
		}
		else if(no_of_days<=60&&no_of_days>=40)
			{
			workstatus=	"Project phase";
	return workstatus;
	}
	
		else
	{
			workstatus=	"Deployed in project";
	return workstatus;
	}
}

	

}
