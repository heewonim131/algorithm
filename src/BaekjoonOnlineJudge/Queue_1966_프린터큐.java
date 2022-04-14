package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_1966_프린터큐 {
	public static void main(String[] args) throws Exception {
		// 중요도가 있는 프린터 큐

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int count = 0;
			LinkedList<int[]> q = new LinkedList<int[]>();
			
			// 문서 개수와 번호
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// 중요도
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				// {문서번호, 중요도}
				q.offer(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			
			while (!q.isEmpty()) {
				int[] front = q.poll();	// 뽑은 원소
				boolean isMax = true;	// 뽑은 원소가 가장 큰 수(중요)인가
				
				// 중요도 비교
				for (int j = 0; j < q.size(); j++) {
					if (front[1] < q.get(j)[1]) {
						q.offer(front);	// 다시 끝으로 돌려보냄
						for (int k = 0; k < j; k++) {
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}
				
				if (!isMax) {
					continue;
				}
				
				count++;
				if (front[0]==M) {
					break;
				}
				
			}
			System.out.println(count);
		}
		
	}
}


//	https://st-lab.tistory.com/201