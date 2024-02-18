package testing;

class abstraction_interface {
	abstract class abs{
	void add() {
		// TODO Auto-generated method stub
	}
	void subscract() {
		System.out.println("We can add body to non abstract method of abstract class");
	}
	}
	class Maths extends abs{
		 void add() {
			System.out.println("implemented the abstract class in maths class");
		
		}
	}
	
	public static void main(String[] args) {
		Maths mat= new Maths();
		mat.add();
		
	}
}
	
