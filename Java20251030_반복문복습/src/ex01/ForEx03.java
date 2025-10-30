package ex01;

public class ForEx03 {

	public static void main(String[] args) {

		int i=0;
		int sum=0;
		
		
		for(; i<=100; i++) {
			
			sum += i;
			//System.out.println(sum);
			
			if(sum>=3000)
				break;
		}
		System.out.println("\nsum = " + sum + "\n" + "i : " + i);
		
		System.out.printf("sum = %d \n i = %d",sum,i);

		System.out.println("\n------------------------------");
		
		System.out.printf("sum = %5d , i = %5d\n",10,1000);
		System.out.printf("sum = %5d , i = %5d\n",1,100);
		System.out.printf("sum = %5d , i = %5d\n",1234,1587);
		//%5d 오른쪽 맞춤
		//%-5d 왼쪽	맞춤
	}
}
