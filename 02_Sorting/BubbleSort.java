
import java.util.Arrays;

public class BubbleSort {
    static void sortNum(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean IsSwap = false;
            for (int j = 0; j < n - 1; j++) {
                while (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    IsSwap = true;
                }

            }
            if (!IsSwap)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 0, 4 };
        sortNum(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}