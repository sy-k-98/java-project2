package codeup;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        long answer = a;
        for (int i = 1; i < n; i++)
            answer = answer * m + d;

        System.out.println(answer);
    }
}
