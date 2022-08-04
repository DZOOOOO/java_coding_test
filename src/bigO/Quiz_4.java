package bigO;

import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(n1, n2, arr));
    }

    public static int solution(int n1, int n2, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n1; rt++) {
            sum += arr[rt];
            if (sum == n2) {
                answer++;
            }

            while (sum >= n2) {
                sum -= arr[lt++];
                if (sum == n2) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
