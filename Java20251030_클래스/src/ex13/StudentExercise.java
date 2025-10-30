package ex13;

public class StudentExercise {
	//실행결과 홍길동,1,1,100,60,76,236,78.7

	public static void main(String[] args) {
		Student s= new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}

}
