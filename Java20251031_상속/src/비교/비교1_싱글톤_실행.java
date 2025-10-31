package 비교;

public class 비교1_싱글톤_실행 {

    public static void main(String args) {

        비교1_싱글톤 s1 = 비교1_싱글톤.getInstance(); //

        비교1_싱글톤 s2 = 비교1_싱글톤.getInstance(); //

        s1.showMessage(); //

        if (s1 == s2) {

            System.out.println("s1과 s2는 같은 인스턴스입니다."); //

        } else {

            System.out.println("s1과 s2는 다른 인스턴스입니다.");

        }

    }

}