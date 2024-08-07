import java.util.Arrays;

public class MergeSort {

    // Merge function to combine two sorted halves
    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int k = 0;

        // Merge the two halves into the temp array
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy any remaining elements from the left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy any remaining elements from the right half
        while (right <= end) {
            temp[k++] = arr[right++];
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }

    // Function to recursively divide the array
    static void divideArr(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            divideArr(arr, start, mid);
            divideArr(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 0, 3, 4, 1, 2 };
        divideArr(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
