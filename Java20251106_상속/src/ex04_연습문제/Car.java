package ex04_연습문제;

public class Car extends Vehicle {

	private String type;
	private String name;
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf("차종: %s", type);
	}
	
	Car(){}
	Car(String brand, int year, String type){
		super(brand, year);
		this.type = type;
	}
	
	
	public void drive() {
        System.out.println(name + "가 운전 중입니다.");

    }
}
