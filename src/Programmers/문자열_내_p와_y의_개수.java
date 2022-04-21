package Programmers;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        int cnt = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') cnt++;
            else if (s.charAt(i) == 'y') cnt--;
        }

        return cnt == 0;
    }

}
