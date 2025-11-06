package ex02_제네릭문법;

public class Box<T> {
	
	T item;
	
	void setItem(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}
	
}

/*
	▼ 이 Box 상자에는 Car만 넣을 수 있다.
	public class Box<Car> {
 
	Car item;
 
	void setItem(Car item) {
		this.item = item;
	}

	Car getItem() {
		return item;
	} 
}

	▼ 이 Box 상자에는 Toy만 넣을 수 있다.
	public class Box<T> {

	Toy item;
		
	void setItem(Toy item) {
	 	this.item = item;
	 }
	 
	 Toy getItem() {
	 	return item;
	 }
}
 */