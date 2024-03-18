package week2;

public class ch4q12 {
	public static void main(String[] args) {
		double[] scores = {1.0,2.0,3.0,4.0};
		for (double value:scores)
			System.out.print(value + " ");
			System.out.println("");
		double sum=0.0;
		for (double element:scores)
			sum+=element;
		System.out.println("합은 " + sum);
		double max=0.0;
		for (double num:scores) {
			if (max>=num)
				max=max;
			else 
				max=num;
		}
		System.out.println("최대값은 " + max );
	}
}

