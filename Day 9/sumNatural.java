import java.util.Scanner;

public class sumNatural {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int sum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // for (int i = 1; i <= 10000000; i++) {
        // System.out.println(i);
        // }

        sc.close();

    }

}
