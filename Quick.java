import java.util.*;
import java.lang.*;
import java.io.*;

public class Quick {
    static int partion(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot)
                left++;
            while (left <= right && arr[right] > pivot)
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[start];
        arr[start] = arr[right];
        arr[right] = temp;

        return right;
    }

    static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotInd = partion(arr, start, end);
            quicksort(arr, start, pivotInd - 1);
            quicksort(arr, pivotInd + 1, end);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}