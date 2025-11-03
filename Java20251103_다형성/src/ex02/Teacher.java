package ex02;

public class Teacher extends Person {
	void tInfo() {
		System.out.println("-----Teacher-----");
	}
	
	@Override
	void func() {
		System.out.println("--Teacher func()--");
	}
	
}
