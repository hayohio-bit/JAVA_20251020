package ex04_연습문제;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("현대", 2025, "SUV");
		car1.showInfo();
		
		System.out.println("\n--------------------------");
		
		Car car2 = new Car();
		car2.showInfo();
		
		System.out.println("\n--------------------------");

		Vehicle car3 = new Car("뭐", 0, "요");
		car3.showInfo();
		
		System.out.println("\n--------------------------");
		
		Vehicle car4 = new Vehicle("차",1);
		car4.showInfo();

		System.out.println("\n--------------------------");

		Car car5 = new Car();
		car5.showInfo();
		
		
		try {
		    Car car6 = (Car) new Vehicle("트럭", 6); // 런타임 시 ClassCastException 발생! ((6))
		    car5.showInfo();
		    car5.drive();
		    
		} catch (ClassCastException e) {
		    System.err.println("오류 발생: " + e.getMessage());
		    System.err.println("Vehicle 객체를 Car 타입으로 강제 변환할 수 없습니다. " +
		                       "new Vehicle(...)은 실제 Car 객체를 생성하지 않습니다.");
		}
		
	}
}
