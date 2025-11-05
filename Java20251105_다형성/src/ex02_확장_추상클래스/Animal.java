package ex02_확장_추상클래스;

//필드: name, age
//메서드: makeSound() → “동물이 소리를 냅니다.” 출력
public abstract class Animal {

	private String name;
	private int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void makeSound();
	// 자손클래스에서 재정의 필수

	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d살", name, age);
	}

}
