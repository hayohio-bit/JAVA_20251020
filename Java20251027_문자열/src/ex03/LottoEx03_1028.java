package ex03;

import java.util.Arrays;

public class LottoEx03_1028 {

	public static void main(String[] args) {

		
		int[] lotto = new int[6];
		int count=1;
		
		for(int i=0; i<lotto.length; i++) {
			int tmp = (int)(Math.random()*45)+1;
			
			lotto[i] = tmp;
			count++;
			
			//중복체크
			for(int j=0; j < i; j++) {
				if(tmp == lotto[j]) {
					i--;
					break;
				} //end if
			} //end j
		} //end i
		
		System.out.println(Arrays.toString(lotto));
		System.out.println("반복횟수 : " + count);
		
	}
}
		
		