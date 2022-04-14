package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deque_10866_덱 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Deque<Integer> d = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cur = st.nextToken();

			switch (cur) {
			case "push_front":
				d.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				d.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				System.out.println(d.isEmpty()? -1: d.pollFirst());
				break;
			case "pop_back":
				System.out.println(d.isEmpty()? -1: d.pollLast());
				break;
			case "size":
				System.out.println(d.size());
				break;
			case "empty":
				System.out.println(d.isEmpty()? 1: 0);
				break;
			case "front":
				System.out.println(d.isEmpty()? -1: d.peekFirst());
				break;
			case "back":
				System.out.println(d.isEmpty()? -1: d.peekLast());
				break;
			}
		}
	}
}