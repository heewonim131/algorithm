package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828_스택 {
	public static void main(String[] args) throws Exception {
		// 배열로 스택 구현
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N+1];
		int top = -1;

		for (int i = 0; i < N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cur = st.nextToken();

			switch (cur) {
			case "push":
				arr[++top] = Integer.parseInt(st.nextToken());
				break;
			case "pop":
				System.out.println(top==-1? top: arr[top--]);
				break;
			case "size":
				System.out.println(top+1);
				break;
			case "empty":
				System.out.println(top==-1? 1: 0);
				break;
			case "top":
				System.out.println(top==-1? top: arr[top]);
				break;
			}
		}
	}
}
