package ex01;

public class ExceptionEx04 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		int a = 5;
		int b = 2;
		int c = 0;

		int[] num = new int[5];
		String str = null;
		
		try { // try 블럭에는 예외가 발생할 개연성이 있는 코드를 넣어준다

			System.out.println(num[4]);
			System.out.println(str.length());
			
			c = a/b; // 에러가 발생하는 경우는 b가 0인 경우 예외 발생
		
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println(e);
		} finally { // 예외가 발생하든 안하든 무조건 실행되는 블럭
			System.out.println("c: "+ c);	//????c값은 출력이 되는가?
		}

		System.out.println("프로그램 종료...");

	}

}
