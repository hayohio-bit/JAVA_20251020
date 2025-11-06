package ex03_제네릭;

public class BoxMain {

	public static void main(String[] args) {
		
		
		/*
		Box<String> str = new Box<>();
		Box<Car> cBox = new Box<>();
		Box<Toy> tBox = new Box<>();
		*/
		
		Box<Person> pBox = new Box<>();
		Box<Student> sBox = new Box<>();
		Box<Teacher> tBox = new Box<>();
		Box<AlbaStudent> aBox = new Box<>();
		
	}
}
class Car{}
class Toy{}
class Person{}
class Student extends Person{}
class AlbaStudent extends Student{}
class Teacher extends Person{}