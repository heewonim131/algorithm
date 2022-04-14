package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_1406_에디터 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 커서 기준 왼쪽, 오른쪽 스택 선언
		Stack<Character> ls = new Stack<Character>();
		Stack<Character> rs = new Stack<Character>();
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				
				case "L":
					// 커서가 맨 앞이라면 무시
					if (ls.isEmpty()) continue;
					// 커서 앞 문자 -> 커서 뒤로 이동
					rs.push(ls.pop());
					break;
					
				case "D":
					// 커서가 맨 뒤라면 무시
					if (rs.isEmpty()) continue;
					// 커서 뒤 문자 -> 커서 앞으로 이동
					ls.push(rs.pop());
					break;
					
				case "B":
					// 커서가 맨 앞이라면 무시
					if (ls.isEmpty()) continue;
					// 커서 앞 문자 삭제
					ls.pop();
					break;
					
				case "P":
					char c = st.nextToken().charAt(0);
					// 커서 앞 문자 추가
					ls.push(c);
					break;
			}
		}
		
		while (!ls.isEmpty()) {
			rs.push(ls.pop());
		}
		while (!rs.isEmpty()) {
			sb.append(rs.pop());
		}
		
		System.out.println(sb);
		
	}//main
}//class