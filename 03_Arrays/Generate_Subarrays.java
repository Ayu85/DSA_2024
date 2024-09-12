public class Generate_Subarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int maxl = 0;
        int givenSum = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                int length = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    length++;
                    System.out.print(arr[k] + " ");
                }
                if (sum == givenSum && length > maxl)
                    maxl = length;
                System.out.println("sum- " + sum);
            }
        }
        System.out.println("Answer-" + maxl);
    }
}
