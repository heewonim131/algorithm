package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class Queue_2161_카드1 {
	public static void main(String[] args) throws Exception {
		// 큐 카드 버리고 옮기기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		StringJoiner sj = new StringJoiner(" ");
		
		for (int i = 0; i < N; i++) {
			queue.add(i+1);
		}
		
		while (queue.size() > 1) {
			sj.add(queue.poll()+"");
			queue.add(queue.poll());
		}
		
		sj.add(queue.peek()+"");
		
		System.out.println(sj);
		
	}
}
