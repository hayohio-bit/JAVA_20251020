package 나머지수업;

public class 기본형과참조형_지역변수 {

		public static void main(String[] args) {
		int a = 10;
		System.out.println("메서드 호출 전: a = " + a);
		changePrimitive(a);
		System.out.println("메서드 호출 후: a = " + a);
		}
		public static void changePrimitive(int x) {
		x = 20;
		}
		}