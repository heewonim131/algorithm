package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        List<Long> list = new LinkedList<>();

        long q = n, r = 0;
        while (q != 0) {
            r = q%10;
            q = q/10;
            list.add(r);
        }

        int[] answer = list.stream().mapToInt(i->i.intValue()).toArray();
        return answer;
    }
}
