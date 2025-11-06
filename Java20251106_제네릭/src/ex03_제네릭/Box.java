package ex03_제네릭;
/*
	타입 제한 : <T extends Person>
	T 전달될 수 있는 객체는
	Person 이거나 Person 자손'들'만 가능
*/
public class Box<T extends Person> {
	
	T item;
	
	void setItem(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}
	
}