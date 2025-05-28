import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
        // System.out.println(b);

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("We are Odd");
        } else {
            System.out.println("We are simple");
        }

        sc.close();
    }

}
