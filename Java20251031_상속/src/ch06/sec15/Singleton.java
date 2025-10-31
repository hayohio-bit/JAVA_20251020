package ch06.sec15;

public class Singleton {

	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	//Singleton singleton = new Singleton(); //static은 static끼리만 논대
	
	// private 접근 권한을 갖는 생성자 선언, 외부에서 객체 생성 불가
	private Singleton() {	
	}
	
	// public 접근 권한을 갖는 정적 메소드 선언
	// 생성된 Singleton 객체를 사용(참조)할 수 있는 유일한 통로
	public static Singleton getInstance() {
		return singleton;
	}
	
}

class Sample{
	public Sample() {
		
	}
	static void func() {	//static이 없으면 SingletonExample에서 Sample.func() 오류
		System.out.println("func()...");
	}
}