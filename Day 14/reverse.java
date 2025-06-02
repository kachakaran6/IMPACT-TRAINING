import java.io.*;
import java.util.*;

public class reverse {

    public static void reverseArray(int arr[], int[] arr2)
    {

       for(int i=arr.length-1; i>=0; i--){
         for(int j=0; j<arr.length; j++){

             arr[j] =arr[i];
       }
       }

      return arr2[]
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        reverseArray(arr1);

    }
}
