package PojoClass;

public class EmployeeDetails {
	String name;
	int empid;
	String mailId;
	long phno;
	public EmployeeDetails(String name, int empid, String mailId, long phno) {
		
		this.name = name;
		this.empid = empid;
		this.mailId = mailId;
		this.phno = phno;
	}
	
	public EmployeeDetails() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}
	//response time for hamcrustmatches
	
	
	

}
