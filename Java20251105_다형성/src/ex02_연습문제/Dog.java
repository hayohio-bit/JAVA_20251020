package ex02_연습문제;

//Animal을 상속받는다.
//makeSound()를 오버라이딩하여 “멍멍!” 출력
public class Dog extends Animal {

	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("\n멍멍!");
	}

}
