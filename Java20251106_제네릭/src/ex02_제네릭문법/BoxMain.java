package ex02_제네릭문법;

public class BoxMain {

	public static void main(String[] args) {
		
		/*
		 * Car가 의미하는 것은 Box클래스 있는 T가 Car란 것을 의미한다.
		 * 즉 ..T를 Car로 변경해서 컴파일시 Box.class 파일이 생성된다.
		 */
		
		Box<Car> box = new Box<Car>(); // Box 클래스의 T를 Car 타입으로 지정
		
		/*
		 * box.setItem("new Car()");
		 * 위 코드 에러 발생 이유 : box.setItem(Car car)이므로
		 * Car 클래스 객체만 전달 가능
		 * 하지만, 지금은 "new Car()"란 문자열을 전달하려고 시도했기 때문에
		 * 에러가 발생 ... 즉 타입이 일치하지 않기 때문
		 */
		
		// box.setItem("new car");
		box.setItem(new Car());	// Car 타입의 객체를 전달
		
		Car car = box.getItem();// getItem()은 Car 타입의 객체를 반환
								// 캐스팅이 필요 없음

		
		Box<Toy> tBox = new Box<Toy>();
		//tBox.setItem(new car());
		tBox.setItem(new Toy());
		Toy toy = tBox.getItem();
		
		Box<String> sBox = new Box<String>();
		sBox.setItem("문자열만 투입");
		String str = sBox.getItem();
	}

}

class Car{
	
}

class Toy{
	
}