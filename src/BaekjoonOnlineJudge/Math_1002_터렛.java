package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1002_터렛 {
	public static void main(String[] args) throws Exception {
		// 두 원의 교점 개수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;	// 교점의 개수
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			// 점1과 점2의 거리 *** double형 주의
			double d = Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
			
			// 점1과 점2가 같은 위치에 있을 때
			if (d==0) {
				// 가리키는 거리(반지름)가 같다 == 원이 일치하며 교점이 무수히 존재
				if (r1==r2) cnt = -1;	// 일치
				// 각자 다른 원을 그리므로 교점이 없음
				else cnt = 0;	// 내부
			}
			// 점1과 점2가 다른 위치에 있을 때
			else {
				if (d > r1+r2) cnt = 0;			// 외부
				else if (d == r1+r2) cnt = 1;	// 외접
				else if (d > Math.abs(r1-r2) && d < r1+r2) cnt = 2;	// 만남
				else if (d == Math.abs(r1-r2)) cnt = 1;	// 내접
				else if (d < Math.abs(r1-r2)) cnt = 0;	// 내부
			}
			sb.append(cnt).append("\n");
			
		}
		System.out.println(sb);
		
	}//main
	
}//class