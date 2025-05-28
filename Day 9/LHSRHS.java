import java.util.Scanner;

public class LHSRHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        // System.out.println(a + " " + b);

        long LHS = (long) Math.pow(a + b, 3);
        long RHS = (long) Math.pow(a, 3) + (long) Math.pow(b, 3) + 3 * (long) Math.pow(a, 2) * b
                + 3 * a * (long) Math.pow(b, 2);

        if (LHS == RHS) {

            System.out.println(LHS + " " + RHS);
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }

        sc.close();
    }
}
