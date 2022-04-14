package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_2493_탑 {
	public static void main(String[] args) throws Exception {
		// 왼쪽방향으로 진행하는 신호를 받은 탑의 번호
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 탑의 수
		String[] arr = br.readLine().split(" ");
		String[] printArr = new String[N];
		Stack<Integer> stack = new Stack<Integer>();
		
		all:
		for (int i = 0; i < N; i++) {
			if (stack.isEmpty()) {
				stack.push(i);
				printArr[i] = "0";
			} else {
				// 피크가 작으면 피크 pop
				while (Integer.parseInt(arr[stack.peek()]) < Integer.parseInt(arr[i])) {
					stack.pop();
					// 스택 비어있으면 송신할 탑이 없음
					if (stack.isEmpty()) {
						stack.push(i);
						printArr[i] = "0";
						continue all;	// 바깥 반복문의 다음 조건을 진행
					}
				}
				// 수신받는 탑 번호 배열에 저장
				printArr[i] = stack.peek()+1+"";
				stack.push(i);
			}
		}
		
		System.out.println(String.join(" ", printArr));
	}
}
