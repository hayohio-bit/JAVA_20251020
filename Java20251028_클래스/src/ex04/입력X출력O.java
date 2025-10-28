package ex04;

import ex04.Student;

public class 입력X출력O {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "안창현";
		s1.age = 29;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		String addr = s1.add();
		System.out.println(addr);
		addr = s1.add();
		System.out.println();
}
}
	/*
	 * 클래스 - 멤버변수(속성), 멤버메소드(함수)
	 * 멤버변수 - 정적(상태)
	 * 멤버메소드 - 동적(행동)
	 */
class Student{
		String name;
		int age;
		String address;
		
		void study() {
			System.out.println(name + " Java 공부 중 입니다.");
		}
		
		//함수명: add, 반환타입(리턴값): String, 매개변수(입력값): 없음
		String add() {

			return address;
	}
}