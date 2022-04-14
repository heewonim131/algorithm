package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DP_1003_피보나치 {
	public static void main(String[] args) throws Exception {
		// 피보나치 일반 재귀말고 동적계획법 사용.. 시간복잡도 줄어듦

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int zero = 0;
			int first = 0;
			
			int N = Integer.parseInt(br.readLine());
			
			if (N==0) {
				zero = 1;
			} else if (N==1) {
				first = 1;
			} else {
				zero = fibonacci(N-2);
				first = fibonacci(N-1);
			}
			
			sb.append(zero+" "+first).append("\n");
			
		}
		
		System.out.println(sb);
		
	}//main
	
	static int[] d = new int[41];
	
	static int fibonacci(int n) {
		if (n==0) return 1;
		if (n==1) return 1;
		// 저장된 값 있으면 반환
		if (d[n]!=0) return d[n];
		// 결과는 배열에 저장하여 같은 함수를 반복 호출하지 않도록..
		return d[n] = fibonacci(n-1) + fibonacci(n-2);
	}
	
}//class