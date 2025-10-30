package car;

public class Main {
	
    public static void main(String[] args) {
    	
        Car car1 = new Car("빨강");         // 첫 번째 자동차
        Car car2 = new Car("파랑", 100);    // 두 번째 자동차

        car1.setSpeed(80);  // setter로 속도 설정
        car1.drive();       // "빨강 색 자동차가 80km/h로 달립니다."
        car2.drive();       // "파랑 색 자동차가 100km/h로 달립니다."

        car1.stop();        // "빨강 색 자동차가 멈췄습니다."

        // static 메서드 사용
        Car.showCarCount(); // "현재까지 만들어진 자동차는 2대입니다."
    }
}

/*
개념			설명								코드 예시
클래스			자동차 설계도						class Car { ... }
변수(필드)		자동차의 속성						private int speed;
메서드			자동차의 행동						void drive()
생성자			자동차가 만들어질 때 호출			Car(String color)
오버로딩		이름 같지만 매개변수 다른 생성자	Car(String color, int speed)
this			현재 객체를 가리킴					this.color = color;
setter/getter	private 변수 접근용					setSpeed() / getSpeed()
static			모든 객체가 공유					static int carCount
private			외부 접근 차단						private String color;
printf			형식 있는 출력						System.out.printf("속도: %d", speed);
*/