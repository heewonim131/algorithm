package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, 1);

        int answer = map.size()> nums.length/2? nums.length/2: map.size();
        return answer;
    }
}
