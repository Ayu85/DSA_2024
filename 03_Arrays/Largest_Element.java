public class Largest_Element {
    static int getLargest(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getLargest(new int[] { 6, 0, 1, 2, 16 }));
    }
}