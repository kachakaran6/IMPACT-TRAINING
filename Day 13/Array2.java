import java.util.*;

public class Array2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int ans = ArrayProblem2(n, arr);
        System.out.println(ans);
    }

    public static int ArrayProblem2(int n, int[] arr) {

        for (int i = 0; i < n; i++) {
            if(Math.max(arr, i)){
                return i;
            }
        }
        return ;

    }
}