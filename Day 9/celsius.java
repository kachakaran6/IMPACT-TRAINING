import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int tempInCelsius = sc.nextInt();
        // int c = sc.nextInt();

        // int fahrenheit = (c * 9 / 5) + 32;

        // System.out.println("Temperature is " + c);
        // System.out.println("Fahrenheit " + fahrenheit);

        int c = sc.nextInt();
        float fahrenheit = (c * 9 / 5.0f) + 32;

        System.out.printf("%.6f", fahrenheit);

        sc.close();
    }
}
