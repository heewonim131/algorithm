package Programmers;

import java.util.LinkedList;

public class Queue_프린터 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<int[]> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new int[] {i, priorities[i]});
        }

        while (!q.isEmpty()) {
            int[] front = q.poll();
            boolean isMax = true;

            // 중요도 비교
            for (int j = 0; j < q.size(); j++) {
                if (front[1] < q.get(j)[1]) {
                    q.offer(front);
                    for (int k = 0; k < j; k++) {
                        q.offer(q.poll());
                    }
                    isMax = false;
                    break;
                }
            }

            if (!isMax) continue;
            answer++;
            if (front[0] == location) break;
        }

        return answer;
    }
}
