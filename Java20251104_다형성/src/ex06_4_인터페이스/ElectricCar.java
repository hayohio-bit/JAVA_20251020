package ex06_4_인터페이스;

public class ElectricCar implements Car {

	@Override
	public void fillUp() {
		System.out.println("전기를 충전합니다.");
	}

	@Override
	public void move() {
		System.out.println("차를 움직입니다.");
	}
}
