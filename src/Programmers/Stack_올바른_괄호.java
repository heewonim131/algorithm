package Programmers;

import java.util.Stack;

public class Stack_올바른_괄호 {
    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
