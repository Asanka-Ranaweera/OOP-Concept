package asa2019;

public class Student implements Iperson{
	private String studentID;
	private int grade;

	public Student(String studentID,int grade) {
		this.studentID = studentID;
		this.grade = grade;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String displayDetails() {
		System.out.println("Student ID : "+studentID + "||" + "Grade  : " +grade);
		return null;
	}
}
