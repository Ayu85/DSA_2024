package ParameterisedRec;
import java.util.Arrays;

public class reverseArray {
    static void rev(int[] arr, int start, int end) {
        if (start == end)
            return;
        int temp = 0;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rev(arr, start+1, end-1);
    }

public static void main(String[] args) {

    int[] arr={1,2,3,4,5};
    rev(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
}
}
