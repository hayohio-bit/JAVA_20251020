package ex01_연습문제;

public class Shape {

	private int x; // X좌표
	private int y; // y좌표

	public Shape() {
		this(0, 0);
	} // 기본생성자 (0,0)초기화

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	} // 좌표를 직접 받는 생성자

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	// Getter (private 멤버 보호)

	public void draw() {
		System.out.printf("도형을 (%d, %d)에 그립니다.\n", x, y);
	} // 기본 draw()
}
