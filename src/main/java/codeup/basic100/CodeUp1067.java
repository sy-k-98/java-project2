package codeup.basic100;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
