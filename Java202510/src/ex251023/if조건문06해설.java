package ex251023;

public class if조건문06해설 {

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
		
		int age = 15;		//나이
		int fee = 2000;		//요금
		double rate = 0;	//할인율
		
		if(age >= 65) {
			fee =0;
//		}else if(age >= 20 ) {
		}else if(age >= 20 & age<65 ) {
			rate = 0;
//		}else if(age >= 15 ) {
		}else if(age >= 15 & age<20 ) {
			rate = 0.2;
//		}else if(age >= 7 ) {
		}else if(age >= 7 & age<14) {
			rate = 0.5;
		}else {
			fee = 0;
		}
		
		if(fee != 0) {
			fee = (int)(fee * (1 - rate));
		}
		
		System.out.println("나이" + age + "는 " + fee + "요금 입니다.");
		
		System.out.println("------프로그램 종료---------");
				
		
	}

}
