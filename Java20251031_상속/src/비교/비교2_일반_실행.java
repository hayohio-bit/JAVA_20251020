package 비교;

public class 비교2_일반_실행 {

    public static void main(String args) {

    	비교2_일반 n1 = new 비교2_일반(); //

    	비교2_일반 n2 = new 비교2_일반(); //

        n1.showMessage(); //

        if (n1 == n2) {

            System.out.println("n1과 n2는 같은 인스턴스입니다.");

        } else {

            System.out.println("n1과 n2는 다른 인스턴스입니다."); //

        }

    }

}