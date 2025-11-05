package ex04_연습_인터페이스;

public class InkjetPrinter implements Printer {

	public InkjetPrinter() {
	}

	@Override
	public void print(String message) {
		System.out.println("잉크젯 프린터 출력." + message);
	}
}