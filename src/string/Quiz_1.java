package string;

import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 대소문자 구분 X
        String input1 = in.nextLine().toLowerCase();
        char input2 = in.nextLine().toLowerCase().charAt(0);
        int result = 0;

        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == input2) {
                result++;
            }
        }

        System.out.println(result);
    }

    // 메서드
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }
        return answer;
    }
}


