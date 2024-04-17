package week2;

public class ch4q18 {

	public static void main(String[] args) {
		String[] cards= { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] values={ "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		String card = cards[(int)(Math.random() * cards.length)]; 
		String value = values[(int)(Math.random() * values.length)]; 
		System.out.println(card + "의 " + value); 
	}

}
