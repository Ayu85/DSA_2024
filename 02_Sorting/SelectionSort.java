import java.util.Arrays;

public class SelectionSort {
    static void sortnum(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min])
                    min = j;
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 0, 3, 2 };
        int[] arr2 = { 13, 46, 24, 52, 20, 9 };
        sortnum(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
