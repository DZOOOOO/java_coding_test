package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int[] nums = new int[input1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        solution(nums);

    }

    public static void solution(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(new StringBuilder(String.valueOf(nums[i])).reverse().toString());
        }

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i]) == 1 && nums[i] != 1) {
                result.add(nums[i]);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            answer += result.get(i) + " ";
        }

        answer = new StringBuilder(answer).deleteCharAt(answer.length() - 1).toString();

        System.out.println(answer);
    }

    // 소수판별
    public static int isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // false
            }
        }
        return 1; // true
    }

    // 모범 답안
    public ArrayList<Integer> check(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res) == 1) answer.add(res);
        }

        return answer;
    }
}
