package ex01;

public class Programmer {

	private String name;
	private int age;
	private String language;
	
	public Programmer() {}
	public Programmer(String name, int age, String language) {
		this.name = name;
		this.age = age;
		this.language = language;
}
	public void code() {
		System.out.println(language + "언어로 코딩 중 입니다.");
	}

}
