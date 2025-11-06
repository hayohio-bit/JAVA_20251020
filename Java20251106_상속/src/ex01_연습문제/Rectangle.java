package ex01_연습문제;

public class Rectangle extends Shape {

	public Rectangle(int x, int y) {
		super(x, y); // 부모 생성자 호출
	}

	@Override
	public void draw() {
		System.out.printf("사각형을 (%d, %d)에 그립니다.\n", getX(), getY());
	}

}
