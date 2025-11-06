package 문제01;

public class Circle extends Shape {

	public Circle(int x, int y) {
		super(x, y); // 부모 생성자 호출
	}

	@Override
	public void draw() {
		System.out.printf("원을 (%d, %d)에 그립니다.\n", getX(), getY());
	}

}