package ex03;

public class 입력O출력X {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "안창현";
		s1.age = 29;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		int num = s1.add(5, 2);

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
		
		//함수명: add, 반환타입(리턴값): int, 매개변수(입력값): 정수2개(int형)
		int add(int n1, int n2) {
			int sum = n1+n2;
			return sum;	//return n1+n2
		}
		//함수명: out, 반환타입(리턴값): void, 매개변수(입력값): 정수2개(int형)
		void out(int n1, int n2) {
			int sum = n1+n2;
			System.out.println("두수 합 : " + sum);
	}

}
