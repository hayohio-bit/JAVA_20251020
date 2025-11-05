package ex03_인터페이스;

public class Dog implements Animal {

	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d년\n", name, age);
	}
}