package week2;
import java.util.*;

public class ch3q15 {
	public static void main(String[] args) {
		double height, standard, weight;
		Scanner scan = new Scanner(System.in);
		  
		 System.out.print("키를 입력하시오: ");
		 height = scan.nextDouble(); 
		 
		 System.out.print("몸무게를 입력하시오: ");
		 weight=scan.nextDouble();
		   
		 standard = (height -100) * 0.9;
		  
		 if(standard > weight)
		 System.out.print("저체중");
		  else if (weight == standard)
		 System.out.print("표준체중");
		  else
		 System.out.print("과체중");
		 }
}
 
