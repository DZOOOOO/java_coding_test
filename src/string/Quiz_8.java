package string;

import java.util.Scanner;

public class Quiz_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution(input));

    }

    public static String solution(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                sb.append(x);
            }
        }

        String first = sb.substring(0, str.length() / 2);
        String second = sb.reverse().substring(0, str.length() / 2);

        if (first.equals(second)) {
            return "YES";
        }

        return "NO";
    }
}
