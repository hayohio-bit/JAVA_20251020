package ex06_2_다형성;

public class Car {
	public void move() {
		System.out.println("차를 이동합니다.");
	}

//Car 클래스를 상속하는 클래스는 fillUp메서드를
//반드시 재정의 하세요!!
	public void fillUp() {
		System.out.println("물을 충전합니다.");
	}
}
