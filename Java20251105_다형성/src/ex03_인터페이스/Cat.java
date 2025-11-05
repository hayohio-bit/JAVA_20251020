package ex03_인터페이스;

public class Cat implements Animal {

	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat() {
		System.out.println("뭘봐");
	}

	@Override
	public void makeSound() {
		System.out.println("야옹");
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d년\n", name, age);
	}
}
