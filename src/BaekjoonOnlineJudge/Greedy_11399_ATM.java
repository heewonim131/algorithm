package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Greedy_11399_ATM {
	public static void main(String[] args) throws Exception {
		// ATM 인출 시간의 합의 최솟값
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		list.sort(Comparator.reverseOrder());	// 5 4 3 2 1
		
		// 순서는 적게 걸리는 사람부터 먼저 인출..
		// 시간이 뒤에 남은 사람 수 만큼 계속 더해짐
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += list.get(i) * (i+1);	// 5*1 + 4*2 + .. + 1*5
		}
		
		System.out.println(sum);
		
	}//main
}//class