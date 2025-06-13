import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // double r = sc.nextInt();

        // double area = 3 * Math.pow(r, 2);
        // double peri = 2 * 3 * r;

        // System.out.println("Area of Circle is " + area);
        // System.out.println("Perimeter of Circle is " + peri);

        // sc.close();

        // Scanner sc = new Scanner(System.in);

        // long r = sc.nextInt();
        // long pi = 3;

        // long area = pi * r * r;
        // long perimeter = 2 * pi * r;

        // System.out.println(area);
        // System.out.println(perimeter);

        int MOD = 1_000_000_007;
        long aCount = 0, abCount = 0, abcCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                aCount = (2 * aCount + 1) % MOD;
            } else if (ch == 'b') {
                abCount = (2 * abCount + aCount) % MOD;
            } else if (ch == 'c') {
                abcCount = (2 * abcCount + abCount) % MOD;
            }
        }
        return (int) abcCount;

    }
}
