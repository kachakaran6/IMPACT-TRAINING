import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Grade = sc.nextInt();

        System.out.println(Grade);

        if (Grade > 90) {
            System.out.println("Excellent");
        } else if (Grade > 80 && Grade <= 90) {
            System.out.println("Good");
        } else if (Grade > 70 && Grade <= 80) {
            System.out.println("Fair");
        } else if (Grade > 60 && Grade <= 70) {
            System.out.println("Meets Expectations");
        } else {
            System.out.println("Below Expectations");
        }

        sc.close();
    }

}
