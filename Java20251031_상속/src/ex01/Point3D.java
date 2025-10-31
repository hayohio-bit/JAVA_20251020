package ex01;

import java.util.Arrays;

public class Point3D extends Point {

	int z;
	
	Point3D (int x, int y, int z) {
		super(x, y);
		// super 없으면 컴파일 에러 발생
		// Point3D 클래스의 생성자 첫 줄이 생성자를 호출하는 문장이 아니므로
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	String getLocation() {
		return "x : " + x + ", y : "+ y + ", z : " + z;
	}
	
	
}
