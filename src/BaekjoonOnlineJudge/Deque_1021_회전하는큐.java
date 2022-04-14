package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deque_1021_회전하는큐 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<Integer> d = new LinkedList<Integer>();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= N; i++) {
			d.offer(i);
		}
		
		int[] seq = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			int idx = d.indexOf(seq[i]);
			int half;
			
			// 중앙 지점
			if (d.size() % 2 == 0) {
				half = d.size() / 2 - 1;
			} else {
				half = d.size() / 2;
			}
			
			// 중앙으로부터 앞에 있는 경우
			if (idx <= half) {
				for (int j = 0; j < idx; j++) {
					d.offerLast(d.pollFirst());
					count++;
				}
			}
			else {	// 중앙으로부터 뒤에 있는 경우
				for (int j = 0; j < d.size() - idx; j++) {
					d.offerFirst(d.pollLast());
					count++;
				}
			}
			
			// 뽑으려는 원소 poll
			d.pollFirst();
		}
		
		System.out.println(count);
	}
}