package ex01;

import java.util.Objects;

public class InheritanceMain {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 25, "천호중학교");
		Student s2 = new Student("홍길동", 25, "천호중학교");
		s1.study();
		s1.eat();
		
		System.out.println(s1.toString());
		//"ex01.Student@1be6f5c3" 부모클래스에 메소드 없을 시 나오는 값(오브젝트 주소값?)
		//부모클래스에 메소드 설정시 'null'값 나옴
		//어떠한 매개변수를 가지고 있는지 확인하는 용도? getsetter 이용하지 않고 배열확인?
		
		System.out.println(s1.equals(s2));
		//equals 만 사용하면 false 값 나옴
		//부모클래스Person에 @Override hashCode() equals() 생성해주면 true값 나옴
		
		Teacher t1 = new Teacher("삼장법사", 50, "수학");
		t1.teach();
		
		Programmer p1 = new Programmer("손오공", 30, "자바");
		p1.code();
		
		Person per1 = new Person();
	
	}
	
}