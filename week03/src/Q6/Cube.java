package Q6;

public class Cube {

	private double side;// ������ü�� �� ���� ����
	public double getSide() {
	return side;
	}
	public double getVolume() {
	return side*side*side;
	}
	public Cube(){ // �Ű������� ���� ������
		this.side =0;
	}
	
	public Cube(double side) { // ����� ������ �ߺ� 
	    this.side = side;
	}
}
