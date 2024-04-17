package Q3;

public class Dog {
	
		String breed;
		int age;
		String color;
		
		public Dog(String breed, int age, String color) {
			this.breed = breed;
			this.age = age;
			this.color = color;
		}
		
		@Override
		public String toString() {
			return "("+breed+","+age+","+color+")";
		}
		
		void barking(){
			System.out.println("barking()");
		}
		
		void hungry() {
			System.out.println("hungry()");
		}
		
		void sleeping() {
			System.out.println("sleeping()");
		}
}

