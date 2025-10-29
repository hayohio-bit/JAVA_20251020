package ex06_251029;
import ex06_251029.Student;

public class ClassEx01 {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setAge(29);
		System.out.println(s1.getAge());
		s1.setName("안창현");
		System.out.println(s1.getName());
		s1.setAddress("강동구 천호동");
		System.out.println(s1.getAddress());
		s1.study();
		System.out.println("------------------------------");
		
		
		Student s2 = new Student();
		s2.setName("선하영");
		s2.setAddress("강동구 암사동");
		s2.setAge(25);
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getAddress());
		s2.study();
		System.out.println("------------------------------");

		Student s3 = new Student("박진희", 27, "강동구 명일동");
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getAddress());
		s3.study();
		
	}
}


class Student{
		//멈버 변수는 무조건 private 접근 제어자를 사용 !!
	
		//멤버변수에 접근할 수 있는 통료 => setter, getter를 만든다.
		private String name;
		private int age;
		private String address;

		//디폴트 생성자.
		public Student() {
			System.out.println("디폴트 생성자 호출!");
		}
		
		public Student(String name, int age, String addr) {
			this.name = name;
			this.age = age;
			this.address = addr;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		void study() {
			System.out.println(name + " Java 공부 중 입니다.");
		}
	}