package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution(input));
    }


    // 문자형 숫자를 숫자형으로 바꿀때 answer = answer * 10 + (x - 48);
    // Character.isDigit(문자) --> 숫자인지 판별
    public static int solution(String str) {
        int answer;
        String nums = "";
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                arr.add(str.charAt(i));
            }
        }

        for (char x : arr) {
            nums += x;
        }

        answer = Integer.parseInt(nums);
        return answer;
    }
}
