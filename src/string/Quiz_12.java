package string;

import java.util.Scanner;

public class Quiz_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String input = scanner.next();
        System.out.println(solution(num, input));
    }

    // # --> 1, * --> 0
    public static String solution(int num, String str) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int number = Integer.parseInt(tmp, 2);
            answer += (char) number;
            str = str.substring(7);
        }

        return answer;
    }
}
