package 상속_연습문제1;

public class Student extends Human {

	private String number;
	private String major;

	Student() {
	}

	Student(String name, int age, int height, int weight, String number, String major) {
		super();
		this.number = number;
		this.major = major;
	}

	@Override
	public void printInformation() {
		super.printInformation();
		System.out.println("  " + number + "  " + major);
	}

}
