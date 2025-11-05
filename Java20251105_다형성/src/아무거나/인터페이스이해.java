package 아무거나;

interface Flyable {
	void fly();
}

interface Swimmable {
	void swim();
}

class Duck implements Flyable, Swimmable {
	public void fly() {
		System.out.println("오리가 난다!");
	}

	public void swim() {
		System.out.println("오리가 수영한다!");
	}
}

	public class 인터페이스이해 {
		public static void main(String[] args) {
			Duck a = new Duck();
			a.swim();
			a.fly();
	}
}