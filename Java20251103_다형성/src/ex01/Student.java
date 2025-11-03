package ex01;

public class Student extends Person {

	//▼ name과 age 부모클래스 Person에서 가져오기 위해
	//private String name;
	//private int age;
	//Person에 public String getName() {return name;}을 씀 
	private String school;
	
	public Student() {
		super(); //자동기입
	}
	
	public Student(String school) {
		super();	//자동기입
		this.school = school;
	}
	
	public Student(String name, int age, String school) {
		super(name, age); //상위클래스 전달
		this.school = school;
	}
	
	public void study() {
		System.out.println(getName() + "은 공부 중입니다.");
	}
	
}
