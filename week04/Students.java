package week04;

public class Students {

	private String name;
	private int studentID;
	private String department;
	private int grade;
	private int credit;
	
	public Students(String name, int studentID, String department, int grade, int credit) {
		this.name=name;
		this.studentID=studentID;
		this.department=department;
		this.grade=grade;
		this.credit=credit;
		
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	public int getStudentID() {return studentID;}
	public void setStudentID(int studentID) {this.studentID=studentID;}
	public String getDepartment() {return department;}
	public void setDepartment(String department) {this.department=department;}
	public int getGrade() {return grade;}
	public void setGrade(int grade) {this.grade=grade;}
	public int getCredit() {return credit;}
	public void setCredit(int credit) {this.credit=credit;}
	
	
	@Override
	public String toString() {
		return "<학생 정보>" + "\n+이 름 : " + name + "\n학  번 : "+studentID +"\n전  공 : "+department+"\n학  년 : " + grade + "\n이수학점 : "+credit; 
	}
	
}
	


 