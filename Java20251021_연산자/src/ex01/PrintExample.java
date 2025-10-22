package ex01;

/*
 * 작성자 : 선하영
 * 작성일 : 2025.10.21
 * 코드의미 : 학습용
 */

/*
 * 1. 한 파일안에는 한 클래스만 있는 것이 일반적
 * 2. 두개 클래스가 존재하면 public 키워드는 한 곳만 지정
 *    --> public 키워드가 있는 곳 클래스명이 파일명
 * 3. public이 없는 클래스가 두 개 이상 존재할 때 파일명은 클래스명 아무거나 사용 가능
 * 	  단, main 함수가 있다면 main 함수가 있는 곳 클래스 명을 파일명으로 기입한다.
 * 
 */

public class PrintExample {

	public static void main(String[] args) {

		System.out.println("Hello, Java");
		
		int age = 20;
		
		System.out.print("안녕하세요, 선하영입니다.");
		System.out.println("안녕하세요, 선하영입니다.");
		System.out.println("안녕하세요, 25 선하영입니다.");
		System.out.println("안녕하세요, 24 선하영입니다.");
		System.out.println("안녕하세요, 20 선하영입니다.");
		System.out.println("안녕하세요, "+ age +" 선하영입니다.");
		System.out.println("안녕하세요, "+ 25 +" 선하영입니다.");
		System.out.println("안녕하세요, "+ age +" 선하영입니다.");

	
		
		// sysout -> System.out.println();
		// 한 줄 주석
		/*
		 * 여 러 줄
		 */
		// System.out.print() - 줄바꿈 없
		// System.out.println() - 줄바꿈 있
	}
}

