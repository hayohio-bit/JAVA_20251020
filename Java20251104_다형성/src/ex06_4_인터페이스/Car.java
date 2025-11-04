package ex06_4_인터페이스;

public interface Car {

	void move();

	// 인터페이스에서 default 메소드 사용시
	// default 메소드를 사용하면 인터페이스에 새로운 기능을
	// 추가하더라도 기존 구현 클래스들이 즉시 해당 메소드를
	// 구현할 필요 없이 기본 동작을 상속받을 수 있음
	default void stop() {
		System.out.println("---------");
	};

	public abstract void fillUp();
}
