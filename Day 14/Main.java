import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        double sum = a + b;
        double pro = a * b;
        double bb = 2 * b;
        double a3 = Math.pow(a, 3);
        double b3 = Math.pow(b, 3);
        double lhs = Math.pow(sum, 3);
        // double rhs = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(3 * a, bb) +
        // Math.pow(3 * pro, 2);
        double rhs = a3 + b3 + Math.pow(3 * a, bb) + Math.pow(3 * pro, 2);

        System.out.println(lhs);
        System.out.println(rhs);

        if (lhs == rhs) {
            System.out.println("VERIFIED");
        }
        System.out.println("NOT VERIFIED");
    }
}