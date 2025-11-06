package ex01;

public class BoxMain {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.setItem(new Car());

		Object obj = box.getItem();
		System.out.println(obj);
		
		Object o = box.getItem();
		Car car = (Car)box.getItem();
		
		
	}

}

class Car{
	
}