package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_17608_막대기 {
	public static void main(String[] args) throws Exception {
		// 옆에서 봤을 때 보이는 막대기 개수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			stack.push(num);
		}
		
		int peek = 0, result = 0;
		
		while (!stack.isEmpty()) {
			if (stack.peek() > peek) {
				peek = stack.peek();
				result++;
			}
			stack.pop();
		}
		
		System.out.println(result);
		
	}
}
