package Programmers;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        int n = 626331;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        long num = n;
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            if (answer++ == 500) return -1;
        }

        return answer;
    }
}
