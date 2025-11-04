package ex03;

public class Main {

	public static void main(String[] args) {

		Archer a = new Archer();
		a.attack();
		a.defend();
		System.out.println("----------------------");
		
		Warrior w = new Warrior();
		w.attack();
		w.defend();
		System.out.println("----------------------");
		
	}

}
