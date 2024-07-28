public class prob3 {
    static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        n--;
        printNto1(n);
    }

    public static void main(String[] args) {
        printNto1(5);
    }
}
