package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_10799_쇠막대기 {
	public static void main(String[] args) throws Exception {
		// 괄호 레이저로 쇠막대기 자르기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		int n = 0;
		
		for (int i = 0; i < s.length(); i++) {
			// (이면 push, )이면 pop
			if (s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i)==')') {
				stack.pop();
				// )앞의 괄호가 (이라면 스택에 남아있는 수만큼 +
				n += s.charAt(i-1)=='('? stack.size(): 1;
			}
		}
		System.out.println(n);
	}
}
