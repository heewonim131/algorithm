package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception {
		// 소괄호, 대괄호 짝 맞는지 검사 (9012_괄호 응용)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			Stack<Character> stack = new Stack<Character>();
			String s = br.readLine();
			if (s.equals(".")) {
				return;
			}
			String bool = "yes";
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)=='(' || s.charAt(i)=='[') {
					stack.push(s.charAt(i));
				} else if (s.charAt(i)==')') {
					if (stack.isEmpty() || stack.peek()!='(') {
						bool = "no";
						break;
					} else stack.pop();
				} else if (s.charAt(i)==']') {
					if (stack.isEmpty() || stack.peek()!='[') {
						bool = "no";
						break;
					} else stack.pop();
				}
			}
			if (!stack.isEmpty()) bool = "no";
			System.out.println(bool);
		}
		
	}
}
