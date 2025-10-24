package ex251024;

public class if조건문9 {

	public static void main(String[] args) {

		int num  = (int)(Math.random()*100)+1;
		//int num = 75;
		System.out.print(num + "점수는 : ");
		
		switch(num / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");			
		}
		
		System.out.println("------프로그램 종료---------");
				
	}

}
