import java.util.Arrays;

public class Remove_Duplicates {
    static void removeDup(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                j++;
                arr[j] = arr[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        int[] arr2 = { 3, 3, 4, 5, 5, 8, 8 };
        removeDup(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
