package car;

public class Car {
	
    // ① 변수(필드)
    private String color;  // 자동차 색깔 (외부에서 바로 바꿀 수 없음)
    private int speed;     // 자동차 속도 (private = 외부에서 직접 접근 불가)
    
    // ② static 변수 (모든 자동차가 공유)
    static int carCount = 0; // 만들어진 자동차 수

    // ③ 생성자 (자동차를 만들 때 처음 호출됨)
    public Car(String color) {
        this.color = color;  // this.color는 "내 자동차의 색깔"을 가리킴
        this.speed = 0;      // 처음엔 멈춘 상태
        carCount++;          // 자동차 한 대 생성될 때마다 1 증가
    }

    // ④ 생성자 오버로딩 (속도도 지정하며 만들기)
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
        carCount++;
    }

    // ⑤ 메서드 - 자동차 행동들
    public void drive() {
        System.out.printf("%s 색 자동차가 %dkm/h로 달립니다.%n", color, speed);
    }

    public void stop() {
        speed = 0;
        System.out.printf("%s 색 자동차가 멈췄습니다.%n", color);
    }

    // ⑥ setter & getter (private 변수에 접근하기 위한 메서드)
    public void setSpeed(int speed) {
        this.speed = speed;  // this.speed는 필드, speed는 매개변수
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // ⑦ static 메서드 (모든 자동차에 공통)
    public static void showCarCount() {
        System.out.printf("현재까지 만들어진 자동차는 %d대입니다.%n", carCount);
    }
}