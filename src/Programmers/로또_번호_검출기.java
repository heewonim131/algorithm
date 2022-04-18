package Programmers;

import java.util.HashSet;
import java.util.Set;

public class 로또_번호_검출기 {
    public static void main(String[] args) {
        int[] lotto = {4, 7, 32, 43, 22, 19};
        System.out.println(solution(lotto));
    }

    public static boolean solution(int[] lotto) {
        Set<Integer> set = new HashSet<>();
        for (int i : lotto) set.add(i);
        boolean answer = set.size() == 6;
        return answer;
    }
}
