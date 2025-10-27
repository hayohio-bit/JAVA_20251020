package ex01;

public class BreakExample2_1027 {

	/*
	 * 1 ~ ?
	 * 이 때 총합 10000 이상 되는 순간 ? 값 찾기
	 */
	
	public static void main(String[] args) {

		int sum=0;
		int i=0;
		
		while(true) {
			i++;
			sum += i;
			
			if(sum>=10000) {
				break;
			}
		}
		System.out.println("총합 : " + sum + ", i : " + i);
		System.out.println("프로그램 종료!");
		
			
		}
}
