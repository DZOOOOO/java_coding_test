package string;

import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;
        String[] arr = str.split(" ");

        for (String x : arr) {
            int len = x.length();
            if (len > min) {
                min = len;
                answer = x;
            }
        }
        return answer;
    }
}
