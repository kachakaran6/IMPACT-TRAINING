import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int Grade = 95;

        if (Grade > 90) {
            System.out.println("Grade A");
        } else if (Grade > 80 && Grade < 90) {
            System.out.println("Grade B");
        } else if (Grade > 70 && Grade < 80) {
            System.out.println("Grade C");
        } else if (Grade > 60 && Grade < 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        Scanner sc = new Scanner(System.in);
        int Grade = sc.nextInt();

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
    }
}
