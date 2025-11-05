package ex02_연습문제;

//Dog와 Cat 객체를 생성하고
//각각 이름과 나이를 설정한 후
//makeSound()를 호출하여 결과를 출력한다.
//
//출력 예시
//이름: 초코, 나이: 3살 - showInfo()
//멍멍!
//
//이름: 나비, 나이: 2살
//야옹!
public class Main {
	public static void main(String[] args) {

		Dog dog1 = new Dog("초코", 3);
		dog1.showInfo();
		dog1.makeSound();

		Cat cat1 = new Cat("나비", 2);
		cat1.showInfo();
		cat1.makeSound();

		Animal t1 = new Dog("로이", 5);
		t1.makeSound();
		t1.showInfo();
	}
}
