public class prob2 {
    static void printlinear(int start, int end) {
        if (start > end)
            return;
        System.out.println(start);
        start++;
        printlinear(start, end);
    }

    public static void main(String[] args) {
        printlinear(1, 5);
    }
}
