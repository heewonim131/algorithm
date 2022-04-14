package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_10773_제로 {
	public static void main(String[] args) throws Exception {
		// 0 입력으로 최근 수 지우고 총합 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		
		for (int i = 0; i < K; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				sum -= stack.peek();
				stack.pop();
			} else {
				sum += n;
				stack.push(n);
			}
		}
		
		System.out.println(sum);
		
	}
}
