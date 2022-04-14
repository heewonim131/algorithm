package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue_10845_큐 {
	public static void main(String[] args) throws Exception {
		// 배열로 큐 구현

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N+1];
		int front = 0;
		int back = 0;

		for (int i = 0; i < N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cur = st.nextToken();

			switch (cur) {
			case "push":
				arr[back++] = Integer.parseInt(st.nextToken());
				break;
			case "pop":
				System.out.println(front==back? -1: arr[front++]);
				break;
			case "size":
				System.out.println(back-front);
				break;
			case "empty":
				System.out.println(front==back? 1: 0);
				break;
			case "front":
				System.out.println(front==back? -1: arr[front]);
				break;
			case "back":
				System.out.println(front==back? -1: arr[back-1]);
				break;
			}
		}
	}
}