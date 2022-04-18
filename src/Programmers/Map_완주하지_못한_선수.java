package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Map_완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) map.put(p, map.getOrDefault(p, 0)+1);
        for (String c : completion) {
            int n = map.get(c) - 1;
            if(n == 0) map.remove(c);
            else map.put(c, n);
        }

        return map.keySet().iterator().next();
    }
}
