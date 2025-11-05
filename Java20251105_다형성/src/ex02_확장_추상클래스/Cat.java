package ex02_확장_추상클래스;
//Animal을 상속받는다.

//makeSound()를 오버라이딩하여 “야옹!” 출력

public class Cat extends Animal {

	Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("\n야옹~");
	}
}
