package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_17298_오큰수 {
	public static void main(String[] args) throws Exception {
		// 오른쪽에 있으면서 큰 수 중에서 왼쪽에 있는 수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> s = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			while (!s.isEmpty() && arr[s.peek()]<arr[i]) {
				arr[s.pop()] = arr[i];
			}
			s.push(i);
		}
		
		while (!s.isEmpty()) {
			arr[s.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);
		
	}
}