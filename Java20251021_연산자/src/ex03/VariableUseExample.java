package ex03;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
	/*연산
	 * 정수 + 정수 => 정수
	 * 실수 + 실수 => 실수
	 * 정수 + 실수 => 실수
	 */
	
		
		
	 /* "kor" , "한글" => 문자열
	 * 정수 + 문자열 => 문자열
	 * 실수 + 문자열 => 문자열
	 */
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
	}

}
