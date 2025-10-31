package test1;

public class Main {
    public static void main(String[] args) {
        // 학생 객체 두 개 생성 — 같은 정보를 담음
        Student s1 = new Student("홍길동", 20, 2023001, "컴퓨터공학");
        Student s2 = new Student("홍길동", 20, 2023001, "컴퓨터공학");

        // 부모 메서드 및 오버라이딩된 메서드 호출
        System.out.println("s1 소개:");
        s1.introduce();

        System.out.println("\ns2 소개:");
        s2.introduce();

        // toString() 호출 - 자식 클래스가 재정의한 것 실행
        System.out.println("\ns1.toString(): " + s1.toString());

        // equals() 호출 - 자식 클래스가 재정의한 것 실행, 내용을 비교함
        System.out.println("\ns1.equals(s2): " + s1.equals(s2));

        // 단순 비교 (==)는 주소 비교
        System.out.println("\ns1 == s2 : " + (s1 == s2));
    }
}

/*
Person 클래스는 기본 정보(이름, 나이)와 introduce() 메서드, toString(), equals()를 정의합니다.

Student 클래스는 Person을 상속받아 학번과 전공을 추가합니다.

자식 생성자에서 super()를 통해 부모 생성자를 호출하여 name과 age를 초기화합니다.

introduce(), toString(), equals()를 오버라이딩하여 부모 기능 위에 학생 정보까지 포함하도록 합니다.

메인에서는 두 학생 객체를 만들어 같은 정보를 주고 실제 내용을 비교합니다.

equals()는 내용을 비교하고, ==는 주소(참조) 비교임을 확인할 수 있습니다.
*/