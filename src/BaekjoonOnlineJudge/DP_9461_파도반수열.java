package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DP_9461_파도반수열 {
	public static void main(String[] args) throws Exception {
		// 가장 긴변에 정삼각형 더해지는 파도반 수열
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(Padovan(N)).append("\n");
		}
		
		System.out.println(sb);
		
	}//main
	
	// 파도반 int형 범위 넘기 때문에 long 주의..
	static long[] d = new long[100];
	
	static long Padovan(int N) {
		
		if (N==1||N==2||N==3) return 1;
		if (d[N-1]!=0) return d[N-1];
		
		return d[N-1] = Padovan(N-2) + Padovan(N-3);
	}
	
}//class