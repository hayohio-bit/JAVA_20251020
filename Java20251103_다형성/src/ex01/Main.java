package ex01;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("천호중학교");
		s1.study();
		System.out.println(s1.info());
		System.out.println("-----------------------");
		
		Student s2 = new Student("홍길동", 25, "천호중학교");
		s2.study();
		System.out.println(s2.info());
	}

}


/*
[실행 순서 및 메모리 동작 순서]

1. 클래스 로드 (Method Area): Person, Student, Main 클래스 정보 JVM에 로드

2. main() 호출 (Stack): Main.main() 호출, 스택에 매개변수 args와 지역 변수 s1, s2 공간 확보

3. 객체 생성 (Heap):
		● new Student("천호중학교") → Student 객체 생성(힙)
		● Person 기본 생성자(super()) 호출, name, age 필드 초기화
		● school 필드 초기화
		● 스택에 s1 참조 변수로 힙 객체 주소 저장

4. 메서드 호출 (Stack):
		● s1.study(), s1.info() 호출마다 스택에 메서드 호출 프레임 추가 및 제거
		● 내부적으로 getName() 호출도 스택에 쌓임

5. 두 번째 객체 생성 및 메서드 호출:
		● new Student("홍길동", 25, "천호중학교") 힙에 객체 생성
		● Person(String name, int age) 생성자 호출으로 상위 클래스 필드 초기화
		● 스택에 s2 참조 변수 생성
		● s2.study(), s2.info() 호출 후 스택 프레임 제거
*/