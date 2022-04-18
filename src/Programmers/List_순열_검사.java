package Programmers;

public class List_순열_검사 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};
        System.out.println(solution(arr));
    }

    public static boolean solution(int[] arr) {
        boolean answer = true;
        int[] chk = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] > arr.length){
                answer = false;
                break;
            }
            chk[arr[i]-1]++;
        }

        for (int i = 0; i < chk.length; i++) {
            if (chk[i] != 1){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
