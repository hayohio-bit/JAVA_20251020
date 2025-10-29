package ex07;

public class Printer {

	//static : 개체 생성하지 않고 사용할 수 있음 
	
	public static void println(int value) {
		System.out.println(value);
	}
	public static void println(boolean value) {
		System.out.println(value);
	}
	public static void println(double value) {
		System.out.println(value);
	}
	public static void println(String value) {
		System.out.println(value);
	}

	public static void println(int value, int value2) {
		System.out.println(value+value2);
	}
	
	public void print() {
		System.out.println("pprint~~");
	}
	
}