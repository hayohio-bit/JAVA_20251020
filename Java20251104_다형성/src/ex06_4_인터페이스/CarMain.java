package ex06_4_인터페이스;

public class CarMain {
	public static void main(String[] args) {

		Car ec = new GasCar();
		ec.move();
		ec.fillUp();

	}
}