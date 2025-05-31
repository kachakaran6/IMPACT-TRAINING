import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // # pattern

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int k = 1; k <= i; k++) {
        // System.out.print("#");
        // }

        // System.out.println();
        // }

        // Star Pyramid

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int k = 1; k <= i; k++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }
        // Character Pattern

        // for (int i = 1; i <= n; i++) {
        // char ch = (char) ('A' + i - 1);
        // for (int k = 1; k <= i; k++) {
        // System.out.print(ch);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Diamond

        // Top
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
