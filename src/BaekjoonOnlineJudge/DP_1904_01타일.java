package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DP_1904_01타일 {
	public static void main(String[] args) throws Exception {
		// 점화식으로 표현되는 2진 수열 개수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(tile(N));
		
	}//main
	
	static int tile(int n) {
		if (n==1) return 1;
		
		int[] d = new int[n+1];
		d[0] = 1;
		d[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			d[i] = (d[i-1] + d[i-2]) % 15746;
		}
		return d[n];
	}
	
}//class