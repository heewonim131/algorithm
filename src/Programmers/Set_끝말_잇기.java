package Programmers;

import java.util.HashSet;
import java.util.Set;

public class Set_끝말_잇기 {
    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream"};
        System.out.println(solution(words));
    }

    public static boolean solution(String[] words) {
        for (int i = 1; i < words.length; i++) {
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) return false;
        }

        Set<String> set = new HashSet<>();
        for (String w : words) set.add(w);

        return words.length == set.size();
    }
}
