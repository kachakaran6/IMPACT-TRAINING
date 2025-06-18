import java.util.*;

class Solution {
    public static int longestOnes(int[] A, int K) {
        // Your code here
        int left = 0;
        int right = 0, zeroCount = 0, maxLength = 0;

        while (right < A.length) {
            if (A[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > K) {
                if (A[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        scan.close();
        System.out.print(Solution.longestOnes(arr, k));
    }
}
