
import java.util.Arrays;

public class InsertionSort {
    static void sort(int[] num, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i ; j > 0; j--) {
                while (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 0, 1, 4 };
        int[] arr2 = { 14, 9, 15, 12, 6, 8,13 };
        sort(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
