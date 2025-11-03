package ex01;

public class Person {
	
	private String name;
	private int age;
	
	Person() {}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String info() {
		return name + ", " +age;
	}

}
