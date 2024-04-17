package Q1;

public class NumberBoxTest {

	public static void main(String[] args) {
		NumberBox nb = new NumberBox();
		nb.iValue = 10;
		nb.dValue = 1.2345; //F를 붙일 지 말 지 고민,이거에 따라 결과 달라짐..  
		
		System.out.println(nb.iValue);
		System.out.println(nb.dValue);
	}

}
