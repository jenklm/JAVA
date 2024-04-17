package week04;

public class Undergraduate extends Students {
	private String club;
	
	 public Undergraduate(String name, int studentID, String department, int grade, int credit,String club)
	 {
	  super(name, studentID, department, grade, credit);
	  this.club=club;
	 }
	
	public String getClub() {return club;}
	public void setClub(String club) {this.club=club;}
	
	@Override
	 public String toString()
	 {
	  return super.toString()+"\n동아리명 : "+club;
	 }

	
}
