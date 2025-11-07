package ex01;

import java.util.Stack;

public class StackEx {
	public static Stack back = new Stack(); // back 스택 생성
	public static Stack forward = new Stack(); // forward 스택 생성

	public static void main(String[] args) {
		goURL("1.네이트"); // 1.네이트 주소를 방문하는 메서드 호출
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");

		printStatus();

		goBack(); // 뒤로가기 기능 수행, 현재 페이지를 forward 스택으로 이동
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();

		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();

		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
		System.out.println();
	}

	public static void goURL(String url) { // 새로운 URP 방문 처리 메서드 시작
		back.push(url); // 현재 URL을 back스택에 저장
		if (!forward.empty()) // forward 스택이 비어있지 않으면,
			forward.clear(); // forward 스택 비움 (새 방문시 앞으로 갈 기록 삭제)
	}

	public static void goForward() {
		if (!forward.empty()) // forward 스택이 비어있지 않으면,
			back.push(forward.pop()); // forward 스택에서 팝한 URL을 back 스택에 푸시(앞으로 이동)
	}

	public static void goBack() {
		if (!back.empty()) // back 스택이 비어있지 않으면,
			forward.push(back.pop()); // back 스택에서 팝한 URL을 forward 스택에 푸시(뒤로 이동)
	}
}
