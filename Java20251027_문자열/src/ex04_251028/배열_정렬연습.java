package ex04_251028;
import java.util.Arrays;

public class 배열_정렬연습 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		
		for(int a=0; a<arr.length; a++) {
			arr[a]=(int)(Math.random()*100)+1;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
