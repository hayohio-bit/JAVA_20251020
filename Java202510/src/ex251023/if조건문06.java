package ex251023;

public class if조건문06 {

	public static void main(String[] args) {

		/*
		 * 버스 요금 계산표
		 * 요금 		: 2000
		 * 65세 이상 	: 무료
		 * 20 ~ 64 	: 할인율 0%
		 * 15 ~ 19 	: 할인율 20%
		 * 7 ~ 14 	: 할인율 50%
		 * 6세 이하 	: 무료
		 * 
		 * 출력예시	: 나이 00는 00요금 입니다.
		 */
		
		//System.out.println("님의 연세는?");
		
		int age = 25;
		int fee = 2000;
		double discountRate65 = 0;
		double discountRate20 = 1;
		double discountRate15 = 0.8;
		double discountRate7 = 0.5;
		double discountRate6 = 0;
		
		if(age >= 65 | age <= 6) {
			System.out.println(age + "세의 요금은 무료입니다.");
		}else if(age >= 20 ) {
			System.out.println(age + "세의 요금은 " + (int)(fee*discountRate20) + "원 입니다.");
		}else if(age >= 15 ) {
			System.out.println(age + "세의 요금은 " + (int)(fee*discountRate15) + "원 입니다.");	
		}else {
			System.out.println(age + "세의 요금은 " + (int)(fee*discountRate7) + "원 입니다.");
		}
		
		System.out.println("------프로그램 종료---------");
				
		
		
	}

}
