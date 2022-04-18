package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Set_같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new LinkedList<>();
        list.add(arr[0]);

        for (int i = 0, idx = 0; i < arr.length; i++) {
            if (arr[i] != list.get(idx)) {
                list.add(arr[i]);
                idx++;
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
