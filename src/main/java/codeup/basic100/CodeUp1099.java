package codeup.basic100;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 2 - 1;
        int y = 2 - 1;

        while(true) {
            if (arr[x][y] == 0) {
                arr[x][y] = 9;
                y++;
            }
            if (arr[x][y] == 1) {
                y--;
                x++;
            }
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            } else if (arr[x][y + 1] == 1 && arr[x + 1][y] == 1) {
                if (arr[x][y] == 0) arr[x][y] = 9;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
