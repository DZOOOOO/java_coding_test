package array;

import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        solution(n, a, b);

    }

    public static void solution(int n, int[] a, int[] b) {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            if (a[i] - b[i] == 2) {
                result[i] = 'B';
            } else if (a[i] - b[i] == -2) {
                result[i] = 'A';
            } else if (a[i] - b[i] == 0 || b[i] - a[i] == 0) {
                result[i] = 'D';
            } else if (b[i] - a[i] == 1) {
                result[i] = 'B';
            } else if (b[i] - a[i] == -1) {
                result[i] = 'A';
            }
        }

        for (char x : result) {
            System.out.println(x);
        }
    }

    // 모범 답안
    public static String answer(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }

        return answer;
    }
}
