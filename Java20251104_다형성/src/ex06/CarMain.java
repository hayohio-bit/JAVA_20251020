package ex06;

//상속 변경 - 메소드 다형성 처리 - 인터페이스? 암튼 이 코드가지고 뭘 해본다함
public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}

}
