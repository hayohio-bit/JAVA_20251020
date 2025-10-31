package 비교;

public class 비교1_싱글톤 {

    private static 비교1_싱글톤 instance = new 비교1_싱글톤(); // 이른 초기화

    private 비교1_싱글톤() { } // 외부에서 직접 객체 생성을 막음

    public static 비교1_싱글톤 getInstance() {

        return instance; // 항상 동일한 인스턴스 반환

    }

    public void showMessage() {

        System.out.println("싱글톤 인스턴스가 호출되었습니다.");

    }

}