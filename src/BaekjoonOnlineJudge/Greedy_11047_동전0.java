package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_11047_동전0 {
	public static void main(String[] args) throws Exception {
		// 동전 개수의 최솟값 (거스름돈)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] m = new int[N];
		int cnt = 0;
		
		// 화폐 단위가 큰수부터
		for (int i = N-1; i >= 0; i--) {
			int A = Integer.parseInt(br.readLine());
			m[i] = A;
		}
		
		// 금액을 큰 단위부터 나눔
		for (int i : m) {
			cnt += K / i;
			K %= i;
		}
		
		System.out.println(cnt);
		
	}//main
}//class