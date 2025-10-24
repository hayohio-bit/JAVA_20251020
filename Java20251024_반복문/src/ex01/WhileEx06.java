package ex01;

import java.util.Scanner;

public class WhileEx06 {

	public static void main(String[] args) {
		
		/*
		 * 무한 반복
		*/
		
		boolean run = true;
		
		int speed = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			String str = sc.nextLine();
			
			if(str.equals("1")) {
				speed++;
				System.out.println("speed : " + speed);
			}else if(str.equals("2")) {
				speed--;
				System.out.println("speed : " + speed);
			}
			else if(str.equals("3")) {
				run = false;
			}else {
				System.out.println("1~3까지만 입력해!");
			}
		} //end while
		System.out.println("프로그램 중지!!!");
		
	}
	

}
