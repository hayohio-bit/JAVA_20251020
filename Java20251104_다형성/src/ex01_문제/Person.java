package ex01_문제;
/*출력예시
 * 이름: 홍길동, 나이:20
 * 학교: 천호중학교
 */

public class Person {
	
	private String name;
	private int age;

	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);
	}
	// %s 문자열 / %d 정수 / %f 실수 / %.2f 소수점 두자리까지 출력
	
	
	Person() {}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
