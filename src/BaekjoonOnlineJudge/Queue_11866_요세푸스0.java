package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Queue_11866_요세푸스0 {
	public static void main(String[] args) throws Exception {
		// 원에서 한명씩 제거

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<Integer>();
		StringJoiner sj = new StringJoiner(", ");
		
		for (int i = 0; i < N; i++) {
			queue.add(i+1);
		}
		
		while (!queue.isEmpty()) {
			for (int i = 0; i < K-1; i++) {
				// K 이전의 수는 끝에 추가
				queue.add(queue.poll());
			}
			sj.add(queue.poll()+"");
		}
		
		System.out.println("<"+sj+">");
		
	}
}