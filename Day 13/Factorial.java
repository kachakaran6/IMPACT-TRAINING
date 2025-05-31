import java.util.*;

public class Factorial {

    static int countFreqDigit(int n, int d) {
        String numStr = Integer.toString(n);
        int count = 0;
        char target = (char) ('0' + d);

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(countFreqDigit(n, d));
    }
}