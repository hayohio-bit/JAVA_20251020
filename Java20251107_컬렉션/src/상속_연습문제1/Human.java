package 상속_연습문제1;

public class Human {

	private String name;
	private int age;
	private int height;
	private int weight;

	Human() {
	}

	Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void printInformation() {
		// System.out.printf("%s %d.5 %d %d", name, age, height, weight);
		System.out.print(name + "  " + age + "  " + height + "  " + weight);
	}

}
