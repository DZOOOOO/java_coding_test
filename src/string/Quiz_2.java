package string;

import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char spell = input.charAt(i);

            if (spell == input.toLowerCase().charAt(i)) {
                // 소문자인 경우
                result.append(input.toUpperCase().charAt(i));
            } else {
                // 아닌경우
                result.append(input.toLowerCase().charAt(i));
            }
        }

        System.out.println(result);
    }

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }
}
