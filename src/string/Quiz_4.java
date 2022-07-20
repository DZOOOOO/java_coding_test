package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];


        // 입력받은 숫자만큼 반복해서 입력
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : solution(str)) {
            System.out.println(x);
        }

    }

    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> arr = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            arr.add(tmp);
        }
        return arr;
    }
}
