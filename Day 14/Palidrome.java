import java.util.*;

public class Palidrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String reversedS = "";

        for (int i = n.length() - 1; i >= 0; i--) {
            reversedS += n.charAt(i);
        }

        System.out.println(reversedS);
        i
    }
}
