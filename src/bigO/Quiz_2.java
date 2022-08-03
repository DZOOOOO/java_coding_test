package bigO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz_2 {
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
        ArrayList<Integer> result = new ArrayList<>();
        String answer = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                }
            }
        }

        result.sort(Integer::compareTo);

        for (int x : result) {
            answer += x + " ";
        }

        System.out.println(answer.substring(0, answer.length() - 1));
    }

    // 모범 답안
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(p1++);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }
}
