package ex03_인터페이스;

public class Main {

	public static void main(String[] args) {

		Dog dog1 = new Dog("개", 1);
		dog1.makeSound();
		dog1.showInfo();

		System.out.println("----------------------");

		Cat cat1 = new Cat("냥", 1);
		cat1.makeSound();
		cat1.showInfo();

		System.out.println("----------------------");

		Cat nocat = new Cat();
		nocat.makeSound();
		nocat.showInfo();

	}

}
