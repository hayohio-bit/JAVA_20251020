package ex07;
import java.util.Scanner;
import ex07.Printer;
public class println {


	public static void main(String[] args) {

		
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		printer.println(10,20);
		
		Printer p = new Printer();
		p.println(1000);
		
		Printer p2 = new Printer();
		p2.print();
	

		
	}

}
