package test2;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance(); //

        Singleton singleton2 = Singleton.getInstance(); //

        singleton1.showMessage(); //

        // 두 객체가 같은 인스턴스인지 확인

        if (singleton1 == singleton2) { //

            System.out.println("두 객체는 동일한 싱글톤 인스턴스입니다."); //

        } else {

            System.out.println("두 객체는 다른 인스턴스입니다."); //

        }

    }

}
