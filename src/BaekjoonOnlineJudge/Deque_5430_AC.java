package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deque_5430_AC {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		all:
		for (int i = 0; i < T; i++) {
			
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			
			Deque<Integer> d = new LinkedList<Integer>();
			StringTokenizer st = new StringTokenizer(s, "[],");
			for (int j = 0; j < n; j++) {
				d.offer(Integer.parseInt(st.nextToken()));
			}
			
			// 정방향
			boolean isRight = true;
			for (int j = 0; j < p.length(); j++) {
				switch (p.charAt(j)) {
				case 'R':	// reverse
					isRight = !isRight;
					break;
				case 'D':	// drop
					if (d.isEmpty()) {
						sb.append("error\n");
						continue all;
					}
					if (isRight) d.pollFirst();
					else d.pollLast();
					break;
				}
			}
			
			// 덱 출력
			sb.append('[');
			if (!d.isEmpty()) {
				if (isRight) {	// 정방향
					sb.append(d.pollFirst());
					while (!d.isEmpty()) {
						sb.append(',').append(d.pollFirst());
					}
				} else {	// 역방향
					sb.append(d.pollLast());
					while (!d.isEmpty()) {
						sb.append(',').append(d.pollLast());
					}
				}
			}
			sb.append(']').append('\n');
		}
		
		System.out.println(sb.toString());
	}
}