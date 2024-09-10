public class Max_Cons_1s {
    static int getMaxCount(int[] arr, int n) {
        int count = 0;
        int maxc = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                count++;
            else {
                if (count > maxc)
                    maxc = count;
                count=0;    
            }
        }
        return maxc;
    }
    public static void main(String[] args) {
        System.out.println(getMaxCount(new int[] {1,1,1,0,1,1,0,1,1}, 9));
    }
}
