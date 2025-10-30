package ex01;

public class ForEx05 {

	public static void main(String[] args) {

		int i=0;
		int sum=0;
		//1~100 홀수 합계, continue 활용
		
		for(i=1; i<=100; i++) {
			
			if(i%2 == 0)
				continue;
			//조건 일치시 △위로 올라가서 다시 계산 진행
			//조건 불일치시 ▽아래로 내려가서 sum += i 진행
			
			sum += i;
			
		}
			//System.out.println(sum);
			System.out.printf("sum = %d\n",sum);
	}
}
