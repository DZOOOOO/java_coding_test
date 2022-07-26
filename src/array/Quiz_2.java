package array;

import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(n, arr));
    }

    public static int solution(int num, int[] arr) {
        int result = 1;
        int max = arr[0];
        for (int i = 1; i < num; i++) {
            if (arr[i] > max) {
                result++;
                max = arr[i];
            }

        }
        return result;
    }
}
