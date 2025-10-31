package ex01;

public class Teacher {

	private String name;
	private int age;
	private String subject;
	
	public Teacher() {}
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public void teach() {
		System.out.println(subject + "를 가르칩니다.");
	}
	
}
