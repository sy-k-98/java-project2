package codeup.basic100;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
