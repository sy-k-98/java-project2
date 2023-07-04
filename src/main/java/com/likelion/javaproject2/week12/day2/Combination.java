package com.likelion.javaproject2.week12.day2;

public class Combination {
    public static void main(String[] args) {
        int n = 5;
        // r == 3이라 가정
        // i는 0부터 n - 2 까지 반복해야 나머지 두 숫자를 고를 수 있다
        for (int i = 0; i < n - 2; i++) {
            // j 도 최소한 하나의 숫자는 남겨둬야 나머지 한 숫자를 고를 수 있다
            for (int j = i + 1; j < n - 1; j++) {
                // k 는 선택할 수 있는 나머지 중 하나 선택
                for (int k = j + 1; k < n; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }

        int[] numbers = new int[] {5, 6, 7, 8, 9};
        for (int i = 0; i < n - 2; i++) {
            // j 도 최소한 하나의 숫자는 남겨둬야 나머지 한 숫자를 고를 수 있다
            for (int j = i + 1; j < n - 1; j++) {
                // k 는 선택할 수 있는 나머지 중 하나 선택
                for (int k = j + 1; k < n; k++) {
                    System.out.printf("%d %d %d\n", numbers[i], numbers[j], numbers[k]);
                }
            }
        }
    }
}
