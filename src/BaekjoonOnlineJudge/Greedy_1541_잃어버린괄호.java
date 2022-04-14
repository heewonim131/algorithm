package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_1541_잃어버린괄호 {
	public static void main(String[] args) throws Exception {
		// 괄호를 쳐서 최솟값으로 만들기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int result = 0;
		
		if (s.contains("-")) {
			// s = a - b+c - d+e
			// -로 구분하여 a, b+c, d+e 그룹을 만든다
			StringTokenizer st = new StringTokenizer(s, "-");
			int cnt = st.countTokens();
			int[] arr = new int[cnt];
			
			for (int i = 0; i < cnt; i++) {
				String s1 = st.nextToken();
				int sum = 0;
				// 2. b+c의 결과값 sum에 저장
				// 3. d+e의 결과값 sum에 저장
				if (s1.contains("+")) {
					StringTokenizer st1 = new StringTokenizer(s1, "+");
					int cnt1 = st1.countTokens();
					for (int j = 0; j < cnt1; j++) {
						int num = Integer.parseInt(st1.nextToken());
						sum += num;
					}
				}
				// 1. a
				else {
					sum = Integer.parseInt(s1);
				}
				// arr[0]=a, arr[1]=b+c, arr[2]=d+e
				arr[i] = sum;
			}
			
			result = arr[0];
			for (int i = 1; i < arr.length; i++) {
				// a-(b+c)-(d+e)
				// 첫번째 값을 기준으로 다음 수를 뺄셈
				result -= arr[i];
			}
		}
		// s = a+b+c
		else {
			StringTokenizer st2 = new StringTokenizer(s, "+");
			int cnt2 = st2.countTokens();
			for (int i = 0; i < cnt2; i++) {
				int num = Integer.parseInt(st2.nextToken());
				result += num;
			}
		}
		
		System.out.println(result);
		
	}//main
}//class