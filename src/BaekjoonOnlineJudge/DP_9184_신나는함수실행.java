package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_9184_신나는함수실행 {
	public static void main(String[] args) throws Exception {
		// 재귀함수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a==-1 && b==-1 && c==-1) break;
			sb.append("w("+a+", "+b+", "+c+") = ").append(w(a, b, c)).append("\n");
		}
		
		System.out.println(sb);
		
	}//main
	
	static int[][][] d = new int[21][21][21];
	
	static int w(int a, int b, int c) {
		
		// 배열 범위 내의 인덱스 체크 가능한 경우
		if (isRange(a, b, c) && d[a][b][c] != 0) return d[a][b][c];
		
		// 배열 범위를 넘어서는 경우
		if (a<=0 || b<=0 || c<=0) return 1;
		if (a>20 || b>20 || c>20) return d[20][20][20] = w(20, 20, 20);
		if (a<b && b<c) return d[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		
		return d[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}

	static boolean isRange(int a, int b, int c) {
		return 0<=a && a<=20 && 0<=b && b<=20 && 0<=c && c<=20; 
	}
	
}//class