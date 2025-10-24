package ex01;

public class ForEx04 {

	public static void main(String[] args) {

		/*
		 * 중첩 for문 - 구구단 출력 - 2단 출력
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18
		 */
		
		for(int i=2; i<=5; i++) {
				System.out.println("----------"+i+"단----------");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			
		for(int a=2; a<=5; a++) {
			System.out.println("----------"+a+"----------");
				for(int j=1; j<=3; j++) {
				System.out.println("----------"+a+"-"+j+"------");
					for(int k=1; k<=2; k++) {
						System.out.println(a + " X " + j + " X " + k + " = " + a*j*k);
					}
		}
	}
}
	}
}


