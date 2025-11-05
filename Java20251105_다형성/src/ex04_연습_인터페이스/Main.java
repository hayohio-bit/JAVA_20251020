package ex04_연습_인터페이스;

public class Main {

	public static void main(String[] args) {

		Printer p1 = new LaserPrinter();
		Printer p2 = new InkjetPrinter();

		p1.print("message 출력");
		p2.print("message 출력");

		System.out.println("----------------------");
		System.out.println("----------------------");

		Printer p = new LaserPrinter();
		p.print("테스트 페이지 출력");
		System.out.println("----------------------");
		p = new InkjetPrinter();
		p.print("테스트 페이지 출력2");

	}

}
