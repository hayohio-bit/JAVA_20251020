package ex06_2_다형성;

public class CarMain {
	public static void main(String[] args) {

		Car ec = new ElectricCar();
		ec.move();
		ec.fillUp();

	}
}