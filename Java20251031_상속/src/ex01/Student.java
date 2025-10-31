package ex01;
// Student 클래스는 Person 클래스 상속
public class Student extends Person {

	//멤버변수는 외부 노출 시키지 않는다-> 정보은닉
	//private String name;
	//private int age;
	private String school;
	
	
	Student(){} //디폴트 생성자
	//▼ 클래스 상속으로 인해 생략 가능한 부분
	Student(String name, int age, String school){
	//	this.name = name;
	//	this.age = age;
	//Student(String school){
		super(name, age);
		this.school = school;
	}
	
	public void study() {
		System.out.println(school + "에서 공부 중입니다.");

	
	}
	public void eat() {
		System.out.println("은 점심을 먹는다.");
	}
}
