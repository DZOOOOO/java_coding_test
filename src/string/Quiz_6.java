package string;

import java.util.Scanner;

public class Quiz_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;

    }

}
