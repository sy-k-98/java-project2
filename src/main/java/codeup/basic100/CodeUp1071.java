package codeup.basic100;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; num != 0; i++) {
            System.out.println(num);
            num = sc.nextInt();
        }
    }
}
