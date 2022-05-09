package Programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = arr[0];
        for (int i : arr) if (min > i) min = i;

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(list.indexOf(min));

        return list.stream().mapToInt(i->i).toArray();
    }

}
