package ex04;

public class Main {
	public static void main(String[] args) {

		A a = new A();
		a.test();	 //A function
		
		a = new B();
		a.test(); 	//B function
		
		a = new C();
		a.test(); 	//C function
		
		System.out.println("---------------");
		
		a = new B();
		B b = (B)a;
		b.test();	//B function
		
		a = new C();
		C c = (C)a;
		c.test(); 	//C function
		
		System.out.println("---------------");

		A aa = null;
		C cc = new C();
		cc.test();	//C function
		
		aa = (A)cc;
		aa.test();	//C function
		
		C cc1 = (C)aa;
		cc1.test(); //C function
		
		aa = (B)cc;
		aa.test();	//C function
		
	}
}
