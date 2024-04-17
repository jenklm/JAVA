package week04;

public class Graduate extends Students {
	private String assistant;
	private double scholarship;
	
	public Graduate(String name, int studentID, String department, int grade, int credit, String assistant, double scholarship) {
		super(name,studentID,department,grade,credit);
		this.assistant=assistant;
		if(scholarship<=1||scholarship>=0) {
			this.scholarship=scholarship;
		} 
	}
	public String getAssistant() {return assistant;}
	public void setAssistant(String assistant) {this.assistant=assistant;}
	public double getScholarship() {return scholarship;}
	public void setScholarship(int scholarship) {this.scholarship=scholarship;}
	
	 @Override
	 public String toString()
	 {
	  return super.toString()+" \n조교유형 : "+ assistant+"\n장학금 비율 : "+scholarship;
	 }
}
