package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_18258_큐2 {
	public static void main(String[] args) throws Exception {
		// 큐 클래스 사용해서 큐 구현 (시간초과 고려 sb)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int back = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cur = st.nextToken();

			switch (cur) {
			case "push":
				back = Integer.parseInt(st.nextToken());
				q.offer(back);
				break;
			case "pop":
				sb.append(q.isEmpty()? -1: q.poll());
				sb.append("\n");
				break;
			case "size":
				sb.append(q.size());
				sb.append("\n");
				break;
			case "empty":
				sb.append(q.isEmpty()? 1: 0);
				sb.append("\n");
				break;
			case "front":
				sb.append(q.isEmpty()? -1: q.peek());
				sb.append("\n");
				break;
			case "back":
				sb.append(q.isEmpty()? -1: back);
				sb.append("\n");
				break;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}