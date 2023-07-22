package oop2019B;

public class Manager implements IEmployee {
	private String managerID;
	private double salary;
	
	public Manager(String managerID, double salary) {
	
		this.managerID = managerID;
		this.salary = salary;
	}
	
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("managerID = "+ managerID+","+"Salary = "+salary);
 		return null;
	}
}
