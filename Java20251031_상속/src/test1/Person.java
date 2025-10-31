package test1;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // 부모 클래스 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 부모 클래스 메서드
    public void introduce() {
        System.out.println("안녕하세요. 저는 " + name + "이고, 나이는 " + age + "살입니다.");
    }

    // toString() 재정의
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // equals() 재정의: 이름과 나이가 같으면 같은 사람으로 판단
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }
}