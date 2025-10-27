package ex01;

public class CharAtEx01 {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		//"자바 프로그래밍"에서 해당하는 index번호 한 문자 추출
		char ch = subject.charAt(3);
		
		System.out.println(ch);
		
		//"자바 프로그래밍" 단어 갯수
		int len = subject.length();
		System.out.println("문자열 길이 : " + len);
		
		System.out.println("----문자열 대체(변경)-----");
		System.out.println("before : " + subject);
		
		//"자바 프로그래밍" 문장에서 자바를 파이썬으로 변경하여 새로운 문자열을 생성
		subject = subject.replace("자바", "파이썬");
		System.out.println("after : " + subject);
		
		System.out.println("----문자열 잘라내기-----");
		//index 4번째 위치에서 끝까지 추출
		String sub2 = subject.substring(4);
		System.out.println(sub2);
		
		//index 4번째 위치에서 6번째 위치 앞까지 추출. 즉, 4,5 추출
		String sub3 = subject.substring(4,6);
		System.out.println(sub3);
		
		//"파이썬 프로그래밍"에서 "프로"의 index 위치 리턴
		System.out.println("------문자열 찾기------");
		int index1 = subject.indexOf("프로");
		System.out.println("문자열 찾기 : " + index1);
		//주어진 문자열이 포함되어 있지 않으면 -1 리턴
		int index2 = subject.indexOf("프로그램");
		System.out.println("문자열 없음" + index2);
		
		// "파이썬 프로그래밍" 공백을 기준으로 문자열 분리
		System.out.println("------문자열 분리------");
		String[] sub4 = subject.split(" ");
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		
		//s 가지고 있는 "대한"에 s2가 가지고 있는 "민국"을 합쳐서 새로운 문자열 (대한민국) 생성
		System.out.println("------문자열 합치기------");
		String s = "대한";
		String s2 = "민국";
		String s3 = s.concat(s2);
		System.out.println(s3);
		
		
		
	}

}
