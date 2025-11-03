package ex03;

public class Main {
	public static void main(String[] args) {
		//상위클래스는 하위클래스 참조 가능
		//참조는 가능하지만, 접근할 수 있는 영역은 상위클래스까지만 가능
		A a = new A();	//1
		//a = new B();	//2
		//a = new C();	//3
		
		//메소드 오버라이딩이 된 경우는, 참조변수가
		// 가르키는 클래스 메소드가 호출
		a = new A();
		a.test(); //A class
		
		a = new B();
		a.test(); //B class
		
		a = new C();
		a.test(); //C class
		
		System.out.println("---------------");
		
		a = new B();
		// B b = new A(); 불가
		B b = (B)a;
		b.test();
		System.out.println("---------------");

		a = new C();
		C c = (C)a;
		c.test();
		
		System.out.println("---------------");
		A aa = null;
		
		C cc = new C();
		
		aa = (A)cc;
		
		C cc1 = (C)aa;
		
		
	}
}
