package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 최댓값_인덱스_구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 5, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) list.add(i);
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
