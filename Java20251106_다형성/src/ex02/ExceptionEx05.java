package ex02;

public class ExceptionEx05 {
	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		try {
			func1(5,0);
		}catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
			System.out.println("----------------------");
			System.out.println(e.getMessage());
		}
		//printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력 
		//getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
		
		System.out.println("프로그램 종료...");
		
	}

	private static void func1(int i, int j) throws ArithmeticException {
		
		func2(i,j);
	}

	private static void func2(int i, int j) throws ArithmeticException {
		
		int result = i/j;
		System.out.println(result);
		
	}

}
