package asa2019;

public class Lecturer implements Iperson{
	private String employeeID;
	private String department;
	public Lecturer(String employeeID, String department) {
		this.employeeID = employeeID;
		this.department = department;
	}
	@Override
	public String displayDetails() {
		System.out.println("Employee ID : "+employeeID + "||" + "Department  : " +department);
		return null;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
