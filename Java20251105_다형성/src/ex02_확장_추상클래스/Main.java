package ex02_확장_추상클래스;

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

		System.out.println("----------------------");

		Cat cat1 = new Cat("나비", 2);
		cat1.showInfo();
		cat1.makeSound();

		System.out.println("----------------------");

		Animal t1 = new Dog("로이", 5);
		t1.showInfo();
		t1.makeSound();

		System.out.println("----------------------");

		// ▼ 추상클래스는 인스턴스화 될 수 없으므로 오류 발생
		// Animal a = new Animal("동물", 10);
		// a.showInfo();
		// System.out.println("");
		// a.makeSound();

	}
}
