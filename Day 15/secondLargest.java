public class secondLargest {
    public static void main(String[] args) {
        // int[] arr = { 12, 35, 1, 10, 34, 1 };
        // int max1 = Integer.MIN_VALUE;
        // int max2 = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max1) {
        // max2 = max1;
        // max1 = arr[i];
        // } else if (arr[i] > max2 && arr[i] != max1) {
        // max2 = arr[i];
        // }
        // }
        // System.out.println(max2);

        int[] arr = { 1, 2, 8, 5, 6 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }

}
