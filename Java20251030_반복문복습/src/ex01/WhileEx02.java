package ex01;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {

		while(true) {
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			
			Scanner sc = new Scanner(System.in);
			int number = Integer.parseInt(sc.nextLine());
			//int number = sc.nextInt();
			
			if(number == 1) {
				System.out.println("예금 코드.........");
			}
			else if(number == 2) {
				System.out.println("출금 코드.........");
			}
			else if(number == 3) {
				System.out.println("잔고 코드.........");
			}
			else if(number == 4) {
				break;
			}
		}
		System.out.println("종료!!");
	}
}