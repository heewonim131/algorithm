package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Sort_문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] arr = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(solution(arr, n)));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else return -1;
            }
        });

        return strings;
    }

}
