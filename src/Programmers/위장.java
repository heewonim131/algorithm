package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] c : clothes) map.put(c[1], map.getOrDefault(c[1], 0) + 1);

        int answer = 1;
        for (int i : map.values()) answer *= i+1;

        return answer-1;
    }
}
