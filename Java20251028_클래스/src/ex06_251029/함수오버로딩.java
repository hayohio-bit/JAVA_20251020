package ex06_251029;

public class 함수오버로딩 {

	public static void main(String[] args) {
		
		func();
		func(10);
		func("홍길동");
		func(10,20);
		//func(10,20,30);
				}

		static void func() {
			System.out.println("----------");
		}
		
		static void func(int n) {
			System.out.println("-----" + n + "-----");
		}
		
		static void func(String s) {
			System.out.println("-----" + s + "-----");
		}

		static void func(int n1, int n2) {
			System.out.println("-----" + (n1+n2) + "-----");
		}

}
