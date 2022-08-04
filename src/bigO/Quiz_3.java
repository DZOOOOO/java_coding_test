package bigO;

import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(n1, n2, arr));

    }

    public static int solution(int n1, int n2, int[] arr) {
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < n2; i++) {
            sum += arr[i];
        }

        answer = sum;


        for (int i = n2; i < n1; i++) {
            sum += (arr[i] - arr[i - n2]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
