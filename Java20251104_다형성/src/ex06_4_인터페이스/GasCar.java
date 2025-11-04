package ex06_4_인터페이스;

public class GasCar implements Car {

	public void fillUp() {
		System.out.println("기름을 주유합니다.");
	}

	@Override
	public void move() {
		System.out.println("차를 움직입니다.");
	}

}
