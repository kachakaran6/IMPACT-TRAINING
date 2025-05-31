// import java.util.Scanner;

// public class Main {
//     public static int sum(int a, int b) {
//         return a * b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         int b = sc.nextInt();

//         int result = sum(a, b);
//         System.out.println("Product is: " + result);

//         sc.close();
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean determineSecondLastDigit(int n) {
        String st = Integer.toString(n);
        int leng = st.length();
        if (st.charAt(leng - 2) == '0') {
            return true;
        } else {
            return false;
        }
    }
}