package ex02;

public class Student extends Person{
	void sInfo() {
		System.out.println("-----Student-----");
	}
	
	@Override
	void func() {
	System.out.println("--Student func()--");
	}
	
}
