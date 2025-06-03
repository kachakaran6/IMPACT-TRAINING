
public class Reverse {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        int[] arr = { 1, 2, 3, 4, 5 };

        int p1 = 0;
        int p2 = 4;

        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}