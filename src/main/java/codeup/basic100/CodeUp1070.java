package codeup.basic100;

import java.util.Scanner;

public class CodeUp1070 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();
        switch (season) {
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("fall");
                break;
        }
    }
}
