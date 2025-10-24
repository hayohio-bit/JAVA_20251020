package ex251023;

public class if조건문04 {

	public static void main(String[] args) {

		/*
		 * number >= 90 ~A
		 * number >= 80 ~B
		 * number >= 70	~C
		 * number >= 60	~D
		 * number < 60	~F
		 */
		
		int number = 60;
		
		if(number >= 90) {
			System.out.println("A학점");
			
		}else if (number >= 80) {
			System.out.println("B학점");
		}else if (number >= 70) {
			System.out.println("C학점");
		}else if (number >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		
		System.out.println("------프로그램 종료---------");
				
		
		
	}

}
