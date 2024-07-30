public class prob4 {
    static void printbybacktrack(int n) {
        if (n == 1)
            return;
        n--;
        printbybacktrack(n);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printbybacktrack(6);
    }
}
