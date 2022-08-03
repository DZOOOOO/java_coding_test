package bigO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        solution(n1, arr1, n2, arr2);
    }

    public static void solution(int n1, int[] arr1, int n2, int[] arr2) {
        int[] result = new int[n1 + n2];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);
        String answer = "";

        for (int i : result) {
            answer += i + " ";
        }

        System.out.println(answer.substring(0, answer.length() - 1));
    }

    // 모범 답안
    public ArrayList<Integer> answer(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(a[p1++]);
        }

        while (p2 < m) {
            answer.add(b[p2++]);
        }

        return answer;
    }
}
