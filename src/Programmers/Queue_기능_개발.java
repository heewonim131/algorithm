package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_기능_개발 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            q.offer(day);
        }

        int count = 1;
        int first = q.poll();

        while (!q.isEmpty()) {
            if (first < q.peek()) {
                list.add(count);
                first = q.poll();
                count = 1;
            }
            else {
                q.poll();
                count++;
            }
        }
        list.add(count);

        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }

}
