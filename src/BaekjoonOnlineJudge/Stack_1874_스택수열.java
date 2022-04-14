package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringJoiner;

public class Stack_1874_스택수열 {
	public static void main(String[] args) throws Exception {
		// 스택으로 수열 구현
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringJoiner sj = new StringJoiner("\n");
		
		int start = 0;
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			// start보다 크다면 입력수만큼 +push
			if (num > start) {
				for (int j = start+1; j <= num; j++) {
					stack.push(j);
					sj.add("+");
				}
				// 다음 push할 수 조정
				start = num;
				
			// 만약 피크가 입력수와 다르다면 불가능, 중지
			} else if (num != stack.peek()) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sj.add("-");
		}
		
		System.out.println(sj);
		
	}
}
