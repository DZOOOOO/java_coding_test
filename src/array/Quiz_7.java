package array;

import java.util.Scanner;

public class Quiz_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int[] arr = new int[input1];

        for (int i = 0; i < input1; i++) {
            int input2 = scanner.nextInt();
            arr[i] = input2;
        }

        solution(arr);
    }

    public static void solution(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count += 1;
                sum += arr[i] * (count);
            } else {
                count *= 0;
            }
        }

        System.out.println(sum);
    }


    // 모범 답안
    public static int answer(int n, int[] arr) {
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }

        return sum;
    }
}
