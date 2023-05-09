package PojoClass;

import java.awt.event.FocusEvent.Cause;

public class EmployeeDetailsWithSpouse {
	String name;
	long mobno;
	Spouse spouse;
	public EmployeeDetailsWithSpouse(String name, long mobno, Spouse spouse) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.spouse = spouse;
	}
	public EmployeeDetailsWithSpouse() {
		super();
	}
	public String getName() {
		return name;
	}
	public long getMobno() {
		return mobno;
	}
	public Spouse getSpouse() {
		return spouse;
	}
	
	
	

}
