package PojoClass;

public class EmployeeDetailsInArray {
	String name;
	int empId;
	String mailId;
	long[] mobno;
	public EmployeeDetailsInArray(String name, int empId, String mailId, long[] mobno) {
		super();
		this.name = name;
		this.empId = empId;
		this.mailId = mailId;
		this.mobno = mobno;
	}
	public EmployeeDetailsInArray() {
		super();
	}
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
	public String getMailId() {
		return mailId;
	}
	public long[] getMobno() {
		return mobno;
	}
	
	
	
	

	
	
}
