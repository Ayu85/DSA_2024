public class No_Appearing_Once {
    static int getUnique(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getUnique(new int[] {1,1,2,3,3,4,4}, 7));
    }
}
