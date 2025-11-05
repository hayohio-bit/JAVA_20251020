package ex01_연습문제;

// 부모 클래스 정의
public class Vehicle {

	// 필드 선언
	private String brand;
	private int year;

	// 브랜드와 연식을 초기화하는 생성자
	Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	// 차량정보를 출력하는 메서드
	public void showInfo() {
		System.out.printf("브랜드: %s, 연식: %d년", brand, year);
	}

}
