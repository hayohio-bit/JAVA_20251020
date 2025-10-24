package ex251024;

public class if조건문08 {

	public static void main(String[] args) {

	
		int number = (int)(Math.random()*100)+1;
		
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
		
		
		int num = (int)(Math.random()*6)+1;	//1~6
		
		switch(num) {
		case 1:
			System.out.println("1번 나옴");
			break;
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		case 6:
			System.out.println("6번 나옴");
			break;
		default:
			System.out.println("1~6 사이 숫자만 입력하세요!");
		}
		
		System.out.println("------프로그램 종료---------");
				
	}

}
