package string;

import java.util.Scanner;

public class Quiz_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String str) {

        String small = str.toLowerCase();
        char firstChar = small.charAt(0);
        char lastChar = small.charAt(str.length() - 1);

        if (firstChar != lastChar) {
            return "NO";
        }

        return "YES";
    }
}
