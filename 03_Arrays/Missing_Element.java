import java.util.Arrays;

public class Missing_Element {
    static int getMissing(int[] arr, int n) {
        int totalSum = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++)
            totalSum += i;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return totalSum - sum;
    }

    static int getMissingOptimal(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return totalSum - sum;
    }

    public static void main(String[] args) {
        System.out.println(getMissingOptimal(new int[] { 1, 2, 3, 4 }, 5));
    }
}
