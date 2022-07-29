package array;

import java.util.Scanner;

public class Quiz_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int[] arr = new int[input1];

        for (int i = 0; i < arr.length; i++) {
            int input2 = scanner.nextInt();
            arr[i] = input2;
        }

        for (int x : solution(input1, arr)) {
            System.out.print(x + " ");
        }

    }

    // 모범 답안
    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }
}
