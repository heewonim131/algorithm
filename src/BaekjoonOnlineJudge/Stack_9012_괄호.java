package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_9012_괄호 {
	public static void main(String[] args) throws Exception {
		// 괄호 짝 맞는지 검사
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<Character>();
			String s = br.readLine();
			String bool = "YES";
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j)=='(') {
					stack.push(s.charAt(j));
				} else if (stack.isEmpty()) {
					bool = "NO";
					break;
				} else {
					stack.pop();
				}
			}
			if (!stack.isEmpty()) bool = "NO";
			System.out.println(bool);
		}
		
	}
}
