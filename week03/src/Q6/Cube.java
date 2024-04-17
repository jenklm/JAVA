package Q6;

public class Cube {

	private double side;// 정육면체의 한 변의 길이
	public double getSide() {
	return side;
	}
	public double getVolume() {
	return side*side*side;
	}
	public Cube(){ // 매개변수가 없는 생성자
		this.side =0;
	}
	
	public Cube(double side) { // 명시적 생성자 중복 
	    this.side = side;
	}
}
