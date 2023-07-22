package oop2019B;

public class Engineer implements IEmployee{
	private String employeeID;
	private String company;
	
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public Engineer(String employeeID, String company) {
	
		this.employeeID = employeeID;
		this.company = company;
	}
	
	@Override
	public String showEmployeeDetails() {
		
		System.out.println("employeeID = "+ employeeID+","+"company = "+company);
 		return null;
	}
	
	
}
