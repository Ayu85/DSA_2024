import java.util.Arrays;

public class Rotate_Array_By_K {
    static void rotate(int[] arr, int k) {
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }
        int j = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
