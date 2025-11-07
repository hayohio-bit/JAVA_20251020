package ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {// 프로그램 시작
		Stack st = new Stack(); // Stack 객체 생성 (LIFO 구조)
		Queue q = new LinkedList(); // LinkedList로 Queue 객체 생성 (FIFO 구조)

		st.push("0"); // Stack에 문자열 "0" 추가
		st.push("1");
		st.push("2");

		q.offer("0"); // Queue에 "0" 추가
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while (!st.empty()) { // Stack이 비어있지 않을 동안 반복
			System.out.println(st.pop()); // Stack의 맨 위 요소 꺼내고 출력(후입선출)
		}

		System.out.println(" = Queue =");
		while (!q.isEmpty()) { // Queue가 비어있지 않을 때 반복
			System.out.println(q.poll()); // Queue의 맨 앞 요소 꺼내고 출력(선입선출)
		}

	}
}
