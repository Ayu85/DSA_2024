public class Sec_Largest {
    static int getSecLargest(int[] num) {
        int max = num[0];
        int smax = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                smax = max;
                max = num[i];
            } else if (num[i] < max && num[i] > smax)
                smax = num[i];

        }
        return smax;
    }

    public static void main(String[] args) {
        System.out.println(getSecLargest(new int[] { 1, 2, 4, 7, 7, 5 }));
    }
}
