package Programmers;

public class 스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            if (skill.startsWith(s.replaceAll("[^"+skill+"]", ""))) answer++;
        }

        return answer;
    }

}
