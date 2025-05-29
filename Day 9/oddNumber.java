import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        while (true) {
            int N = sc.nextInt();
            if (N % 2 != 0) {
                break;
            }
            evenCount++;
        }
        System.out.println(evenCount);
    }
}
