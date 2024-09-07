import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeroes_End {
    static void move_brute(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = j; i < n; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void move_better(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int[] arr2={0,1,0,3,12};
        move_better(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
