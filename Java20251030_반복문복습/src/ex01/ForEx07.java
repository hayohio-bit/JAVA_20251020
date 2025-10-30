package ex01;

import java.util.Arrays;

public class ForEx07 {

	public static void main(String[] args) {

		int[] arr = {1,5,4,3,2};
		
		for(int i=0; i<5; i++)
		
		System.out.print(arr[i] + " ");
		System.out.println("\n---------------");
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------\n 향상된 for문\n---------------");
		
		for(int num : arr)
			System.out.print(num + " ");
		
		System.out.println("\n---------------\n배열 합 구하기\n---------------");
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.printf("sum : %d",sum);
		
		System.out.println("\n---------------\n  최대값  \n---------------");
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("max : " + max);
	}

}