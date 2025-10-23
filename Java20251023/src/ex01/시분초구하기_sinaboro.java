package ex01;

import java.util.Scanner;

/*
 * 키보드 통해서 4000을 입력 받는다.
 * 
 * 입력받은 4000을  시 분 초로 계산한다.
 * 
 * 출력 결과는
 * 1시간 6분 40초
 */
public class 시분초구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요 >> ");
		
		int inputData = sc.nextInt();
		
		int hours = inputData / 3600;
		int minutes= (inputData % 3600) / 60 ;
		int seconds= inputData % 60;
		
		System.out.println(hours + "시간, " + minutes + "분, " + seconds + "초");
		
				
	}

}
