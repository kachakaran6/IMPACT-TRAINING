public class Function {

    public static int countDigit(int n, int d) {
        int count = 0;

        // Convert number to string to iterate over each digit
        String numStr = Integer.toString(n);

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) - '0' == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();

        int result = countDigit(number, digit);
        System.out.println("Count: " + result);

        sc.close();
    }
}
