package test1;
import java.util.Objects;

public class Student extends Person {
	private int studentId;
    private String major;

    // 자식 클래스 생성자 - 부모 생성자 호출 위해 super() 사용
    public Student(String name, int age, int studentId, String major) {
        super(name, age); // 부모 생성자 호출
        this.studentId = studentId;
        this.major = major;
    }

    // 부모 클래스 메서드 오버라이딩 - introduce 확장
    @Override
    public void introduce() {
        super.introduce(); // 부모 클래스 메서드 호출
        System.out.println("저는 학번 " + studentId + "이고, 전공은 " + major + "입니다.");
    }

    // toString() 재정의 - 부모 toString() 확장
    @Override
    public String toString() {
        return super.toString() + ", Student{studentId=" + studentId + ", major='" + major + "'}";
    }

    // equals() 재정의 - 부모 equals()와 학생 ID, 전공도 비교
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return studentId == other.studentId && Objects.equals(major, other.major);
    }
}