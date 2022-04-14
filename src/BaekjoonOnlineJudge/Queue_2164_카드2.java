package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_2164_카드2 {
	public static void main(String[] args) throws Exception {
		// 큐 카드 버리고 옮기기 - 마지막 카드

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			queue.add(i+1);
		}

		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}

		System.out.println(queue.peek());

	}
}

