package ex01_연습문제;

public class Car extends Vehicle {
	private String type;

	// 브랜드, 연식, 차종을 모두 초기화하는 생성자
	public Car(String brand, int year, String type) {
		super(brand, year); // 부모 클래스 생성자를 호출하여 브랜드와 연식 초기화
		this.type = type; // 차종 초기화
	}

	// 차량 전체 정보를 출력하는 오버라이딩 메서드
	@Override
	public void showInfo() {
		super.showInfo(); // 부모클래스의 showInfo()를 호출(브랜드, 연식 출력)
		System.out.println("\n차종: " + type);
	}

}

/*
 * 문제.
 * 
 * Vehicle(부모 클래스) 필드: brand, year 메서드: showInfo() → "브랜드: OOO, 연식: OOO년" 출력
 * 
 * Car(자식 클래스) Vehicle을 상속받는다. 추가 필드: type (예: "SUV", "세단" 등) 메서드: showInfo() →
 * 부모의 showInfo() 호출 후 차량 종류까지 출력
 * 
 * 출력예시 브랜드: 현대, 연식: 2025년 차종: SUV
 */
