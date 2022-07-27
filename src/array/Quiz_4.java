package array;

import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));
    }

    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        int first = 1, second = 1;
        int[] arr = new int[n];
        arr[0] = first;
        arr[1] = second;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for (int x : arr) {
            result.append(x).append(" ");
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }

    // 모범 답안
    public int[] answer(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}
