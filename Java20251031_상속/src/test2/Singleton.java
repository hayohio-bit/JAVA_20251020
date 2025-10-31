package test2;

public class Singleton {

    // 1. 유일한 인스턴스를 저장할 private static 변수
    private static Singleton instance = null; //

    // 2. 외부에서 객체 생성을 막기 위한 private 생성자
    private Singleton() { 
    	
    	//초기화 작업
    }
    // 3. 인스턴스를 반환하는 public static 메서드
    public static Singleton getInstance() { //

        if (instance == null) { // 인스턴스가 없으면 생성

            instance = new Singleton(); //
        }
        return instance; // 기존 인스턴스 반환

    }
    // 예시 메서드
    public void showMessage() { //
        System.out.println("싱글톤 인스턴스가 호출되었습니다.");
    }
}