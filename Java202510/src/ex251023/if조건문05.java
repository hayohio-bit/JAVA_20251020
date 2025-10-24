package ex251023;

public class if조건문05 {

	public static void main(String[] args) {

		/*
		 * number >= 90 ~A
		 * number >= 80 ~B
		 * number >= 70	~C
		 */
		
		int number = 75;
		
		if(number >= 90) {
			System.out.println("A학점");
		}else {
			if(number >= 80) {
			System.out.println("B학점");
			}else {
				System.out.println("C학점");
			}
		}
		
		
		System.out.println("------프로그램 종료---------");
				
		
		
	}

}
