package Programmers;

import java.util.Stack;

public class Stack_올바른_괄호 {
    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i)==')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                else if (stack.peek()=='(') stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = false;

        return answer;
    }

}
