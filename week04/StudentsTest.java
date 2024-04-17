package week04;

public class StudentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students("김00",2022111253,"디지털미디어 ",2,50);
		System.out.println(s);
		
		Undergraduate u=new Undergraduate("이00",2019111253,"소프트웨어융합 ",3,80,"디션 ");
		System.out.println(u);
		
		Graduate g=new Graduate("박00",2016111253,"디미",2,100,"실습 조교",0.8);
		System.out.println(g);

	}

}
