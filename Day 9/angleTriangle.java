import java.util.Scanner;

public class angleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        int max = Math.max(side1, Math.max(side2, side3));

        int sum = (side1 * side1) + (side2 * side2) + (side3 * side3);

        int max2 = 2 * (max * max);

        // Acute Angled
        if (max2 < sum) {
            System.out.println(1);
            // Obtuse
        } else if (max2 > max2) {
            System.out.println(3);
            // Right
        } else {
            System.out.println(2);
        }
        // System.out.println("Maximum is: " + max);

        sc.close();
    }
}
