import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // if (n < 2) {
        // isPrime = false;
        // } else {
        // }
        for (int k = 2; k <= n; k++) {
            boolean isPrime = true;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(k);
            }
        }

        // System.out.println(n + " not prime");
        // }
    }
}
