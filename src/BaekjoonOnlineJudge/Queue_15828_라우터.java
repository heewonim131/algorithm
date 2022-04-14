package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_15828_라우터 {
	public static void main(String[] args) throws Exception {
		// 라우터 내부 버퍼(크기가 정해진 큐)의 상태 구현

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int P = Integer.parseInt(br.readLine());
			if (P == -1) {	// 종료
				break;
			} else if (P == 0) {	// 패킷 처리
				q.poll();
				M--;
			} else if (M < N) {	// 패킷 받음
				q.offer(P);
				M++;
			}
		}
		
		if (q.isEmpty()) {
			sb.append("empty");
		}
		while (!q.isEmpty()) {
			sb.append(q.poll());
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		
	}
}