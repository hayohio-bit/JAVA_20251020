package ex01_문제;

public class Main {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.showStudentInfo();
		System.out.println("----------------------");

		Student s2 = new Student("홍길동", 20, "천호중학교");
		s2.showStudentInfo();
		System.out.println("----------------------");
		s2.showInfo();
		
	}

}
