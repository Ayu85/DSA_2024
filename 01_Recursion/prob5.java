public class prob5 {
    static void printNto1Back(int i,int n) {
        if (i == n)
            return;
        i++;
        printNto1Back(i,n);
        System.out.println(n);

    }

    public static void main(String[] args) {
        printNto1Back(1,5);
    }
}