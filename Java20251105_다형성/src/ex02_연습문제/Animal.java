package ex02_연습문제;

//필드: name, age
//메서드: makeSound() → “동물이 소리를 냅니다.” 출력
public class Animal {
	private String name;
	private int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("동물이 소리를 냅니다.");
	}

	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d살", name, age);
	}

}
