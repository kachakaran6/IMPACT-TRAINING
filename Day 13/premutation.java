import java.util.Scanner;

public class premutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        int nRF = 1;
        for (int i = 1; i <= n - r; i++) {
            nRF *= i;
        }

        System.out.println("Permutation :" + nFactorial / nRF);

        sc.close();
    }
}
