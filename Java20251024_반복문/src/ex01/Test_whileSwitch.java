package ex01;

import java.util.Scanner;
/*
 * 이것이자바다_연습문제 4.7
 */

public class Test_whileSwitch {

	public static void main(String[] args) {
		int money=0;
		int number=0;
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.print("선택> ");
			//키보드 입력한 숫자를 컴퓨터는 문자열로 인식하므로
			//문자열로 인식된 숫자를 Integer.parseInt 통해 정수로 변환
			number= Integer.parseInt(sc.nextLine());
			
			// if or switch문 사용

			switch(number) {
			case 1:
				System.out.print("예금액> ");
				money += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				money -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(money);
				break;
			case 4:
				break;
			default:
				System.out.println("1~4까지 정수만 입력");
			}
			
			if(number == 4) break;
		}
	System.out.println("\r프로그램 종료");
	}
}
